package com.huangj.entity;

import java.util.List;

/**
 * Created by JY on 2016/10/20.
 */

public class FoodEntity {



    private String code;


    private DataBean data;
    private String detail;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        private int cityFlag;
        private int isEnd;
        private int nextPage;
        private int page;
        private int pageSize;
        private String pid;
        private int totalRows;
        /**
         * itemData : [{"id":23,"menuHref":"yhouse://search?bizType=1&catalog=2&sort=2","menuIcon":"http://r.yhres.com/home/near@3x.png","menuName":"附近"},{"id":21,"menuHref":"yhouse://search?bizType=1&catalog=2&sort=3","menuIcon":"http://r.yhres.com/home/new@3x.png","menuName":"新品"},{"id":5,"menuHref":"yhouse://invitation2","menuIcon":"http://r.yhres.com/home/invitation@3x.png","menuName":"电子请柬"},{"id":9,"menuHref":"yhouse://search?bizType=1&filter=2&catalog=2&dt=1","menuIcon":"http://r.yhres.com/home/lunch@3x.png","menuName":"午餐"},{"id":10,"menuHref":"yhouse://search?bizType=1&filter=2&catalog=2&dt=2","menuIcon":"http://r.yhres.com/home/dinner@3x.png","menuName":"晚餐"},{"id":11,"menuHref":"yhouse://search?bizType=1&filter=2&catalog=2&dt=3","menuIcon":"http://r.yhres.com/home/tea@3x.png","menuName":"下午茶"},{"id":14,"menuHref":"yhouse://search?bizType=1&filter=2&catalog=2&ps=2","menuIcon":"http://r.yhres.com/home/2people@3x.png","menuName":"二人世界"},{"id":16,"menuHref":"yhouse://search?bizType=1&filter=2&catalog=2&pc=1","menuIcon":"http://r.yhres.com/home/less100@3x.png","menuName":"食不过百"}]
         * itemLayout : 0
         * itemType : 40
         */

        private List<DocBean> doc;

        public int getCityFlag() {
            return cityFlag;
        }

        public void setCityFlag(int cityFlag) {
            this.cityFlag = cityFlag;
        }

        public int getIsEnd() {
            return isEnd;
        }

        public void setIsEnd(int isEnd) {
            this.isEnd = isEnd;
        }

        public int getNextPage() {
            return nextPage;
        }

