package com.huangj.childfragment;

import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.huangj.adapter.Other2_Rvadapter;
import com.huangj.entity.FoodsPicEntity;
import com.huangj.entity.PlayEntity;
import com.huangj.huangjlibrary.base.BaseFragment;
import com.huangj.pro4_yhouse.R;
import com.huangj.util.GetJsonDatas;
import com.huangj.util.NetworkImageHolderView;
import com.zhy.adapter.recyclerview.wrapper.HeaderAndFooterWrapper;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by HuangJ on 2016/10/24.23:55
 */
public class LifeCdFragment extends BaseFragment {
    private ConvenientBanner convenientBanner;
    private List<String> pics;//图片集合;
    private Other2_Rvadapter other2adapter;

    @Bind(R.id.play_recycle)
    RecyclerView play_recycle;
    @Bind(R.id.refresh)
    SwipeRefreshLayout refresh;
    private FragmentActivity activity;

    @Override
    public int getContentId() {
        return R.layout.cdfragment_life;

    }

    @Override
    protected void init(View view) {
        activity = getActivity();
        View headerView =  LayoutInflater.from(getActivity()).inflate(R.layout.header_foods, null);
        convenientBanner = (ConvenientBanner) headerView.findViewById(R.id.foods_conven);

        play_recycle.setLayoutManager(new LinearLayoutManager(activity));
        other2adapter = new  Other2_Rvadapter(activity);//初始化适配器;
        //给RecycleView添加头部布局;类似装饰者模式，直接将原本的adapter传入，初始化一个HeaderAndFooterWrapper对象，然后调用相关API添加。
        HeaderAndFooterWrapper headerAndFooterWrapper = new HeaderAndFooterWrapper(other2adapter);
        play_recycle.setAdapter(headerAndFooterWrapper);
        headerAndFooterWrapper.addHeaderView(headerView);
        headerAndFooterWrapper.notifyDataSetChanged();

    }


    @Override
    protected void loadDatas() {
        //得到play头部图片的JSON;
        String json_food_header = GetJsonDatas.getJSON2("life_header.json", activity);
        List<FoodsPicEntity> foodsPic = GetJsonDatas.getFoodsPic(json_food_header);
        pics = new ArrayList<>();//得到图片集合;
        for (int i = 0; i < foodsPic.size(); i++) {
            String picUrl = foodsPic.get(i).getPicUrl();
            pics.add(picUrl);
        }
        //顶部广告
        convenientBanner.setPages(new CBViewHolderCreator<NetworkImageHolderView>() {
            @Override
            public NetworkImageHolderView createHolder() {
                return new NetworkImageHolderView();
            }
        },pics)
                .setPageIndicator(new int []{ R.drawable.ic_guide_indicator_page_new_normal,R.drawable.ic_guide_indicator_page_new_selected})
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL);
//                .setOnItemClickListener();//设置图片的点击事件；
//                convenientBanner.setManualPageable(false);//设置不能手动影响
//        convenientBanner.getViewPager().setPageTransformer(true,new ());//设置特效;
        //得到Play的JSON；
        String json = GetJsonDatas.getJSON2("life2.json",activity);
        PlayEntity playEntity = GetJsonDatas.getPlayEntity(json);
        List<PlayEntity.DataBean.DocBean> docBeen = playEntity.getData().getDoc();
        other2adapter.setDatas(docBeen);
    }
    @Override
    protected void bindListener() {
        refresh.setColorSchemeResources(R.color.appcolor);
        refresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refresh.setRefreshing(false);
                        Toast.makeText(activity, "刷新完成", Toast.LENGTH_SHORT).show();
                    }
                },1000);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        convenientBanner.startTurning(4000);
    }
}
