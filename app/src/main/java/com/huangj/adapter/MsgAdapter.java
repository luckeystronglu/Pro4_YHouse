package com.huangj.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.huangj.entity.MsgEntity;
import com.huangj.msgfragment.PhotoActivity;
import com.huangj.pro4_yhouse.MsgUserInfoActivity;
import com.huangj.pro4_yhouse.R;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mmmm on 2016/10/31.
 */
public class MsgAdapter extends AbsMoreBaseAdapter<MsgEntity.CustomerFeedListBean> {
    private GridView gv;
    private ImageView iv,ivhead;
    private MsgGridViewAdapter gridViewAdapter;
    private LinearLayout lladdr1,lladdr2;
    public MsgAdapter(Context context) {
        super(context, R.layout.item_msg1,R.layout.item_msg2);

    }



    @Override
    protected void bindData(ViewHolder viewHolder, final MsgEntity.CustomerFeedListBean data, int typeView) {

        switch (typeView){
            case 0:
                //多图片布局
                viewHolder
                        .bindTextView(R.id.msg1_tvname,data.getAuthor().getName())
                        .bindTextView(R.id.msg1_tvlike,data.getPraiseCount() + "")
                        .bindTextView(R.id.msg1_tvreply,data.getReplyCount() + "")
                        .bindTextView(R.id.msg1_tvneirong,data.getFeed().getContent())
                        .cBindImageView(R.id.msg1_ivhead,data.getAuthor().getPicUrl(),R.drawable.icon);
                //加载GridView
                final List<MsgEntity.CustomerFeedListBean.PictureListBean> pictureList = data.getPictureList();
                gv = (GridView) viewHolder.getView(R.id.msg1_gv);
                gridViewAdapter = new MsgGridViewAdapter(context);
                gv.setAdapter(gridViewAdapter);
                gridViewAdapter.setDatas(pictureList);
                //GridView的点击事件an
                gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(context, PhotoActivity.class);
                        intent.putExtra("photo", (Serializable) pictureList);
                        intent.putExtra("position",position);
                        context.startActivity(intent);
                    }
                });

                lladdr1 = (LinearLayout) viewHolder.getView(R.id.msg1_11address);
                if (data.getFeed().getLocation() != null){
                    ImageView iv = new ImageView(context);
                    TextView tv = new TextView(context);
                    lladdr1.removeAllViews();
                    iv.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                    iv.setImageResource(R.drawable.icon_feed_locaion);
                    lladdr1.addView(iv);

                    tv.setTextSize(12);
                    tv.setText(data.getFeed().getLocation() + "");
                    lladdr1.addView(tv);
                }

                ivhead = (ImageView) viewHolder.getView(R.id.msg1_ivhead);
                //头像的点击事件
                ivhead.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("print", "点击了头像");
                        Intent intent = new Intent(context, MsgUserInfoActivity.class);
                        intent.putExtra("id",data.getAuthor().getUserId() + "");
                        intent.putExtra("name",data.getAuthor().getName());
                        intent.putExtra("data", data);
                        context.startActivity(intent);
                    }
                });

                break;
            case 1:
                //单图片布局
                viewHolder
                        .bindTextView(R.id.msg2_tvname,data.getAuthor().getName())
                        .bindTextView(R.id.msg2_tvlike,data.getPraiseCount() + "")
                        .bindTextView(R.id.msg2_tvreply,data.getReplyCount() + "")
                        .bindTextView(R.id.msg2_tvneirong,data.getFeed().getContent())
                        .bindImageView(R.id.msg2_iv,data.getPictureList().get(0).getUrlHeader() + data.getPictureList().get(0).getUrl(),R.drawable.icon)
                        .cBindImageView(R.id.msg2_ivhead,data.getAuthor().getPicUrl(),R.drawable.icon);
                iv = (ImageView) viewHolder.getView(R.id.msg2_iv);
                final List<MsgEntity.CustomerFeedListBean.PictureListBean> pictureList1 = data.getPictureList();
                final int position = 1;
                //图片的点击事件
                iv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, PhotoActivity.class);
                        intent.putExtra("photo", (Serializable) pictureList1);
                        intent.putExtra("position",position);
                        context.startActivity(intent);
                    }
                });

                lladdr2 = (LinearLayout) viewHolder.getView(R.id.msg2_11address);
                if (data.getFeed().getLocation() != null){
                    ImageView iv = new ImageView(context);
                    TextView tv = new TextView(context);

                    lladdr2.removeAllViews();
                    iv.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                    iv.setImageResource(R.drawable.icon_feed_locaion);
                    lladdr2.addView(iv);

                    tv.setTextSize(12);
                    tv.setText(data.getFeed().getLocation() + "");
                    lladdr2.addView(tv);
                }

                ivhead = (ImageView) viewHolder.getView(R.id.msg2_ivhead);
                //头像的点击事件
                ivhead.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("print", "点击了头像");
                        Intent intent = new Intent(context, MsgUserInfoActivity.class);
                        intent.putExtra("id",data.getFeed().getFeedId() + "");
                        intent.putExtra("name",data.getAuthor().getName());
                        intent.putExtra("data", data);
                        context.startActivity(intent);
                    }
                });
                break;
        }
    }
}
