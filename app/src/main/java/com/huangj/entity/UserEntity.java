package com.huangj.entity;

/**
 * Created by mmmm on 2016/11/1.
 */
public class UserEntity {

    /**
     * InviteFeedCountOfTargetUser : 0
     * CustomerUserDetail : {"personalInfo":{"userId":373182377987744,"name":"莉莉的微笑","picUrl":"http://apphead.zaiwai.com/3731823779877441474803707254-73550949.jpg","sex":0,"addr":"辽宁省 沈阳市","content":"好好去爱，去生活。记住，太阳每天都是新的，不要辜负了美好的晨光。","bgPicUrl":null,"createTime":"20160301213559","loginTime":"20160301213559","state":0,"isBindWeibo":0,"isBindQQ":0,"isBindPhone":1,"tabs":"旅行[tab]摄影[tab]自驾","lastRequestTime":"20161101151533","phone":"1394235****","isBind8264":0,"isPicRealPersopn":1,"userKey8264":null,"isBindWeiXin":0,"birthday":"19741211000000","isAccessPhoneSearch":1,"isAccessShowRequestTime":1,"isOpenReplyNotify":1,"isOpenReferNotify":1,"isOpenInviteHeplerFeedNotify":0,"isOpenGroupNotify":1,"isOpenChatNotify":0,"isOpenNoDisturbTime":0,"noDisturbBegin":null,"noDisturbEnd":null,"picUrlHeader":"http://zwhead.b0.upaiyun.com"},"relationType":0,"oppositeRelationType":0,"followCount":103,"fansCount":696,"praiseCount":4552,"feedCount":47,"remark":"","answerPraisedCount":0,"feedPraisedCount":4552,"questionAndAnswerCount":0}
     */

    private int InviteFeedCountOfTargetUser;
    /**
     * personalInfo : {"userId":373182377987744,"name":"莉莉的微笑","picUrl":"http://apphead.zaiwai.com/3731823779877441474803707254-73550949.jpg","sex":0,"addr":"辽宁省 沈阳市","content":"好好去爱，去生活。记住，太阳每天都是新的，不要辜负了美好的晨光。","bgPicUrl":null,"createTime":"20160301213559","loginTime":"20160301213559","state":0,"isBindWeibo":0,"isBindQQ":0,"isBindPhone":1,"tabs":"旅行[tab]摄影[tab]自驾","lastRequestTime":"20161101151533","phone":"1394235****","isBind8264":0,"isPicRealPersopn":1,"userKey8264":null,"isBindWeiXin":0,"birthday":"19741211000000","isAccessPhoneSearch":1,"isAccessShowRequestTime":1,"isOpenReplyNotify":1,"isOpenReferNotify":1,"isOpenInviteHeplerFeedNotify":0,"isOpenGroupNotify":1,"isOpenChatNotify":0,"isOpenNoDisturbTime":0,"noDisturbBegin":null,"noDisturbEnd":null,"picUrlHeader":"http://zwhead.b0.upaiyun.com"}
     * relationType : 0
     * oppositeRelationType : 0
     * followCount : 103
     * fansCount : 696
     * praiseCount : 4552
     * feedCount : 47
     * remark :
     * answerPraisedCount : 0
     * feedPraisedCount : 4552
     * questionAndAnswerCount : 0
     */

    private CustomerUserDetailBean CustomerUserDetail;

    public int getInviteFeedCountOfTargetUser() {
        return InviteFeedCountOfTargetUser;
    }

    public void setInviteFeedCountOfTargetUser(int InviteFeedCountOfTargetUser) {
        this.InviteFeedCountOfTargetUser = InviteFeedCountOfTargetUser;
    }

    public CustomerUserDetailBean getCustomerUserDetail() {
        return CustomerUserDetail;
    }

    public void setCustomerUserDetail(CustomerUserDetailBean CustomerUserDetail) {
        this.CustomerUserDetail = CustomerUserDetail;
    }

