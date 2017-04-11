package com.huangj.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.huangj.entity.VideoEntity;
import com.huangj.pro4_yhouse.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuangJ on 2016/10/28.20:55
 */
public class Video_LvAdapter extends BaseAdapter implements MediaPlayer.OnPreparedListener, View.OnClickListener {

    private Context context;
    private List<VideoEntity.ListBean> datas ;
    private int playIndex = -1;//需要播放的视频item下标

    private MediaPlayer mediaplayer;//定义视频播放器;

    public Video_LvAdapter(Context context) {
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
        if (viewHolder != null){
            viewHolder = (ViewHolder) convertView.getTag();
        }else {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_video,null);
            viewHolder.author = (TextView) convertView.findViewById(R.id.video_tv_name);
            viewHolder.time = (TextView) convertView.findViewById(R.id.video_tv_time);
            viewHolder.content = (TextView) convertView.findViewById(R.id.video_tv_content);
            viewHolder.ding = (TextView) convertView.findViewById(R.id.ding);
            viewHolder.cai = (TextView) convertView.findViewById(R.id.cai);
            viewHolder.share = (TextView) convertView.findViewById(R.id.share);
            viewHolder.command = (TextView) convertView.findViewById(R.id.command);

            viewHolder.header = (ImageView) convertView.findViewById(R.id.video_iv);
            viewHolder.iv_contener = (ImageView) convertView.findViewById(R.id.video_iv_center);
            viewHolder.ivct = (ImageView) convertView.findViewById(R.id.video_iv_ct);

            viewHolder.video_ll = (LinearLayout) convertView.findViewById(R.id.video_ll);

            //Texture
            viewHolder.textureView = (TextureView) convertView.findViewById(R.id.texture);
            //下方View;
            viewHolder.view_bottom = convertView.findViewById(R.id.view_bottom);
            viewHolder.textureView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //暂停position
                    if(mediaplayer != null && mediaplayer.isPlaying()){
                        mediaplayer.pause();
                        Log.d("print", "onClick: 视频   点击了暂停textTureView");
                    } else {
                        Log.d("print", "onClick: 视频  点击了播放视屏");
                        mediaplayer.start();
                    }
                }
            });
            //设置图片的点击事件
            viewHolder.iv_contener.setOnClickListener(this);
            convertView.setTag(viewHolder);
        }

        viewHolder.author.setText(datas.get(position).getU().getName());
        viewHolder.time.setText(datas.get(position).getPasstime());
        viewHolder.ding.setText(datas.get(position).getUp());
        viewHolder.cai.setText(datas.get(position).getDown()+"");
        viewHolder.share.setText(datas.get(position).getForward()+"");
        viewHolder.command.setText(datas.get(position).getComment());
        viewHolder.content.setText(datas.get(position).getText());
        //下载头像;
        Glide.with(context).load(datas.get(position).getU().getHeader().get(0))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade(300)
                .thumbnail(0.1f)
                .into(viewHolder.header);

        //设置视频的图片;
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(datas.get(position).getVideo().getWidth(),datas.get(position).getVideo().getHeight());
        lp.gravity = Gravity.CENTER;
        viewHolder.iv_contener.setLayoutParams(lp);
        //给图片设置tag;
        viewHolder.iv_contener.setTag(R.id.position,position);//Values设置ids;
        //下载图片;
        Glide.with(context).load(datas.get(position).getVideo().getThumbnail().get(0))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade(300)
                .thumbnail(0.1f)
                .into(viewHolder.iv_contener);
        //判断Item是否已经重用
        if(viewHolder.textureView.getTag() != null){
            if((int)viewHolder.textureView.getTag() != position && (int)viewHolder.textureView.getTag() == playIndex){
                //说明Item已经被重用
                if(mediaplayer != null && mediaplayer.isPlaying()){
                    mediaplayer.stop();
                    mediaplayer.reset();
                }
                playIndex = -1;
            }
        }
        //设置TextureView
        viewHolder.textureView.setTag(position);
        viewHolder.textureView.setLayoutParams(lp);

        //开始播放视频
        if(position == playIndex){
            Log.d("print", "getView: 进入播放1");
            //该item需要播放视频
            //隐藏图片
            viewHolder.iv_contener.setVisibility(View.GONE);
            viewHolder.ivct.setVisibility(View.GONE);
            try {

                Log.d("print", "getView:视频链接：  "+datas.get(position).getVideo().getVideo().get(0));
                mediaplayer.setDataSource(datas.get(position).getVideo().getVideo().get(0));
                mediaplayer.setSurface(new Surface(viewHolder.textureView.getSurfaceTexture()));
                mediaplayer.prepareAsync();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            //显示图片
            viewHolder.iv_contener.setVisibility(View.VISIBLE);
            viewHolder.ivct.setVisibility(View.VISIBLE);
        }
        return convertView;
    }


    /**
     * 图片的点击事件;
     * @param v
     */
    @Override
    public void onClick(View v) {
        int position = (int) v.getTag(R.id.position);
        this.playIndex = position;
        Log.d("print", "onClick: 点击了外层图片");
        //重置Mediaplayer
        if(mediaplayer != null && mediaplayer.isPlaying()){
            Log.d("print", "onClick: 视频准备");
            mediaplayer.reset();
        }
        this.notifyDataSetChanged();
    }

    /**
     * 视频准备完成;
     * @param mp
     */
    @Override
    public void onPrepared(MediaPlayer mp) {
        Log.d("print", "onPrepared: 视频准备完成");
        mediaplayer.start();
    }

    class ViewHolder{
        TextView author,time,content,ding,cai,share,command;
        ImageView header,iv_contener,ivct;
        View view_bottom;
        LinearLayout video_ll;
        TextureView textureView;
    }
}