        public void setNextPage(int nextPage) {
            this.nextPage = nextPage;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public int getTotalRows() {
            return totalRows;
        }

        public void setTotalRows(int totalRows) {
            this.totalRows = totalRows;
        }

        public List<DocBean> getDoc() {
            return doc;
        }

        public void setDoc(List<DocBean> doc) {
            this.doc = doc;
        }



        public static class DocBean {

            private int itemLayout;
            private int itemType;

            /**
             * id : 23
             * menuHref : yhouse://search?bizType=1&catalog=2&sort=2
             * menuIcon : http://r.yhres.com/home/near@3x.png
             * menuName : 附近
             */

            private List<ItemDataBean> itemData;
            /**
             * address : 三里屯路19号三里屯太古里南区三层S9-33
             * businessesDistrict : 三里屯
             * categorys : ["午餐","晚餐"]
             * cityId : null
             * contactNumber : 010-64176082
             * countOfInterested : 582
             * distance : 5.8km
             * flag : 1
             * headPics : ["http://p.yhres.com/meal/2016/10/20/1476952211243.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952203045.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952202301.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952209146.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952205580.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952203739.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952206107.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952206693.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952210254.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952204308.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952204945.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952207264.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952207942.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952208549.jpg-q75","http://p.yhres.com/meal/2016/10/20/1476952212251.jpg-q75"]
             * hostDetailUrl : https://m.yhouse.com/host-app/14988
             * hostDisplay : 0
             * hostId : 14988
             * hostName : 羲和三里(三里屯店)
             * hostSharePicUrl :
             * hostShareUrl : http://m.yhouse.com/host/14988?pk_campaign=share&pk_kwd=host
             * htmlUrl : https://m.yhouse.com/meal-app/7778
             * id : 7778
             * interestedNum : 581
             * isHaveEquities : 0
             * isInterested : null
             * isOnlineTimeNew : null
             * latitude : 39.934519
             * longitude : 116.45429
             * maxNum : 99
             * needReserveTime : 0
             * notice : 该套餐无需预约,建议就餐前致电商家询问，确保不用排队等位。
             * offLineEqs : null
             * originalPrice : 897
             * personsMax : 4
             * personsMin : 3
             * picUrl : http://p.yhres.com/meal/2016/10/20/1476952203045.jpg-q75h
             * price : 499
             * priceStr : 499元/4人
             * recommand : 0
             * sPicUrl : http://p.yhres.com/meal/2016/10/20/1476952203045.jpg-ssq75
             * shareContent : 传承百年阿婆烹饪技艺 感受香酥烤鸭蘸蓝莓酱新奇吃法
             * shareImgUrl : http://p.yhres.com/meal/2016/10/20/1476952203045.jpg-ssq75
             * shareUrl : http://m.yhouse.com/meal/7778?pk_campaign=share&pk_kwd=meal
             * style : 京帮菜
             * supportDiscount : 1
             * supportParty : 1
             * tags : ["烤鸭","三里屯"]
             * title : 传承百年阿婆烹饪技艺 感受香酥烤鸭蘸蓝莓酱新奇吃法
             * todayReserve : 0
             * typeIcon : http://r.yhres.com/category/banner/meal.png
             * viceTitle :
             * vipEqsTag :
             */

            private String address;
            private String businessesDistrict;
            private Object cityId;
            private String contactNumber;
            private int countOfInterested;
            private String distance;
            private int flag;
            private String hostDetailUrl;
            private int hostDisplay;
            private int hostId;
            private String hostName;
            private String hostSharePicUrl;
            private String hostShareUrl;
            private String htmlUrl;
            private int id;
            private int interestedNum;
            private int isHaveEquities;
            private Object isInterested;
            private Object isOnlineTimeNew;
            private String latitude;
            private String longitude;
            private int maxNum;
            private int needReserveTime;
            private String notice;
            private Object offLineEqs;
            private double originalPrice;
            private int personsMax;
            private int personsMin;
            private String picUrl;
            private int price;
            private String priceStr;
            private int recommand;
            private String sPicUrl;
            private String shareContent;
            private String shareImgUrl;
            private String shareUrl;
            private String style;
            private int supportDiscount;
            private int supportParty;
            private String title;
            private int todayReserve;
            private String typeIcon;
            private String viceTitle;
            private String vipEqsTag;
            private List<String> categorys;
            private List<String> headPics;
            private List<String> tags;

            public int getItemLayout() {
                return itemLayout;
            }

            public void setItemLayout(int itemLayout) {
                this.itemLayout = itemLayout;
            }

            public int getItemType() {
                return itemType;
            }

            public void setItemType(int itemType) {
                this.itemType = itemType;
            }

            public List<ItemDataBean> getItemData() {
                return itemData;
            }

            public void setItemData(List<ItemDataBean> itemData) {
                this.itemData = itemData;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getBusinessesDistrict() {
                return businessesDistrict;
            }

            public void setBusinessesDistrict(String businessesDistrict) {
                this.businessesDistrict = businessesDistrict;
            }

            public Object getCityId() {
                return cityId;
            }

            public void setCityId(Object cityId) {
                this.cityId = cityId;
            }

            public String getContactNumber() {
                return contactNumber;
            }

            public void setContactNumber(String contactNumber) {
                this.contactNumber = contactNumber;
            }

            public int getCountOfInterested() {
                return countOfInterested;
            }

            public void setCountOfInterested(int countOfInterested) {
                this.countOfInterested = countOfInterested;
            }

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public int getFlag() {
                return flag;
            }

            public void setFlag(int flag) {
                this.flag = flag;
            }

            public String getHostDetailUrl() {
                return hostDetailUrl;
            }

            public void setHostDetailUrl(String hostDetailUrl) {
                this.hostDetailUrl = hostDetailUrl;
            }

            public int getHostDisplay() {
                return hostDisplay;
            }

            public void setHostDisplay(int hostDisplay) {
                this.hostDisplay = hostDisplay;
            }

            public int getHostId() {
                return hostId;
            }

            public void setHostId(int hostId) {
                this.hostId = hostId;
            }

            public String getHostName() {
                return hostName;
            }

            public void setHostName(String hostName) {
                this.hostName = hostName;
            }

            public String getHostSharePicUrl() {
                return hostSharePicUrl;
            }

            public void setHostSharePicUrl(String hostSharePicUrl) {
                this.hostSharePicUrl = hostSharePicUrl;
            }

            public String getHostShareUrl() {
                return hostShareUrl;
            }

            public void setHostShareUrl(String hostShareUrl) {
                this.hostShareUrl = hostShareUrl;
            }

            public String getHtmlUrl() {
                return htmlUrl;
            }

            public void setHtmlUrl(String htmlUrl) {
                this.htmlUrl = htmlUrl;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getInterestedNum() {
                return interestedNum;
            }

            public void setInterestedNum(int interestedNum) {
                this.interestedNum = interestedNum;
            }

            public int getIsHaveEquities() {
                return isHaveEquities;
            }

            public void setIsHaveEquities(int isHaveEquities) {
                this.isHaveEquities = isHaveEquities;
            }

            public Object getIsInterested() {
                return isInterested;
            }

            public void setIsInterested(Object isInterested) {
                this.isInterested = isInterested;
            }

            public Object getIsOnlineTimeNew() {
                return isOnlineTimeNew;
            }

            public void setIsOnlineTimeNew(Object isOnlineTimeNew) {
                this.isOnlineTimeNew = isOnlineTimeNew;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public int getMaxNum() {
                return maxNum;
            }

            public void setMaxNum(int maxNum) {
                this.maxNum = maxNum;
            }

            public int getNeedReserveTime() {
                return needReserveTime;
            }

            public void setNeedReserveTime(int needReserveTime) {
                this.needReserveTime = needReserveTime;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }

            public Object getOffLineEqs() {
                return offLineEqs;
            }

            public void setOffLineEqs(Object offLineEqs) {
                this.offLineEqs = offLineEqs;
            }

            public double getOriginalPrice() {
                return originalPrice;
            }

            public void setOriginalPrice(double originalPrice) {
                this.originalPrice = originalPrice;
            }

            public int getPersonsMax() {
                return personsMax;
            }

            public void setPersonsMax(int personsMax) {
                this.personsMax = personsMax;
            }

            public int getPersonsMin() {
                return personsMin;
            }

            public void setPersonsMin(int personsMin) {
                this.personsMin = personsMin;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public String getPriceStr() {
                return priceStr;
            }

            public void setPriceStr(String priceStr) {
                this.priceStr = priceStr;
            }

            public int getRecommand() {
                return recommand;
            }

            public void setRecommand(int recommand) {
                this.recommand = recommand;
            }

            public String getSPicUrl() {
                return sPicUrl;
            }

            public void setSPicUrl(String sPicUrl) {
                this.sPicUrl = sPicUrl;
            }

            public String getShareContent() {
                return shareContent;
            }

            public void setShareContent(String shareContent) {
                this.shareContent = shareContent;
            }

            public String getShareImgUrl() {
                return shareImgUrl;
            }

            public void setShareImgUrl(String shareImgUrl) {
                this.shareImgUrl = shareImgUrl;
            }

            public String getShareUrl() {
                return shareUrl;
            }

            public void setShareUrl(String shareUrl) {
                this.shareUrl = shareUrl;
            }

            public String getStyle() {
                return style;
            }

            public void setStyle(String style) {
                this.style = style;
            }

            public int getSupportDiscount() {
                return supportDiscount;
            }

            public void setSupportDiscount(int supportDiscount) {
                this.supportDiscount = supportDiscount;
            }

            public int getSupportParty() {
                return supportParty;
            }

            public void setSupportParty(int supportParty) {
                this.supportParty = supportParty;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getTodayReserve() {
                return todayReserve;
            }

            public void setTodayReserve(int todayReserve) {
                this.todayReserve = todayReserve;
            }

            public String getTypeIcon() {
                return typeIcon;
            }

            public void setTypeIcon(String typeIcon) {
                this.typeIcon = typeIcon;
            }

            public String getViceTitle() {
                return viceTitle;
            }

            public void setViceTitle(String viceTitle) {
                this.viceTitle = viceTitle;
            }

            public String getVipEqsTag() {
                return vipEqsTag;
            }

            public void setVipEqsTag(String vipEqsTag) {
                this.vipEqsTag = vipEqsTag;
            }

            public List<String> getCategorys() {
                return categorys;
            }

            public void setCategorys(List<String> categorys) {
                this.categorys = categorys;
            }

            public List<String> getHeadPics() {
                return headPics;
            }

            public void setHeadPics(List<String> headPics) {
                this.headPics = headPics;
            }

            public List<String> getTags() {
                return tags;
            }

            public void setTags(List<String> tags) {
                this.tags = tags;
            }

            public static class ItemDataBean {

                private int id;
                private String menuHref;
                private String menuIcon;
                private String menuName;
                /**
                 * layout : 4
                 * adsName : bundle
                 * position : 1
                 * content : [{"picUrl":"http://p.yhres.com/bundle/2016/10/20/1476953394890103.jpg-q75","linkId":2984,"linkUrl":"/guide/2984","schemeUrl":"yhouse://guide/2984","pvUrl":"","linkType":8,"id":1026,"title":"北京最佳四合院餐厅Top 8","sPicUrl":"http://p.yhres.com/bundle/2016/10/20/1476953394890103.jpg-ssq75","linkName":"GUIDE"},{"picUrl":"http://p.yhres.com/bundle/2016/10/20/1476953394941697.jpg-q75","linkUrl":"yhouse://share-tab?id=12","schemeUrl":"yhouse://share-tab?id=12","pvUrl":"","linkType":10,"id":1106,"title":"此生必吃牛排大测评","sPicUrl":"http://p.yhres.com/bundle/2016/10/20/1476953394941697.jpg-ssq75","linkName":"APP"},{"picUrl":"http://p.yhres.com/bundle/2016/10/20/1476954200654050.jpg-q75","linkId":2841,"linkUrl":"/guide/2841","schemeUrl":"yhouse://guide/2841","pvUrl":"","linkType":8,"id":885,"title":"","sPicUrl":"http://p.yhres.com/bundle/2016/10/20/1476954200654050.jpg-ssq75","linkName":"GUIDE"},{"picUrl":"http://p.yhres.com/bundle/2016/10/21/1476979728277686.jpg-q75","linkId":0,"linkUrl":"http://m.yhouse.com/m/2016stella/index.html?city=beijin","schemeUrl":"yhouse://web?title=%E6%97%B6%E4%BB%A3%E5%95%A4%E9%85%92-%E5%8C%97%E4%BA%AC%E7%83%A4%E9%B8%AD&url=http%3A%2F%2Fm.yhouse.com%2Fm%2F2016stella%2Findex.html%3Fcity%3Dbeijin&shareIcon=http%3A%2F%2Fp.yhres.com%2Fbundle%2F2016%2F10%2F21%2F1476979728277686.jpg-ssq75&shareTitle=&shareDesc=","pvUrl":"","linkType":4,"id":1141,"title":"时代啤酒-北京烤鸭","sPicUrl":"http://p.yhres.com/bundle/2016/10/21/1476979728277686.jpg-ssq75","linkName":"HTML5"}]
                 */

                private int layout;
                private String adsName;
                private int position;
                /**
                 * picUrl : http://p.yhres.com/bundle/2016/10/20/1476953394890103.jpg-q75
                 * linkId : 2984
                 * linkUrl : /guide/2984
                 * schemeUrl : yhouse://guide/2984
                 * pvUrl :
                 * linkType : 8
                 * id : 1026
                 * title : 北京最佳四合院餐厅Top 8
                 * sPicUrl : http://p.yhres.com/bundle/2016/10/20/1476953394890103.jpg-ssq75
                 * linkName : GUIDE
                 */

                //private List<ContentBean> content;


                private String content1;
                private String contentsNumStr;
                private String description;
                private int isInterested;
                private String picUrl;
                private String sPicUrl;
                private String schemeUrl;
                private String shareUrl;
                private String title;
                private String viceTitle;
                /**
                 * distance : null
                 * icon : http://p.yhres.com/meal/2016/10/19/1476855923384.jpg-sq75h
                 * isHaveEquities : 0
                 * link : yhouse://meal/7772
                 * price : 960元/2人
                 * sort : 1
                 * title : 西海湖畔的中式宫廷菜 二环以里世外桃源品佳肴赏海景
                 */

                private List<ListBean> list;



                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getMenuHref() {
                    return menuHref;
                }

                public void setMenuHref(String menuHref) {
                    this.menuHref = menuHref;
                }

                public String getMenuIcon() {
                    return menuIcon;
                }

                public void setMenuIcon(String menuIcon) {
                    this.menuIcon = menuIcon;
                }

                public String getMenuName() {
                    return menuName;
                }

                public void setMenuName(String menuName) {
                    this.menuName = menuName;
                }

                public int getLayout() {
                    return layout;
                }

                public void setLayout(int layout) {
                    this.layout = layout;
                }

                public String getAdsName() {
                    return adsName;
                }

                public void setAdsName(String adsName) {
                    this.adsName = adsName;
                }

                public int getPosition() {
                    return position;
                }

                public void setPosition(int position) {
                    this.position = position;
                }

//                public List<ContentBean> getContent() {
//                    return content;
//                }

//                public void setContent(List<ContentBean> content) {
//                    this.content = content;
//                }

                public String getContentsNumStr() {
                    return contentsNumStr;
                }

                public void setContentsNumStr(String contentsNumStr) {
                    this.contentsNumStr = contentsNumStr;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getIsInterested() {
                    return isInterested;
                }

                public void setIsInterested(int isInterested) {
                    this.isInterested = isInterested;
                }

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
                }

                public String getSPicUrl() {
                    return sPicUrl;
                }

                public void setSPicUrl(String sPicUrl) {
                    this.sPicUrl = sPicUrl;
                }

                public String getSchemeUrl() {
                    return schemeUrl;
                }

                public void setSchemeUrl(String schemeUrl) {
                    this.schemeUrl = schemeUrl;
                }

                public String getShareUrl() {
                    return shareUrl;
                }

                public void setShareUrl(String shareUrl) {
                    this.shareUrl = shareUrl;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getViceTitle() {
                    return viceTitle;
                }

                public void setViceTitle(String viceTitle) {
                    this.viceTitle = viceTitle;
                }

                public List<ListBean> getList() {
                    return list;
                }

                public void setList(List<ListBean> list) {
                    this.list = list;
                }

                public static class ContentBean {
                    private String picUrl;
                    private int linkId;
                    private String linkUrl;
                    private String schemeUrl;
                    private String pvUrl;
                    private int linkType;
                    private int id;
                    private String title;

                    public String getPicUrl() {
                        return picUrl;
                    }

                    public void setPicUrl(String picUrl) {
                        this.picUrl = picUrl;
                    }

                    public int getLinkId() {
                        return linkId;
                    }

                    public void setLinkId(int linkId) {
                        this.linkId = linkId;
                    }

                    public String getLinkUrl() {
                        return linkUrl;
                    }

                    public void setLinkUrl(String linkUrl) {
                        this.linkUrl = linkUrl;
                    }

                    public String getSchemeUrl() {
                        return schemeUrl;
                    }

                    public void setSchemeUrl(String schemeUrl) {
                        this.schemeUrl = schemeUrl;
                    }

                    public String getPvUrl() {
                        return pvUrl;
                    }

                    public void setPvUrl(String pvUrl) {
                        this.pvUrl = pvUrl;
                    }

                    public int getLinkType() {
                        return linkType;
                    }

                    public void setLinkType(int linkType) {
                        this.linkType = linkType;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }
                }

                public static class ListBean {
                    private Object distance;
                    private String icon;
                    private int isHaveEquities;
                    private String link;
                    private String price;
                    private int sort;
                    private String title;

                    public Object getDistance() {
                        return distance;
                    }

                    public void setDistance(Object distance) {
                        this.distance = distance;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public int getIsHaveEquities() {
                        return isHaveEquities;
                    }

                    public void setIsHaveEquities(int isHaveEquities) {
                        this.isHaveEquities = isHaveEquities;
                    }

                    public String getLink() {
                        return link;
                    }

                    public void setLink(String link) {
                        this.link = link;
                    }

                    public String getPrice() {
                        return price;
                    }

                    public void setPrice(String price) {
                        this.price = price;
                    }

                    public int getSort() {
                        return sort;
                    }

                    public void setSort(int sort) {
                        this.sort = sort;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    @Override
                    public String toString() {
                        return "ListBean{" +
                                "distance=" + distance +
                                ", icon='" + icon + '\'' +
                                ", isHaveEquities=" + isHaveEquities +
                                ", link='" + link + '\'' +
                                ", price='" + price + '\'' +
                                ", sort=" + sort +
                                ", title='" + title + '\'' +
                                '}';
                    }
                }

                @Override
                public String toString() {
                    return "ItemDataBean{" +
                            "id=" + id +
                            ", menuHref='" + menuHref + '\'' +
                            ", menuIcon='" + menuIcon + '\'' +
                            ", menuName='" + menuName + '\'' +
                            ", layout=" + layout +
                            ", adsName='" + adsName + '\'' +
                            ", position=" + position +
                            ", content1='" + content1 + '\'' +
                            ", contentsNumStr='" + contentsNumStr + '\'' +
                            ", description='" + description + '\'' +
                            ", isInterested=" + isInterested +
                            ", picUrl='" + picUrl + '\'' +
                            ", sPicUrl='" + sPicUrl + '\'' +
                            ", schemeUrl='" + schemeUrl + '\'' +
                            ", shareUrl='" + shareUrl + '\'' +
                            ", title='" + title + '\'' +
                            ", viceTitle='" + viceTitle + '\'' +
                            ", list=" + list +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "DocBean{" +
                        "itemLayout=" + itemLayout +
                        ", itemType=" + itemType +
                        ", itemData=" + itemData +
                        ", address='" + address + '\'' +
                        ", businessesDistrict='" + businessesDistrict + '\'' +
                        ", cityId=" + cityId +
                        ", contactNumber='" + contactNumber + '\'' +
                        ", countOfInterested=" + countOfInterested +
                        ", distance='" + distance + '\'' +
                        ", flag=" + flag +
                        ", hostDetailUrl='" + hostDetailUrl + '\'' +
                        ", hostDisplay=" + hostDisplay +
                        ", hostId=" + hostId +
                        ", hostName='" + hostName + '\'' +
                        ", hostSharePicUrl='" + hostSharePicUrl + '\'' +
                        ", hostShareUrl='" + hostShareUrl + '\'' +
                        ", htmlUrl='" + htmlUrl + '\'' +
                        ", id=" + id +
                        ", interestedNum=" + interestedNum +
                        ", isHaveEquities=" + isHaveEquities +
                        ", isInterested=" + isInterested +
                        ", isOnlineTimeNew=" + isOnlineTimeNew +
                        ", latitude='" + latitude + '\'' +
                        ", longitude='" + longitude + '\'' +
                        ", maxNum=" + maxNum +
                        ", needReserveTime=" + needReserveTime +
                        ", notice='" + notice + '\'' +
                        ", offLineEqs=" + offLineEqs +
                        ", originalPrice=" + originalPrice +
                        ", personsMax=" + personsMax +
                        ", personsMin=" + personsMin +
                        ", picUrl='" + picUrl + '\'' +
                        ", price=" + price +
                        ", priceStr='" + priceStr + '\'' +
                        ", recommand=" + recommand +
                        ", sPicUrl='" + sPicUrl + '\'' +
                        ", shareContent='" + shareContent + '\'' +
                        ", shareImgUrl='" + shareImgUrl + '\'' +
                        ", shareUrl='" + shareUrl + '\'' +
                        ", style='" + style + '\'' +
                        ", supportDiscount=" + supportDiscount +
                        ", supportParty=" + supportParty +
                        ", title='" + title + '\'' +
                        ", todayReserve=" + todayReserve +
                        ", typeIcon='" + typeIcon + '\'' +
                        ", viceTitle='" + viceTitle + '\'' +
                        ", vipEqsTag='" + vipEqsTag + '\'' +
                        ", categorys=" + categorys +
                        ", headPics=" + headPics +
                        ", tags=" + tags +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "cityFlag=" + cityFlag +
                    ", isEnd=" + isEnd +
                    ", nextPage=" + nextPage +
                    ", page=" + page +
                    ", pageSize=" + pageSize +
                    ", pid='" + pid + '\'' +
                    ", totalRows=" + totalRows +
                    ", doc=" + doc +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "FoodEntity{" +
                "code='" + code + '\'' +
                ", data=" + data +
                ", detail='" + detail + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
