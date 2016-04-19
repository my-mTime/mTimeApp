package com.atguigu.mtimeapp.daiwei.domain;

import java.util.List;

/**
 * Created by daiwei on 2016/4/15.
 *
 * 发现 -- 预告片列表的实体类
 */
public class DiscoverPrevueEntity {

    /**
     * id : 59906
     * movieName : 《三人行》先行版预告片
     * coverImg : http://img31.mtime.cn/mg/2016/04/15/094906.15136025.jpg
     * movieId : 221822
     * url : http://vfx.mtime.cn/Video/2016/04/14/mp4/160414164023423259_480.mp4
     * hightUrl : http://vfx.mtime.cn/Video/2016/04/14/mp4/160414164023423259.mp4
     * videoTitle : 三人行 先行版预告片
     * videoLength : 72
     * rating : -1
     * type : ["动作","惊悚","犯罪"]
     * summary : 警医匪三人自我执念引发危机
     */

    private List<TrailersEntity> trailers;

    public List<TrailersEntity> getTrailers() {
        return trailers;
    }

    public void setTrailers(List<TrailersEntity> trailers) {
        this.trailers = trailers;
    }

    public static class TrailersEntity {
        private int id;
        private String movieName;
        private String coverImg;
        private int movieId;
        private String url;
        private String hightUrl;
        private String videoTitle;
        private int videoLength;
        private double rating;
        private String summary;
        private List<String> type;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public String getCoverImg() {
            return coverImg;
        }

        public void setCoverImg(String coverImg) {
            this.coverImg = coverImg;
        }

        public int getMovieId() {
            return movieId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHightUrl() {
            return hightUrl;
        }

        public void setHightUrl(String hightUrl) {
            this.hightUrl = hightUrl;
        }

        public String getVideoTitle() {
            return videoTitle;
        }

        public void setVideoTitle(String videoTitle) {
            this.videoTitle = videoTitle;
        }

        public int getVideoLength() {
            return videoLength;
        }

        public void setVideoLength(int videoLength) {
            this.videoLength = videoLength;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<String> getType() {
            return type;
        }

        public void setType(List<String> type) {
            this.type = type;
        }
    }
}
