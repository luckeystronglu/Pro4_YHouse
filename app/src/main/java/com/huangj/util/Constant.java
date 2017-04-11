package com.huangj.util;

/**
 * Created by HJ on 2016/10/20.
 */

public interface Constant {
   /* *//**
     * 预订URL
     *//*
    //城市URL
     String CITY_URL = "http://api.yhouse.com/m/city/dynmiclist?pos=116.397123,39.90678&coordType=1";
    //生活课程头部URL
     String LIFEHEAD_URL = "http://api.yhouse.com/rocket/launch?type=101&cityId=1&catalogId=3&siteId=-2";
     String LIFECONTENT_URL = "http://api.yhouse.com/m/catalogData/list?cityId=1&page=1&pageSize=20&siteId=-2&catalogId=3&pid=&coordType=1&pos=116.397123,39.90678";
    //玩乐头部URL
     String PLAYHEAD_URL = "http://api.yhouse.com/rocket/launch?type=101&cityId=1&catalogId=1&siteId=-2";
     String PLAYCONTENT_URL = "http://api.yhouse.com/m/catalogData/list?cityId=1&page=1&pageSize=20&siteId=-2&catalogId=1&pid=&coordType=1&pos=116.397123,39.90678";
    //美食头部UR
     String FOODHEAD_URL = "http://api.yhouse.com/rocket/launch?type=101&cityId=1&catalogId=2&siteId=-2";
    //美食内容URL
     String FOODCONTENT_URL = "http://api.yhouse.com/m/catalogData/list?cityId=1&page=1&pageSize=20&siteId=-2&catalogId=2&pid=&coordType=1&pos=116.397123,39.90678";
    //HOME内容URL
     String HOME_URL = "http://api.yhouse.com/m/catalogData/list?cityId=1&page=1&pageSize=20&siteId=-2&catalogId=%d&pid=&coordType=1&pos=116.397123,39.90678";
     String HOMEHEAD_URL = "http://api.yhouse.com/rocket/launch?type=101&cityId=1&catalogId=%d&siteId=-2";
    *//**
     * 社区URL
     *//*
    //热门
     String HOT_URL = "http://api.yhouse.com/rocket/launch?cityId=1&catalogId=11&siteId=-2&type=102";
    *//**
     * 动态URL
     *
     //动态内容
     String MSG_URL = "http://zaiwai.qunawan.com/recommendFeedService/findRecommendCustomerFeedListBySourceUserId?sToken=379673296794183&sourceUserId=378195987904416";
     //动态详情
     String MSGINFO_URL = "http://zaiwai.qunawan.com/feedService/findCustomerFeedDetailByFeedId?sToken=379673296794183&feedId=%s&userId=378195987904416 ";
     //动态评论
     String MSGCOMMENT_URL = "http://zaiwai.qunawan.com/replyService/findCustomerFeedReplyListByFeedId?sToken=379673296794183&feedId=%s";

     */
    //动态内容
    String MSG_URL = "http://zaiwai.qunawan.com/recommendFeedService/findRecommendCustomerFeedListBySourceUserId?sToken=379673296794183&sourceUserId=378195987904416&page=1";
    //动态详情
    String MSGINFO_URL = "http://zaiwai.qunawan.com/feedService/findCustomerFeedDetailByFeedId?sToken=379673296794183&feedId=%s&userId=378195987904416 ";
    //动态评论
    String MSGCOMMENT_URL = "http://zaiwai.qunawan.com/replyService/findCustomerFeedReplyListByFeedId?sToken=379673296794183&feedId=%s";
    //个人资料
    String MSGUSERDATA_URL = "http://zaiwai.qunawan.com/userService/findCustomerUserDetailBySourceUserIdAndTargetUserName?sToken=379673296794183&sourceUserId=378195987904416&targetUserName=%s";
    //高德地图坐标
    String MSGUSERMAP_URL = "http://zaiwai.qunawan.com/commonService/findUserTrace?sToken=379673296794183&userId=%s";
    /**
     * 不得姐的URL
     * 百思不得姐
     精华头部：http://s.budejie.com/public/list-appbar/budejie-android-6.5.7/?market=wandoujia&udid=864394011166024&appname=baisibudejie&os=4.4.2&client=android&visiting=&mac=EC%3A8E%3AB5%3A59%3A3B%3AAE&ver=6.5.7
     内容：精华头部中的url + 0budejie-android-6.5.7/0-20.json?market=wandoujia&udid=864394011166024&appname=baisibudejie&os=4.4.2&client=android&visiting=&mac=EC%3A8E%3AB5%3A59%3A3B%3AAE&ver=6.5.7
     */
    String BSBDJ_HEADER="http://s.budejie.com/public/list-appbar/budejie-android-6.5.7/?market=wandoujia&udid=864394011166024&appname=baisibudejie&os=4.4.2&client=android&visiting=&mac=EC%3A8E%3AB5%3A59%3A3B%3AAE&ver=6.5.7";
    String BSBDJ_PJ="0budejie-android-6.5.7/0-20.json?market=wandoujia&udid=864394011166024&appname=baisibudejie&os=4.4.2&client=android&visiting=&mac=EC%3A8E%3AB5%3A59%3A3B%3AAE&ver=6.5.7";
    String baseUrl="http://s.budejie.com/";
    String BSBDJ_SP="http://s.budejie.com/topic/list/jingxuan/41/0budejie-android-6.5.7/0-20.json?market=wandoujia&udid=864394011166024&appname=baisibudejie&os=4.4.2&client=android&visiting=&mac=EC%3A8E%3AB5%3A59%3A3B%3AAE&ver=6.5.7";
    String BSDBJ_TEXT="http://s.budejie.com/topic/tag-topic/64/hot/0budejie-android-6.5.7/0-%d.json?market=wandoujia&udid=864394011166024&appname=baisibudejie&os=4.4.2";
    String BSBDJ_TEXTPL = "http://c.api.budejie.com/topic/comment_list/%s/0/budejie-android-6.5.7/0-20.json?";
    /**
     * 音乐播放器的接口;
     */
    String COMMEND = "http://spark.api.xiami.com/api?api_key=263b63d85992a30cc6030aff03c9dfd0&call_id=1477722302362&av=android_126&v=5.0&app_v=5070200&os_v=19_4.4.2&ch=10001608&network=1&device_id=simulator.00.00.00.00&platform_id=1&gps=113.95722833333333%2C22.583156666666664&lg=zh_CN&utdid=V%2FMsFEYE6PUDAP%2FznHCwWh9P&resolution=1244*720&method=collect.music-list&order=recommend&limit=20&page=1&proxy=0&api_sig=63c32e4bbe3f93da88064deff4a47553";
    String HOT = "http://spark.api.xiami.com/api?api_key=263b63d85992a30cc6030aff03c9dfd0&call_id=1477722872675&av=android_126&v=5.0&app_v=5070200&os_v=19_4.4.2&ch=10001608&network=1&device_id=simulator.00.00.00.00&platform_id=1&gps=113.95722833333333%2C22.583156666666664&lg=zh_CN&utdid=V%2FMsFEYE6PUDAP%2FznHCwWh9P&resolution=1244*720&method=collect.music-list&order=hot&limit=20&page=1&proxy=0&api_sig=3badee3861653d671d58d4ab86394d57";
    String NEW = "http://spark.api.xiami.com/api?api_key=263b63d85992a30cc6030aff03c9dfd0&call_id=1477722936771&av=android_126&v=5.0&app_v=5070200&os_v=19_4.4.2&ch=10001608&network=1&device_id=simulator.00.00.00.00&platform_id=1&gps=113.95722833333333%2C22.583156666666664&lg=zh_CN&utdid=V%2FMsFEYE6PUDAP%2FznHCwWh9P&resolution=1244*720&method=collect.music-list&order=new&limit=20&page=1&proxy=0&api_sig=562f07ec28514346945e05d9b20a0d10";
    String SPECIALLY="http://spark.api.xiami.com/api?api_key=263b63d85992a30cc6030aff03c9dfd0&call_id=1477722957855&av=android_126&v=5.0&app_v=5070200&os_v=19_4.4.2&ch=10001608&network=1&device_id=simulator.00.00.00.00&platform_id=1&gps=113.95722833333333%2C22.583156666666664&lg=zh_CN&utdid=V%2FMsFEYE6PUDAP%2FznHCwWh9P&resolution=1244*720&method=zone.music-list&limit=20&page=1&proxy=0&api_sig=c83e4aaa17f52d53789a5eb69737e592";
    String COMMEND2 = "http://spark.api.xiami.com/api?api_key=263b63d85992a30cc6030aff03c9dfd0&call_id=1477820922239&av=android_126&v=5.0&app_v=5070200&os_v=19_4.4.2&ch=702006&network=1&device_id=simulator.00.00.00.00&platform_id=1&gps=113.95726666666665%2C22.583205&lg=zh_CN&utdid=WBWVE3Pk9bQDADNPQZnMZnRP&resolution=1280*720&method=collect.music-list&order=recommend&limit=20&page=2&proxy=0&api_sig=daa2734a731e8e9a9967b4f8d542a894";
    /**
     * 5Sing音乐接口
     */
    String BaseUrl="http://mobileapi.5sing.kugou.com/";
    String ZHUYE = "http://mobileapi.5sing.kugou.com/channel/channel?limit=12&offset=1&sid=0";
    String GeQu= "http://mobileapi.5sing.kugou.com/channel/song?limit=%d&offset=0&cid=%s";
    String GeQuList= "http://mobileapi.5sing.kugou.com/song/user?userid=%s&songtype=%s&pageindex=1&pagesize=20&songfields=%s";
    String GeQuPlay = "http://mobileapi.5sing.kugou.com/song/getSongUrl?songid=%d&songtype=%s";
}
