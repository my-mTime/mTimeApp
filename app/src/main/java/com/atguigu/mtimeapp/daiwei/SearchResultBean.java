package com.atguigu.mtimeapp.daiwei;

import java.util.List;

/**
 * Created by daiwei on 2016/4/11.
 *
 * 搜索结果实体类
 */
public class SearchResultBean {

    /**
     * suggestions : [{"id":209007,"type":1,"contentType":"电影","movieType":"爱情 | 剧情 | 科幻","isFilter":false,"titlecn":"美人鱼","titleen":"The Mermaid","rLocation":"中国","locationName":"中国","year":"2016","director":"周星驰","cover":"http://img31.mtime.cn/mt/2016/02/04/165933.21865133_1280X720X2.jpg"},{"id":89952,"type":1,"contentType":"电影","movieType":"动作 | 冒险 | 奇幻","isFilter":false,"titlecn":"魔兽","titleen":"Warcraft","rLocation":"美国","locationName":"美国","year":"2016","director":"邓肯·琼斯","cover":"http://img31.mtime.cn/mt/2016/04/01/091052.69736286_1280X720X2.jpg"},{"id":209122,"type":1,"contentType":"电影","movieType":"动作 | 科幻 | 惊悚","isFilter":false,"titlecn":"美国队长3","titleen":"Captain America: Civil War","rLocation":"美国","locationName":"美国","year":"2016","director":"安东尼·罗素","cover":"http://img31.mtime.cn/mt/2016/04/08/170930.97388737_1280X720X2.jpg"},{"id":210271,"type":1,"contentType":"电影","movieType":"爱情 | 喜剧","isFilter":false,"titlecn":"我的新野蛮女友","titleen":"My New Sassy Girl","rLocation":"中国","locationName":"中国","year":"2016","director":"赵根植","cover":"http://img31.mtime.cn/mt/2016/03/16/092953.63679225_1280X720X2.jpg"},{"id":1750136,"type":3,"titlecn":"李敏芝","titleen":"Min-ji Lee","sex":"女","birthLocation":"韩国","profession":"演员","birth":"1989-1-23","cover":"http://img31.mtime.cn/ph/2015/01/06/115646.70571366_1280X720X2.jpg"}]
     * goodsCount : 5
     */

    private int goodsCount;
    /**
     * id : 209007
     * type : 1
     * contentType : 电影
     * movieType : 爱情 | 剧情 | 科幻
     * isFilter : false
     * titlecn : 美人鱼
     * titleen : The Mermaid
     * rLocation : 中国
     * locationName : 中国
     * year : 2016
     * director : 周星驰
     * cover : http://img31.mtime.cn/mt/2016/02/04/165933.21865133_1280X720X2.jpg
     */

    private List<SuggestionsBean> suggestions;

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public List<SuggestionsBean> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<SuggestionsBean> suggestions) {
        this.suggestions = suggestions;
    }

    public static class SuggestionsBean {
        private int id;
        private int type;
        private String contentType;
        private String movieType;
        private boolean isFilter;
        private String titlecn;
        private String titleen;
        private String rLocation;
        private String locationName;
        private String year;
        private String director;
        private String cover;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public String getMovieType() {
            return movieType;
        }

        public void setMovieType(String movieType) {
            this.movieType = movieType;
        }

        public boolean isIsFilter() {
            return isFilter;
        }

        public void setIsFilter(boolean isFilter) {
            this.isFilter = isFilter;
        }

        public String getTitlecn() {
            return titlecn;
        }

        public void setTitlecn(String titlecn) {
            this.titlecn = titlecn;
        }

        public String getTitleen() {
            return titleen;
        }

        public void setTitleen(String titleen) {
            this.titleen = titleen;
        }

        public String getRLocation() {
            return rLocation;
        }

        public void setRLocation(String rLocation) {
            this.rLocation = rLocation;
        }

        public String getLocationName() {
            return locationName;
        }

        public void setLocationName(String locationName) {
            this.locationName = locationName;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }
    }
}
