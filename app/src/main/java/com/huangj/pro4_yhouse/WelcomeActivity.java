package com.huangj.pro4_yhouse;

import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

import com.huangj.huangjlibrary.base.BaseActivity;

import butterknife.Bind;

/**
 * Created by HuangJ on 2016/10/24.16:48
 * 欢迎主页;
 */
public class WelcomeActivity extends BaseActivity {

    @Bind(R.id.ll)
    LinearLayout linearLayout;
    private int right;

    @Override
    protected int getContentId() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void init() {
        right = linearLayout.getWidth();
        final TranslateAnimation animation = new TranslateAnimation(right,0,0,0);
        animation.setDuration(400);
        animation.setFillAfter(true);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);//关闭过场动画;
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        linearLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                linearLayout.startAnimation(animation);
            }
        },1200);
    }



}
