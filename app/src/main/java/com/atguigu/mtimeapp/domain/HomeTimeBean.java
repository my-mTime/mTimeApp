package com.atguigu.mtimeapp.domain;

import java.util.List;

/**
 * Created by 笨货 on 2016/4/10.
 * 首页-时光精选数据对象
 */
public class HomeTimeBean {

    private int count;

    private List<DataEntity> data;

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HomeTimeBean{" +
                "count=" + count +
                ", data=" + data +
                '}';
    }

    public static class DataEntity{

        /**
         * commentCount : 25
         * content : 周润发称 香港电影100年靠郭富城梁家辉
         * dataType : 1
         * id : 1554270
         */

        private int commentCount;
        private String content;
        private int dataType;
        private int id;
        /**
         * desc : 《寒战2》北京发布会主创合影
         * gId : 503191
         * title :
         * url1 : http://img31.mtime.cn/CMS/Gallery/2016/04/10/165401.50264067.jpg
         * url2 : http://img31.mtime.cn/CMS/Gallery/2016/04/10/165401.50264067_900.jpg
         */

        private List<ImagesEntity> images;
        /**
         * img1 : http://img31.mtime.cn/CMS/Gallery/2016/04/10/165401.50264067_900.jpg
         * img2 : http://img31.mtime.cn/CMS/Gallery/2016/04/10/171101.93632305_900.jpg
         * img3 : http://img31.mtime.cn/CMS/Gallery/2016/04/10/165402.48698020_900.jpg
         * isShow : 是
         * publishTime : 1460307693
         */

        private String img1;
        private String img2;
        private String img3;
        private String isShow;
        private int publishTime;
        /**
         * id : 228965
         * image : http://img31.mtime.cn/mt/2016/03/14/151224.74585045_1280X720X2.jpg
         * name : 寒战2
         * rating : 0.0
         * relaseLocation : 中国
         * releaseDate : 2016年7月8日
         * scoreCount : 16
         * type : 1
         * year : 2016
         */

        private List<RelationsEntity> relations;

        private int status;
        private String tag;
        private String time;
        private String title;
        private String titlesmall;
        private int type;
        /**
         * memo : 看这剑拔弩张的架势，一场大战在所难免，但是有人并不属于这里？！
         * pic1Url : http://img31.mtime.cn/mg/2016/04/10/105605.41204213.jpg
         * url : http://feature.mtime.cn/puzzle/answer.html?gameClassId=1361&gameTypeId=1&gameId=0
         */

        private String memo;
        private String pic1Url;
        private String url;
        /**
         * nickname : 尉迟上九
         * rating : 8.0
         * relatedObj : {"id":219754,"image":"http://img31.mtime.cn/mg/2016/04/10/091052.65495566.jpg","name":"索尔之子","rating":8,"releaseLocation":"匈牙利","runtime":"107分钟","title":"索尔之子","titleCn":"索尔之子","titleEn":"Saul fia","type":["剧情","惊悚"],"url":"http://movie.mtime.com/219754/","wapUrl":"http://movie.wap.mtime.com/219754/"}
         * summaryInfo : 我从索尔身上看到是纯粹以当局者的角度出发，体会更多是失去所有希望后的一种自我麻痹。
         * userImage : http://img2.mtime.cn/u/1870/887870/2a83876d-712a-4238-9130-60f3ca695cf0/128X128.jpg
         */

        private String nickname;
        private String rating;
        /**
         * id : 219754
         * image : http://img31.mtime.cn/mg/2016/04/10/091052.65495566.jpg
         * name : 索尔之子
         * rating : 8
         * releaseLocation : 匈牙利
         * runtime : 107分钟
         * title : 索尔之子
         * titleCn : 索尔之子
         * titleEn : Saul fia
         * type : ["剧情","惊悚"]
         * url : http://movie.mtime.com/219754/
         * wapUrl : http://movie.wap.mtime.com/219754/
         */

