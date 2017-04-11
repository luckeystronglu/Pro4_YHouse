package com.huangj.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.huangj.entity.MsgEntity;
import com.huangj.pro4_yhouse.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmmm on 2016/10/26.
 */
public class MsgUserInfoGridViewAdapter extends BaseAdapter {
    private List<MsgEntity.CustomerFeedListBean.PictureListBean> datas;
    private Context context;

    public MsgUserInfoGridViewAdapter(Context context){
        this.context = context;
        this.datas = new ArrayList<>();
    }

    public void setDatas(List<MsgEntity.CustomerFeedListBean.PictureListBean> datas){
        this.datas = datas;
        this.notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_msg_infogv,null);
        ImageView iv = (ImageView) convertView.findViewById(R.id.infogv_iv);
        Log.d("print", "datas" + datas);
        Glide.with(context)
                .load(datas.get(position).getUrlHeader() + datas.get(position).getUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .thumbnail(0.1f)
                .crossFade()
                .into(iv);
        return convertView;
    }
}
