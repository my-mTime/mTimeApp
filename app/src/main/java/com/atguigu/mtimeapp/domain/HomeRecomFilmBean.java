package com.atguigu.mtimeapp.domain;

import java.util.List;

/**
 * Created by 笨货 on 2016/4/10.
 * 首页推荐电影的Bean对象
 */
public class HomeRecomFilmBean {

    /**
     * count : 15
     * movies : [{"actorName1":"杰拉德·巴特勒","actorName2":"艾伦·艾克哈特","btnText":"","commonSpecial":"这不奥林匹斯陷落么","directorName":"巴巴克·纳加非","img":"http://img31.mtime.cn/mt/2016/03/18/144725.14339749_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":true,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":99,"movieId":211903,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":143,"nearestShowDay":1460246400,"nearestShowtimeCount":1664},"rDay":8,"rMonth":4,"rYear":2016,"ratingFinal":6.7,"titleCn":"伦敦陷落","titleEn":"London Has Fallen","type":"动作 | 犯罪 | 惊悚","wantedCount":1632},{"actorName1":"陈坤","actorName2":"白百何","btnText":"","commonSpecial":" 贼好看，\u201c贼\u201d好看","directorName":"杨庆","img":"http://img31.mtime.cn/mt/2016/03/17/095046.92546354_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":true,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":95,"movieId":229813,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":140,"nearestShowDay":1460246400,"nearestShowtimeCount":1089},"rDay":1,"rMonth":4,"rYear":2016,"ratingFinal":6.5,"titleCn":"火锅英雄","titleEn":"Chongqing Hot Pot","type":"爱情 | 动作 | 剧情","wantedCount":2684},{"actorName1":"洪金宝","actorName2":"刘德华","btnText":"","commonSpecial":" 功夫版《老炮儿》","directorName":"洪金宝","img":"http://img31.mtime.cn/mt/2016/03/18/115923.98692411_1280X720X2.jpg","is3D":false,"isDMAX":true,"isFilter":false,"isHot":true,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":99,"movieId":216573,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":136,"nearestShowDay":1460246400,"nearestShowtimeCount":711},"rDay":1,"rMonth":4,"rYear":2016,"ratingFinal":5.5,"titleCn":"我的特工爷爷","titleEn":"The Bodyguard","type":"动作 | 剧情 | 悬疑","wantedCount":2697},{"actorName1":"金妮弗·古德温","actorName2":"杰森·贝特曼","btnText":"","commonSpecial":"不乱卖萌的全年龄层动画","directorName":"拜恩·霍华德","img":"http://img31.mtime.cn/mt/2016/01/28/092552.17985926_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":108,"movieId":205222,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":128,"nearestShowDay":1460246400,"nearestShowtimeCount":773},"rDay":4,"rMonth":3,"rYear":2016,"ratingFinal":8.7,"titleCn":"疯狂动物城","titleEn":"Zootopia","type":"动画 | 冒险 | 喜剧","wantedCount":14209},{"actorName1":"本·阿弗莱克","actorName2":"亨利·卡维尔","btnText":"","commonSpecial":"自带BGM的神奇女侠","directorName":"扎克·施奈德","img":"http://img31.mtime.cn/mt/2016/03/14/201837.61652663_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":151,"movieId":203183,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":124,"nearestShowDay":1460246400,"nearestShowtimeCount":468},"rDay":25,"rMonth":3,"rYear":2016,"ratingFinal":7.4,"titleCn":"蝙蝠侠大战超人：正义黎明","titleEn":"Batman v Superman: Dawn of Justice","type":"动作 | 冒险 | 奇幻","wantedCount":11009},{"actorName1":"陈晓","actorName2":"秦岚","btnText":"","commonSpecial":"宿舍的黄段子是一道风景","directorName":"张琦","img":"http://img31.mtime.cn/mt/2016/03/17/173331.19323605_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":93,"movieId":225158,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":89,"nearestShowDay":1460246400,"nearestShowtimeCount":248},"rDay":1,"rMonth":4,"rYear":2016,"ratingFinal":5.7,"titleCn":"睡在我上铺的兄弟","titleEn":"Who Sleeps My Bro","type":"剧情","wantedCount":1339},{"actorName1":"莱昂纳多·迪卡普里奥","actorName2":"汤姆·哈迪","btnText":"","commonSpecial":"其实小李的大氅老值钱了","directorName":"亚利桑德罗·冈萨雷斯·伊纳里图","img":"http://img31.mtime.cn/mt/2016/03/03/222241.58917235_1280X720X2.jpg","is3D":false,"isDMAX":true,"isFilter":false,"isHot":false,"isIMAX":true,"isIMAX3D":false,"isNew":false,"length":156,"movieId":156682,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":68,"nearestShowDay":1460246400,"nearestShowtimeCount":189},"rDay":18,"rMonth":3,"rYear":2016,"ratingFinal":8,"titleCn":"荒野猎人","titleEn":"The Revenant","type":"冒险 | 剧情 | 惊悚","wantedCount":6701},{"actorName1":"劳伦·科汉","actorName2":"鲁珀特·伊文斯","btnText":"","commonSpecial":"保姆从来都不是好差事","directorName":"威廉·布伦特·贝尔","img":"http://img31.mtime.cn/mt/2016/03/30/111813.75613052_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":97,"movieId":229122,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":40,"nearestShowDay":1460246400,"nearestShowtimeCount":76},"rDay":1,"rMonth":4,"rYear":2016,"ratingFinal":6.6,"titleCn":"灵偶契约","titleEn":"The Boy","type":"恐怖 | 惊悚","wantedCount":466},{"actorName1":"","actorName2":"","btnText":"","commonSpecial":"反派大联萌来袭","directorName":"郑成峰","img":"http://img31.mtime.cn/mt/2015/11/02/151318.16176984_1280X720X2.jpg","is3D":true,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":80,"movieId":229451,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":20,"nearestShowDay":1460246400,"nearestShowtimeCount":32},"rDay":2,"rMonth":4,"rYear":2016,"ratingFinal":3.4,"titleCn":"太空熊猫英雄归来","titleEn":"Space Panda","type":"动画 | 喜剧","wantedCount":133},{"actorName1":"沙溢","actorName2":"胡可","btnText":"","commonSpecial":"老白胡可两口子齐上阵","directorName":"刘天荣","img":"http://img31.mtime.cn/mt/2016/03/17/153645.50060865_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":90,"movieId":232692,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":19,"nearestShowDay":1460246400,"nearestShowtimeCount":29},"rDay":8,"rMonth":4,"rYear":2016,"ratingFinal":-1,"titleCn":"午夜寻访录","titleEn":"Midnight Record Search","type":"惊悚","wantedCount":29},{"actorName1":"杨鸥","actorName2":"夏磊","btnText":"","commonSpecial":"关于列车的遐想","directorName":"李婷婷","img":"http://img31.mtime.cn/mt/2016/03/13/160106.35635976_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":86,"movieId":209501,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":11,"nearestShowDay":1460246400,"nearestShowtimeCount":18},"rDay":2,"rMonth":4,"rYear":2016,"ratingFinal":5.3,"titleCn":"摩尔庄园大电影3魔幻列车大冒险","titleEn":"Legend Of The Moles-The Magic Train Adventure","type":"动画 | 家庭 | 剧情","wantedCount":422},{"actorName1":"刘心悠","actorName2":"周柏豪","btnText":"","commonSpecial":"","directorName":"翁秀兰","img":"http://img31.mtime.cn/mt/2016/03/25/085208.48363109_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":105,"movieId":230241,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":11,"nearestShowDay":1460246400,"nearestShowtimeCount":15},"rDay":8,"rMonth":4,"rYear":2016,"ratingFinal":5.3,"titleCn":"我的老婆是明星","titleEn":"My Wife Is A Superstar","type":"爱情 | 剧情 | 喜剧","wantedCount":63},{"actorName1":"黎明","actorName2":"韩彩英","btnText":"","commonSpecial":"看男神女神一起玩重口","directorName":"林大雄","img":"http://img31.mtime.cn/mt/2016/03/30/113537.91294974_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":94,"movieId":222349,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":9,"nearestShowDay":1460246400,"nearestShowtimeCount":15},"rDay":1,"rMonth":4,"rYear":2016,"ratingFinal":5.8,"titleCn":"不速之客","titleEn":"The Guest","type":"惊悚 | 剧情 | 犯罪","wantedCount":250},{"actorName1":"李左飞","actorName2":"曹子辰","btnText":"","commonSpecial":"京城鬼宅又上银幕","directorName":"邢博","img":"http://img31.mtime.cn/mt/2016/03/28/151116.71732478_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":92,"movieId":232570,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":11,"nearestShowDay":1460246400,"nearestShowtimeCount":14},"rDay":8,"rMonth":4,"rYear":2016,"ratingFinal":4.9,"titleCn":"隔壁惊魂","titleEn":"Ghost Neighbor","type":"惊悚 | 恐怖","wantedCount":24},{"actorName1":"尼可拉·科斯特-瓦尔道","actorName2":"杰拉德·巴特勒","btnText":"","commonSpecial":"场景设定很洋气","directorName":"亚历克斯·普罗亚斯","img":"http://img31.mtime.cn/mt/2016/03/04/095907.69694487_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":127,"movieId":208254,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":7,"nearestShowDay":1460246400,"nearestShowtimeCount":13},"rDay":11,"rMonth":3,"rYear":2016,"ratingFinal":6.6,"titleCn":"神战：权力之眼","titleEn":"Gods of Egypt","type":"动作 | 冒险 | 奇幻","wantedCount":2813}]
     * totalCinemaCount : 169
     * totalComingMovie : 50
     * totalHotMovie : 45
     */