        private RelatedObjEntity relatedObj;
        private String summaryInfo;
        private String userImage;
        /**
         * titleCn : 《麦格雷的陷阱》2015
         * titleEn : 暂时忘记他的憨豆属性
         * image : http://img31.mtime.cn/mt/2016/04/08/111605.73244306_1280X720X2.jpg
         */

        private String titleCn;
        private String titleEn;
        private String image;

        @Override
        public String toString() {
            return "DataEntity{" +
                    "commentCount=" + commentCount +
                    ", content='" + content + '\'' +
                    ", dataType=" + dataType +
                    ", id=" + id +
                    ", images=" + images +
                    ", img1='" + img1 + '\'' +
                    ", img2='" + img2 + '\'' +
                    ", img3='" + img3 + '\'' +
                    ", isShow='" + isShow + '\'' +
                    ", publishTime=" + publishTime +
                    ", relations=" + relations +
                    ", status=" + status +
                    ", tag='" + tag + '\'' +
                    ", time='" + time + '\'' +
                    ", title='" + title + '\'' +
                    ", titlesmall='" + titlesmall + '\'' +
                    ", type=" + type +
                    ", memo='" + memo + '\'' +
                    ", pic1Url='" + pic1Url + '\'' +
                    ", url='" + url + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", rating='" + rating + '\'' +
                    ", relatedObj=" + relatedObj +
                    ", summaryInfo='" + summaryInfo + '\'' +
                    ", userImage='" + userImage + '\'' +
                    '}';
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitlesmall() {
            return titlesmall;
        }

        public void setTitlesmall(String titlesmall) {
            this.titlesmall = titlesmall;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setCommentCount(int commentCount) {
            this.commentCount = commentCount;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setDataType(int dataType) {
            this.dataType = dataType;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCommentCount() {
            return commentCount;
        }

        public String getContent() {
            return content;
        }

        public int getDataType() {
            return dataType;
        }

        public int getId() {
            return id;
        }

        public void setImages(List<ImagesEntity> images) {
            this.images = images;
        }

        public List<ImagesEntity> getImages() {
            return images;
        }

        public void setImg1(String img1) {
            this.img1 = img1;
        }

        public void setImg2(String img2) {
            this.img2 = img2;
        }

        public void setImg3(String img3) {
            this.img3 = img3;
        }

        public void setIsShow(String isShow) {
            this.isShow = isShow;
        }

        public void setPublishTime(int publishTime) {
            this.publishTime = publishTime;
        }

        public String getImg1() {
            return img1;
        }

        public String getImg2() {
            return img2;
        }

        public String getImg3() {
            return img3;
        }

        public String getIsShow() {
            return isShow;
        }

        public int getPublishTime() {
            return publishTime;
        }

        public void setRelations(List<RelationsEntity> relations) {
            this.relations = relations;
        }

        public List<RelationsEntity> getRelations() {
            return relations;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public void setPic1Url(String pic1Url) {
            this.pic1Url = pic1Url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getMemo() {
            return memo;
        }

        public String getPic1Url() {
            return pic1Url;
        }

        public String getUrl() {
            return url;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public void setRelatedObj(RelatedObjEntity relatedObj) {
            this.relatedObj = relatedObj;
        }

        public void setSummaryInfo(String summaryInfo) {
            this.summaryInfo = summaryInfo;
        }

        public void setUserImage(String userImage) {
            this.userImage = userImage;
        }

        public String getNickname() {
            return nickname;
        }

        public String getRating() {
            return rating;
        }

        public RelatedObjEntity getRelatedObj() {
            return relatedObj;
        }

        public String getSummaryInfo() {
            return summaryInfo;
        }

        public String getUserImage() {
            return userImage;
        }

        public void setTitleCn(String titleCn) {
            this.titleCn = titleCn;
        }

        public void setTitleEn(String titleEn) {
            this.titleEn = titleEn;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitleCn() {
            return titleCn;
        }

        public String getTitleEn() {
            return titleEn;
        }

        public String getImage() {
            return image;
        }

        public static class ImagesEntity {
            private String desc;
            private int gId;
            private String title;
            private String url1;
            private String url2;

            @Override
            public String toString() {
                return "ImagesEntity{" +
                        "desc='" + desc + '\'' +
                        ", gId=" + gId +
                        ", title='" + title + '\'' +
                        ", url1='" + url1 + '\'' +
                        ", url2='" + url2 + '\'' +
                        '}';
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public void setGId(int gId) {
                this.gId = gId;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setUrl1(String url1) {
                this.url1 = url1;
            }

            public void setUrl2(String url2) {
                this.url2 = url2;
            }

            public String getDesc() {
                return desc;
            }

            public int getGId() {
                return gId;
            }

            public String getTitle() {
                return title;
            }

            public String getUrl1() {
                return url1;
            }

            public String getUrl2() {
                return url2;
            }
        }

        public static class RelationsEntity {
            private int id;
            private String image;
            private String name;
            private String rating;
            private String relaseLocation;
            private String releaseDate;
            private int scoreCount;
            private int type;
            private String year;

            @Override
            public String toString() {
                return "RelationsEntity{" +
                        "id=" + id +
                        ", image='" + image + '\'' +
                        ", name='" + name + '\'' +
                        ", rating='" + rating + '\'' +
                        ", relaseLocation='" + relaseLocation + '\'' +
                        ", releaseDate='" + releaseDate + '\'' +
                        ", scoreCount=" + scoreCount +
                        ", type=" + type +
                        ", year='" + year + '\'' +
                        '}';
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setRating(String rating) {
                this.rating = rating;
            }

            public void setRelaseLocation(String relaseLocation) {
                this.relaseLocation = relaseLocation;
            }

            public void setReleaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
            }

            public void setScoreCount(int scoreCount) {
                this.scoreCount = scoreCount;
            }

            public void setType(int type) {
                this.type = type;
            }

            public void setYear(String year) {
                this.year = year;
            }

            public int getId() {
                return id;
            }

            public String getImage() {
                return image;
            }

            public String getName() {
                return name;
            }

            public String getRating() {
                return rating;
            }

            public String getRelaseLocation() {
                return relaseLocation;
            }

            public String getReleaseDate() {
                return releaseDate;
            }

            public int getScoreCount() {
                return scoreCount;
            }

            public int getType() {
                return type;
            }

            public String getYear() {
                return year;
            }
        }

        public static class RelatedObjEntity {
            private int id;
            private String image;
            private String name;
            private String rating;
            private String releaseLocation;
            private String runtime;
            private String title;
            private String titleCn;
            private String titleEn;
            private String url;
            private String wapUrl;
            private List<String> type;

            public void setId(int id) {
                this.id = id;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setRating(String rating) {
                this.rating = rating;
            }

            public void setReleaseLocation(String releaseLocation) {
                this.releaseLocation = releaseLocation;
            }

            public void setRuntime(String runtime) {
                this.runtime = runtime;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setTitleCn(String titleCn) {
                this.titleCn = titleCn;
            }

            public void setTitleEn(String titleEn) {
                this.titleEn = titleEn;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public void setWapUrl(String wapUrl) {
                this.wapUrl = wapUrl;
            }

            public void setType(List<String> type) {
                this.type = type;
            }

            public int getId() {
                return id;
            }

            public String getImage() {
                return image;
            }

            public String getName() {
                return name;
            }

            public String getRating() {
                return rating;
            }

            public String getReleaseLocation() {
                return releaseLocation;
            }

            public String getRuntime() {
                return runtime;
            }

            public String getTitle() {
                return title;
            }

            public String getTitleCn() {
                return titleCn;
            }

            public String getTitleEn() {
                return titleEn;
            }

            public String getUrl() {
                return url;
            }

            public String getWapUrl() {
                return wapUrl;
            }

            public List<String> getType() {
                return type;
            }
        }
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
