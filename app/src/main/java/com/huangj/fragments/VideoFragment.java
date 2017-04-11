package com.huangj.fragments;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.huangj.childfragment.MusicCdFragment;
import com.huangj.childfragment.TextCdFragment;
import com.huangj.childfragment.VideoCdFragment;
import com.huangj.huangjlibrary.base.BaseFragment;
import com.huangj.pro4_yhouse.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by HuangJ on 2016/10/24.21:24
 */
public class VideoFragment extends BaseFragment {

    @Bind(R.id.video_tb)
    TabLayout tabLayout;
    @Bind(R.id.video_vp)
    ViewPager viewPager;
    private VideoVPAdapter videoVPAdapter;
    private String tabs[] = {"社区视频","精选音乐","搞笑段子"};

    @Override
    public int getContentId() {
        return R.layout.fragment_video;
    }

    @Override
    protected void init(View view) {
        videoVPAdapter = new VideoVPAdapter(getChildFragmentManager());//初始化适配器;
        videoVPAdapter.addFragment(new VideoCdFragment(),tabs[0]);
        videoVPAdapter.addFragment(new MusicCdFragment(),tabs[1]);
        videoVPAdapter.addFragment(new TextCdFragment(),tabs[2]);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(videoVPAdapter);//设置适配器
        tabLayout.setupWithViewPager(viewPager);//设置联动
    }

    //ViewPager的适配器
    public static class VideoVPAdapter extends FragmentStatePagerAdapter{
        private List<Fragment> videoFragmens;
        private List<String> tabs;
        public VideoVPAdapter(FragmentManager fm) {
            super(fm);
            this.videoFragmens = new ArrayList<>();
            this.tabs = new ArrayList<>();
        }
        public void addFragment (Fragment fragment,String tab){
            videoFragmens.add(fragment);
            tabs.add(tab);
        }
        @Override
        public Fragment getItem(int position) {
            return videoFragmens.get(position);
        }
        @Override
        public int getCount() {
            return tabs.size();
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return tabs.get(position);
        }
    }
}
