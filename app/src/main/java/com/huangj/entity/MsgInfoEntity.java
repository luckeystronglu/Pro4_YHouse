package com.huangj.entity;

import com.huangj.adapter.AbsMoreBaseAdapter;

import java.util.List;

/**
 * Created by mmmm on 2016/10/27.
 */
public class MsgInfoEntity {

    /**
     * author : {"userId":370091855554464,"name":"诠释向往","picUrl":"http://apphead.zaiwai.com/3700918555544641468569568167-841736100.jpg","bgPicUrl":null,"content":"记录美与景，人在京城","tabs":"旅行[tab]找寻[tab]徒步","sex":1,"phone":"1316190****","lastRequestTime":"20161027154406","isPicRealPersopn":1,"birthday":"","isAccessPhoneSearch":1,"isAccessShowRequestTime":1,"blockSexType":-1,"isOpenInviteHeplerFeedNotify":1,"picUrlHeader":"http://zwhead.b0.upaiyun.com"}
     * pictureList : [{"id":378551575373728,"lng":0,"lat":0,"altitude":0,"location":null,"time":null,"url":"/3700918555544641477549923258-1336387242.jpg","content":null,"exif":null,"userId":370091855554464,"width":1000,"high":750,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378335982626464,"lng":0,"lat":0,"altitude":0,"location":null,"time":null,"url":"/37009185555446414775499233401905448154.jpg","content":null,"exif":null,"userId":370091855554464,"width":1000,"high":750,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378529530615712,"lng":0,"lat":0,"altitude":0,"location":null,"time":null,"url":"/37009185555446414775499234991633563557.jpg","content":null,"exif":null,"userId":370091855554464,"width":1000,"high":750,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378498125629088,"lng":0,"lat":0,"altitude":0,"location":null,"time":null,"url":"/37009185555446414775499236751067729727.jpg","content":null,"exif":null,"userId":370091855554464,"width":1000,"high":750,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378627511414688,"lng":0,"lat":0,"altitude":0,"location":null,"time":null,"url":"/3700918555544641477549923752-1486237662.jpg","content":null,"exif":null,"userId":370091855554464,"width":750,"high":1000,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378633168326560,"lng":0,"lat":0,"altitude":0,"location":null,"time":null,"url":"/3700918555544641477549923838-663351201.jpg","content":null,"exif":null,"userId":370091855554464,"width":1000,"high":750,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378417526994848,"lng":0,"lat":0,"altitude":0,"location":null,"time":null,"url":"/3700918555544641477549923924-596827054.jpg","content":null,"exif":null,"userId":370091855554464,"width":1000,"high":750,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378539496042400,"lng":0,"lat":0,"altitude":0,"location":null,"time":null,"url":"/3700918555544641477549924004-1117036229.jpg","content":null,"exif":null,"userId":370091855554464,"width":1000,"high":750,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"},{"id":378324607696544,"lng":0,"lat":0,"altitude":0,"location":null,"time":null,"url":"/3700918555544641477549924095620793953.jpg","content":null,"exif":null,"userId":370091855554464,"width":1000,"high":750,"sourceType":0,"type":0,"urlHeader":"http://zaiwaiimage.b0.upaiyun.com"}]
     * praiseId : null
     * praiseCount : 10
     * forwardCount : 0
     * replyCount : 3
     * praisedUserList : [{"userId":367174605989792,"name":"肖顺禹","picUrl":"http://apphead.zaiwai.com/14341152021311434115202131.png","bgPicUrl":"http://appbgpic.zaiwai.com/14341177383351434117738335.png","content":"一次次旅行归来后，除了该做的事情被拖延的更久了，什么都没有改变。","tabs":"","sex":1,"phone":"1504666****","lastRequestTime":"20161027155308","isPicRealPersopn":1,"birthday":"","isAccessPhoneSearch":1,"isAccessShowRequestTime":1,"blockSexType":-1,"isOpenInviteHeplerFeedNotify":1,"picUrlHeader":"http://zwhead.b0.upaiyun.com"},{"userId":373394064131744,"name":"刚柔","picUrl":"http://apphead.zaiwai.com//2016/3/9d737c3415cc196d7be9498647c564230","bgPicUrl":null,"content":null,"tabs":"","sex":1,"phone":"1360686****","lastRequestTime":"20161027155214","isPicRealPersopn":1,"birthday":"","isAccessPhoneSearch":1,"isAccessShowRequestTime":1,"blockSexType":-1,"isOpenInviteHeplerFeedNotify":1,"picUrlHeader":"http://zwhead.b0.upaiyun.com"},{"userId":367642425274272,"name":"菜豆豆","picUrl":"http://apphead.zaiwai.com/201512090923326329035avatar","bgPicUrl":null,"content":"喵喵喵","tabs":"旅行[tab]美食","sex":0,"phone":"1512252****","lastRequestTime":"20160731172626","isPicRealPersopn":0,"birthday":"","isAccessPhoneSearch":1,"isAccessShowRequestTime":1,"blockSexType":-1,"isOpenInviteHeplerFeedNotify":1,"picUrlHeader":"http://zwhead.b0.upaiyun.com"},{"userId":367306451300256,"name":"Free_","picUrl":"http://apphead.zaiwai.com/3673064513002561459327721955.jpg","bgPicUrl":null,"content":"身在里，心在外","tabs":"","sex":0,"phone":"1582259****","lastRequestTime":"20161026173857","isPicRealPersopn":1,"birthday":"","isAccessPhoneSearch":0,"isAccessShowRequestTime":1,"blockSexType":-1,"isOpenInviteHeplerFeedNotify":0,"picUrlHeader":"http://zwhead.b0.upaiyun.com"},{"userId":370028112635808,"name":"大灰狼的脚","picUrl":"http://apphead.zaiwai.com//2016/3/ab745508990710cb72d8a9be01d7efd70","bgPicUrl":null,"content":"世界很大，出去走走。","tabs":"","sex":1,"phone":"1399460****","lastRequestTime":"20161027155050","isPicRealPersopn":1,"birthday":"","isAccessPhoneSearch":1,"isAccessShowRequestTime":1,"blockSexType":-1,"isOpenInviteHeplerFeedNotify":0,"picUrlHeader":"http://zwhead.b0.upaiyun.com"},{"userId":374089339213472,"name":"命运我手中","picUrl":"http://apphead.zaiwai.com/3740893392134721465482901533997912571.jpg","bgPicUrl":null,"content":"遨游辽阔的中华大地，我陶醉过;仰望无尽的苍穹，我迷恋过;如果把大地比作物质，把苍穹比做精神，我认为苍穹比大地更迷人。","tabs":"旅行[tab]摄影[tab]美食","sex":0,"phone":"1807424****","lastRequestTime":"20161027152053","isPicRealPersopn":1,"birthday":"19920904000000","isAccessPhoneSearch":1,"isAccessShowRequestTime":1,"blockSexType":-1,"isOpenInviteHeplerFeedNotify":1,"picUrlHeader":"http://zwhead.b0.upaiyun.com"},{"userId":372258864228256,"name":"某某某人","picUrl":"http://zwhead.b0.upaiyun.com/2016/1/26/7818ab7369d5d9f1678d1d6311f8e893.jpg","bgPicUrl":null,"content":"","tabs":"","sex":1,"phone":"","lastRequestTime":"20161027145332","isPicRealPersopn":1,"birthday":"","isAccessPhoneSearch":1,"isAccessShowRequestTime":1,"blockSexType":-1,"isOpenInviteHeplerFeedNotify":1,"picUrlHeader":"http://zwhead.b0.upaiyun.com"},{"userId":372945949665184,"name":"金某","picUrl":"http://zwhead.b0.upaiyun.com/2016/2/15/61ea713606d46753f48d9c1152d31336.jpg","bgPicUrl":null,"content":"","tabs":"","sex":1,"phone":"","lastRequestTime":"20161027145152","isPicRealPersopn":1,"birthday":"","isAccessPhoneSearch":1,"isAccessShowRequestTime":1,"blockSexType":-1,"isOpenInviteHeplerFeedNotify":1,"picUrlHeader":"http://zwhead.b0.upaiyun.com"},{"userId":367616468833952,"name":"远眺的天空","picUrl":"http://apphead.zaiwai.com/14338908547421433890854742.png","bgPicUrl":"http://appbgpic.zaiwai.com/14339370048151433937004816.png","content":"融入自然世界，心情自然舒畅！","tabs":"户外","sex":1,"phone":"1523518****","lastRequestTime":"20161027154748","isPicRealPersopn":0,"birthday":"","isAccessPhoneSearch":1,"isAccessShowRequestTime":1,"blockSexType":-1,"isOpenInviteHeplerFeedNotify":1,"picUrlHeader":"http://zwhead.b0.upaiyun.com"},{"userId":370091855554464,"name":"诠释向往","picUrl":"http://apphead.zaiwai.com/3700918555544641468569568167-841736100.jpg","bgPicUrl":null,"content":"记录美与景，人在京城","tabs":"旅行[tab]找寻[tab]徒步","sex":1,"phone":"1316190****","lastRequestTime":"20161027154406","isPicRealPersopn":1,"birthday":"","isAccessPhoneSearch":1,"isAccessShowRequestTime":1,"blockSexType":-1,"isOpenInviteHeplerFeedNotify":1,"picUrlHeader":"http://zwhead.b0.upaiyun.com"}]
     * retweet : null
     * retweetAuthor : null
     * retweetPictureList : null
     * remark :
     * referEntryList : null
     * topicEntryList : null
     * browserCount : 0
     * feedSupplyList : []
     * isAttentioned : 0
     * attentionId : null
     * treasureFounder : null
     * treasureFoundPictureList : null
     * feed : {"feedId":378334392084128,"userId":370091855554464,"location":"北京爱丽斯幼儿教育艺术学校","lng":116.45687,"lat":39.896095,"picIdList":"378551575373728,378335982626464,378529530615712,378498125629088,378627511414688,378633168326560,378417526994848,378539496042400,378324607696544","addTime":"20161027143206","content":"九重城阙，京华烟云，\n难以忘记那年初雪时你容颜。","altitude":0,"state":0,"sourceFeedId":0,"equipment":null,"type":0,"osType":1,"isFound":0,"exp2":null,"exp3":null,"beginDate":null,"endDate":null,"topicIdList":null,"invitetype":0,"terminis":null,"title":null,"originAnalyse":null,"originLocate":null,"exp1":null}
     */

