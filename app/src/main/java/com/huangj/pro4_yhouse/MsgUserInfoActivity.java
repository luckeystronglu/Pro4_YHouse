package com.huangj.pro4_yhouse;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.gson.Gson;
import com.huangj.adapter.MsgUserInfoGridViewAdapter;
import com.huangj.entity.MsgEntity;
import com.huangj.entity.UserEntity;
import com.huangj.huangjlibrary.base.BaseActivity;
import com.huangj.huangjlibrary.util.DownUtil;
import com.huangj.util.Constant;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import butterknife.Bind;

/**
 * Created by mmmm on 2016/10/31.
 */
public class MsgUserInfoActivity extends BaseActivity implements DownUtil.OnDownListener {


    private MsgUserInfoGridViewAdapter gridViewAdapter;
    private TextView tvneirong,tvxihuan,tvpinglun,tvtop,tvname,tvaddress,tvage,tvqianming,tvdongtai,tvguanzhu,tvfensi,tvtiezi,tvzan;
    private ImageView ivhead,ivsex,ivaddr,ivditu,ivback;
    private LinearLayout lladdr,llneirong,llbiaoqian;
    private int[] colors = {R.color.baiqiancolor1,R.color.baiqiancolor2,R.color.baiqiancolor3,R.color.baiqiancolor4};

    private String urluser;
    @Bind(R.id.userinfo_gv)
    public GridView gv;
    @Override
    protected int getContentId() {
        return R.layout.activity_userinfo;
    }

