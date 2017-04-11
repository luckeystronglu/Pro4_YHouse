package com.huangj.entity;

/**
 * Created by HuangJ on 2016/10/26.17:09
 */
public class FoodsPicEntity {

    /**
     * id : 1124
     * description : null
     * picUrl : http://p.yhres.com/ads/2016/10/19/1476843691880300.jpg-q75
     * sPicUrl : http://p.yhres.com/ads/2016/10/19/1476843691880300.jpg-ssq75
     * title : 除了全聚德还有哪些值得一尝的烤鸭？
     * linkUrl : /guide/3042
     * schemeUrl : yhouse://guide/3042
     * linkName : GUIDE
     * linkType : 8
     * pvUrl :
     * linkId : 3042
     * xsort : 1
     * actual : false
     */

    private int id;
    private String picUrl;
    private String sPicUrl;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