    private CustomerFeedDetailBean CustomerFeedDetail;

    public CustomerFeedDetailBean getCustomerFeedDetail() {
        return CustomerFeedDetail;
    }

    public void setCustomerFeedDetail(CustomerFeedDetailBean CustomerFeedDetail) {
        this.CustomerFeedDetail = CustomerFeedDetail;
    }

    public static class CustomerFeedDetailBean {
        /**
         * userId : 370091855554464
         * name : 诠释向往
         * picUrl : http://apphead.zaiwai.com/3700918555544641468569568167-841736100.jpg
         * bgPicUrl : null
         * content : 记录美与景，人在京城
         * tabs : 旅行[tab]找寻[tab]徒步
         * sex : 1
         * phone : 1316190****
         * lastRequestTime : 20161027154406
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
        private Object retweetPictureList;
        private String remark;
        private Object referEntryList;
        private Object topicEntryList;
        private int browserCount;
        private int isAttentioned;
        private Object attentionId;
        private Object treasureFounder;
        private Object treasureFoundPictureList;
        /**
         * feedId : 378334392084128
         * userId : 370091855554464
         * location : 北京爱丽斯幼儿教育艺术学校
         * lng : 116.45687
         * lat : 39.896095
         * picIdList : 378551575373728,378335982626464,378529530615712,378498125629088,378627511414688,378633168326560,378417526994848,378539496042400,378324607696544
         * addTime : 20161027143206
         * content : 九重城阙，京华烟云，
         难以忘记那年初雪时你容颜。
         * altitude : 0.0
         * state : 0
         * sourceFeedId : 0
         * equipment : null
         * type : 0
         * osType : 1
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
         * id : 378551575373728
         * lng : 0.0
         * lat : 0.0
         * altitude : 0.0
         * location : null
         * time : null
         * url : /3700918555544641477549923258-1336387242.jpg
         * content : null
         * exif : null
         * userId : 370091855554464
         * width : 1000
         * high : 750
         * sourceType : 0
         * type : 0
         * urlHeader : http://zaiwaiimage.b0.upaiyun.com
         */

