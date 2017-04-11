package com.huangj.adapter;

import android.content.Context;
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
import com.huangj.entity.PlayEntity;
import com.huangj.pro4_yhouse.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuangJ on 2016/10/27.16:22
 */
public class Other2_Rvadapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<PlayEntity.DataBean.DocBean> datas;


    public Other2_Rvadapter(Context context) {
        this.context = context;
        this.datas = new ArrayList<>();
    }


    public void setDatas(List<PlayEntity.DataBean.DocBean> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                View itemView1 = LayoutInflater.from(context).inflate(R.layout.item_others_1,parent,false);
                return new Others1ViewHolder(itemView1);
            case 1:
                View itemView2 = LayoutInflater.from(context).inflate(R.layout.item_others_2,parent,false);
                return new Others2ViewHolder(itemView2);
            case 2:
                View itemView3 = LayoutInflater.from(context).inflate(R.layout.item_others_3,parent,false);
                return new Others3ViewHolder(itemView3);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof Others1ViewHolder){
            List<PlayEntity.DataBean.DocBean.ItemDataBean> itemData = datas.get(position).getItemData();
            ((Others1ViewHolder) holder).item1_ll.removeAllViews();
            if (itemData != null) {
                for (int i = 0; i < itemData.size(); i++) {
                    LinearLayout ll = new LinearLayout(context);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    layoutParams.setMargins(50,20,4,50);
                    ll.setLayoutParams(layoutParams);
                    ll.setGravity(Gravity.CENTER_HORIZONTAL);
                    ll.setOrientation(LinearLayout.VERTICAL);
                    ImageView iv = new ImageView(context);
                    LinearLayout.LayoutParams ivlp = new LinearLayout.LayoutParams(70,70);
                    iv.setLayoutParams(ivlp);
                    Glide.with(context).load(itemData.get(i).getMenuIcon()).diskCacheStrategy(DiskCacheStrategy.ALL).into(iv);
                    TextView tv = new TextView(context);
                    LinearLayout.LayoutParams tvlp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    tv.setText(itemData.get(i).getMenuName());
                    tv.setGravity(Gravity.CENTER_HORIZONTAL);
                    tv.setLayoutParams(tvlp);
                    ll.addView(iv);
                    ll.addView(tv);
                    ((Others1ViewHolder) holder).item1_ll.addView(ll);
                }
            }
        }else if (holder instanceof Others2ViewHolder){
            List<PlayEntity.DataBean.DocBean.ItemDataBean.ContentBean> pics = datas.get(position).getItemData().get(0).getContent();
            Glide.with(context).load(pics.get(0).getPicUrl()).diskCacheStrategy(DiskCacheStrategy.ALL).into(((Others2ViewHolder) holder).item2_iv1);
            Glide.with(context).load(pics.get(1).getPicUrl()).diskCacheStrategy(DiskCacheStrategy.ALL).into(((Others2ViewHolder) holder).item2_iv2);
        }else  if (holder instanceof Others3ViewHolder){
            Glide.with(context).load(datas.get(position).getPicUrl()).diskCacheStrategy(DiskCacheStrategy.ALL).thumbnail(0.1f).crossFade(300).into(((Others3ViewHolder) holder).item4_iv);
            ((Others3ViewHolder) holder).item4_tvtitle.setText(datas.get(position).getTitle());
            ((Others3ViewHolder) holder).item4_tvaddress.setText(datas.get(position).getDistrict());
            ((Others3ViewHolder) holder).item4_tvname.setText(datas.get(position).getHostName());
            ((Others3ViewHolder) holder).item4_tvprice.setText(datas.get(position).getNeededCredits());
        }

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class Others1ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout item1_ll;
        public Others1ViewHolder(View itemView) {
            super(itemView);
            item1_ll = (LinearLayout) itemView.findViewById(R.id.food_item1_ll);
        }
    }
    class Others2ViewHolder extends RecyclerView.ViewHolder {
        private ImageView item2_iv1, item2_iv2;
        public Others2ViewHolder(View itemView) {
            super(itemView);
            item2_iv1 = (ImageView) itemView.findViewById(R.id.image1);
            item2_iv2 = (ImageView) itemView.findViewById(R.id.image2);
        }

    }
    class Others3ViewHolder extends RecyclerView.ViewHolder {
        private TextView item4_tvtitle, item4_tvaddress, item4_tvname, item4_tvprice;
        private ImageView item4_iv;
        private LinearLayout item4_ll;
        public Others3ViewHolder(View itemView) {
            super(itemView);
            item4_tvtitle = (TextView) itemView.findViewById(R.id.food_item4_tvtitle);
            item4_tvaddress = (TextView) itemView.findViewById(R.id.food_item4_tvaddress);
            item4_tvname = (TextView) itemView.findViewById(R.id.food_item4_tvname);
            item4_tvprice = (TextView) itemView.findViewById(R.id.food_item4_tvprive);
            item4_iv = (ImageView) itemView.findViewById(R.id.food_item4_iv);
            item4_ll = (LinearLayout) itemView.findViewById(R.id.food_item4_ll);
        }
    }

    @Override
    public int getItemViewType(int position) {
        int itemType = datas.get(position).getItemType();
        switch (itemType) {
            case 40:
                return 0;
            case 30:
                return 1;
            default:
                return 2;
        }
    }
}
