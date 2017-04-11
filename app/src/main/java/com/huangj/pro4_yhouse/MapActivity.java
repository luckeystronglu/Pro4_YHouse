package com.huangj.pro4_yhouse;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.MapView;
import com.amap.api.maps2d.model.BitmapDescriptorFactory;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.google.gson.Gson;
import com.huangj.entity.MapEntity;
import com.huangj.huangjlibrary.util.DownUtil;
import com.huangj.util.Constant;

/**
 * Created by mmmm on 2016/11/2.
 */
public class MapActivity extends Activity implements DownUtil.OnDownListener {
    private String url;
    private MapView mMapView = null;
    private AMap aMap= null;
    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        //获取地图控件引用
        mMapView = (MapView) findViewById(R.id.gbMap);
        //在activity执行onCreate时执行mMapView.onCreate(savedInstanceState)，实现地图生命周期管理
        mMapView.onCreate(savedInstanceState);

        //初始化地图变量
        if (aMap == null) {
            aMap = mMapView.getMap();
        }
        init();
        loadDatas();
    }

    /**
     * 初始化
     */
    private void init() {
        Intent intent = getIntent();
        id = intent.getStringExtra("id");
        url = String.format(Constant.MSGUSERMAP_URL,id);
    }

    /**
     * 加载数据
     */
    private void loadDatas() {
        new DownUtil().setOnDownListener(this).downJSON(url);
    }

    /**
     * 解析JSON
     * @param json
     * @return
     */
    @Override
    public Object paresJson(String json) {
        if (json != null){
            return new Gson().fromJson(json.toString(), MapEntity.class);
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
            MapEntity mapEntity = (MapEntity) object;
            if (mapEntity.getSimpleFeedList().size() != 0 ) {
                for (int i = 0; i < mapEntity.getSimpleFeedList().size(); i++) {
                    LatLng latLng = new LatLng(mapEntity.getSimpleFeedList().get(i).getLat(),mapEntity.getSimpleFeedList().get(i).getLng());
                    MarkerOptions markerOptions = new MarkerOptions();
                    markerOptions.position(latLng)
                            .draggable(true)
                            .title(mapEntity.getSimpleFeedList().get(i).getId() + "")
                            .icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory
                                    .decodeResource(getResources(),
                                            R.drawable.map_marker_feed)));

                    Marker marker = aMap.addMarker(markerOptions);
                }
            }
            if (mapEntity.getSimplePicList().size() != 0){
                for(int j = 0; j < mapEntity.getSimplePicList().size() ; j++){
                    LatLng latLng = new LatLng(mapEntity.getSimplePicList().get(j).getLat(),mapEntity.getSimplePicList().get(j).getLng());
                    MarkerOptions markerOptions = new MarkerOptions();
                    markerOptions.position(latLng)
                            .draggable(true)
                            .title(mapEntity.getSimplePicList().get(j).getId() + "")
                            .icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory
                                    .decodeResource(getResources(),
                                            R.drawable.map_marker_feed)));

                    Marker marker = aMap.addMarker(markerOptions);
                }
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        mMapView.onDestroy();
    }
    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView.onResume ()，实现地图生命周期管理
        mMapView.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView.onPause ()，实现地图生命周期管理
        mMapView.onPause();
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，实现地图生命周期管理
        mMapView.onSaveInstanceState(outState);
    }
}
