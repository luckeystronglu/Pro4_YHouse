/*package com.huangj.pro4_yhouse;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
//import com.huangj.adapter.MusicListAdapter;
//import com.huangj.entity.Music5SingListEntity;
import com.huangj.huangjlibrary.base.BaseActivity;
import com.huangj.huangjlibrary.util.SharedUtil;
import com.huangj.service.MyMusicService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import butterknife.Bind;
import retrofit2.Retrofit;

*//**
 * Created by HuangJ on 2016/10/31.20:48
 *//*
public class MusicListActivity extends BaseActivity implements AdapterView.OnItemClickListener {



    private MyMusicService myMusicService;//服务对象;
    private Retrofit retrofit;
    private BroadcastReceiver broadcastReceiver;
    private Boolean play = false;
    @Bind(R.id.iv_musicPic)
    ImageView ivsinger;
    @Bind(R.id.tv_musicName)
    TextView musicname;
    @Bind(R.id.tv_musicSinger)
    TextView singer;
    @Bind(R.id.tv_max)
    TextView tv_progressmax;
    @Bind(R.id.tv_progress)
    TextView tv_progress;
    @Bind(R.id.seekbar)
    SeekBar seekBar;
    @Bind(R.id.iv_musicPlay)
    ImageView musicplay;
    @Bind(R.id.lv)
    ListView listView;

    private MusicListAdapter musicListAdapter;

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            //绑定成功;
            myMusicService = ((MyMusicService.MyBind)service).getService();//得到Service对象
            myMusicService.setGetListDatsListener(new MyMusicService.GetListDatsListener() {
                @Override
                public void getList(List<Music5SingListEntity.DataBean> musicListDatas) {
                    musicListAdapter.setDatas(musicListDatas);
                }
            });
        }
        @Override
        public void onServiceDisconnected(ComponentName name) {
        }
    };
    private boolean playing;

    @Override
    protected int getContentId() {
        return R.layout.activity_musiclist;
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void init() {
        //再次调用服务;
        Intent intent = new Intent(this, MyMusicService.class);
        bindService(intent,serviceConnection,BIND_AUTO_CREATE);
        musicListAdapter = new MusicListAdapter(this);
        listView.setAdapter(musicListAdapter);
        listView.setOnItemClickListener(this);//点击事件;

        //读取共享参数;
        String dataSN = SharedUtil.getString("sn");
        String nn = SharedUtil.getString("nn");
        String i = SharedUtil.getString("i");
        //再次设置到界面上;
        musicname.setText(dataSN);
        singer.setText(nn);
        Glide.with(MusicListActivity.this).load(i).diskCacheStrategy(DiskCacheStrategy.ALL).crossFade(200).thumbnail(0.1f).into(ivsinger);

        //开启广播;接受广播;
        broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                switch (intent.getAction()){
                    case "com.hj.progress":
                        //得到歌曲最大最小值;
                        int progress = intent.getIntExtra("progress",-1);
                        int max = intent.getIntExtra("max",-1);
                        //设置SeekBar;
                        seekBar.setMax(max);
                        seekBar.setProgress(progress);
                        //设置时间;
                        Date date1 = new Date(progress);
                        Date date2 = new Date(max);
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
                        tv_progress.setText(simpleDateFormat.format(date1));
                        tv_progressmax.setText(simpleDateFormat.format(date2));
                    case "com.hj.data":
                        Music5SingListEntity.DataBean data  = (Music5SingListEntity.DataBean) intent.getSerializableExtra("data");
                        //设置头像以及歌曲名称;
                        if (data!=null) {
                            String dataSN = data.getSN();
                            String nn = data.getUser().getNN();
                            String i = data.getUser().getI();
                            //保存进共享参数之中;
                            SharedUtil.putString("sn",dataSN);
                            SharedUtil.putString("nn",nn);
                            SharedUtil.putString("i",i);
                            //设置到界面上;
                            musicname.setText(dataSN);
                            singer.setText(nn);
                            Glide.with(MusicListActivity.this).load(i).diskCacheStrategy(DiskCacheStrategy.ALL).crossFade(200).thumbnail(0.1f).into(ivsinger);
                        }
                        break;
                }
            }
        };
        //注册广播;
        IntentFilter  intentFilter = new IntentFilter();
        intentFilter.addAction("com.hj.progress");
        intentFilter.addAction("com.hj.data");
        registerReceiver(broadcastReceiver,intentFilter);
    }

    @Override
    protected void bindListener() {


    }

    *//**
     * ListView的点击事件;
     *//*
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        myMusicService.playMusicposition(position);//传点击的下表进服务、再进行播放;
        musicplay.setImageResource(R.drawable.player_pause_selected);
    }
    *//**
     * 下面的点击事件;
     * @param v
     *//*
    public void imageViewOnclick(View v){
        switch (v.getId()) {
            case R.id.iv_musicPlay:
                myMusicService.control();//播放点击的音乐;
                playing = myMusicService.isPlaying();
                if (playing) {
                    musicplay.setImageResource(R.drawable.player_pause_selected);
                } else {
                    musicplay.setImageResource(R.drawable.player_start_selected);
                }
                Log.d("print", "imageViewOnclick: 点击了暂停/播放");
                break;
            case R.id.iv_musicNext:
                myMusicService.next();
                Log.d("print", "imageViewOnclick: 点击了下一首");
                if (playing) {
                    musicplay.setImageResource(R.drawable.player_pause_selected);
                } else {
                    musicplay.setImageResource(R.drawable.player_start_selected);
                    tv_progress.setText("00:00");
                    tv_progressmax.setText("00:00");
                }
                break;
            case R.id.iv_musicshang:
                myMusicService.above();
                Log.d("print", "imageViewOnclick: 点击了上一首");
                tv_progress.setText("00:00");
                tv_progressmax.setText("00:00");
                break;
        }
    }

}
*/