package com.atguigu.mtimeapp.lixin;

import java.util.List;

/**
 * Created by 笨货 on 2016/4/13.
 * 时光热搜榜的数据对象
 */
public class MTimeHotBean {

    /**
     * count : 15
     * list : [{"id":211903,"name":"伦敦陷落","posterUrl":"http://img31.mtime.cn/mt/2016/03/18/144725.14339749_1280X720X2.jpg","nameEn":"London Has Fallen","rating":"6.7","releaseArea":"中国","wantCount":"1838","isTicket":true,"isPresell":false,"directorId":1726823,"director":"巴巴克·纳加非","directorId2":0,"director2":"","actor1Id":928291,"actor1":"杰拉德·巴特勒","actor2Id":928291,"actor2":"艾伦·艾克哈特","releaseDate":"2016.4.8"},{"id":207872,"name":"奇幻森林","posterUrl":"http://img31.mtime.cn/mt/2016/03/28/170428.48853494_1280X720X2.jpg","nameEn":"The Jungle Book","rating":"7.9","releaseArea":"中国","wantCount":"2658","isTicket":true,"isPresell":true,"directorId":902449,"director":"乔恩·费儒","directorId2":0,"director2":"","actor1Id":2100136,"actor1":"尼尔·塞西","actor2Id":2100136,"actor2":"比尔·默瑞","releaseDate":"2016.4.15"},{"id":203183,"name":"蝙蝠侠大战超人：正义黎明","posterUrl":"http://img31.mtime.cn/mt/2016/03/14/201837.61652663_1280X720X2.jpg","nameEn":"Batman v Superman: Dawn of Justice","rating":"7.4","releaseArea":"中国","wantCount":"1.1万","isTicket":true,"isPresell":false,"directorId":904479,"director":"扎克·施奈德","directorId2":0,"director2":"","actor1Id":900976,"actor1":"本·阿弗莱克","actor2Id":900976,"actor2":"亨利·卡维尔","releaseDate":"2016.3.25"},{"id":229813,"name":"火锅英雄","posterUrl":"http://img31.mtime.cn/mt/2016/03/17/095046.92546354_1280X720X2.jpg","nameEn":"Chongqing Hot Pot","rating":"6.5","releaseArea":"中国","wantCount":"2817","isTicket":true,"isPresell":false,"directorId":1654943,"director":"杨庆","directorId2":0,"director2":"","actor1Id":923642,"actor1":"陈坤","actor2Id":923642,"actor2":"白百何","releaseDate":"2016.4.1"},{"id":205222,"name":"疯狂动物城","posterUrl":"http://img31.mtime.cn/mt/2016/01/28/092552.17985926_1280X720X2.jpg","nameEn":"Zootopia","rating":"8.7","releaseArea":"中国","wantCount":"1.4万","isTicket":true,"isPresell":false,"directorId":1543670,"director":"拜恩·霍华德","directorId2":2079599,"director2":"杰拉德·布什","actor1Id":913635,"actor1":"金妮弗·古德温","actor2Id":913635,"actor2":"杰森·贝特曼","releaseDate":"2016.3.4"},{"id":216573,"name":"我的特工爷爷","posterUrl":"http://img31.mtime.cn/mt/2016/03/18/115923.98692411_1280X720X2.jpg","nameEn":"The Bodyguard","rating":"5.5","releaseArea":"中国","wantCount":"2755","isTicket":true,"isPresell":false,"directorId":892825,"director":"洪金宝","directorId2":0,"director2":"","actor1Id":892825,"actor1":"洪金宝","actor2Id":892825,"actor2":"刘德华","releaseDate":"2016.4.1"},{"id":209122,"name":"美国队长3","posterUrl":"http://img31.mtime.cn/mt/2016/04/08/170930.97388737_1280X720X2.jpg","nameEn":"Captain America: Civil War","rating":"-1.0","releaseArea":"中国","wantCount":"3659","isTicket":false,"isPresell":false,"directorId":903229,"director":"安东尼·罗素","directorId2":903230,"director2":"乔·罗素","actor1Id":911885,"actor1":"克里斯·埃文斯","actor2Id":911885,"actor2":"小罗伯特·唐尼","releaseDate":"2016.5.6"},{"id":224689,"name":"垫底辣妹","posterUrl":"http://img31.mtime.cn/mt/2016/03/31/001142.64728084_1280X720X2.jpg","nameEn":"Flying Colors","rating":"7.6","releaseArea":"中国","wantCount":"555","isTicket":true,"isPresell":true,"directorId":1123712,"director":"土井裕泰","directorId2":0,"director2":"","actor1Id":1834685,"actor1":"有村架纯","actor2Id":1834685,"actor2":"伊藤淳史","releaseDate":"2016.4.14"},{"id":209597,"name":"废柴特工","posterUrl":"http://img31.mtime.cn/mt/2016/04/01/164732.59310030_1280X720X2.jpg","nameEn":"American Ultra","rating":"6.5","releaseArea":"中国","wantCount":"1141","isTicket":true,"isPresell":true,"directorId":1771251,"director":"尼玛·诺里扎德","directorId2":0,"director2":"","actor1Id":914798,"actor1":"杰西·艾森伯格","actor2Id":914798,"actor2":"克里斯汀·斯图尔特","releaseDate":"2016.4.15"},{"id":209007,"name":"美人鱼","posterUrl":"http://img31.mtime.cn/mt/2016/02/04/165933.21865133_1280X720X2.jpg","nameEn":"The Mermaid","rating":"7.5","releaseArea":"中国","wantCount":"1.7万","isTicket":false,"isPresell":false,"directorId":893017,"director":"周星驰","directorId2":0,"director2":"","actor1Id":1256584,"actor1":"邓超","actor2Id":1256584,"actor2":"罗志祥","releaseDate":"2016.2.8"},{"id":189531,"name":"猎神：冬日之战","posterUrl":"http://img31.mtime.cn/mt/2016/03/23/101418.42520265_1280X720X2.jpg","nameEn":"The Huntsman: Winter's War","rating":"-1.0","releaseArea":"中国","wantCount":"985","isTicket":false,"isPresell":false,"directorId":1422020,"director":"塞德里克·萨科","directorId2":0,"director2":"","actor1Id":1425372,"actor1":"克里斯·海姆斯沃斯","actor2Id":1425372,"actor2":"艾米莉·布朗特","releaseDate":"2016.4.22"},{"id":89952,"name":"魔兽","posterUrl":"http://img31.mtime.cn/mt/2016/04/01/091052.69736286_1280X720X2.jpg","nameEn":"Warcraft","rating":"-1.0","releaseArea":"美国","wantCount":"3937","isTicket":false,"isPresell":false,"directorId":1522091,"director":"邓肯·琼斯","directorId2":0,"director2":"","actor1Id":1434373,"actor1":"崔维斯·费米尔","actor2Id":1434373,"actor2":"托比·凯贝尔","releaseDate":"2016.6.10"},{"id":219131,"name":"纽约纽约","posterUrl":"http://img31.mtime.cn/mt/2016/03/17/160007.97969060_1280X720X2.jpg","nameEn":"New York New York","rating":"-1.0","releaseArea":"中国","wantCount":"855","isTicket":true,"isPresell":true,"directorId":1546992,"director":"罗冬","directorId2":0,"director2":"","actor1Id":1255044,"actor1":"阮经天","actor2Id":1255044,"actor2":"杜鹃","releaseDate":"2016.4.15"},{"id":225720,"name":"冰河追凶","posterUrl":"http://img31.mtime.cn/mt/2016/03/18/091618.24526976_1280X720X2.jpg","nameEn":"Lost In White","rating":"-1.0","releaseArea":"中国","wantCount":"341","isTicket":true,"isPresell":true,"directorId":1252348,"director":"徐伟","directorId2":0,"director2":"","actor1Id":893545,"actor1":"梁家辉","actor2Id":893545,"actor2":"佟大为","releaseDate":"2016.4.15"},{"id":209180,"name":"西游记之孙悟空三打白骨精","posterUrl":"http://img31.mtime.cn/mt/2016/02/02/094409.88742673_1280X720X2.jpg","nameEn":"The Monkey King 2","rating":"6.5","releaseArea":"中国","wantCount":"7676","isTicket":false,"isPresell":false,"directorId":1190864,"director":"郑保瑞","directorId2":0,"director2":"","actor1Id":928694,"actor1":"郭富城","actor2Id":928694,"actor2":"巩俐","releaseDate":"2016.2.8"},{"id":225158,"name":"睡在我上铺的兄弟","posterUrl":"http://img31.mtime.cn/mt/2016/03/17/173331.19323605_1280X720X2.jpg","nameEn":"Who Sleeps My Bro","rating":"5.6","releaseArea":"中国","wantCount":"1375","isTicket":true,"isPresell":false,"directorId":1299407,"director":"张琦","directorId2":0,"director2":"","actor1Id":1824419,"actor1":"陈晓","actor2Id":1824419,"actor2":"秦岚","releaseDate":"2016.4.1"},{"id":156682,"name":"荒野猎人","posterUrl":"http://img31.mtime.cn/mt/2016/03/03/222241.58917235_1280X720X2.jpg","nameEn":"The Revenant","rating":"8.0","releaseArea":"中国","wantCount":"6745","isTicket":false,"isPresell":false,"directorId":1248624,"director":"亚利桑德罗·冈萨雷斯·伊纳里图","directorId2":0,"director2":"","actor1Id":924319,"actor1":"莱昂纳多·迪卡普里奥","actor2Id":924319,"actor2":"汤姆·哈迪","releaseDate":"2016.3.18"},{"id":229122,"name":"灵偶契约","posterUrl":"http://img31.mtime.cn/mt/2016/03/30/111813.75613052_1280X720X2.jpg","nameEn":"The Boy","rating":"6.5","releaseArea":"中国","wantCount":"495","isTicket":true,"isPresell":false,"directorId":1201649,"director":"威廉·布伦特·贝尔","directorId2":0,"director2":"","actor1Id":1181445,"actor1":"劳伦·科汉","actor2Id":1181445,"actor2":"鲁珀特·伊文斯","releaseDate":"2016.4.1"},{"id":220890,"name":"北京遇上西雅图之不二情书","posterUrl":"http://img31.mtime.cn/mt/2016/04/06/095043.16001045_1280X720X2.jpg","nameEn":"Book Of Love","rating":"-1.0","releaseArea":"中国","wantCount":"3732","isTicket":false,"isPresell":false,"directorId":893136,"director":"薛晓路","directorId2":0,"director2":"","actor1Id":1248918,"actor1":"汤唯","actor2Id":1248918,"actor2":"吴秀波","releaseDate":"2016.4.29"},{"id":210271,"name":"我的新野蛮女友","posterUrl":"http://img31.mtime.cn/mt/2016/03/16/092953.63679225_1280X720X2.jpg","nameEn":"My New Sassy Girl","rating":"-1.0","releaseArea":"中国","wantCount":"1676","isTicket":false,"isPresell":false,"directorId":903616,"director":"赵根植","directorId2":0,"director2":"","actor1Id":929164,"actor1":"车太贤","actor2Id":929164,"actor2":"宋茜","releaseDate":"2016.4.22"}]
     */

