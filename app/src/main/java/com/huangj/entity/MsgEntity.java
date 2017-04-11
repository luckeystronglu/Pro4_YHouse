package com.huangj.entity;

import com.huangj.adapter.AbsMoreBaseAdapter;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mmmm on 2016/10/26.
 */
public class MsgEntity implements Serializable{
    private int i = 0;
    /**
     * author : {"userId":370742686885792,"name":"瑶莲","picUrl":"http://apphead.zaiwai.com/2015111620530541212555avatar","bgPicUrl":null,"content":"慧根天成藏七情广结世上善缘，佛心早定去六欲普建人间天堂！","tabs":"旅行[tab]户外[tab]摄影","sex":0,"phone":"1354242****","lastRequestTime":"20161026184109","isPicRealPersopn":1,"birthday":"","isAccessPhoneSearch":1,"isAccessShowRequestTime":1,"blockSexType":-1,"isOpenInviteHeplerFeedNotify":1,"picUrlHeader":"http://zwhead.b0.upaiyun.com"}
     * pictureList : [{"id":378415340310176,"lng":99.93651,"lat":23.12679,"altitude":0,"location":null,"time":"20161026155135","url":"/3707426868857921477476449091629785180.jpg","content":null,"exif":null,"userId":370742686885792,"width":1704,"high":2272,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378530421403552,"lng":99.937035,"lat":23.126127,"altitude":0,"location":null,"time":"20161026160017","url":"/37074268688579214774764490851951831108.jpg","content":null,"exif":null,"userId":370742686885792,"width":1704,"high":2272,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378260341112736,"lng":99.93701,"lat":23.126137,"altitude":0,"location":null,"time":"20161026160049","url":"/3707426868857921477476449566-2058069571.jpg","content":null,"exif":null,"userId":370742686885792,"width":1704,"high":2272,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378434126319520,"lng":99.93701,"lat":23.126137,"altitude":0,"location":null,"time":"20161026160052","url":"/37074268688579214774764495561162523565.jpg","content":null,"exif":null,"userId":370742686885792,"width":1704,"high":2272,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378328053690016,"lng":99.937035,"lat":23.12607,"altitude":0,"location":null,"time":"20161026160102","url":"/37074268688579214774764498681966863568.jpg","content":null,"exif":null,"userId":370742686885792,"width":1704,"high":2272,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378508477695904,"lng":99.937065,"lat":23.125984,"altitude":0,"location":null,"time":"20161026160112","url":"/3707426868857921477476449873-154721022.jpg","content":null,"exif":null,"userId":370742686885792,"width":1704,"high":2272,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378473532219040,"lng":99.93705,"lat":23.125942,"altitude":0,"location":null,"time":"20161026160119","url":"/37074268688579214774764502101778839747.jpg","content":null,"exif":null,"userId":370742686885792,"width":1704,"high":2272,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378623080240800,"lng":99.93709,"lat":23.125887,"altitude":0,"location":null,"time":"20161026160126","url":"/3707426868857921477476450411-139713294.jpg","content":null,"exif":null,"userId":370742686885792,"width":1704,"high":2272,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378781515227040,"lng":99.93724,"lat":23.125816,"altitude":0,"location":null,"time":"20161026160200","url":"/3707426868857921477476450623-477872109.jpg","content":null,"exif":null,"userId":370742686885792,"width":1704,"high":2272,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"}]
     * praiseId : null
     * praiseCount : 9
     * forwardCount : 0
     * replyCount : 4
     * retweet : null
     * retweetAuthor : null
     * retweetPraiseCount : 0
     * retweetForwardCount : 0
     * retweetReplyCount : 0
     * retweetPictureList : null
     * retweetPraiseId : null
     * remark :
     * relationType : 0
     * oppositeRelationType : 0
     * referEntryList : null
     * topicEntryList : null
     * distance : null
     * browserCount : 0
     * collecttionCount : 0
     * specialSubjectPicture : null
     * specialSubjectList : null
     * feedSupplyList : []
     * feed : {"feedId":378337010759584,"userId":370742686885792,"location":"中国云南省普洱市澜沧拉祜族自治县文东佤族乡文东段","lng":99.89671,"lat":23.173605,"picIdList":"378415340310176,378530421403552,378260341112736,378434126319520,378328053690016,378508477695904,378473532219040,378623080240800,378781515227040","addTime":"20161026180742","content":"在邦威村偶遇这位80岁的老奶奶，我与她边聊边走拍照，其实我一点也听不懂她说什么 ，享受一份外婆的情怀！80岁的老奶奶还能背着这一筐爬坡干农活，敬佩呀！在分岔路口看着她远去的背影，我好想好想喊一声：外婆！","altitude":0,"state":0,"sourceFeedId":null,"equipment":"iPhone6,2","type":0,"osType":0,"isFound":0,"exp2":null,"exp3":null,"beginDate":null,"endDate":null,"topicIdList":null,"invitetype":0,"terminis":null,"title":null,"originAnalyse":null,"originLocate":null,"exp1":null}
     */

