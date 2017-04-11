package com.huangj.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.huangj.entity.FoodEntity;
import com.huangj.pro4_yhouse.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuangJ on 2016/10/26.21:21
 */
public class Foods_RvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<FoodEntity.DataBean.DocBean> datas;

    public Foods_RvAdapter(Context context) {
        this.context = context;
        this.datas = new ArrayList<>();
    }

    public void setDatas(List<FoodEntity.DataBean.DocBean> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                View itemView1 = LayoutInflater.from(context).inflate(R.layout.item_foods_1, parent, false);
                return new Foods1ViewHolder(itemView1);
            case 1:
                View itemView2 = LayoutInflater.from(context).inflate(R.layout.item_foods_2, parent, false);
                return new Foods2ViewHolder(itemView2);
            case 2:
                View itemView3 = LayoutInflater.from(context).inflate(R.layout.item_foods_3, parent, false);
                return new Foods3ViewHolder(itemView3);
            case 3:
                View itemView4 = LayoutInflater.from(context).inflate(R.layout.item_foods_4, parent, false);
                return new Foods4ViewHolder(itemView4);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof Foods1ViewHolder) {
            List<FoodEntity.DataBean.DocBean.ItemDataBean> itemData = datas.get(position).getItemData();
            ((Foods1ViewHolder) holder).item1_ll.removeAllViews();
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
                    ((Foods1ViewHolder) holder).item1_ll.addView(ll);
                }
            }
        } else if (holder instanceof Foods2ViewHolder) {
            Glide.with(context).load("http://p.yhres.com/bundle/2016/10/20/1476953394890103.jpg-q75").thumbnail(0.1f).crossFade(200).diskCacheStrategy(DiskCacheStrategy.ALL).into(((Foods2ViewHolder) holder).item2_iv1);
            Glide.with(context).load("http://p.yhres.com/bundle/2016/10/24/1477277530035929.jpg-q75").thumbnail(0.1f).crossFade(200).diskCacheStrategy(DiskCacheStrategy.ALL).into(((Foods2ViewHolder) holder).item2_iv2);
            Glide.with(context).load("http://p.yhres.com/bundle/2016/10/20/1476954200654050.jpg-q75").thumbnail(0.1f).crossFade(200).diskCacheStrategy(DiskCacheStrategy.ALL).into(((Foods2ViewHolder) holder).item2_iv3);
            Glide.with(context).load("http://p.yhres.com/bundle/2016/10/26/1477461077346611.png-q75").thumbnail(0.1f).crossFade(200).diskCacheStrategy(DiskCacheStrategy.ALL).into(((Foods2ViewHolder) holder).item2_iv4);
        } else if (holder instanceof Foods3ViewHolder) {
            ((Foods3ViewHolder) holder).item3_tvtitle.setText(datas.get(position).getItemData().get(0).getTitle());
            ((Foods3ViewHolder) holder).item3_tvcenter.setText(datas.get(position).getItemData().get(0).getViceTitle());
            ((Foods3ViewHolder) holder).item3_tvbottom.setText(datas.get(position).getItemData().get(0).getContentsNumStr());
            List<FoodEntity.DataBean.DocBean.ItemDataBean.ListBean> listBeen = datas.get(position).getItemData().get(0).getList();

        } else if (holder instanceof Foods4ViewHolder) {
            Glide.with(context).load(datas.get(position).getPicUrl()).diskCacheStrategy(DiskCacheStrategy.ALL).thumbnail(0.1f).crossFade(300).into(((Foods4ViewHolder) holder).item4_iv);
            ((Foods4ViewHolder) holder).item4_tvtitle.setText(datas.get(position).getShareContent());
            ((Foods4ViewHolder) holder).item4_tvaddress.setText(datas.get(position).getBusinessesDistrict());
            ((Foods4ViewHolder) holder).item4_tvname.setText(datas.get(position).getHostName());
            ((Foods4ViewHolder) holder).item4_tvprice.setText(datas.get(position).getPriceStr());
            ((Foods4ViewHolder) holder).item_tvkm.setText(datas.get(position).getDistance());
        }
    }


    @Override
    public int getItemCount() {
        return datas.size();
    }

    class Foods1ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout item1_ll;

        public Foods1ViewHolder(View itemView) {
            super(itemView);
            item1_ll = (LinearLayout) itemView.findViewById(R.id.food_item1_ll);
        }

    }

    class Foods2ViewHolder extends RecyclerView.ViewHolder {
        private ImageView item2_iv1, item2_iv2, item2_iv3, item2_iv4;

        public Foods2ViewHolder(View itemView) {
            super(itemView);
            item2_iv1 = (ImageView) itemView.findViewById(R.id.image1);
            item2_iv2 = (ImageView) itemView.findViewById(R.id.image2);
            item2_iv3 = (ImageView) itemView.findViewById(R.id.image3);
            item2_iv4 = (ImageView) itemView.findViewById(R.id.image4);
        }

    }

    class Foods3ViewHolder extends RecyclerView.ViewHolder {
        private TextView item3_tvtitle, item3_tvcenter, item3_tvbottom;
        private GridView item3_gv;

        public Foods3ViewHolder(View itemView) {
            super(itemView);
            item3_tvtitle = (TextView) itemView.findViewById(R.id.food_item3_tvtitle);
            item3_tvcenter = (TextView) itemView.findViewById(R.id.food_item3_tvcenter);
            item3_tvbottom = (TextView) itemView.findViewById(R.id.food_item3_tvbottom);
            item3_gv = (GridView) itemView.findViewById(R.id.food_item3_gv);
        }

    }

    class Foods4ViewHolder extends RecyclerView.ViewHolder {
        private TextView item4_tvtitle, item4_tvaddress, item4_tvname, item4_tvprice, item_tvkm;
        private ImageView item4_iv;
        private LinearLayout item4_ll;

        public Foods4ViewHolder(View itemView) {
            super(itemView);
            item4_tvtitle = (TextView) itemView.findViewById(R.id.food_item4_tvtitle);
            item4_tvaddress = (TextView) itemView.findViewById(R.id.food_item4_tvaddress);
            item4_tvname = (TextView) itemView.findViewById(R.id.food_item4_tvname);
            item4_tvprice = (TextView) itemView.findViewById(R.id.food_item4_tvprive);
            item_tvkm = (TextView) itemView.findViewById(R.id.food_item4_tvkm);
            item4_iv = (ImageView) itemView.findViewById(R.id.food_item4_iv);
            item4_ll = (LinearLayout) itemView.findViewById(R.id.food_item4_ll);
        }
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);

    }

    /**
     * //得到布局类型;
     *
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        int itemLayout = datas.get(position).getItemType();
        switch (itemLayout) {
            case 40:
                return 0;
            case 30:
                return 1;
            case 20:
                return 2;
            default:
                return 3;
        }
    }
}
