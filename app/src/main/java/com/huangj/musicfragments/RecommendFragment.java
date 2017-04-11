package com.huangj.musicfragments;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.huangj.adapter.Music3_RVAdapter;
import com.huangj.entity.MusicEntity;
import com.huangj.huangjlibrary.base.BaseFragment;
import com.huangj.pro4_yhouse.R;
import com.huangj.util.Constant;
import com.huangj.util.GetJsonDatas;
import com.huangj.util.XMService;
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
 * Created by HuangJ on 2016/10/30.14:24
 */
public class RecommendFragment extends BaseFragment implements Music3_RVAdapter.ItemOnClickListener {

    private Retrofit retrofit;
    private Music3_RVAdapter music3_rvAdapter;
    @Bind(R.id.pullloadRecycleView)
    PullLoadMoreRecyclerView musicPullRecycleView;


    @Override
    public int getContentId() {
        return R.layout.musicfg_recommend;
    }

    @Override
    protected void init(View view) {
        musicPullRecycleView.setLinearLayout();
        music3_rvAdapter = new Music3_RVAdapter(getActivity());
        musicPullRecycleView.setAdapter(music3_rvAdapter);
        musicPullRecycleView.setPushRefreshEnable(false);//关闭上拉刷新
        music3_rvAdapter.setItemOnClickListener(this);//Item的点击事件;
    }

    @Override
    protected void bindListener() {
        musicPullRecycleView.setOnPullLoadMoreListener(new PullLoadMoreRecyclerView.PullLoadMoreListener() {
            @Override
            public void onRefresh() {
                music3_rvAdapter.clearDatas();
                loadDatas();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getActivity(), "刷新完成", Toast.LENGTH_SHORT).show();
                        musicPullRecycleView.setPullLoadMoreCompleted();//关闭下拉刷新;
                    }
                },1000);
            }
            @Override
            public void onLoadMore() {

            }
        });
    }

    /**
     * 下载得到JSON；
     */
    @Override
    protected void loadDatas() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://spark.api.xiami.com/")
                .client(new OkHttpClient())
                .build();
        XMService xmService = retrofit.create(XMService.class);

        Call<ResponseBody> commendCall = xmService.getXMJSON(Constant.COMMEND);
        commendCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    MusicEntity musicEntity = GetJsonDatas.getMusicJson(response.body().string());
                    List<MusicEntity.DataBean.CollectsBean> collectsBeen = musicEntity.getData().getCollects();
                    music3_rvAdapter.setDatas(collectsBeen);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
            }
        });
    }

    @Override
    public void onClick(View view, int position) {
        List<MusicEntity.DataBean.CollectsBean> datas = music3_rvAdapter.getDatas();
        Log.d("print", "onClick: " +datas.get(position).getUser_name());
    }
}