    private List<CustomerFeedListBean> customerFeedList;
    /**
     * id : 378739687671456
     * feedId : 378337010759584
     * userId : 1234567890
     * createTime : 2016-10-26 18:17:19
     */

    private List<FeedRefereeListBean> feedRefereeList;

    public List<CustomerFeedListBean> getCustomerFeedList() {
        return customerFeedList;
    }

    public void setCustomerFeedList(List<CustomerFeedListBean> customerFeedList) {
        this.customerFeedList = customerFeedList;
    }

    public List<FeedRefereeListBean> getFeedRefereeList() {
        return feedRefereeList;
    }

    public void setFeedRefereeList(List<FeedRefereeListBean> feedRefereeList) {
        this.feedRefereeList = feedRefereeList;
    }



    public static class CustomerFeedListBean implements AbsMoreBaseAdapter.OnType,Serializable {
        /**
         * userId : 370742686885792
         * name : 瑶莲
         * picUrl : http://apphead.zaiwai.com/2015111620530541212555avatar
         * bgPicUrl : null
         * content : 慧根天成藏七情广结世上善缘，佛心早定去六欲普建人间天堂！
         * tabs : 旅行[tab]户外[tab]摄影
         * sex : 0
         * phone : 1354242****
         * lastRequestTime : 20161026184109
         * isPicRealPersopn : 1
         * birthday :
         * isAccessPhoneSearch : 1
         * isAccessShowRequestTime : 1
         * blockSexType : -1
         * isOpenInviteHeplerFeedNotify : 1
         * picUrlHeader : http://zwhead.b0.upaiyun.com
         */

        private AuthorBean author;
        private Object praiseId;
        private int praiseCount;
        private int forwardCount;
        private int replyCount;
        private Object retweet;
        private Object retweetAuthor;
        private int retweetPraiseCount;
        private int retweetForwardCount;
        private int retweetReplyCount;
        private Object retweetPictureList;
        private Object retweetPraiseId;
        private String remark;
        private int relationType;
        private int oppositeRelationType;
        private Object referEntryList;
        private Object topicEntryList;
        private Object distance;
        private int browserCount;
        private int collecttionCount;
        private Object specialSubjectPicture;
        private Object specialSubjectList;
        /**
         * feedId : 378337010759584
         * userId : 370742686885792
         * location : 中国云南省普洱市澜沧拉祜族自治县文东佤族乡文东段
         * lng : 99.89671
         * lat : 23.173605
         * picIdList : 378415340310176,378530421403552,378260341112736,378434126319520,378328053690016,378508477695904,378473532219040,378623080240800,378781515227040
         * addTime : 20161026180742
         * content : 在邦威村偶遇这位80岁的老奶奶，我与她边聊边走拍照，其实我一点也听不懂她说什么 ，享受一份外婆的情怀！80岁的老奶奶还能背着这一筐爬坡干农活，敬佩呀！在分岔路口看着她远去的背影，我好想好想喊一声：外婆！
         * altitude : 0.0
         * state : 0
         * sourceFeedId : null
         * equipment : iPhone6,2
         * type : 0
         * osType : 0
         * isFound : 0
         * exp2 : null
         * exp3 : null
         * beginDate : null
         * endDate : null
         * topicIdList : null
         * invitetype : 0
         * terminis : null
         * title : null
         * originAnalyse : null
         * originLocate : null
         * exp1 : null
         */

