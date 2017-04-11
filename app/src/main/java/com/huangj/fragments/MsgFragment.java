package com.huangj.fragments;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.huangj.adapter.MsgAdapter;
import com.huangj.entity.MsgEntity;
import com.huangj.huangjlibrary.base.BaseFragment;
import com.huangj.huangjlibrary.util.DownUtil;
import com.huangj.pro4_yhouse.MsgInfoActivity;
import com.huangj.pro4_yhouse.R;
import com.huangj.util.Constant;

import java.util.List;

import butterknife.Bind;

/**
 * Created by HuangJ on 2016/10/24.21:24
 */
public class MsgFragment extends BaseFragment implements DownUtil.OnDownListener, AdapterView.OnItemClickListener {

    //获取适配器
    private MsgAdapter msgAdapter;

    //获取listview
    @Bind(R.id.msg_lv)
    public ListView lv;

    @Bind(R.id.srl)
    public SwipeRefreshLayout srl;

    @Override
    public int getContentId() {
        return R.layout.fragment_msg;
    }

    /**
     * 初始化
     * @param view
     */
    @Override
    protected void init(View view) {
        msgAdapter = new MsgAdapter(getActivity());
        lv.setAdapter(msgAdapter);
        lv.setOnItemClickListener(this);

    }

    /**
     * 加载数据
     */
    @Override
    protected void loadDatas(){
        new DownUtil().setOnDownListener(this).downJSON(Constant.MSG_URL);
    }

    /**
     * 解析JSON
     * @param json
     * @return
     */
    @Override
    public Object paresJson(String json) {
        if (json != null){
            return new Gson().fromJson(json.toString(),MsgEntity.class);
        }
        return null;
    }

    /**
     * 解析完成
     * @param object
     */
    @Override
    public void downSucc(Object object) {
        if (object != null){
            MsgEntity msgEntity = (MsgEntity) object;
            List<MsgEntity.CustomerFeedListBean> datas = msgEntity.getCustomerFeedList();
            //将数据放入适配器
            msgAdapter.setDatas(datas);
        }
    }

    @Override
    protected void bindListener() {
        srl.setColorSchemeResources(R.color.appcolor);
        srl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadDatas();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        srl.setRefreshing(false);
                        Toast.makeText(getActivity(), "刷新完成", Toast.LENGTH_SHORT).show();
                    }
                },1000);
            }
        });
    }

    /**
     * listview item的点击监听
     * @param parent
     * @param view
     * @param position
     * @param id
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        MsgEntity.CustomerFeedListBean item = (MsgEntity.CustomerFeedListBean) msgAdapter.getItem(position);
        Intent intent = new Intent(getActivity(), MsgInfoActivity.class);
        intent.putExtra("id",item.getFeed().getFeedId() + "");
        Log.d("print", "点击了第" + position + "item  ");
        startActivity(intent);
    }
}
