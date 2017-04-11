package com.huangj.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.huangj.entity.MusicEntity;
import com.huangj.pro4_yhouse.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by HuangJ on 2016/10/30.15:24
 */
public class Music3_RVAdapter extends RecyclerView.Adapter<Music3_RVAdapter.Music3ViewHolder> {

    private Context context;
    private List<MusicEntity.DataBean.CollectsBean> datas;
    private ItemOnClickListener itemOnClickListener;

    public Music3_RVAdapter(Context context) {
        this.context = context;
        this.datas = new ArrayList<>();
    }

    public void clearDatas(){
        this.datas.clear();
    }

    public List<MusicEntity.DataBean.CollectsBean> getDatas() {
        return datas;
    }

    public void setDatas(List<MusicEntity.DataBean.CollectsBean> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }

    public void setItemOnClickListener(ItemOnClickListener itemOnClickListener) {
        this.itemOnClickListener = itemOnClickListener;
    }

    @Override
    public Music3ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_music_three,parent,false);
        return new Music3ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(Music3ViewHolder holder, int position) {
        holder.title.setText(datas.get(position).getCollect_name());
        holder.nickname.setText(datas.get(position).getUser_name());
        holder.info.setText(datas.get(position).getDescription());
        int play_count = datas.get(position).getPlay_count();

        holder.counts.setText(getPeopleNum(play_count));//获取播放总数;

        Glide.with(context).load(datas.get(position).getCollect_logo())
                .thumbnail(0.1f)
                .crossFade(200)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.face);
        Glide.with(context).load(datas.get(position).getAuthor_avatar())
                .thumbnail(0.1f)
                .crossFade(200)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.header);
        List<String> tags = datas.get(position).getTags();
        if (tags != null) {
            holder.ll.removeAllViews();
            for (int i = 0; i < tags.size(); i++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.setMargins(10,5,10,5);
                TextView tv1 = new TextView(context);
                tv1.setGravity(Gravity.CENTER_VERTICAL);
                tv1.setText(tags.get(i));
                tv1.setTextColor(Color.parseColor("#c2b1b1"));
                holder.ll.addView(tv1);
            }
        }
    }


    @Override
    public int getItemCount() {
        return datas.size();
    }



    class Music3ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView title,counts,info,nickname;
        private CircleImageView header;
        private ImageView face;
        private LinearLayout ll;

        public Music3ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.music_tv_title);
            counts = (TextView) itemView.findViewById(R.id.music_tv_counts);
            info = (TextView) itemView.findViewById(R.id.music_tv_info);
            nickname = (TextView) itemView.findViewById(R.id.music_tv_nickname);
            header = (CircleImageView) itemView.findViewById(R.id.music_iv_header);
            face = (ImageView) itemView.findViewById(R.id.music_iv_face);
            ll = (LinearLayout) itemView.findViewById(R.id.music_ll);

            itemView.setOnClickListener(this);//设置监听;
        }

        @Override
        public void onClick(View v) {
            if (itemOnClickListener != null){

                itemOnClickListener.onClick(v,getAdapterPosition());
            }
        }
    }
    /**
     * 字符串 转换为数字的方法
     * @return
     */
    public static String getPeopleNum(int p){
        if(p != 0){
            int s = p / 10000;//万位
            int k = p %10000;
            int m = k / 1000;
            if(m > 4){
                int sum = ++m;
                return s + "." + sum;
            }
            return s + "." + k;
        }
        return null;
    }

    public  interface ItemOnClickListener{
        void onClick(View  view,int position);
    }
}
