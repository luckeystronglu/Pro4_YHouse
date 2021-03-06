package com.huangj.entity;

import java.util.List;

/**
 * Created by HuangJ on 2016/10/28.13:56
 */
public class VideoEntity {

    /**
     * count : 4283
     * np : 1477585922
     */

    private InfoBean info;
    /**
     * status : 4
     * comment : 19
     * tags : [{"id":1,"name":"搞笑"},{"id":55,"name":"微视频"},{"id":115,"name":"原创"},{"id":3096,"name":"百思红人"}]
     * bookmark : 49
     * text : 老司机的故事，请系好安全带
     * up : 284
     * share_url : http://a.f.budejie.com/share/21682017.html?wx.qq.com
     * down : 73
     * forward : 72
     * u : {"header":["http://wimg.spriteapp.cn/profile/large/2016/03/29/56f9dfaa5b577_mini.jpg","http://dimg.spriteapp.cn/profile/large/2016/03/29/56f9dfaa5b577_mini.jpg"],"is_v":true,"uid":"17914521","is_vip":false,"name":"大哥vip"}
     * passtime : 2016-10-28 13:51:01
     * video : {"playfcount":2350,"height":320,"width":568,"video":["http://wvideo.spriteapp.cn/video/2016/1027/5811b00e4eb93_wpd.mp4","http://bvideo.spriteapp.cn/video/2016/1027/5811b00e4eb93_wpd.mp4","http://dvideo.spriteapp.cn/video/2016/1027/5811b00e4eb93_wpd.mp4"],"download":["http://wvideo.spriteapp.cn/video/2016/1027/5811b00e4eb93_wpc.mp4","http://bvideo.spriteapp.cn/video/2016/1027/5811b00e4eb93_wpc.mp4","http://dvideo.spriteapp.cn/video/2016/1027/5811b00e4eb93_wpc.mp4"],"duration":95,"playcount":18128,"thumbnail":["http://wimg.spriteapp.cn/picture/2016/1027/5811b00e2d237__b_33.jpg","http://dimg.spriteapp.cn/picture/2016/1027/5811b00e2d237__b_33.jpg"],"thumbnail_small":["http://wimg.spriteapp.cn/crop/150x150/picture/2016/1027/5811b00e2d237__b_33.jpg","http://dimg.spriteapp.cn/crop/150x150/picture/2016/1027/5811b00e2d237__b_33.jpg"]}
     * type : video
     * id : 21682017
     */

    private List<ListBean> list;

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class InfoBean {
        private int count;
        private int np;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getNp() {
            return np;
        }

        public void setNp(int np) {
            this.np = np;
        }
    }

    public static class ListBean {
        private int status;
        private String comment;
        private String bookmark;
        private String text;
        private String up;
        private String share_url;
        private int down;
        private int forward;
        /**
         * header : ["http://wimg.spriteapp.cn/profile/large/2016/03/29/56f9dfaa5b577_mini.jpg","http://dimg.spriteapp.cn/profile/large/2016/03/29/56f9dfaa5b577_mini.jpg"]
         * is_v : true
         * uid : 17914521
         * is_vip : false
         * name : 大哥vip
         */

        private UBean u;
        private String passtime;
        /**
         * playfcount : 2350
         * height : 320
         * width : 568
         * video : ["http://wvideo.spriteapp.cn/video/2016/1027/5811b00e4eb93_wpd.mp4","http://bvideo.spriteapp.cn/video/2016/1027/5811b00e4eb93_wpd.mp4","http://dvideo.spriteapp.cn/video/2016/1027/5811b00e4eb93_wpd.mp4"]
         * download : ["http://wvideo.spriteapp.cn/video/2016/1027/5811b00e4eb93_wpc.mp4","http://bvideo.spriteapp.cn/video/2016/1027/5811b00e4eb93_wpc.mp4","http://dvideo.spriteapp.cn/video/2016/1027/5811b00e4eb93_wpc.mp4"]
         * duration : 95
         * playcount : 18128
         * thumbnail : ["http://wimg.spriteapp.cn/picture/2016/1027/5811b00e2d237__b_33.jpg","http://dimg.spriteapp.cn/picture/2016/1027/5811b00e2d237__b_33.jpg"]
         * thumbnail_small : ["http://wimg.spriteapp.cn/crop/150x150/picture/2016/1027/5811b00e2d237__b_33.jpg","http://dimg.spriteapp.cn/crop/150x150/picture/2016/1027/5811b00e2d237__b_33.jpg"]
         */

        private VideoBean video;
        private String type;
        private String id;
        /**
         * id : 1
         * name : 搞笑
         */

        private List<TagsBean> tags;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getBookmark() {
            return bookmark;
        }

        public void setBookmark(String bookmark) {
            this.bookmark = bookmark;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public int getDown() {
            return down;
        }

        public void setDown(int down) {
            this.down = down;
        }

        public int getForward() {
            return forward;
        }

        public void setForward(int forward) {
            this.forward = forward;
        }

        public UBean getU() {
            return u;
        }

        public void setU(UBean u) {
            this.u = u;
        }

        public String getPasstime() {
            return passtime;
        }

        public void setPasstime(String passtime) {
            this.passtime = passtime;
        }

        public VideoBean getVideo() {
            return video;
        }

        public void setVideo(VideoBean video) {
            this.video = video;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public static class UBean {
            private boolean is_v;
            private String uid;
            private boolean is_vip;
            private String name;
            private List<String> header;

            public boolean isIs_v() {
                return is_v;
            }

            public void setIs_v(boolean is_v) {
                this.is_v = is_v;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public boolean isIs_vip() {
                return is_vip;
            }

            public void setIs_vip(boolean is_vip) {
                this.is_vip = is_vip;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<String> getHeader() {
                return header;
            }

            public void setHeader(List<String> header) {
                this.header = header;
            }
        }

        public static class VideoBean {
            private int playfcount;
            private int height;
            private int width;
            private int duration;
            private int playcount;
            private List<String> video;
            private List<String> download;
            private List<String> thumbnail;
            private List<String> thumbnail_small;

            public int getPlayfcount() {
                return playfcount;
            }

            public void setPlayfcount(int playfcount) {
                this.playfcount = playfcount;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getPlaycount() {
                return playcount;
            }

            public void setPlaycount(int playcount) {
                this.playcount = playcount;
            }

            public List<String> getVideo() {
                return video;
            }

            public void setVideo(List<String> video) {
                this.video = video;
            }

            public List<String> getDownload() {
                return download;
            }

            public void setDownload(List<String> download) {
                this.download = download;
            }

            public List<String> getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(List<String> thumbnail) {
                this.thumbnail = thumbnail;
            }

            public List<String> getThumbnail_small() {
                return thumbnail_small;
            }

            public void setThumbnail_small(List<String> thumbnail_small) {
                this.thumbnail_small = thumbnail_small;
            }
        }

        public static class TagsBean {
            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
