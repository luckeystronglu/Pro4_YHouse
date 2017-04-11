package com.huangj.childfragment;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.huangj.adapter.Video_LvAdapter;
import com.huangj.entity.VideoEntity;
import com.huangj.huangjlibrary.base.BaseFragment;
import com.huangj.pro4_yhouse.R;
import com.huangj.util.BSBDJservice;
import com.huangj.util.Constant;
import com.huangj.util.GetJsonDatas;

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
public class VideoCdFragment extends BaseFragment {

    @Bind(R.id.listView)
    ListView listView;
    @Bind(R.id.anim)
    ImageView anim;
    private Video_LvAdapter video_lvAdapter;
    private Retrofit retrofit;
    private AnimationDrawable drawable;


    @Override
    public int getContentId() {
        return R.layout.cdfragment_videos;
    }

    @Override
    protected void init(View view) {
        video_lvAdapter = new Video_LvAdapter(getActivity());
        listView.setAdapter(video_lvAdapter);
        drawable = (AnimationDrawable) anim.getBackground();
        drawable.start();
    }

    @Override
    protected void loadDatas() {
        String url  = Constant.BSBDJ_SP;
        //下载视频页的JSON;
        //1、建立对象;
        retrofit = new Retrofit.Builder()
                .baseUrl(Constant.baseUrl)
                .client(new OkHttpClient())
                .build();
        BSBDJservice bsbdJservice = retrofit.create(BSBDJservice.class);
        //2、得到Call对象;
        Call<ResponseBody> spJsonCall = bsbdJservice.getSPJson(url);
        spJsonCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    VideoEntity videoEntity = GetJsonDatas.getVideoEntity(response.body().string());
                    List<VideoEntity.ListBean> listBeen = videoEntity.getList();
                    anim.setVisibility(View.GONE);
                    drawable.stop();//关闭动画;
                    video_lvAdapter.setDatas(listBeen);
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