    public static class CustomerUserDetailBean {
        /**
         * userId : 373182377987744
         * name : 莉莉的微笑
         * picUrl : http://apphead.zaiwai.com/3731823779877441474803707254-73550949.jpg
         * sex : 0
         * addr : 辽宁省 沈阳市
         * content : 好好去爱，去生活。记住，太阳每天都是新的，不要辜负了美好的晨光。
         * bgPicUrl : null
         * createTime : 20160301213559
         * loginTime : 20160301213559
         * state : 0
         * isBindWeibo : 0
         * isBindQQ : 0
         * isBindPhone : 1
         * tabs : 旅行[tab]摄影[tab]自驾
         * lastRequestTime : 20161101151533
         * phone : 1394235****
         * isBind8264 : 0
         * isPicRealPersopn : 1
         * userKey8264 : null
         * isBindWeiXin : 0
         * birthday : 19741211000000
         * isAccessPhoneSearch : 1
         * isAccessShowRequestTime : 1
         * isOpenReplyNotify : 1
         * isOpenReferNotify : 1
         * isOpenInviteHeplerFeedNotify : 0
         * isOpenGroupNotify : 1
         * isOpenChatNotify : 0
         * isOpenNoDisturbTime : 0
         * noDisturbBegin : null
         * noDisturbEnd : null
         * picUrlHeader : http://zwhead.b0.upaiyun.com
         */

        private PersonalInfoBean personalInfo;
        private int relationType;
        private int oppositeRelationType;
        private int followCount;
        private int fansCount;
        private int praiseCount;
        private int feedCount;
        private String remark;
        private int answerPraisedCount;
        private int feedPraisedCount;
        private int questionAndAnswerCount;

        public PersonalInfoBean getPersonalInfo() {
            return personalInfo;
        }

