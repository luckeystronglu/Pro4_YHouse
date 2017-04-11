package com.huangj.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.huangj.entity.TextEntity;
import com.huangj.pro4_yhouse.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by HuangJ on 2016/10/28.17:32
 */
public class Text_RvAdapter  extends RecyclerView.Adapter<Text_RvAdapter.TextViewHolder>{

    private Context context;
    private List<TextEntity.ListBean> datas;
    private ItemOnClickListener itemOnClickListener;

    public void setItemOnClickListener(ItemOnClickListener itemOnClickListener) {
        this.itemOnClickListener = itemOnClickListener;
    }

    public Text_RvAdapter(Context context) {
        this.context = context;
        this.datas = new ArrayList<>();
    }

    public List<TextEntity.ListBean> getDatas() {
        return datas;
    }

    public void clearDatas(){
        this.datas.clear();
    }
    public void setDatas(List<TextEntity.ListBean> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }


    @Override
    public TextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_text,parent,false);
        return new TextViewHolder(view);

    }

    @Override
    public void onBindViewHolder(TextViewHolder holder, int position) {
        holder.author.setText(datas.get(position).getU().getName());
        holder.time.setText(datas.get(position).getPasstime());
        holder.ding.setText(datas.get(position).getUp());
        holder.cai.setText(datas.get(position).getDown()+"");
        holder.share.setText(datas.get(position).getForward()+"");
        holder.command.setText(datas.get(position).getComment());
        holder.content.setText(datas.get(position).getText());
        Glide.with(context).load(datas.get(position).getU().getHeader().get(0))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade(300)
                .thumbnail(0.1f)
                .into(holder.header);
        //动态添加评论;
        List<TextEntity.ListBean.TopCommentsBean> top_comments = datas.get(position).getTop_comments();
        //为空则显示间距栏;
        if (top_comments == null){
            holder.view_bottom.setVisibility(View.VISIBLE);
        }
        //评论不为空则动态添加评论；
        if (top_comments!= null){
            holder.view_bottom.setVisibility(View.GONE);//隐藏;

            holder.ll.removeAllViews();//移除所有布局;
            for (int i = 0; i < top_comments.size(); i++) {

                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(LinearLayout.HORIZONTAL);
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                lp.setMargins(40,10,10,10);
                lp.gravity = Gravity.CENTER_VERTICAL;
                linearLayout.setLayoutParams(lp);
                TextView tv1 = new TextView(context);
                tv1.setGravity(Gravity.CENTER_VERTICAL);
                tv1.setTextColor(Color.GRAY);
                tv1.setText(top_comments.get(i).getU().getName()+" : ");

                TextView tv2 = new TextView(context);
                tv2.setGravity(Gravity.CENTER_VERTICAL);
                tv2.setTextColor(Color.WHITE);
                tv2.setText(top_comments.get(i).getContent());

                linearLayout.addView(tv1);
                linearLayout.addView(tv2);

                holder.ll.addView(linearLayout);
            }
        }
}

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class TextViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private CircleImageView header;
        private TextView author,time,content,ding,cai,share,command;
        private LinearLayout ll;
        private View view_bottom;
        public TextViewHolder(View itemView) {
            super(itemView);
            author = (TextView) itemView.findViewById(R.id.video_tv_name);
            time = (TextView) itemView.findViewById(R.id.video_tv_time);
            content = (TextView) itemView.findViewById(R.id.video_tv_content);
            ding = (TextView) itemView.findViewById(R.id.ding);
            cai = (TextView) itemView.findViewById(R.id.cai);
            share = (TextView) itemView.findViewById(R.id.share);
            command = (TextView) itemView.findViewById(R.id.command);
            header = (CircleImageView) itemView.findViewById(R.id.video_iv);

            ll = (LinearLayout) itemView.findViewById(R.id.text_ll);

            view_bottom = itemView.findViewById(R.id.view_bottom);

            itemView.setOnClickListener(this);
        }

        //监听事件;
        @Override
        public void onClick(View v) {
            if(itemOnClickListener != null){
                itemOnClickListener.onClick(v,getAdapterPosition());
            }
        }


    }

    public  interface ItemOnClickListener{
        void onClick(View  view,int position);
    }

}
