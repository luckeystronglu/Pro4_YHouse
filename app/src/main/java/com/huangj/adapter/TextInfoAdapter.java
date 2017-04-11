package com.huangj.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.huangj.entity.TextInfoEntity;
import com.huangj.pro4_yhouse.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by HuangJ on 2016/10/29.17:44
 */
public class TextInfoAdapter extends BaseAdapter {

    private Context context;
    private List<TextInfoEntity.NormalBean.ListBean>  datas;

    public TextInfoAdapter(Context context) {
        this.context = context;
        this.datas = new ArrayList<>();
    }

    public void setDatas(List<TextInfoEntity.NormalBean.ListBean> datas) {
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
        ViewHolder viewHolder = null;
        if (convertView!=null){
            viewHolder = (ViewHolder) convertView.getTag();
        }else {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_textinfo,null);
            viewHolder.iv_headee = (CircleImageView) convertView.findViewById(R.id.video_iv);
            viewHolder.textinfoll = (LinearLayout) convertView.findViewById(R.id.text_info_ll);
            viewHolder.title = (TextView) convertView.findViewById(R.id.video_tv_name);
            viewHolder.time = (TextView) convertView.findViewById(R.id.video_tv_time);
            viewHolder.counts = (TextView) convertView.findViewById(R.id.text_info_count);
            viewHolder.ding = (ImageView) convertView.findViewById(R.id.ding);
            convertView.setTag(viewHolder);
        }
        Glide.with(context).load(datas.get(position).getUser().getProfile_image())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(viewHolder.iv_headee);
        viewHolder.title.setText(datas.get(position).getUser().getUsername());
        viewHolder.time.setText(datas.get(position).getContent());
        viewHolder.counts.setText(datas.get(position).getLike_count()+1+"");
        List<TextInfoEntity.NormalBean.ListBean.PrecmtsBean> precmts = datas.get(position).getPrecmts();
        if (precmts != null){
            viewHolder.textinfoll.removeAllViews();
            for (int i = 0; i < precmts.size(); i++) {
                LinearLayout ll = new LinearLayout(context);
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                lp.setMargins(20,10,10,20);
                ll.setOrientation(LinearLayout.VERTICAL);
                ll.setLayoutParams(lp);
                TextView tv1 = new TextView(context);
                tv1.setGravity(Gravity.CENTER_VERTICAL);
                tv1.setText(i+1 +" "+ precmts.get(i).getUser().getUsername());
                tv1.setTextColor(Color.parseColor("#66b3ff"));
                TextView tv2 = new TextView(context);
                tv2.setGravity(Gravity.CENTER_VERTICAL);
                tv2.setText(precmts.get(i).getContent());
                ll.addView(tv1);
                ll.addView(tv2);
                viewHolder.textinfoll.addView(ll);
            }
        }
        return convertView;
    }


    class ViewHolder{
        ImageView ding;
        CircleImageView iv_headee;
        LinearLayout textinfoll;
        TextView title,time,counts;
    }
}