        public void setPersonalInfo(PersonalInfoBean personalInfo) {
            this.personalInfo = personalInfo;
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

        public int getFollowCount() {
            return followCount;
        }

        public void setFollowCount(int followCount) {
            this.followCount = followCount;
        }

        public int getFansCount() {
            return fansCount;
        }

        public void setFansCount(int fansCount) {
            this.fansCount = fansCount;
        }

        public int getPraiseCount() {
            return praiseCount;
        }

        public void setPraiseCount(int praiseCount) {
            this.praiseCount = praiseCount;
        }

        public int getFeedCount() {
            return feedCount;
        }

        public void setFeedCount(int feedCount) {
            this.feedCount = feedCount;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public int getAnswerPraisedCount() {
            return answerPraisedCount;
        }

        public void setAnswerPraisedCount(int answerPraisedCount) {
            this.answerPraisedCount = answerPraisedCount;
        }

        public int getFeedPraisedCount() {
            return feedPraisedCount;
        }

        public void setFeedPraisedCount(int feedPraisedCount) {
            this.feedPraisedCount = feedPraisedCount;
        }

        public int getQuestionAndAnswerCount() {
            return questionAndAnswerCount;
        }

        public void setQuestionAndAnswerCount(int questionAndAnswerCount) {
            this.questionAndAnswerCount = questionAndAnswerCount;
        }

        public static class PersonalInfoBean {
            private long userId;
            private String name;
            private String picUrl;
            private int sex;
            private String addr;
            private String content;
            private Object bgPicUrl;
            private String createTime;
            private String loginTime;
            private int state;
            private int isBindWeibo;
            private int isBindQQ;
            private int isBindPhone;
            private String tabs;
            private String lastRequestTime;
            private String phone;
            private int isBind8264;
            private int isPicRealPersopn;
            private Object userKey8264;
            private int isBindWeiXin;
            private String birthday;
            private int isAccessPhoneSearch;
            private int isAccessShowRequestTime;
            private int isOpenReplyNotify;
            private int isOpenReferNotify;
            private int isOpenInviteHeplerFeedNotify;
            private int isOpenGroupNotify;
            private int isOpenChatNotify;
            private int isOpenNoDisturbTime;
            private Object noDisturbBegin;
            private Object noDisturbEnd;
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

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public Object getBgPicUrl() {
                return bgPicUrl;
            }

            public void setBgPicUrl(Object bgPicUrl) {
                this.bgPicUrl = bgPicUrl;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getLoginTime() {
                return loginTime;
            }

            public void setLoginTime(String loginTime) {
                this.loginTime = loginTime;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public int getIsBindWeibo() {
                return isBindWeibo;
            }

            public void setIsBindWeibo(int isBindWeibo) {
                this.isBindWeibo = isBindWeibo;
            }

            public int getIsBindQQ() {
                return isBindQQ;
            }

            public void setIsBindQQ(int isBindQQ) {
                this.isBindQQ = isBindQQ;
            }

            public int getIsBindPhone() {
                return isBindPhone;
            }

            public void setIsBindPhone(int isBindPhone) {
                this.isBindPhone = isBindPhone;
            }

            public String getTabs() {
                return tabs;
            }

            public void setTabs(String tabs) {
                this.tabs = tabs;
            }

            public long getLastRequestTime() {
                return Long.parseLong(lastRequestTime);
            }

            public void setLastRequestTime(String lastRequestTime) {
                this.lastRequestTime = lastRequestTime;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public int getIsBind8264() {
                return isBind8264;
            }

            public void setIsBind8264(int isBind8264) {
                this.isBind8264 = isBind8264;
            }

            public int getIsPicRealPersopn() {
                return isPicRealPersopn;
            }

            public void setIsPicRealPersopn(int isPicRealPersopn) {
                this.isPicRealPersopn = isPicRealPersopn;
            }

            public Object getUserKey8264() {
                return userKey8264;
            }

            public void setUserKey8264(Object userKey8264) {
                this.userKey8264 = userKey8264;
            }

            public int getIsBindWeiXin() {
                return isBindWeiXin;
            }

            public void setIsBindWeiXin(int isBindWeiXin) {
                this.isBindWeiXin = isBindWeiXin;
            }

            public long getBirthday() {
                return Long.parseLong(birthday);
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

            public int getIsOpenReplyNotify() {
                return isOpenReplyNotify;
            }

            public void setIsOpenReplyNotify(int isOpenReplyNotify) {
                this.isOpenReplyNotify = isOpenReplyNotify;
            }

            public int getIsOpenReferNotify() {
                return isOpenReferNotify;
            }

            public void setIsOpenReferNotify(int isOpenReferNotify) {
                this.isOpenReferNotify = isOpenReferNotify;
            }

            public int getIsOpenInviteHeplerFeedNotify() {
                return isOpenInviteHeplerFeedNotify;
            }

            public void setIsOpenInviteHeplerFeedNotify(int isOpenInviteHeplerFeedNotify) {
                this.isOpenInviteHeplerFeedNotify = isOpenInviteHeplerFeedNotify;
            }

            public int getIsOpenGroupNotify() {
                return isOpenGroupNotify;
            }

            public void setIsOpenGroupNotify(int isOpenGroupNotify) {
                this.isOpenGroupNotify = isOpenGroupNotify;
            }

            public int getIsOpenChatNotify() {
                return isOpenChatNotify;
            }

            public void setIsOpenChatNotify(int isOpenChatNotify) {
                this.isOpenChatNotify = isOpenChatNotify;
            }

            public int getIsOpenNoDisturbTime() {
                return isOpenNoDisturbTime;
            }

            public void setIsOpenNoDisturbTime(int isOpenNoDisturbTime) {
                this.isOpenNoDisturbTime = isOpenNoDisturbTime;
            }

            public Object getNoDisturbBegin() {
                return noDisturbBegin;
            }

            public void setNoDisturbBegin(Object noDisturbBegin) {
                this.noDisturbBegin = noDisturbBegin;
            }

            public Object getNoDisturbEnd() {
                return noDisturbEnd;
            }

            public void setNoDisturbEnd(Object noDisturbEnd) {
                this.noDisturbEnd = noDisturbEnd;
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
