package com.huangj.msgfragment;

import android.content.Intent;
import android.support.v4.view.ViewPager;

import com.huangj.adapter.MsgViewPagerAdapter;
import com.huangj.entity.MsgEntity;
import com.huangj.huangjlibrary.base.BaseActivity;
import com.huangj.pro4_yhouse.R;

import java.util.List;

import butterknife.Bind;

/**
 * Created by mmmm on 2016/10/28.
 */
public class PhotoActivity extends BaseActivity {
    private MsgViewPagerAdapter pagerAdapter;

    @Bind(R.id.photo_vp)
    public ViewPager vp;
    @Override
    protected int getContentId() {
        return R.layout.activity_photo;
    }

    @Override
    protected void init() {
        Intent intent = getIntent();
        List<MsgEntity.CustomerFeedListBean.PictureListBean> datas = (List<MsgEntity.CustomerFeedListBean.PictureListBean>) intent.getSerializableExtra("photo");
        int position = intent.getIntExtra("position",0);
        pagerAdapter = new MsgViewPagerAdapter(getSupportFragmentManager(),datas);
        vp.setAdapter(pagerAdapter);
        vp.setCurrentItem(position);
    }
}