        private FeedBean feed;
        /**
         * id : 378415340310176
         * lng : 99.93651
         * lat : 23.12679
         * altitude : 0.0
         * location : null
         * time : 20161026155135
         * url : /3707426868857921477476449091629785180.jpg
         * content : null
         * exif : null
         * userId : 370742686885792
         * width : 1704
         * high : 2272
         * sourceType : 0
         * type : 0
         * urlHeader : http://zaiwaiimage.b0.upaiyun.com
         */

        private List<PictureListBean> pictureList;
        private List<?> feedSupplyList;

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public Object getPraiseId() {
            return praiseId;
        }

        public void setPraiseId(Object praiseId) {
            this.praiseId = praiseId;
        }

        public int getPraiseCount() {
            return praiseCount;
        }

        public void setPraiseCount(int praiseCount) {
            this.praiseCount = praiseCount;
        }

        public int getForwardCount() {
            return forwardCount;
        }

        public void setForwardCount(int forwardCount) {
            this.forwardCount = forwardCount;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        public Object getRetweet() {
            return retweet;
        }

        public void setRetweet(Object retweet) {
            this.retweet = retweet;
        }

        public Object getRetweetAuthor() {
            return retweetAuthor;
        }

        public void setRetweetAuthor(Object retweetAuthor) {
            this.retweetAuthor = retweetAuthor;
        }

        public int getRetweetPraiseCount() {
            return retweetPraiseCount;
        }

        public void setRetweetPraiseCount(int retweetPraiseCount) {
            this.retweetPraiseCount = retweetPraiseCount;
        }

        public int getRetweetForwardCount() {
            return retweetForwardCount;
        }

        public void setRetweetForwardCount(int retweetForwardCount) {
            this.retweetForwardCount = retweetForwardCount;
        }

        public int getRetweetReplyCount() {
            return retweetReplyCount;
        }

        public void setRetweetReplyCount(int retweetReplyCount) {
            this.retweetReplyCount = retweetReplyCount;
        }

        public Object getRetweetPictureList() {
            return retweetPictureList;
        }

        public void setRetweetPictureList(Object retweetPictureList) {
            this.retweetPictureList = retweetPictureList;
        }

        public Object getRetweetPraiseId() {
            return retweetPraiseId;
        }

        public void setRetweetPraiseId(Object retweetPraiseId) {
            this.retweetPraiseId = retweetPraiseId;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public int getRelationType() {
            return relationType;
        }

        public void setRelationType(int relationType) {
            this.relationType = relationType;
        }

        public int getOppositeRelationType() {
            return oppositeRelationType;
        }

        public void setOppositeRelationType(int oppositeRelationType) {
            this.oppositeRelationType = oppositeRelationType;
        }

        public Object getReferEntryList() {
            return referEntryList;
        }

        public void setReferEntryList(Object referEntryList) {
            this.referEntryList = referEntryList;
        }

        public Object getTopicEntryList() {
            return topicEntryList;
        }

        public void setTopicEntryList(Object topicEntryList) {
            this.topicEntryList = topicEntryList;
        }

        public Object getDistance() {
            return distance;
        }

        public void setDistance(Object distance) {
            this.distance = distance;
        }

        public int getBrowserCount() {
            return browserCount;
        }

        public void setBrowserCount(int browserCount) {
            this.browserCount = browserCount;
        }

        public int getCollecttionCount() {
            return collecttionCount;
        }

        public void setCollecttionCount(int collecttionCount) {
            this.collecttionCount = collecttionCount;
        }

        public Object getSpecialSubjectPicture() {
            return specialSubjectPicture;
        }

        public void setSpecialSubjectPicture(Object specialSubjectPicture) {
            this.specialSubjectPicture = specialSubjectPicture;
        }

        public Object getSpecialSubjectList() {
            return specialSubjectList;
        }

        public void setSpecialSubjectList(Object specialSubjectList) {
            this.specialSubjectList = specialSubjectList;
        }

        public FeedBean getFeed() {
            return feed;
        }

        public void setFeed(FeedBean feed) {
            this.feed = feed;
        }

        public List<PictureListBean> getPictureList() {
            return pictureList;
        }

        public void setPictureList(List<PictureListBean> pictureList) {
            this.pictureList = pictureList;
        }

        public List<?> getFeedSupplyList() {
            return feedSupplyList;
        }

        public void setFeedSupplyList(List<?> feedSupplyList) {
            this.feedSupplyList = feedSupplyList;
        }

        @Override
        public int getType() {
            if (pictureList.size()>1){
                return 0;
            }else{
                return 1;
            }
        }


        public static class AuthorBean implements Serializable{
            private long userId;
            private String name;
            private String picUrl;
            private Object bgPicUrl;
            private String content;
            private String tabs;
            private int sex;
            private String phone;
            private String lastRequestTime;
            private int isPicRealPersopn;
            private String birthday;
            private int isAccessPhoneSearch;
            private int isAccessShowRequestTime;
            private int blockSexType;
            private int isOpenInviteHeplerFeedNotify;
            private String picUrlHeader;

            public long getUserId() {
                return userId;
            }

            public void setUserId(long userId) {
                this.userId = userId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public Object getBgPicUrl() {
                return bgPicUrl;
            }

            public void setBgPicUrl(Object bgPicUrl) {
                this.bgPicUrl = bgPicUrl;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getTabs() {
                return tabs;
            }

            public void setTabs(String tabs) {
                this.tabs = tabs;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getLastRequestTime() {
                return lastRequestTime;
            }

            public void setLastRequestTime(String lastRequestTime) {
                this.lastRequestTime = lastRequestTime;
            }

            public int getIsPicRealPersopn() {
                return isPicRealPersopn;
            }

            public void setIsPicRealPersopn(int isPicRealPersopn) {
                this.isPicRealPersopn = isPicRealPersopn;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public int getIsAccessPhoneSearch() {
                return isAccessPhoneSearch;
            }

            public void setIsAccessPhoneSearch(int isAccessPhoneSearch) {
                this.isAccessPhoneSearch = isAccessPhoneSearch;
            }

            public int getIsAccessShowRequestTime() {
                return isAccessShowRequestTime;
            }

            public void setIsAccessShowRequestTime(int isAccessShowRequestTime) {
                this.isAccessShowRequestTime = isAccessShowRequestTime;
            }

            public int getBlockSexType() {
                return blockSexType;
            }

            public void setBlockSexType(int blockSexType) {
                this.blockSexType = blockSexType;
            }

            public int getIsOpenInviteHeplerFeedNotify() {
                return isOpenInviteHeplerFeedNotify;
            }

            public void setIsOpenInviteHeplerFeedNotify(int isOpenInviteHeplerFeedNotify) {
                this.isOpenInviteHeplerFeedNotify = isOpenInviteHeplerFeedNotify;
            }

            public String getPicUrlHeader() {
                return picUrlHeader;
            }

            public void setPicUrlHeader(String picUrlHeader) {
                this.picUrlHeader = picUrlHeader;
            }
        }

        public static class FeedBean implements Serializable{
            private long feedId;
            private long userId;
            private String location;
            private double lng;
            private double lat;
            private String picIdList;
            private String addTime;
            private String content;
            private double altitude;
            private int state;
            private Object sourceFeedId;
            private String equipment;
            private int type;
            private int osType;
            private int isFound;
            private Object exp2;
            private Object exp3;
            private Object beginDate;
            private Object endDate;
            private Object topicIdList;
            private int invitetype;
            private Object terminis;
            private Object title;
            private Object originAnalyse;
            private Object originLocate;
            private Object exp1;

            public long getFeedId() {
                return feedId;
            }

            public void setFeedId(long feedId) {
                this.feedId = feedId;
            }

            public long getUserId() {
                return userId;
            }

            public void setUserId(long userId) {
                this.userId = userId;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public String getPicIdList() {
                return picIdList;
            }

            public void setPicIdList(String picIdList) {
                this.picIdList = picIdList;
            }

            public String getAddTime() {
                return addTime;
            }

            public void setAddTime(String addTime) {
                this.addTime = addTime;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public double getAltitude() {
                return altitude;
            }

            public void setAltitude(double altitude) {
                this.altitude = altitude;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public Object getSourceFeedId() {
                return sourceFeedId;
            }

            public void setSourceFeedId(Object sourceFeedId) {
                this.sourceFeedId = sourceFeedId;
            }

            public String getEquipment() {
                return equipment;
            }

            public void setEquipment(String equipment) {
                this.equipment = equipment;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getOsType() {
                return osType;
            }

            public void setOsType(int osType) {
                this.osType = osType;
            }

            public int getIsFound() {
                return isFound;
            }

            public void setIsFound(int isFound) {
                this.isFound = isFound;
            }

            public Object getExp2() {
                return exp2;
            }

            public void setExp2(Object exp2) {
                this.exp2 = exp2;
            }

            public Object getExp3() {
                return exp3;
            }

            public void setExp3(Object exp3) {
                this.exp3 = exp3;
            }

            public Object getBeginDate() {
                return beginDate;
            }

            public void setBeginDate(Object beginDate) {
                this.beginDate = beginDate;
            }

            public Object getEndDate() {
                return endDate;
            }

            public void setEndDate(Object endDate) {
                this.endDate = endDate;
            }

            public Object getTopicIdList() {
                return topicIdList;
            }

            public void setTopicIdList(Object topicIdList) {
                this.topicIdList = topicIdList;
            }

            public int getInvitetype() {
                return invitetype;
            }

            public void setInvitetype(int invitetype) {
                this.invitetype = invitetype;
            }

            public Object getTerminis() {
                return terminis;
            }

            public void setTerminis(Object terminis) {
                this.terminis = terminis;
            }

            public Object getTitle() {
                return title;
            }

            public void setTitle(Object title) {
                this.title = title;
            }

            public Object getOriginAnalyse() {
                return originAnalyse;
            }

            public void setOriginAnalyse(Object originAnalyse) {
                this.originAnalyse = originAnalyse;
            }

            public Object getOriginLocate() {
                return originLocate;
            }

            public void setOriginLocate(Object originLocate) {
                this.originLocate = originLocate;
            }

            public Object getExp1() {
                return exp1;
            }

            public void setExp1(Object exp1) {
                this.exp1 = exp1;
            }
        }

        public static class PictureListBean implements Serializable {
            private long id;
            private double lng;
            private double lat;
            private double altitude;
            private Object location;
            private String time;
            private String url;
            private Object content;
            private Object exif;
            private long userId;
            private int width;
            private int high;
            private int sourceType;
            private int type;
            private String urlHeader;

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getAltitude() {
                return altitude;
            }

            public void setAltitude(double altitude) {
                this.altitude = altitude;
            }

            public Object getLocation() {
                return location;
            }

            public void setLocation(Object location) {
                this.location = location;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public Object getContent() {
                return content;
            }

            public void setContent(Object content) {
                this.content = content;
            }

            public Object getExif() {
                return exif;
            }

            public void setExif(Object exif) {
                this.exif = exif;
            }

            public long getUserId() {
                return userId;
            }

            public void setUserId(long userId) {
                this.userId = userId;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHigh() {
                return high;
            }

            public void setHigh(int high) {
                this.high = high;
            }

            public int getSourceType() {
                return sourceType;
            }

            public void setSourceType(int sourceType) {
                this.sourceType = sourceType;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getUrlHeader() {
                return urlHeader;
            }

            public void setUrlHeader(String urlHeader) {
                this.urlHeader = urlHeader;
            }
        }
    }

    public static class FeedRefereeListBean implements Serializable {
        private long id;
        private long feedId;
        private int userId;
        private String createTime;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getFeedId() {
            return feedId;
        }

        public void setFeedId(long feedId) {
            this.feedId = feedId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }
    }
}
