package com.huangj.entity;

import java.util.List;

/**
 * Created by JY on 2016/10/20.
 */

public class PlayEntity {


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
        private int isEnd;
        private int nextPage;
        private int page;
        private int pageSize;
        private String pid;
        private int totalRows;
        /**
         * itemData : [{"id":26,"menuHref":"yhouse://search?bizType=1&catalog=1&sort=2","menuIcon":"http://r.yhres.com/home/near@3x.png","menuName":"附近"},{"id":24,"menuHref":"yhouse://search?bizType=1&catalog=1&sort=3","menuIcon":"http://r.yhres.com/home/new@3x.png","menuName":"新品"},{"id":25,"menuHref":"yhouse://search?bizType=1&catalog=1&sort=4","menuIcon":"http://r.yhres.com/home/hot@3x.png","menuName":"最热"},{"id":27,"menuHref":"yhouse://search?bizType=1&catalog=1&filter=2&dt=1","menuIcon":"http://r.yhres.com/home/weekend@3x.png","menuName":"周末"},{"id":5,"menuHref":"yhouse://invitation2","menuIcon":"http://r.yhres.com/home/invitation@3x.png","menuName":"电子请柬"}]
         * itemLayout : 0
         * itemType : 40
         */

        private List<DocBean> doc;

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
             * id : 26
             * menuHref : yhouse://search?bizType=1&catalog=1&sort=2
             * menuIcon : http://r.yhres.com/home/near@3x.png
             * menuName : 附近
             */

            private List<ItemDataBean> itemData;
            /**
             * address : 北京市工体西路8号1楼
             * ageScope : null
             * applyExpiredTime : 2016-11-02 00:00
             * categoryIconUrl : http://r.yhres.com/category/banner/good_wine.png
             * categoryId : 2
             * categorys : ["美酒佳饮"]
             * cityName : 北京
             * dataType : 1
             * distance : 4.8km
             * district : 三里屯
             * duration : 08.29 21:00 - 11.02 04:00
             * hostName : 人头马
             * id : 14151
             * isFree : 2
             * isHaveEquities : 0
             * isInterested : null
             * isOnlineTimeNew : null
             * latitude : 39.929065
             * longitude : 116.445169
             * maxNum : 99
             * neededCredits : 972元/3人
             * originalPrice : 1080
             * picUrl : http://p.yhres.com/event/2016/09/12/1473671001827883.jpg-q75h
             * recommand : 1
             * sPicUrl : http://p.yhres.com/event/2016/09/12/1473671001827883.jpg-ssq75
             * supportDiscount : 1
             * tag : 品酒
             * title : 充满自信的人头马V.S.O.P 品味法国酒窖大师创建经典之作
             * typeIcon : http://r.yhres.com/category/banner/event.png
             * vipEqsTag :
             */

            private String address;
            private Object ageScope;
            private String applyExpiredTime;
            private String categoryIconUrl;
            private int categoryId;
            private String cityName;
            private int dataType;
            private String distance;
            private String district;
            private String duration;
            private String hostName;
            private int id;
            private int isFree;
            private int isHaveEquities;
            private Object isInterested;
            private Object isOnlineTimeNew;
            private String latitude;
            private String longitude;
            private int maxNum;
            private String neededCredits;
            private int originalPrice;
            private String picUrl;
            private int recommand;
            private String sPicUrl;
            private int supportDiscount;
            private String tag;
            private String title;
            private String typeIcon;
            private String vipEqsTag;
            private List<String> categorys;


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

            public Object getAgeScope() {
                return ageScope;
            }

            public void setAgeScope(Object ageScope) {
                this.ageScope = ageScope;
            }

            public String getApplyExpiredTime() {
                return applyExpiredTime;
            }

            public void setApplyExpiredTime(String applyExpiredTime) {
                this.applyExpiredTime = applyExpiredTime;
            }

            public String getCategoryIconUrl() {
                return categoryIconUrl;
            }

            public void setCategoryIconUrl(String categoryIconUrl) {
                this.categoryIconUrl = categoryIconUrl;
            }

            public int getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(int categoryId) {
                this.categoryId = categoryId;
            }

            public String getCityName() {
                return cityName;
            }

            public void setCityName(String cityName) {
                this.cityName = cityName;
            }

            public int getDataType() {
                return dataType;
            }

            public void setDataType(int dataType) {
                this.dataType = dataType;
            }

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public String getDistrict() {
                return district;
            }

            public void setDistrict(String district) {
                this.district = district;
            }

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getHostName() {
                return hostName;
            }

