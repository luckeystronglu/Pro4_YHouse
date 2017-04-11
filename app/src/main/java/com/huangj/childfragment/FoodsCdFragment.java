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
import com.huangj.adapter.Foods_RvAdapter;
import com.huangj.entity.FoodEntity;
import com.huangj.entity.FoodsPicEntity;
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
public class FoodsCdFragment extends BaseFragment {

    private ConvenientBanner convenientBanner;
    private List<String> pics;//图片集合;
    private Foods_RvAdapter foods_rvAdapter;

    @Bind(R.id.foods_recycle)
    RecyclerView foods_recycle;
    private FragmentActivity activity;
    @Bind(R.id.refresh)
    SwipeRefreshLayout refresh;
    @Override
    public int getContentId() {
        return R.layout.cdfragment_foods;
    }
    /**
     * 初始化头部;
     * @param view
     */
    @Override
    protected void init(View view) {
        activity = getActivity();
        View headerView =  LayoutInflater.from(getActivity()).inflate(R.layout.header_foods, null);
        convenientBanner = (ConvenientBanner) headerView.findViewById(R.id.foods_conven);

//        foods_recycle.setLayoutManager(new LinearLayoutManager(getActivity()));

        foods_recycle.setLayoutManager(new LinearLayoutManager(activity));
        foods_rvAdapter = new Foods_RvAdapter(getActivity());//初始化适配器;
        //给RecycleView添加头部布局;类似装饰者模式，直接将原本的adapter传入，初始化一个HeaderAndFooterWrapper对象，然后调用相关API添加。
        HeaderAndFooterWrapper headerAndFooterWrapper = new HeaderAndFooterWrapper(foods_rvAdapter);
        foods_recycle.setAdapter(headerAndFooterWrapper);
        headerAndFooterWrapper.addHeaderView(headerView);

        headerAndFooterWrapper.notifyDataSetChanged();
    }

    @Override
    protected void loadDatas() {

        //得到头部图片的JSON;
        String json_food_header = GetJsonDatas.getJSON2("food_header.json", activity);
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

        //得到food的json;
        String json_food = GetJsonDatas.getJSON2("food.json",activity);
        FoodEntity foodsEntity = GetJsonDatas.getFoodsEntity(json_food);
        List<FoodEntity.DataBean.DocBean> docBeen = foodsEntity.getData().getDoc();//得到DOC所有数据;
//        Log.d("print", "loadDatas: "+docBeen.get(0).getAddress());
        foods_rvAdapter.setDatas(docBeen);
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

    /**
     * 程序运行时开启翻页
     */
    @Override
    public void onResume() {
        super.onResume();
        convenientBanner.startTurning(4000);
    }

}