    /**
     * 初始化
     */
    @Override
    protected void init() {
        //初始化控件
        tvneirong = (TextView) findViewById(R.id.userinfo_tvneirong);
        tvpinglun = (TextView) findViewById(R.id.userinfo_tvpinglun);
        tvxihuan = (TextView) findViewById(R.id.userinfo_tvxihuan);
        tvname = (TextView) findViewById(R.id.userinfo_tvname);
        tvaddress = (TextView) findViewById(R.id.userinfo_tvaddress);
        tvtop = (TextView) findViewById(R.id.userinfo_tvtop);
//        tvage = (TextView) findViewById(R.id.userinfo_tvage);
        tvqianming = (TextView) findViewById(R.id.userinfo_tvqianming);
        tvdongtai = (TextView) findViewById(R.id.userinfo_tvdongtai);
        tvguanzhu = (TextView) findViewById(R.id.userinfo_tvguanzhu);
        tvfensi = (TextView) findViewById(R.id.userinfo_tvfensi);
        tvtiezi = (TextView) findViewById(R.id.userinfo_tvtiezi);
        tvzan = (TextView) findViewById(R.id.userinfo_tvzan);
        ivditu = (ImageView) findViewById(R.id.iv_ditu);

        ivhead = (ImageView) findViewById(R.id.userinfo_ivhead);
        ivsex = (ImageView) findViewById(R.id.userinfo_ivsex);
        ivaddr = (ImageView) findViewById(R.id.userinfo_ivaddr);
        ivback = (ImageView) findViewById(R.id.userinfo_ivback);

        lladdr = (LinearLayout) findViewById(R.id.userinfo_lladdr);
        llneirong = (LinearLayout) findViewById(R.id.userinfo_llneirong);
        llbiaoqian = (LinearLayout) findViewById(R.id.userinfo_llbiaoqian);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        final String id = intent.getStringExtra("id");
        MsgEntity.CustomerFeedListBean data = (MsgEntity.CustomerFeedListBean) intent.getSerializableExtra("data");
        //调用设置控件的方法
        setView(data);
        //用户名转码
        try {
            String str = URLEncoder.encode(name, "UTF-8");
            urluser = String.format(Constant.MSGUSERDATA_URL,str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //返回按钮的点击事件
        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //背景图片的点击事件
        ivditu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MsgUserInfoActivity.this,MapActivity.class);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });
    }

    /**
     * 加载数据
     */
    @Override
    protected void loadDatas() {
        new DownUtil().setOnDownListener(this).downJSON(urluser);
    }

    /**
     * 解析JSON
     * @param json
     * @return
     */
    @Override
    public Object paresJson(String json) {
        if(json != null){
            return new Gson().fromJson(json.toString(), UserEntity.class);
        }
        return null;
    }

    /**
     * 解析完成
     * @param object
     */
    @Override
    public void downSucc(Object object) {
        if (object != null){
            UserEntity userEntity = (UserEntity) object;
            //调用设置控件数据的方法
            setInfoView(userEntity);
        }
    }

    //设置控件的数据
    public void setView(MsgEntity.CustomerFeedListBean data){
        List<MsgEntity.CustomerFeedListBean.PictureListBean> pictureList = data.getPictureList();
        gridViewAdapter = new MsgUserInfoGridViewAdapter(this);
        gridViewAdapter.setDatas(pictureList);
        //判断是Gridview还是单图片
        if(pictureList.size() > 1){
            gv.setAdapter(gridViewAdapter);
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
        //动态添加位置信息
        if (data.getFeed().getLocation() != null){
            ImageView iv = new ImageView(this);
            TextView tv = new TextView(this);

            iv.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            iv.setImageResource(R.drawable.icon_feed_locaion);
            lladdr.addView(iv);

            tv.setTextSize(12);
            tv.setText(data.getFeed().getLocation());
            lladdr.addView(tv);
        }

        tvneirong.setText(data.getFeed().getContent());
        tvxihuan.setText(data.getPraiseCount() + "");
        tvpinglun.setText(data.getReplyCount() + "");
        tvtop.setText(data.getAuthor().getName());
    }

    //设置控件的数据
    public void setInfoView(UserEntity userEntity){
        Glide.with(this).load(userEntity.getCustomerUserDetail().getPersonalInfo().getPicUrl()).into(ivhead);
        tvname.setText(userEntity.getCustomerUserDetail().getPersonalInfo().getName());//设置名字
        ivaddr.setImageResource(R.drawable.icon_feed_locaion);
        tvaddress.setText(userEntity.getCustomerUserDetail().getPersonalInfo().getAddr());//设置地址
        tvdongtai.setText("动态" + " " + userEntity.getCustomerUserDetail().getFeedCount() + "");
        tvguanzhu.setText("关注" + " " + userEntity.getCustomerUserDetail().getFollowCount() + "");
        tvfensi.setText("粉丝" + " " + userEntity.getCustomerUserDetail().getFansCount() + "");
        tvqianming.setText(userEntity.getCustomerUserDetail().getPersonalInfo().getContent());
        tvtiezi.setText("帖子" + "(" + userEntity.getCustomerUserDetail().getFeedCount() + ")");
        tvzan.setText("收到了" + userEntity.getCustomerUserDetail().getFeedPraisedCount() + "个赞");
        //设置性别图标
        if (userEntity.getCustomerUserDetail().getPersonalInfo().getSex() == 0){
            ivsex.setImageResource(R.drawable.girl);
        }else {
            ivsex.setImageResource(R.drawable.boy);
        }
        //添加标签
        String[] tabs = userEntity.getCustomerUserDetail().getPersonalInfo().getTabs().split("\\[tab\\]");
        for (int i = 0; i<tabs.length ; i++){
            TextView tv = new TextView(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0,0,10,0);
            tv.setText(tabs[i]);
            tv.setTextColor(Color.WHITE);
            tv.setBackgroundResource(colors[i]);
            llbiaoqian.addView(tv,layoutParams);
        }
        //设置年龄
        //            if (userEntity.getCustomerUserDetail().getPersonalInfo().getBirthday() > 0){
        //                int age = (int) (((userEntity.getCustomerUserDetail().getPersonalInfo().getLastRequestTime() - userEntity.getCustomerUserDetail().getPersonalInfo().getBirthday()) % 100000) % 100000);
        //                tvage.setText(age + "");
        //            }else {
        //                tvage.setText(userEntity.getCustomerUserDetail().getFeedCount());
        //            }
    }
}
