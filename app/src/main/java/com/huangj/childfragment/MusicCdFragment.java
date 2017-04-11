package com.huangj.childfragment;

import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.RadioGroup;

import com.huangj.huangjlibrary.base.BaseFragment;
import com.huangj.musicfragments.HotFragment;
import com.huangj.musicfragments.NewFragment;
import com.huangj.musicfragments.RecommendFragment;
import com.huangj.musicfragments.SpeciallyFragment;
import com.huangj.pro4_yhouse.R;

import butterknife.Bind;

/**
 * Created by HuangJ on 2016/10/28.10:40
 */
public class MusicCdFragment extends BaseFragment implements RadioGroup.OnCheckedChangeListener {

    @Bind(R.id.music_rg)
    RadioGroup music_rq;

    private FragmentManager fragmentManager;

    @Override
    public int getContentId() {
        return R.layout.cdfragment_music;
    }

    @Override
    protected void init(View view) {
        fragmentManager = getChildFragmentManager();

        music_rq.setOnCheckedChangeListener(this);//设置点击监听;
        music_rq.getChildAt(0).performClick();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.music_rb1:
                fragmentManager.beginTransaction().replace(R.id.music_zwfl,new RecommendFragment()).commit();
                break;
            case R.id.music_rb2:
                fragmentManager.beginTransaction().replace(R.id.music_zwfl,new HotFragment()).commit();
                break;
            case R.id.music_rb3:
                fragmentManager.beginTransaction().replace(R.id.music_zwfl,new NewFragment()).commit();
                break;
            case R.id.music_rb4:
                fragmentManager.beginTransaction().replace(R.id.music_zwfl,new SpeciallyFragment()).commit();
                break;
        }
    }

}
