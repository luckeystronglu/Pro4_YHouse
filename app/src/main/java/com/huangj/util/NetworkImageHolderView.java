package com.huangj.util;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.huangj.pro4_yhouse.R;

/**
 * Created by HuangJ on 2016/10/15.12:30
 * //头部广告;
 */
public class NetworkImageHolderView implements Holder<String> {

    private ImageView imageView;

    @Override
    public View createView(Context context) {
        imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    @Override
    public void UpdateUI(Context context, int position, String data) {
        imageView.setImageResource(R.drawable.icon);
//        ImageLoader.getInstance().displayImage(data,imageView);
        Glide.with(context)
                .load(data)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade(200)
                .thumbnail(0.1f)
                .into(imageView);
    }

}
