package com.huangj.fragments;

import android.view.View;
import android.widget.LinearLayout;

import com.huangj.huangjlibrary.base.BaseFragment;
import com.huangj.pro4_yhouse.R;

import butterknife.Bind;

/**
 * Created by HuangJ on 2016/10/24.21:24
 */
public class MineFragment extends BaseFragment {
    @Bind(R.id.lllllll)
    public LinearLayout ll;
    @Override
    public int getContentId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void init(View view) {
        ll.getBackground().setAlpha(150
        );
    }
}
