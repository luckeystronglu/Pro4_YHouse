package com.huangj.pro4_yhouse;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.gson.Gson;
import com.huangj.adapter.MsgInfoGridViewAdapter;
import com.huangj.adapter.MsginfoListViewAdapter;
import com.huangj.entity.CommentEntity;
import com.huangj.entity.MsgInfoEntity;
import com.huangj.huangjlibrary.base.BaseActivity;
import com.huangj.huangjlibrary.util.DownUtil;
import com.huangj.huangjlibrary.util.DownUtil2;
import com.huangj.util.Constant;
import com.huangj.util.GlideRoundTransform;

import java.util.List;

import butterknife.Bind;

/**
 * Created by mmmm on 2016/10/27.
 */
public class MsgInfoActivity extends BaseActivity implements DownUtil.OnDownListener, DownUtil2.OnDownListener2 {
    private RequestManager glideRequest;

    private String infourl;//详情url
    private String cimmenturl;//评论url

    //信息部分的控件
    private TextView tvname,tvneirong,tvcount,tv;
    private ImageView ivhead,ivback;
    private LinearLayout lluser,llneirong,lladdress;


    @Bind(R.id.msginfo_gv)
    public GridView gv;

    @Bind(R.id.msginfo_lv)
    public ListView lv;
    private MsgInfoGridViewAdapter gridViewAdapter;
    private MsginfoListViewAdapter listViewAdapter;
    @Override
    protected int getContentId() {
        return R.layout.activity_msginfo;
    }

