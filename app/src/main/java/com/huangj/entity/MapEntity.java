package com.huangj.entity;

import java.util.List;

/**
 * Created by mmmm on 2016/11/2.
 */
public class MapEntity {

    /**
     * id : 373469272338336
     * lng : 100.74834
     * lat : 13.681808
     */

    private List<SimpleFeedListBean> simpleFeedList;
    /**
     * id : 373400533190304
     * lng : 91.11351
     * lat : 29.654924
     * url : /2016/3/a148a2bb025724bc6bd5907a3f6549850
     */

    private List<SimplePicListBean> simplePicList;

    public List<SimpleFeedListBean> getSimpleFeedList() {
        return simpleFeedList;
    }

    public void setSimpleFeedList(List<SimpleFeedListBean> simpleFeedList) {
        this.simpleFeedList = simpleFeedList;
    }

    public List<SimplePicListBean> getSimplePicList() {
        return simplePicList;
    }

    public void setSimplePicList(List<SimplePicListBean> simplePicList) {
        this.simplePicList = simplePicList;
    }

    public static class SimpleFeedListBean {
        private long id;
        private double lng;
        private double lat;

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
    }

    public static class SimplePicListBean {
        private long id;
        private double lng;
        private double lat;
        private String url;

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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