    private int count;
    private int totalCinemaCount;
    private int totalComingMovie;
    private int totalHotMovie;
    /**
     * actorName1 : 杰拉德·巴特勒
     * actorName2 : 艾伦·艾克哈特
     * btnText :
     * commonSpecial : 这不奥林匹斯陷落么
     * directorName : 巴巴克·纳加非
     * img : http://img31.mtime.cn/mt/2016/03/18/144725.14339749_1280X720X2.jpg
     * is3D : true
     * isDMAX : true
     * isFilter : false
     * isHot : true
     * isIMAX : false
     * isIMAX3D : false
     * isNew : false
     * length : 99
     * movieId : 211903
     * nearestShowtime : {"isTicket":true,"nearestCinemaCount":143,"nearestShowDay":1460246400,"nearestShowtimeCount":1664}
     * rDay : 8
     * rMonth : 4
     * rYear : 2016
     * ratingFinal : 6.7
     * titleCn : 伦敦陷落
     * titleEn : London Has Fallen
     * type : 动作 | 犯罪 | 惊悚
     * wantedCount : 1632
     */

    private List<MoviesEntity> movies;

    @Override
    public String toString() {
        return "HomeRecomFilmBean{" +
                "count=" + count +
                ", totalCinemaCount=" + totalCinemaCount +
                ", totalComingMovie=" + totalComingMovie +
                ", totalHotMovie=" + totalHotMovie +
                ", movies=" + movies +
                '}';
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setTotalCinemaCount(int totalCinemaCount) {
        this.totalCinemaCount = totalCinemaCount;
    }

    public void setTotalComingMovie(int totalComingMovie) {
        this.totalComingMovie = totalComingMovie;
    }

    public void setTotalHotMovie(int totalHotMovie) {
        this.totalHotMovie = totalHotMovie;
    }

    public void setMovies(List<MoviesEntity> movies) {
        this.movies = movies;
    }

    public int getCount() {
        return count;
    }

    public int getTotalCinemaCount() {
        return totalCinemaCount;
    }

    public int getTotalComingMovie() {
        return totalComingMovie;
    }

    public int getTotalHotMovie() {
        return totalHotMovie;
    }

    public List<MoviesEntity> getMovies() {
        return movies;
    }

    public static class MoviesEntity {
        private String actorName1;
        private String actorName2;
        private String btnText;
        private String commonSpecial;
        private String directorName;
        private String img;
        private boolean is3D;
        private boolean isDMAX;
        private boolean isFilter;
        private boolean isHot;
        private boolean isIMAX;
        private boolean isIMAX3D;
        private boolean isNew;
        private int length;
        private int movieId;
        /**
         * isTicket : true
         * nearestCinemaCount : 143
         * nearestShowDay : 1460246400
         * nearestShowtimeCount : 1664
         */

        private NearestShowtimeEntity nearestShowtime;
        private int rDay;
        private int rMonth;
        private int rYear;
        private double ratingFinal;
        private String titleCn;
        private String titleEn;
        private String type;
        private int wantedCount;

        @Override
        public String toString() {
            return "MoviesEntity{" +
                    "actorName1='" + actorName1 + '\'' +
                    ", actorName2='" + actorName2 + '\'' +
                    ", btnText='" + btnText + '\'' +
                    ", commonSpecial='" + commonSpecial + '\'' +
                    ", directorName='" + directorName + '\'' +
                    ", img='" + img + '\'' +
                    ", is3D=" + is3D +
                    ", isDMAX=" + isDMAX +
                    ", isFilter=" + isFilter +
                    ", isHot=" + isHot +
                    ", isIMAX=" + isIMAX +
                    ", isIMAX3D=" + isIMAX3D +
                    ", isNew=" + isNew +
                    ", length=" + length +
                    ", movieId=" + movieId +
                    ", nearestShowtime=" + nearestShowtime +
                    ", rDay=" + rDay +
                    ", rMonth=" + rMonth +
                    ", rYear=" + rYear +
                    ", ratingFinal=" + ratingFinal +
                    ", titleCn='" + titleCn + '\'' +
                    ", titleEn='" + titleEn + '\'' +
                    ", type='" + type + '\'' +
                    ", wantedCount=" + wantedCount +
                    '}';
        }

        public void setActorName1(String actorName1) {
            this.actorName1 = actorName1;
        }

        public void setActorName2(String actorName2) {
            this.actorName2 = actorName2;
        }

        public void setBtnText(String btnText) {
            this.btnText = btnText;
        }

        public void setCommonSpecial(String commonSpecial) {
            this.commonSpecial = commonSpecial;
        }

        public void setDirectorName(String directorName) {
            this.directorName = directorName;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public void setIs3D(boolean is3D) {
            this.is3D = is3D;
        }

        public void setIsDMAX(boolean isDMAX) {
            this.isDMAX = isDMAX;
        }

        public void setIsFilter(boolean isFilter) {
            this.isFilter = isFilter;
        }

        public void setIsHot(boolean isHot) {
            this.isHot = isHot;
        }

        public void setIsIMAX(boolean isIMAX) {
            this.isIMAX = isIMAX;
        }

        public void setIsIMAX3D(boolean isIMAX3D) {
            this.isIMAX3D = isIMAX3D;
        }

        public void setIsNew(boolean isNew) {
            this.isNew = isNew;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public void setNearestShowtime(NearestShowtimeEntity nearestShowtime) {
            this.nearestShowtime = nearestShowtime;
        }

        public void setRDay(int rDay) {
            this.rDay = rDay;
        }

        public void setRMonth(int rMonth) {
            this.rMonth = rMonth;
        }

        public void setRYear(int rYear) {
            this.rYear = rYear;
        }

        public void setRatingFinal(double ratingFinal) {
            this.ratingFinal = ratingFinal;
        }

        public void setTitleCn(String titleCn) {
            this.titleCn = titleCn;
        }

        public void setTitleEn(String titleEn) {
            this.titleEn = titleEn;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setWantedCount(int wantedCount) {
            this.wantedCount = wantedCount;
        }

        public String getActorName1() {
            return actorName1;
        }

        public String getActorName2() {
            return actorName2;
        }

        public String getBtnText() {
            return btnText;
        }

        public String getCommonSpecial() {
            return commonSpecial;
        }

        public String getDirectorName() {
            return directorName;
        }

        public String getImg() {
            return img;
        }

        public boolean isIs3D() {
            return is3D;
        }

        public boolean isIsDMAX() {
            return isDMAX;
        }

        public boolean isIsFilter() {
            return isFilter;
        }

        public boolean isIsHot() {
            return isHot;
        }

        public boolean isIsIMAX() {
            return isIMAX;
        }

        public boolean isIsIMAX3D() {
            return isIMAX3D;
        }

        public boolean isIsNew() {
            return isNew;
        }

        public int getLength() {
            return length;
        }

        public int getMovieId() {
            return movieId;
        }

        public NearestShowtimeEntity getNearestShowtime() {
            return nearestShowtime;
        }

        public int getRDay() {
            return rDay;
        }

        public int getRMonth() {
            return rMonth;
        }

        public int getRYear() {
            return rYear;
        }

        public double getRatingFinal() {
            return ratingFinal;
        }

        public String getTitleCn() {
            return titleCn;
        }

        public String getTitleEn() {
            return titleEn;
        }

        public String getType() {
            return type;
        }

        public int getWantedCount() {
            return wantedCount;
        }

        public static class NearestShowtimeEntity {
            private boolean isTicket;
            private int nearestCinemaCount;
            private int nearestShowDay;
            private int nearestShowtimeCount;

            @Override
            public String toString() {
                return "NearestShowtimeEntity{" +
                        "isTicket=" + isTicket +
                        ", nearestCinemaCount=" + nearestCinemaCount +
                        ", nearestShowDay=" + nearestShowDay +
                        ", nearestShowtimeCount=" + nearestShowtimeCount +
                        '}';
            }

            public void setIsTicket(boolean isTicket) {
                this.isTicket = isTicket;
            }

            public void setNearestCinemaCount(int nearestCinemaCount) {
                this.nearestCinemaCount = nearestCinemaCount;
            }

            public void setNearestShowDay(int nearestShowDay) {
                this.nearestShowDay = nearestShowDay;
            }

            public void setNearestShowtimeCount(int nearestShowtimeCount) {
                this.nearestShowtimeCount = nearestShowtimeCount;
            }

            public boolean isIsTicket() {
                return isTicket;
            }

            public int getNearestCinemaCount() {
                return nearestCinemaCount;
            }

            public int getNearestShowDay() {
                return nearestShowDay;
            }

            public int getNearestShowtimeCount() {
                return nearestShowtimeCount;
            }
        }
    }
}