            public void setHostName(String hostName) {
                this.hostName = hostName;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getIsFree() {
                return isFree;
            }

            public void setIsFree(int isFree) {
                this.isFree = isFree;
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

            public String getNeededCredits() {
                return neededCredits;
            }

            public void setNeededCredits(String neededCredits) {
                this.neededCredits = neededCredits;
            }

            public int getOriginalPrice() {
                return originalPrice;
            }

            public void setOriginalPrice(int originalPrice) {
                this.originalPrice = originalPrice;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
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

            public int getSupportDiscount() {
                return supportDiscount;
            }

            public void setSupportDiscount(int supportDiscount) {
                this.supportDiscount = supportDiscount;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTypeIcon() {
                return typeIcon;
            }

            public void setTypeIcon(String typeIcon) {
                this.typeIcon = typeIcon;
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

            public static class ItemDataBean {
                private int id;
                private String menuHref;
                private String menuIcon;
                private String menuName;
                /**
                 * layout : 2
                 * adsName : bundle
                 * position : 1
                 * content : [{"picUrl":"http://p.yhres.com/bundle/2016/09/08/1473306091605578.png-q75","linkId":100,"linkUrl":"/topic/100","schemeUrl":"yhouse://topic/100","description":"不要再羡慕达人们的精彩世界\r\nYHOUSE给你真正想要的\r\n让你随时follow最新玩乐方式\r\n尽情享受无限乐趣","linkType":6,"id":0,"title":"时下最流行","sPicUrl":"http://p.yhres.com/bundle/2016/09/08/1473306091605578.png-ssq75","linkName":"TOPIC"},{"picUrl":"http://p.yhres.com/bundle/2016/09/24/1474720906589951.png-q75","linkId":649,"linkUrl":"/topic/649","schemeUrl":"yhouse://topic/649","description":"你怎么舍得宅在家中\r\n将大把时光白白浪费？\r\n\r\n不如翻出你的游玩计划\r\n逃去未知的旅途\r\n淋漓尽致地体会这场探险之路\r\n给你的心情放大假！","linkType":6,"id":0,"title":"游玩大作战","sPicUrl":"http://p.yhres.com/bundle/2016/09/24/1474720906589951.png-ssq75","linkName":"TOPIC"}]
                 */

                private int layout;
                private String adsName;
                private int position;
                /**
                 * picUrl : http://p.yhres.com/bundle/2016/09/08/1473306091605578.png-q75
                 * linkId : 100
                 * linkUrl : /topic/100
                 * schemeUrl : yhouse://topic/100
                 * description : 不要再羡慕达人们的精彩世界
                 YHOUSE给你真正想要的
                 让你随时follow最新玩乐方式
                 尽情享受无限乐趣
                 * linkType : 6
                 * id : 0
                 * title : 时下最流行
                 * sPicUrl : http://p.yhres.com/bundle/2016/09/08/1473306091605578.png-ssq75
                 * linkName : TOPIC
                 */

                private List<ContentBean> content;


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

                public List<ContentBean> getContent() {
                    return content;
                }

                public void setContent(List<ContentBean> content) {
                    this.content = content;
                }

                public static class ContentBean {
                    private String picUrl;
                    private int linkId;
                    private String linkUrl;
                    private String schemeUrl;
                    private String description;
                    private int linkType;
                    private int id;
                    private String title;
                    private String sPicUrl;
                    private String linkName;

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

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
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

                    public String getSPicUrl() {
                        return sPicUrl;
                    }

                    public void setSPicUrl(String sPicUrl) {
                        this.sPicUrl = sPicUrl;
                    }

                    public String getLinkName() {
                        return linkName;
                    }

                    public void setLinkName(String linkName) {
                        this.linkName = linkName;
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
                            ", content=" + content +
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
                        ", ageScope=" + ageScope +
                        ", applyExpiredTime='" + applyExpiredTime + '\'' +
                        ", categoryIconUrl='" + categoryIconUrl + '\'' +
                        ", categoryId=" + categoryId +
                        ", cityName='" + cityName + '\'' +
                        ", dataType=" + dataType +
                        ", distance='" + distance + '\'' +
                        ", district='" + district + '\'' +
                        ", duration='" + duration + '\'' +
                        ", hostName='" + hostName + '\'' +
                        ", id=" + id +
                        ", isFree=" + isFree +
                        ", isHaveEquities=" + isHaveEquities +
                        ", isInterested=" + isInterested +
                        ", isOnlineTimeNew=" + isOnlineTimeNew +
                        ", latitude='" + latitude + '\'' +
                        ", longitude='" + longitude + '\'' +
                        ", maxNum=" + maxNum +
                        ", neededCredits='" + neededCredits + '\'' +
                        ", originalPrice=" + originalPrice +
                        ", picUrl='" + picUrl + '\'' +
                        ", recommand=" + recommand +
                        ", sPicUrl='" + sPicUrl + '\'' +
                        ", supportDiscount=" + supportDiscount +
                        ", tag='" + tag + '\'' +
                        ", title='" + title + '\'' +
                        ", typeIcon='" + typeIcon + '\'' +
                        ", vipEqsTag='" + vipEqsTag + '\'' +
                        ", categorys=" + categorys +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "isEnd=" + isEnd +
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
        return "PlayEntity{" +
                "code='" + code + '\'' +
                ", data=" + data +
                ", detail='" + detail + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