        private List<PictureListBean> pictureList;
        /**
         * userId : 367174605989792
         * name : 肖顺禹
         * picUrl : http://apphead.zaiwai.com/14341152021311434115202131.png
         * bgPicUrl : http://appbgpic.zaiwai.com/14341177383351434117738335.png
         * content : 一次次旅行归来后，除了该做的事情被拖延的更久了，什么都没有改变。
         * tabs :
         * sex : 1
         * phone : 1504666****
         * lastRequestTime : 20161027155308
         * isPicRealPersopn : 1
         * birthday :
         * isAccessPhoneSearch : 1
         * isAccessShowRequestTime : 1
         * blockSexType : -1
         * isOpenInviteHeplerFeedNotify : 1
         * picUrlHeader : http://zwhead.b0.upaiyun.com
         */

        private List<PraisedUserListBean> praisedUserList;
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

        public Object getRetweetPictureList() {
            return retweetPictureList;
        }

        public void setRetweetPictureList(Object retweetPictureList) {
            this.retweetPictureList = retweetPictureList;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
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

        public int getBrowserCount() {
            return browserCount;
        }

        public void setBrowserCount(int browserCount) {
            this.browserCount = browserCount;
        }

        public int getIsAttentioned() {
            return isAttentioned;
        }

        public void setIsAttentioned(int isAttentioned) {
            this.isAttentioned = isAttentioned;
        }

        public Object getAttentionId() {
            return attentionId;
        }

        public void setAttentionId(Object attentionId) {
            this.attentionId = attentionId;
        }

        public Object getTreasureFounder() {
            return treasureFounder;
        }

        public void setTreasureFounder(Object treasureFounder) {
            this.treasureFounder = treasureFounder;
        }

        public Object getTreasureFoundPictureList() {
            return treasureFoundPictureList;
        }

        public void setTreasureFoundPictureList(Object treasureFoundPictureList) {
            this.treasureFoundPictureList = treasureFoundPictureList;
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

        public List<PraisedUserListBean> getPraisedUserList() {
            return praisedUserList;
        }

        public void setPraisedUserList(List<PraisedUserListBean> praisedUserList) {
            this.praisedUserList = praisedUserList;
        }

        public List<?> getFeedSupplyList() {
            return feedSupplyList;
        }

        public void setFeedSupplyList(List<?> feedSupplyList) {
            this.feedSupplyList = feedSupplyList;
        }

        public static class AuthorBean {
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

        public static class FeedBean {
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
            private int sourceFeedId;
            private Object equipment;
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

            public int getSourceFeedId() {
                return sourceFeedId;
            }

            public void setSourceFeedId(int sourceFeedId) {
                this.sourceFeedId = sourceFeedId;
            }

            public Object getEquipment() {
                return equipment;
            }

            public void setEquipment(Object equipment) {
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

        public static class PictureListBean implements AbsMoreBaseAdapter.OnType {
            private long id;
            private double lng;
            private double lat;
            private double altitude;
            private Object location;
            private Object time;
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

            public Object getTime() {
                return time;
            }

            public void setTime(Object time) {
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

            @Override
            public int getType() {
                return 0;
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

        public static class PraisedUserListBean {
            private long userId;
            private String name;
            private String picUrl;
            private String bgPicUrl;
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

            public String getBgPicUrl() {
                return bgPicUrl;
            }

            public void setBgPicUrl(String bgPicUrl) {
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
    }
}
