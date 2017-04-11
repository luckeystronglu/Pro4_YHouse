package com.huangj.fragments;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.huangj.childfragment.FoodsCdFragment;
import com.huangj.childfragment.LifeCdFragment;
import com.huangj.childfragment.PlayCdFragment;
import com.huangj.huangjlibrary.base.BaseFragment;
import com.huangj.pro4_yhouse.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by HuangJ on 2016/10/24.21:24
 */
public class HomeFragment extends BaseFragment {

    @Bind(R.id.tb_home)
    TabLayout tabLayout;
    @Bind(R.id.home_vp)
    ViewPager viewPager;

    private FragmentActivity homeActivity;
    private ChildFragmentAdapter childFragmentAdapter;
    private FragmentManager fragmentManager;

    private String tabs[]  = {"美食","玩乐","生活课程"};

    @Override
    public int getContentId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void init(View view) {
        fragmentManager = getChildFragmentManager();//管理；
        homeActivity = getActivity();//上下文;
        viewPager.setOffscreenPageLimit(2);//预加载两个;
        childFragmentAdapter = new ChildFragmentAdapter(fragmentManager);
        childFragmentAdapter.addFragments(new FoodsCdFragment(),tabs[0]);
        childFragmentAdapter.addFragments(new PlayCdFragment(),tabs[1]);
        childFragmentAdapter.addFragments(new LifeCdFragment(),tabs[2]);
        viewPager.setAdapter(childFragmentAdapter);//设置适配器
        tabLayout.setupWithViewPager(viewPager);//设置联动
    }
    /**
     * 适配器;
     */
    public static class ChildFragmentAdapter extends FragmentStatePagerAdapter{

        private List<Fragment> childFragment;
        private List<String> tabs;

        public ChildFragmentAdapter(FragmentManager fm) {
            super(fm);
            childFragment = new ArrayList<>();
            tabs = new ArrayList<>();
        }
        public void addFragments(Fragment fragment,String tab){
            childFragment.add(fragment);
            tabs.add(tab);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabs.get(position);
        }

        @Override
        public Fragment getItem(int position) {
            return childFragment.get(position);
        }

        @Override
        public int getCount() {
            return tabs.size();
        }
    }
}
