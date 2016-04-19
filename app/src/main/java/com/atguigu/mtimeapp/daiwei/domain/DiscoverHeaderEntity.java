package com.atguigu.mtimeapp.daiwei.domain;

/**
 * Created by daiwei on 2016/4/15.
 *
 * 发现页面头部实体类
 */
public class DiscoverHeaderEntity {

    /**
     * newsID : 1554343
     * title : 涮涮迪士尼真人电影 昔日“副业”要变中流砥柱？
     * type : 0
     * imageUrl : http://img31.mtime.cn/mg/2016/04/15/081657.76957434.jpg
     */

    private NewsEntity news;
    /**
     * trailerID : 59915
     * title : 《霓虹恶魔》预告片
     * imageUrl : http://img31.mtime.cn/mg/2016/04/15/154447.79216562.jpg
     * mp4Url : http://vfx.mtime.cn/Video/2016/04/15/mp4/160415091802675105_480.mp4
     * hightUrl : http://vfx.mtime.cn/Video/2016/04/15/mp4/160415091802675105.mp4
     * movieId : 218285
     */

    private TrailerEntity trailer;
    /**
     * reviewID : 7950788
     * title : 上古神话的好莱坞式解读
     * posterUrl : http://img31.mtime.cn/mt/2016/03/04/095907.69694487_1280X720X2.jpg
     * movieName : 神战：权力之眼
     * imageUrl : http://img31.mtime.cn/mg/2016/03/15/095415.85345975.jpg
     */

    private ReviewEntity review;
    /**
     * id : 10792
     * imageUrl : http://img31.mtime.cn/mg/2015/03/31/100230.43767720.jpg
     */

    private ViewingGuideEntity viewingGuide;
    /**
     * id : 1348
     * title : 亚视经典剧集回顾
     * imageUrl : http://img31.mtime.cn/mg/2016/03/05/111735.12026988.jpg
     * type : 0
     */

    private TopListEntity topList;

    public NewsEntity getNews() {
        return news;
    }

    public void setNews(NewsEntity news) {
        this.news = news;
    }

    public TrailerEntity getTrailer() {
        return trailer;
    }

    public void setTrailer(TrailerEntity trailer) {
        this.trailer = trailer;
    }

    public ReviewEntity getReview() {
        return review;
    }

    public void setReview(ReviewEntity review) {
        this.review = review;
    }

    public ViewingGuideEntity getViewingGuide() {
        return viewingGuide;
    }

    public void setViewingGuide(ViewingGuideEntity viewingGuide) {
        this.viewingGuide = viewingGuide;
    }

    public TopListEntity getTopList() {
        return topList;
    }

    public void setTopList(TopListEntity topList) {
        this.topList = topList;
    }

    public static class NewsEntity {
        private int newsID;
        private String title;
        private int type;
        private String imageUrl;

        public int getNewsID() {
            return newsID;
        }

        public void setNewsID(int newsID) {
            this.newsID = newsID;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    }

    public static class TrailerEntity {
        private int trailerID;
        private String title;
        private String imageUrl;
        private String mp4Url;
        private String hightUrl;
        private int movieId;

        public int getTrailerID() {
            return trailerID;
        }

        public void setTrailerID(int trailerID) {
            this.trailerID = trailerID;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getMp4Url() {
            return mp4Url;
        }

        public void setMp4Url(String mp4Url) {
            this.mp4Url = mp4Url;
        }

        public String getHightUrl() {
            return hightUrl;
        }

        public void setHightUrl(String hightUrl) {
            this.hightUrl = hightUrl;
        }

        public int getMovieId() {
            return movieId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }
    }

    public static class ReviewEntity {
        private int reviewID;
        private String title;
        private String posterUrl;
        private String movieName;
        private String imageUrl;

        public int getReviewID() {
            return reviewID;
        }

        public void setReviewID(int reviewID) {
            this.reviewID = reviewID;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPosterUrl() {
            return posterUrl;
        }

        public void setPosterUrl(String posterUrl) {
            this.posterUrl = posterUrl;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    }

    public static class ViewingGuideEntity {
        private String id;
        private String imageUrl;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    }

    public static class TopListEntity {
        private int id;
        private String title;
        private String imageUrl;
        private int type;

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

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
