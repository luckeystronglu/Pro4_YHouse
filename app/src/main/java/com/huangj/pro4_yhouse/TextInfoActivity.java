package com.huangj.pro4_yhouse;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.huangj.adapter.TextInfoAdapter;
import com.huangj.entity.TextEntity;
import com.huangj.entity.TextInfoEntity;
import com.huangj.huangjlibrary.base.BaseActivity;
import com.huangj.util.BSBDJservice;
import com.huangj.util.Constant;
import com.huangj.util.GetJsonDatas;

import java.io.IOException;
import java.util.List;

import butterknife.Bind;
import de.hdodenhof.circleimageview.CircleImageView;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by HuangJ on 2016/10/29.17:03
 */
public class TextInfoActivity extends BaseActivity implements View.OnClickListener {

    private String Id;
    private Retrofit retrofit;
    //头布局的控件;
    private CircleImageView header;
    private TextView author,time,content,ding,cai,share,command,infopl;

    @Bind(R.id.textinfo_lv)
    ListView textListView;
    @Bind(R.id.finish)
    ImageView finish;

    private TextInfoAdapter textInfoAdapter;


    @Override
    protected int getContentId() {
        return R.layout.textinfo_activity;
    }
    @Override
    protected void init() {
        //获得点击的对象;
        Intent intent = getIntent();
        TextEntity.ListBean textInfoBean = (TextEntity.ListBean) intent.getSerializableExtra("textInfoBean");
        Id = textInfoBean.getId();

        textInfoAdapter = new TextInfoAdapter(this);//初始化适配器;
        textListView.setAdapter(textInfoAdapter);
        View headerView = LayoutInflater.from(this).inflate(R.layout.item_text,null);
        author = (TextView) headerView.findViewById(R.id.video_tv_name);
        time = (TextView) headerView.findViewById(R.id.video_tv_time);
        content = (TextView) headerView.findViewById(R.id.video_tv_content);
        ding = (TextView) headerView.findViewById(R.id.ding);
        cai = (TextView) headerView.findViewById(R.id.cai);
        share = (TextView) headerView.findViewById(R.id.share);
        command = (TextView) headerView.findViewById(R.id.command);
        header = (CircleImageView) headerView.findViewById(R.id.video_iv);
        infopl = (TextView) headerView.findViewById(R.id.text_info_pl);

        //下方的评论显示;
        infopl.setVisibility(View.VISIBLE);
        //返回上一页面监听;
        finish.setOnClickListener(this);

        author.setText(textInfoBean.getU().getName());
        time.setText(textInfoBean.getPasstime());
        ding.setText(textInfoBean.getUp());
        cai.setText(textInfoBean.getDown()+"");
        share.setText(textInfoBean.getForward()+"");
        command.setText(textInfoBean.getComment());
        content.setText(textInfoBean.getText());
        Glide.with(this).load(textInfoBean.getU().getHeader().get(0))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade(300)
                .thumbnail(0.1f)
                .into(header);
        textListView.addHeaderView(headerView);

    }

    /**
     * 绑定监听;
     */
    @Override
    protected void bindListener() {


    }

    /**
     * 下载评论详情的方法;
     */
    @Override
    protected void loadDatas() {
        String infoUrl = String.format(Constant.BSBDJ_TEXTPL,Id);
        if (infoUrl != null) {
            //建立retrofit对象
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://c.api.budejie.com/")
                    .client(new OkHttpClient())
                    .build();
            BSBDJservice bsbdJservice = retrofit.create(BSBDJservice.class);
            Call<ResponseBody> TextInfoCall = bsbdJservice.getTextInfoJson(infoUrl);
            //获得请求
            TextInfoCall.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    try {
                        TextInfoEntity textInfo = GetJsonDatas.getTextInfo(response.body().string());
                        List<TextInfoEntity.NormalBean.ListBean> listBeen = textInfo.getNormal().getList();
                        textInfoAdapter.setDatas(listBeen);
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

    @Override
    public void onClick(View v) {
        this.finish();
    }
}
