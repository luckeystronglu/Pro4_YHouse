package com.huangj.util;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huangj.entity.FoodEntity;
import com.huangj.entity.FoodsPicEntity;
import com.huangj.entity.MusicEntity;
import com.huangj.entity.PlayEntity;
import com.huangj.entity.TextEntity;
import com.huangj.entity.TextInfoEntity;
import com.huangj.entity.VideoEntity;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuangJ on 2016/10/26.17:29
 */
public class GetJsonDatas {


    //获得JSON数据;
     public static String getJSON(String filename, Context context){
          InputStream in = null;
          ByteArrayOutputStream out = null;
         try {
             in = context.getAssets().open(filename);
             out = new ByteArrayOutputStream();
             int len = 0;
             byte buffer []  = new byte[1024];
             while ((len = in.read(buffer))!=-1){
                out.write(buffer,0,len);
             }
               String json = new String(out.toByteArray());
             Log.d("print", "getJSON: "+json);
             return json;
         } catch (Exception e) {
             e.printStackTrace();
         }finally {
             try {
                 in.close();
                 out.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         return null;
     }
    //第二种获得JSON数据;
     public static String getJSON2(String filename, Context context){

        StringBuilder builder = new StringBuilder();
        try {
            InputStream in = context.getAssets().open(filename);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            String line = null;
            while((line = bufferedReader.readLine())!=null){
                builder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.i("abc", builder.toString());
        try {
            return new String(builder.toString().getBytes(),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "解析失败";
    }

    //美食的头部图片;
    public static List<FoodsPicEntity> getFoodsPic(String json){
        if (json!=null) {
            List<FoodsPicEntity> datas = new ArrayList<>();
            try {
                JSONObject  jsonObject = new JSONObject(json);
                JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray("reserveList");
                for (int i = 0 ; i< jsonArray.length();i++){
                    JSONArray jsonArray1 = jsonArray.getJSONObject(i).getJSONArray("content");
                    TypeToken<List<FoodsPicEntity>> tt = new TypeToken<List<FoodsPicEntity>>(){};
                    datas = new Gson().fromJson(jsonArray1.toString(), tt.getType());
                    return datas;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    //解析美食内容;
    public static FoodEntity getFoodsEntity(String json){
        if (json!=null){
            return new Gson().fromJson(json,FoodEntity.class);
        }
        return null;
    }
    // 解析玩乐、生活数据;
    public static PlayEntity getPlayEntity(String json){
        if (json!=null){
            return new Gson().fromJson(json,PlayEntity.class);
        }
        return null;
    }
    //解析视频的数据;
    public static VideoEntity getVideoEntity(String json){
        if (json!=null) {
            return new Gson().fromJson(json,VideoEntity.class);
        }
        return null;
    }
    //解析段子的数据;
    public static TextEntity getTextEntty(String json){
        if (json != null){
            return  new Gson().fromJson(json,TextEntity.class);
        }
        return  null;
    }
    //解析评论详情的数据;
    public static TextInfoEntity getTextInfo(String json){
        if (json != null){
            return  new Gson().fromJson(json,TextInfoEntity.class);
        }
        return  null;
    }

    //解析虾米音乐的列表;
    public static MusicEntity getMusicJson(String json){
        try {
            return new Gson().fromJson(json,MusicEntity.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
