/*
package com.huangj.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.widget.RemoteViews;
import android.widget.Toast;

import com.huangj.entity.Music5SingFaceEntity;
import com.huangj.entity.Music5SingListEntity;
import com.huangj.entity.MusicLPlayEntity;
import com.huangj.pro4_yhouse.R;
import com.huangj.util.Constant;
import com.huangj.util.FiveSingService;
import com.huangj.util.GetJsonDatas;

import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

*/
/**
 * Created by HuangJ on 2016/11/1.13:50
 *//*

public class MyMusicService extends Service implements MediaPlayer.OnCompletionListener {

    private MediaPlayer mediaPlayer;
    private List<Music5SingListEntity.DataBean> musicListDatas;
    private int index = -1;//播放歌曲的下标;
    private String musicName ;//当前歌曲的名称;
    private String musicSinger;//歌手;
    private String picUrl;
    private String url;//歌曲列表的URL;
    private Retrofit retrofit;
    private GetListDatsListener getListDatsListener;//接口回调;
    private FiveSingService fiveSingService;




    //通知相关;
    private NotificationManager notificationManager;
    private Notification notification;

    public void setGetListDatsListener(GetListDatsListener getListDatsListener) {
        this.getListDatsListener = getListDatsListener;
    }

    @Override
    public void onStart(Intent intent, int startId) {

        Music5SingFaceEntity.DataBean dataBean = (Music5SingFaceEntity.DataBean) intent.getSerializableExtra("datas");
        String jq = dataBean.getSURL().substring(23, 25);
        String suid = dataBean.getSUID();
        String cl = "ID%2CSN%2CSK%2CUID%2CST%2CDD%2CCT%2CGD%2CKM5&userfields=ID%2CNN%2CI";
        url = String.format(Constant.GeQuList, suid, jq, cl);
        loadDatas();//下载得到音乐列表;
        super.onStart(intent, startId);

    }

    @Override
    public void onCreate() {
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(this);
        //通知相关;
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        createNotification();
        notificationManager.notify(0x001,notification);
    }

    //获得音乐列表的下标;根据下标播放;
    public  void playMusicposition(int position){
        if (index != position){
            index = position;
            //播放音乐;
            play();
        }
    }


    */
/**
     *  TODO 播放音乐
     *//*

    public void play(){
        if (musicListDatas!=null){

            Music5SingListEntity.DataBean data = musicListDatas.get(index);

            //得到歌曲的名称、作者、头像;
            musicName = data.getSN();
            musicSinger = data.getUser().getNN();
            picUrl = data.getUser().getI();
//            Log.d("print", "play: "+musicName+"  "+musicSinger+"  "+picUrl);
            Intent intent = new Intent("com.hj.data");
            intent.putExtra("data",data);
            sendBroadcast(intent);

            //得到歌曲URL；
            int playID = data.getID();
            String playSK = data.getSK();
            String playUrl = String.format(Constant.GeQuPlay,playID,playSK);//得到音乐的URL;
            //下载得到歌曲URL;
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constant.BaseUrl)
                    .client(new OkHttpClient())
                    .build();
            fiveSingService = retrofit.create(FiveSingService.class);
            //下载歌曲的URL;
            Call<ResponseBody> playCall = fiveSingService.get5SingJson(playUrl);
            playCall.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    try {
                        MusicLPlayEntity musicPlayJson = GetJsonDatas.getMusicPlayJson(response.body().string());
                        String squrl  = musicPlayJson.getData().getSqurl();//歌曲URL;
                        try {
                            mediaPlayer.reset();//重置播放器;
                            mediaPlayer.setDataSource(squrl);//装载
                            mediaPlayer.prepare();//装载后 就绪；
                            mediaPlayer.start();//开始播放
                            timer();//开启定时器;
                        }catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                }
            });
        }
    }
    */
/**
     * 暂停、播放音乐;
     *//*

    public void control(){
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }else{
            if (musicListDatas == null){
                Toast.makeText(MyMusicService.this, "请点击歌曲播放", Toast.LENGTH_SHORT).show();
            }else{
                mediaPlayer.start();
                timer();}
        }
    }

    //上一曲
    public void above(){
        if(index == -1){
            return;
        }
        if(--index == -1){
            index = musicListDatas.size() - 1;
        }
        play();
    }

    //下一曲
    public void next(){
        if(index == -1){
            return;
        }

        if(++index == musicListDatas.size()){
            index = 0;
        }

        play();

    }

    */
/**
     * 判断播放的状态；
     *//*

    public boolean isPlaying(){
        if (mediaPlayer.isPlaying()){
            return true;
        } else  {
            return false;
        }
    }

    */
/**
     * 定时器;
     *//*

    private Timer timer = null;
    public void timer(){
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (mediaPlayer.isPlaying()){
                    Intent intent = new Intent("com.hj.progress");
                    intent.putExtra("progress",mediaPlayer.getCurrentPosition());
                    intent.putExtra("max",mediaPlayer.getDuration());
                    sendBroadcast(intent);//发送广播;
                }else {
                    timer.cancel();
                    timer = null;
                }
            }
        },0,1000);
    }

    //下载音乐列表数据;
    private void loadDatas() {

        retrofit = new Retrofit.Builder()
                .baseUrl(Constant.BaseUrl)
                .client(new OkHttpClient())
                .build();
        fiveSingService = retrofit.create(FiveSingService.class);
        Call<ResponseBody> fiveSingSerCall = fiveSingService.get5SingJson(url);
        fiveSingSerCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Music5SingListEntity music5SingListJson = GetJsonDatas.getMusic5SingListJson(response.body().string());
                    musicListDatas =  music5SingListJson.getData();
                    if (getListDatsListener != null && musicListDatas != null) {
                        getListDatsListener.getList(musicListDatas);//借口回调返回数据;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
            }
        });

    }

    */
/**
     * TODO 通知的方法
     *//*

    public void createNotification(){
        RemoteViews remoteViews = new RemoteViews(getPackageName(),R.layout.notification_layout);
        //更新远程试图;
//        remoteViews.setTextViewText(R.id.tv_notification_name,musicName);
//        remoteViews.setTextViewText(R.id.tv_notification_singer,musicSinger);
//        Glide.with(this).load(picUrl).asBitmap().into(new SimpleTarget<Bitmap>() {
//            @Override
//            public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
//                remoteViews.setImageViewBitmap(R.id.iv_notification_pic,resource);
//            }
//        });

        notification = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.icon)
                .setTicker(musicName)
                .setContent(remoteViews)
                .build();
    }

    */
/**
     * 得到Service对象;
     * @param intent
     * @return
     *//*

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBind();
    }

    */
/**
     * 音乐播放完成的监听;
     * @param mp
     *//*

    @Override
    public void onCompletion(MediaPlayer mp) {
        if (index == musicListDatas.size()-1 ){
            index = 0;
            play();//自动播放第一首;
        }
        if(index < musicListDatas.size()-1 && index!=0){
            index++;
            play();//自动播放下一曲;
        }

    }

    */
/**
     * 返回Service对象;
     *//*

    public class MyBind extends Binder {
        public MyMusicService getService() {
            return MyMusicService.this;
        }
    }
    //接口回调;
    public interface GetListDatsListener {
        void getList(List<Music5SingListEntity.DataBean> musicListDatas);
    }

}
*/