    /**
     * 初始化
     */
    @Override
    protected void init() {
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        infourl = String.format(Constant.MSGINFO_URL,id);
        cimmenturl = String.format(Constant.MSGCOMMENT_URL,id);

        //信息部分控件的初始化
        tvname = (TextView) findViewById(R.id.msginfo_tvname);
        tvneirong = (TextView) findViewById(R.id.msginfo_tvneirong);
        tvcount = (TextView) findViewById(R.id.msginfo_tvcount);
        tv = (TextView) findViewById(R.id.msginfo_tv);
        ivhead = (ImageView) findViewById(R.id.msginfo_ivhead);
        ivback = (ImageView) findViewById(R.id.msginfo_ivback);
        llneirong = (LinearLayout) findViewById(R.id.ll_neirong);
        lluser = (LinearLayout) findViewById(R.id.ll_user);
        lladdress = (LinearLayout) findViewById(R.id.ll_address);

        gridViewAdapter = new MsgInfoGridViewAdapter(this);
        listViewAdapter = new MsginfoListViewAdapter(this);
        gv.setAdapter(gridViewAdapter);
        lv.setAdapter(listViewAdapter);
        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    /**
     * 加载数据
     */
    @Override
    protected void loadDatas() {
        //头部信息数据
        new DownUtil().setOnDownListener(this).downJSON(infourl);
        //评论数据
        new DownUtil2().setOnDownListener2(this).downJSON2(cimmenturl);
    }

    /**
     * 解析头部信息JSON
     * @param json
     * @return
     */
    @Override
    public Object paresJson(String json) {
        if (json != null){
            return new Gson().fromJson(json.toString(), MsgInfoEntity.class);
        }
        return null;
    }

    /**
     * 部信息解析完成
     * @param object
     */
    @Override
    public void downSucc(Object object) {
        glideRequest = Glide.with(this);
        if (object != null){
            MsgInfoEntity msgInfoEntity = (MsgInfoEntity) object;
            List<MsgInfoEntity.CustomerFeedDetailBean.PictureListBean> pictureList = msgInfoEntity.getCustomerFeedDetail().getPictureList();
            if(pictureList.size() > 1){
                gridViewAdapter.setDatas(pictureList);
            }else{
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(600,450);
                ImageView iv = new ImageView(this);
                iv.setLayoutParams(layoutParams);
                iv.setScaleType(ImageView.ScaleType.FIT_XY);
                Glide.with(this)
                        .load(pictureList.get(0).getUrlHeader() + pictureList.get(0).getUrl())
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .placeholder(R.drawable.icon)
                        .thumbnail(0.1f)
                        .crossFade()
                        .into(iv);
                llneirong.addView(iv);
            }
            tvname.setText(msgInfoEntity.getCustomerFeedDetail().getAuthor().getName());
            tvneirong.setText(msgInfoEntity.getCustomerFeedDetail().getFeed().getContent());
            tvcount.setText(msgInfoEntity.getCustomerFeedDetail().getPraisedUserList().size() + "");
            glideRequest.load(msgInfoEntity.getCustomerFeedDetail().getAuthor().getPicUrl())
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .placeholder(R.drawable.icon)
                    .thumbnail(0.1f)
                    .crossFade()
                    .transform(new GlideRoundTransform(this, 10))
                    .into(ivhead);
            //动态添加位置信息
            if (msgInfoEntity.getCustomerFeedDetail().getFeed().getLocation() != null){
                ImageView iv = new ImageView(this);
                TextView tv = new TextView(this);

                iv.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                iv.setImageResource(R.drawable.icon_feed_locaion);
                lladdress.addView(iv);

                tv.setTextSize(12);
                tv.setText(msgInfoEntity.getCustomerFeedDetail().getFeed().getLocation());
                lladdress.addView(tv);
            }

            if (msgInfoEntity.getCustomerFeedDetail().getPraisedUserList().size() > 7){

                for (int i = 0;i < 8 ;i++){
                    ImageView iv = new ImageView(this);
                    iv.setScaleType(ImageView.ScaleType.FIT_XY);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(90,90);
                    layoutParams.setMargins(3,3,3,3);
                    iv.setLayoutParams(layoutParams);
                    glideRequest.load(msgInfoEntity.getCustomerFeedDetail().getPraisedUserList().get(i).getPicUrl())
                            .diskCacheStrategy(DiskCacheStrategy.ALL)
                            .placeholder(R.drawable.icon)
                            .thumbnail(0.1f)
                            .crossFade()
                            .transform(new GlideRoundTransform(this, 10))
                            .into(iv);
                    lluser.addView(iv);
                }
            }else{
                for (int i = 0;i < msgInfoEntity.getCustomerFeedDetail().getPraisedUserList().size() ;i++){
                    Log.d("pring", "长度__________>" + msgInfoEntity.getCustomerFeedDetail().getPraisedUserList().size());
                    ImageView iv = new ImageView(this);
                    iv.setScaleType(ImageView.ScaleType.FIT_XY);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(90,90);
                    layoutParams.setMargins(3,3,3,3);
                    iv.setLayoutParams(layoutParams);
                    glideRequest.load(msgInfoEntity.getCustomerFeedDetail().getPraisedUserList().get(i).getPicUrl())
                            .diskCacheStrategy(DiskCacheStrategy.ALL)
                            .placeholder(R.drawable.icon)
                            .thumbnail(0.1f)
                            .crossFade()
                            .transform(new GlideRoundTransform(this, 10))
                            .into(iv);
                    lluser.addView(iv);
                }
            }
        }
    }

    /**
     * 解析JSON
     * @param json
     * @return
     */
    @Override
    public Object paresJson2(String json) {
        if (json != null){
            return new Gson().fromJson(json.toString(), CommentEntity.class);
        }
        return null;
    }

    /**
     * JSON解析完成
     * @param object
     */
    @Override
    public void downSucc2(Object object) {
        if (object != null){
            CommentEntity commentEntity = (CommentEntity) object;
            List<CommentEntity.CustomerReplyListBean> customerReplyList = commentEntity.getCustomerReplyList();
            if (customerReplyList.size() == 0){
                tv.setText("快做第一个评论的人吧!");
            }else{
                tv.setText("评论" + " " + customerReplyList.size());
                listViewAdapter.setDatas(customerReplyList);
            }
        }
    }
}