    private int count;
    /**
     * id : 211903
     * name : 伦敦陷落
     * posterUrl : http://img31.mtime.cn/mt/2016/03/18/144725.14339749_1280X720X2.jpg
     * nameEn : London Has Fallen
     * rating : 6.7
     * releaseArea : 中国
     * wantCount : 1838
     * isTicket : true
     * isPresell : false
     * directorId : 1726823
     * director : 巴巴克·纳加非
     * directorId2 : 0
     * director2 :
     * actor1Id : 928291
     * actor1 : 杰拉德·巴特勒
     * actor2Id : 928291
     * actor2 : 艾伦·艾克哈特
     * releaseDate : 2016.4.8
     */

    private List<ListEntity> list;

    @Override
    public String toString() {
        return "MTimeHotBean{" +
                "count=" + count +
                ", list=" + list +
                '}';
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setList(List<ListEntity> list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public List<ListEntity> getList() {
        return list;
    }

    public static class ListEntity {
        private int id;
        private String name;
        private String posterUrl;
        private String nameEn;
        private String rating;
        private String releaseArea;
        private String wantCount;
        private boolean isTicket;
        private boolean isPresell;
        private int directorId;
        private String director;
        private int directorId2;
        private String director2;
        private int actor1Id;
        private String actor1;
        private int actor2Id;
        private String actor2;
        private String releaseDate;

        @Override
        public String toString() {
            return "ListEntity{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", posterUrl='" + posterUrl + '\'' +
                    ", nameEn='" + nameEn + '\'' +
                    ", rating='" + rating + '\'' +
                    ", releaseArea='" + releaseArea + '\'' +
                    ", wantCount='" + wantCount + '\'' +
                    ", isTicket=" + isTicket +
                    ", isPresell=" + isPresell +
                    ", directorId=" + directorId +
                    ", director='" + director + '\'' +
                    ", directorId2=" + directorId2 +
                    ", director2='" + director2 + '\'' +
                    ", actor1Id=" + actor1Id +
                    ", actor1='" + actor1 + '\'' +
                    ", actor2Id=" + actor2Id +
                    ", actor2='" + actor2 + '\'' +
                    ", releaseDate='" + releaseDate + '\'' +
                    '}';
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPosterUrl(String posterUrl) {
            this.posterUrl = posterUrl;
        }

        public void setNameEn(String nameEn) {
            this.nameEn = nameEn;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public void setReleaseArea(String releaseArea) {
            this.releaseArea = releaseArea;
        }

        public void setWantCount(String wantCount) {
            this.wantCount = wantCount;
        }

        public void setIsTicket(boolean isTicket) {
            this.isTicket = isTicket;
        }

        public void setIsPresell(boolean isPresell) {
            this.isPresell = isPresell;
        }

        public void setDirectorId(int directorId) {
            this.directorId = directorId;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public void setDirectorId2(int directorId2) {
            this.directorId2 = directorId2;
        }

        public void setDirector2(String director2) {
            this.director2 = director2;
        }

        public void setActor1Id(int actor1Id) {
            this.actor1Id = actor1Id;
        }

        public void setActor1(String actor1) {
            this.actor1 = actor1;
        }

        public void setActor2Id(int actor2Id) {
            this.actor2Id = actor2Id;
        }

        public void setActor2(String actor2) {
            this.actor2 = actor2;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPosterUrl() {
            return posterUrl;
        }

        public String getNameEn() {
            return nameEn;
        }

        public String getRating() {
            return rating;
        }

        public String getReleaseArea() {
            return releaseArea;
        }

        public String getWantCount() {
            return wantCount;
        }

        public boolean isIsTicket() {
            return isTicket;
        }

        public boolean isIsPresell() {
            return isPresell;
        }

        public int getDirectorId() {
            return directorId;
        }

        public String getDirector() {
            return director;
        }

        public int getDirectorId2() {
            return directorId2;
        }

        public String getDirector2() {
            return director2;
        }

        public int getActor1Id() {
            return actor1Id;
        }

        public String getActor1() {
            return actor1;
        }

        public int getActor2Id() {
            return actor2Id;
        }

        public String getActor2() {
            return actor2;
        }

        public String getReleaseDate() {
            return releaseDate;
        }
    }
}
