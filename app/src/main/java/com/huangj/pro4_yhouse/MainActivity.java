package com.huangj.pro4_yhouse;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.huangj.fragments.HomeFragment;
import com.huangj.fragments.MineFragment;
import com.huangj.fragments.MsgFragment;
import com.huangj.fragments.VideoFragment;
import com.huangj.huangjlibrary.base.BaseActivity;
/**
 * 实际上就是就是
 */
import butterknife.Bind;
public class MainActivity extends BaseActivity {


    @Bind(R.id.rg)
    RadioGroup radioGroup;

    @Override
    protected int getContentId() {
        return R.layout.activity_main;
    }
    @Override
    protected void init() {
        radioGroup.getChildAt(0).performClick();
    }

    public void btnOnclick(View view){
        switch (view.getId()){
            case R.id.rb1:
                showFragment(R.id.fl_zw,new HomeFragment());
                break;
            case R.id.rb2:
                showFragment(R.id.fl_zw,new VideoFragment());
                break;
            case R.id.rb3:
                Toast.makeText(MainActivity.this, "点击加号", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb4:
                showFragment(R.id.fl_zw,new MsgFragment());
                break;
            case R.id.rb5:
                showFragment(R.id.fl_zw,new MineFragment());
                break;
        }
    }
}
