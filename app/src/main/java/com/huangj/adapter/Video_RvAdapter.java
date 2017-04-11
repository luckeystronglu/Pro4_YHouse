package com.huangj.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.huangj.entity.VideoEntity;
import com.huangj.pro4_yhouse.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuangJ on 2016/10/28.14:34
 */
public class Video_RvAdapter extends RecyclerView.Adapter<Video_RvAdapter.VideoViewHolder> implements MediaPlayer.OnPreparedListener, View.OnClickListener {

    private Context context;
    private List<VideoEntity.ListBean> datas ;
    private int playIndex = -1;//需要播放的视频item下标

    private MediaPlayer mediaplayer;//定义视频播放器;

    public Video_RvAdapter(Context context) {
        this.context = context;
        this.datas = new ArrayList<>();
        this.mediaplayer = new MediaPlayer();
        this.mediaplayer.setOnPreparedListener(this);//视频准备好的监听;
    }

    public void setDatas(List<VideoEntity.ListBean> datas ){
        this.datas = datas;
        this.notifyDataSetChanged();
    }

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_video,parent,false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final VideoViewHolder holder, final int position) {

        holder.author.setText(datas.get(position).getU().getName());
        holder.time.setText(datas.get(position).getPasstime());
        holder.ding.setText(datas.get(position).getUp());
        holder.cai.setText(datas.get(position).getDown()+"");
        holder.share.setText(datas.get(position).getForward()+"");
        holder.command.setText(datas.get(position).getComment());
        holder.content.setText(datas.get(position).getText());
        //下载头像;
        Glide.with(context).load(datas.get(position).getU().getHeader().get(0))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade(300)
                .thumbnail(0.1f)
                .into(holder.header);

//        List<TextEntity.ListBean.TopCommentsBean> top_comments = datas.get(position).getT;
//        Log.d("print", "onBindViewHolder: text："+top_comments);
//        //为空则显示间距栏;
//        if (top_comments == null){
//            holder.view_bottom.setVisibility(View.VISIBLE);
//        }
//        //评论不为空则动态添加评论；
//        if (top_comments!= null){
//            holder.view_bottom.setVisibility(View.GONE);//隐藏;
//            holder.video_ll.removeAllViews();//移除所有布局;
//            for (int i = 0; i < top_comments.size(); i++) {
//
//                LinearLayout linearLayout = new LinearLayout(context);
//                linearLayout.setOrientation(LinearLayout.HORIZONTAL);
//                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//                lp.setMargins(40,10,10,10);
//                lp.gravity = Gravity.CENTER_VERTICAL;
//                linearLayout.setLayoutParams(lp);
//                TextView tv1 = new TextView(context);
//                tv1.setGravity(Gravity.CENTER_VERTICAL);
//                tv1.setTextColor(Color.GRAY);
//                tv1.setText(top_comments.get(i).getU().getName()+" : ");
//
//                TextView tv2 = new TextView(context);
//                tv2.setGravity(Gravity.CENTER_VERTICAL);
//                tv2.setTextColor(Color.WHITE);
//                tv2.setText(top_comments.get(i).getContent());
//
//                linearLayout.addView(tv1);
//                linearLayout.addView(tv2);
//
//                holder.video_ll.addView(linearLayout);
//            }
//        }

//        //TexturView的点击事件；
//        holder.textureView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (mediaplayer != null && mediaplayer.isPlaying()){
//                    holder.ivct.setImageResource(R.drawable.wxplayvideo);
//                    mediaplayer.pause();//视频暂停;
//                }else {
//                    holder.ivct.setImageResource(R.drawable.mediacontroller_pause);
//                    mediaplayer.start();
//                }
//            }
//        });
        //设置视频的图片;
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(datas.get(position).getVideo().getWidth(),datas.get(position).getVideo().getHeight());
        lp.gravity = Gravity.CENTER;
        holder.iv_contener.setLayoutParams(lp);
        //给图片设置tag;
        holder.iv_contener.setTag(R.id.position,position);//Values设置ids;
        //下载图片;
        Glide.with(context).load(datas.get(position).getVideo().getThumbnail().get(0))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade(300)
                .thumbnail(0.1f)
                .into(holder.iv_contener);


        //判断Item是否已经重用
        if(holder.textureView.getTag() != null) {
            if ((int)holder.textureView.getTag() != position && (int)holder.textureView.getTag() == playIndex) {
                //说明被重用了;
                if (mediaplayer != null && mediaplayer.isPlaying()){
                    mediaplayer.stop();
                    mediaplayer.reset();
                }
                playIndex = -1;
            }
        }
        //设置TexyureView;
        holder.textureView.setTag(position);
        holder.textureView.setLayoutParams(lp);
        //播放视频；
        if (position == playIndex){
            //该Item播放视频;
            //隐藏图片;
            holder.iv_contener.setVisibility(View.GONE);

            try {
                mediaplayer.setSurface(new Surface(holder.textureView.getSurfaceTexture()));
                mediaplayer.setDataSource(datas.get(position).getVideo().getVideo().get(0));
                mediaplayer.prepareAsync();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            //显示图片;
            holder.iv_contener.setVisibility(View.VISIBLE);
        }
        holder.iv_contener.setOnClickListener(this);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }


    /**
     * 图片的监听方法;点击开始播放视频;
     * @param v
     */
    @Override
    public void onClick(View v) {
        int position = (int) v.getTag(R.id.position);
        this.playIndex = position;
        //重置Mediaplayer;
        if(mediaplayer != null && mediaplayer.isPlaying()){
            mediaplayer.reset();
        }
        this.notifyDataSetChanged();
    }
    /**
     * 视屏准备完成；
     * @param mp
     */
    @Override
    public void onPrepared(MediaPlayer mp) {
        mediaplayer.start();
    }


    class VideoViewHolder extends RecyclerView.ViewHolder{
        TextView author,time,content,ding,cai,share,command;
        ImageView header,iv_contener,ivct;
        View view_bottom;
        LinearLayout video_ll;
        TextureView textureView;
        public VideoViewHolder(View itemView) {
            super(itemView);
            author = (TextView) itemView.findViewById(R.id.video_tv_name);
            time = (TextView) itemView.findViewById(R.id.video_tv_time);
            content = (TextView) itemView.findViewById(R.id.video_tv_content);
            ding = (TextView) itemView.findViewById(R.id.ding);
            cai = (TextView) itemView.findViewById(R.id.cai);
            share = (TextView) itemView.findViewById(R.id.share);
            command = (TextView) itemView.findViewById(R.id.command);

            header = (ImageView) itemView.findViewById(R.id.video_iv);
            iv_contener = (ImageView) itemView.findViewById(R.id.video_iv_center);
            ivct = (ImageView) itemView.findViewById(R.id.video_iv_ct);

            video_ll = (LinearLayout) itemView.findViewById(R.id.video_ll);

            //Texture
            textureView = (TextureView) itemView.findViewById(R.id.texture);
            //下方View;
            view_bottom = itemView.findViewById(R.id.view_bottom);

            textureView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mediaplayer != null && mediaplayer.isPlaying()){
                        ivct.setImageResource(R.drawable.wxplayvideo);
                        mediaplayer.pause();//视频暂停;
                    }else {
//                        ivct.setImageResource(R.drawable.mediacontroller_pause);
                        mediaplayer.start();
                    }
                }
            });
        }

    }
}
