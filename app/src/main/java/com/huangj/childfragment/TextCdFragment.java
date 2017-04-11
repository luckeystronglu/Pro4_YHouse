package com.huangj.childfragment;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Toast;

import com.huangj.adapter.Text_RvAdapter;
import com.huangj.entity.TextEntity;
import com.huangj.huangjlibrary.base.BaseFragment;
import com.huangj.pro4_yhouse.R;
import com.huangj.pro4_yhouse.TextInfoActivity;
import com.huangj.util.BSBDJservice;
import com.huangj.util.Constant;
import com.huangj.util.GetJsonDatas;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;

import java.io.IOException;
import java.util.List;

import butterknife.Bind;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by HuangJ on 2016/10/28.10:40
 */
public class TextCdFragment extends BaseFragment implements Text_RvAdapter.ItemOnClickListener {


    @Bind(R.id.text_Pollrecycle)
    PullLoadMoreRecyclerView pullLoadMoreRecyclerView;
    @Bind(R.id.zhiding)
    FloatingActionButton fab;
    private int page = 20;
    private Retrofit retrofit;
    private Text_RvAdapter text_rvAdapter;
    private String textUrl;

    @Override
    public int getContentId() {
        return R.layout.cdfragment_text;
    }

    @Override
    protected void init(View view) {
        pullLoadMoreRecyclerView.setLinearLayout();//设置线性布局;
        text_rvAdapter = new Text_RvAdapter(getActivity());
        pullLoadMoreRecyclerView.setAdapter(text_rvAdapter);

    }

    @Override
    protected void bindListener() {
    //上下刷新和下拉刷新;
    pullLoadMoreRecyclerView.setOnPullLoadMoreListener(new PullLoadMoreRecyclerView.PullLoadMoreListener() {
        @Override
        public void onRefresh() {
            setRefresh();
            loadDatas();
         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Toast.makeText(getActivity(), "刷新完成", Toast.LENGTH_SHORT).show();
//                 pullLoadMoreRecyclerView.setPushRefreshEnable(false);设置不需要下拉刷新
//                 pullLoadMoreRecyclerView.setRefreshing(false);//设置关闭
                 pullLoadMoreRecyclerView.setPullLoadMoreCompleted();
             }
         },1000);
        }

        @Override
        public void onLoadMore() {
            page+=20;
            loadDatas();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    pullLoadMoreRecyclerView.setPullLoadMoreCompleted();
                }
            },2000);
        }
    });
        //置顶按钮;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pullLoadMoreRecyclerView.scrollToTop();
            }
        });
        //点击事件;
        text_rvAdapter.setItemOnClickListener(this);

    }



    /**
     * 下载数据;
     */
    @Override
    protected void loadDatas() {
        textUrl = String.format(Constant.BSDBJ_TEXT,page);
        retrofit = new Retrofit.Builder()
                .baseUrl(Constant.baseUrl)
                .client(new OkHttpClient())
                .build();

        BSBDJservice bsbdJservice = retrofit.create(BSBDJservice.class);
        if (textUrl!=null) {
            Call<ResponseBody> textCall = bsbdJservice.getTextJson(textUrl);

        textCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    TextEntity textEntty = GetJsonDatas.getTextEntty(response.body().string());
                    List<TextEntity.ListBean> listBeen =  textEntty.getList();
                    text_rvAdapter.setDatas(listBeen);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
        }
    }

    private void setRefresh() {
        text_rvAdapter.clearDatas();
        page = 20;
    }

    /**
     * item的点击事件
     * @param view
     * @param position
     */
    @Override
    public void onClick(View view, int position) {
        TextEntity.ListBean textInfoBean = text_rvAdapter.getDatas().get(position);

        //点击跳转 到详情页面;
        Intent intent = new Intent(getActivity(), TextInfoActivity.class);
        intent.putExtra("textInfoBean",textInfoBean);
        startActivity(intent);
        getActivity().overridePendingTransition(R.anim.bottom_in,R.anim.bottomout);
    }

}
