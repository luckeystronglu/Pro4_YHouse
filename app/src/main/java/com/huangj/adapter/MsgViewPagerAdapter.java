package com.huangj.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.huangj.entity.MsgEntity;
import com.huangj.fragments.PhotoFragment;

import java.util.List;

/**
 * Created by mmmm on 2016/10/28.
 */
public class MsgViewPagerAdapter extends FragmentPagerAdapter {
    private List<MsgEntity.CustomerFeedListBean.PictureListBean> datas;
    public MsgViewPagerAdapter(FragmentManager fm, List<MsgEntity.CustomerFeedListBean.PictureListBean> datas) {
        super(fm);
        this.datas = datas;
    }

    @Override
    public Fragment getItem(int position) {
        return PhotoFragment.getInstance(datas.get(position).getUrlHeader() + datas.get(position).getUrl(),position,datas.size());

    }

    @Override
    public int getCount() {
        return datas.size();
    }
}
