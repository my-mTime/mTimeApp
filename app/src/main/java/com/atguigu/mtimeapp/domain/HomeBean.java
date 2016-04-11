package com.atguigu.mtimeapp.domain;

import java.util.List;

/**
 * Created by 笨货 on 2016/4/10.
 * 首页的数据对象，不包括时光精选列表和推荐电影
 */
public class HomeBean {

    /**
     * gotoPage : {"gotoType":"gotourl","isGoH5":false,"parameters":{},"parameters1":{},"relatedTypeUrl":"","url":"http://feature.mtime.cn/mobile/movie/2016/zgyh/index.html"}
     * img : http://img31.mtime.cn/mg/2016/04/08/084113.91173524.jpg
     * img2 : http://img31.mtime.cn/mg/2016/04/08/084115.71620293.jpg
     * url : http://feature.mtime.cn/mobile/movie/2016/zgyh/index.html
     */

    private List<AdvListEntity> advList;

    private AreaSecondEntity areaSecond;
    /**
     * movie : {}
     * newsId : 0
     * title :
     * topCover : http://img31.mtime.cn/mg/2016/03/20/112629.61804111.jpg
     */

    private HotMovieEntity hotMovie;
    private HotPersonEntity hotPerson;
    /**
     * commentCount : 36
     * desc : 杰拉德巴特勒不认老 最爱周星驰电影
     * id : 1554113
     * img : http://img31.mtime.cn/mg/2016/04/09/093329.66771815.jpg
     * img2 :
     * img3 :
     * publishTime : 1460191496
     * tag :
     * title : 专访《伦敦陷落》五大主创
     * type : 0
     */

    private List<HotPointsEntity> hotPoints;
    /**
     * gotoPage : {"gotoType":"gotonews","isGoH5":false,"parameters":{"newId":1554256},"parameters1":{},"relatedTypeUrl":"","url":"http://m.mtime.cn/#!/news/movie/1554256/"}
     * img : http://img31.mtime.cn/mg/2016/04/10/134544.90383080.jpg
     * keyColor : #888888
     * url : http://m.mtime.cn/#!/news/movie/1554256/
     */

    private List<TopPostersEntity> topPosters;


    public AreaSecondEntity getAreaSecond() {
        return areaSecond;
    }

    public void setAreaSecond(AreaSecondEntity areaSecond) {
        this.areaSecond = areaSecond;
    }

    public void setHotMovie(HotMovieEntity hotMovie) {
        this.hotMovie = hotMovie;
    }

    public void setHotPerson(HotPersonEntity hotPerson) {
        this.hotPerson = hotPerson;
    }

    public HotMovieEntity getHotMovie() {
        return hotMovie;
    }

    public HotPersonEntity getHotPerson() {
        return hotPerson;
    }

    public void setHotPoints(List<HotPointsEntity> hotPoints) {
        this.hotPoints = hotPoints;
    }

    public List<HotPointsEntity> getHotPoints() {
        return hotPoints;
    }

    public void setTopPosters(List<TopPostersEntity> topPosters) {
        this.topPosters = topPosters;
    }

    public List<TopPostersEntity> getTopPosters() {
        return topPosters;
    }

    public static class AreaSecondEntity{

        /**
         * goodsId : 0
         * gotoPage : {"gotoType":"gotogoodsinfo","isGoH5":false,"parameters":{"goodsId":102310},"parameters1":{},"relatedTypeUrl":"","url":"http://mall.wv.mtime.cn/?utm_source=app_home_5#!/commerce/item/102310/"}
         * id : 18159583
         * image : http://img31.mtime.cn/mg/2016/04/05/104123.99029004.jpg
         * image2 : http://img31.mtime.cn/mg/2016/04/05/104127.56790228.jpg
         * title : 原创设计
         * titleColor : #9950D8
         * titleSmall : 超人钢铁之躯运动套装
         */

        private SubFifthEntity subThird;

        public SubFifthEntity getSubThird() {
            return subThird;
        }

        public void setSubThird(SubFifthEntity subThird) {
            this.subThird = subThird;
        }

        public static class SubThirdEntity {

            /**
             * goodsId : 0
             */

            private int goodsId;
            /**
             * gotoType : gotogoodslist
             * isGoH5 : false
             * parameters : {"keyword":0}
             * parameters1 : {}
             * relatedTypeUrl :
             * url : http://mall.wv.mtime.cn/?utm_source=app_home_5&q=%E9%B2%A8%E9%B1%BC&utm_source=app_home_3#!/commerce/list/
             */

            private GotoPageEntity gotoPage;
            /**
             * id : 17304116
             * image : http://img31.mtime.cn/mg/2016/04/05/104506.23867951.jpg
             * image2 : http://img31.mtime.cn/mg/2016/04/05/104509.65118566.jpg
             * title : 时尚配饰
             * titleColor : #e45e5e
             */

            private int id;
            private String image;
            private String image2;
            private String title;
            private String titleColor;
            /**
             * titleSmall : 超人系列蓝色石英表
             */

            private String titleSmall;


            public void setGoodsId(int goodsId) {
                this.goodsId = goodsId;
            }

            public int getGoodsId() {
                return goodsId;
            }

            public void setGotoPage(GotoPageEntity gotoPage) {
                this.gotoPage = gotoPage;
            }

            public GotoPageEntity getGotoPage() {
                return gotoPage;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setImage2(String image2) {
                this.image2 = image2;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setTitleColor(String titleColor) {
                this.titleColor = titleColor;
            }

            public int getId() {
                return id;
            }

            public String getImage() {
                return image;
            }

            public String getImage2() {
                return image2;
            }

            public String getTitle() {
                return title;
            }

            public String getTitleColor() {
                return titleColor;
            }

            public void setTitleSmall(String titleSmall) {
                this.titleSmall = titleSmall;
            }

            public String getTitleSmall() {
                return titleSmall;
            }

            public static class GotoPageEntity {
                private String gotoType;
                private boolean isGoH5;
                /**
                 * keyword : 0
                 */

                private ParametersEntity parameters;
                private Parameters1Entity parameters1;
                private String relatedTypeUrl;
                private String url;

                public void setGotoType(String gotoType) {
                    this.gotoType = gotoType;
                }

                public void setIsGoH5(boolean isGoH5) {
                    this.isGoH5 = isGoH5;
                }

                public void setParameters(ParametersEntity parameters) {
                    this.parameters = parameters;
                }

                public void setParameters1(Parameters1Entity parameters1) {
                    this.parameters1 = parameters1;
                }

                public void setRelatedTypeUrl(String relatedTypeUrl) {
                    this.relatedTypeUrl = relatedTypeUrl;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getGotoType() {
                    return gotoType;
                }

                public boolean isIsGoH5() {
                    return isGoH5;
                }

                public ParametersEntity getParameters() {
                    return parameters;
                }

                public Parameters1Entity getParameters1() {
                    return parameters1;
                }

                public String getRelatedTypeUrl() {
                    return relatedTypeUrl;
                }

                public String getUrl() {
                    return url;
                }

                public static class ParametersEntity {
                    private int keyword;

                    public void setKeyword(int keyword) {
                        this.keyword = keyword;
                    }

                    public int getKeyword() {
                        return keyword;
                    }
                }

                public static class Parameters1Entity {
                }
            }
        }



        private SubFifthEntity subFifth;
        /**
         * goodsId : 100905
         * gotoPage : {"gotoType":"gotogoodsinfo","isGoH5":false,"parameters":{"goodsId":100905},"parameters1":{},"relatedTypeUrl":"","url":"http://mall.wv.mtime.cn/?utm_source=app_home_1#!/commerce/item/100905/"}
         * id : 17728960
         * image : http://img31.mtime.cn/mg/2016/04/10/115601.29116781.jpg
         * image2 : http://img31.mtime.cn/mg/2016/04/10/115612.10817861.jpg
         * title : 限时闪购
         * titleColor : #e75959
         * titleSmall : 反浩克i6手机壳
         */

        private SubFirstEntity subFirst;
        /**
         * goodsId : 0
         * gotoPage : {"gotoType":"gotourl","isGoH5":false,"parameters":{},"parameters1":{},"relatedTypeUrl":"","url":"http://feature.mtime.cn/mobile/item/2015/preironman/"}
         * image : http://img31.mtime.cn/mg/2016/03/18/105503.44806826.jpg
         * image2 : http://img31.mtime.cn/mg/2016/03/18/105503.44806826.jpg
         */

        private SubFourthEntity subFourth;
        /**
         * goodsId : 102198
         * gotoPage : {"gotoType":"gotogoodsinfo","isGoH5":false,"parameters":{"goodsId":102198},"parameters1":{},"relatedTypeUrl":"","url":"http://mall.wv.mtime.cn/?utm_source=app_home_2#!/commerce/item/102198/"}
         * id : 17304115
         * image : http://img31.mtime.cn/mg/2016/04/05/104443.69314769.jpg
         * image2 : http://img31.mtime.cn/mg/2016/04/05/104446.85497934.jpg
         * title : 时尚配饰
         * titleColor : #2b88ca
         * titleSmall : 正义联盟系列饰品
         */

        private SubSecondEntity subSecond;

        public void setSubFifth(SubFifthEntity subFifth) {
            this.subFifth = subFifth;
        }

        public SubFifthEntity getSubFifth() {
            return subFifth;
        }

        public void setSubFirst(SubFirstEntity subFirst) {
            this.subFirst = subFirst;
        }

        public SubFirstEntity getSubFirst() {
            return subFirst;
        }

        public void setSubFourth(SubFourthEntity subFourth) {
            this.subFourth = subFourth;
        }

        public SubFourthEntity getSubFourth() {
            return subFourth;
        }

        public void setSubSecond(SubSecondEntity subSecond) {
            this.subSecond = subSecond;
        }

        public SubSecondEntity getSubSecond() {
            return subSecond;
        }

        public static class SubFifthEntity {
            private int goodsId;
            /**
             * gotoType : gotogoodsinfo
             * isGoH5 : false
             * parameters : {"goodsId":102310}
             * parameters1 : {}
             * relatedTypeUrl :
             * url : http://mall.wv.mtime.cn/?utm_source=app_home_5#!/commerce/item/102310/
             */

            private GotoPageEntity gotoPage;
            private int id;
            private String image;
            private String image2;
            private String title;
            private String titleColor;
            private String titleSmall;

            public void setGoodsId(int goodsId) {
                this.goodsId = goodsId;
            }

            public void setGotoPage(GotoPageEntity gotoPage) {
                this.gotoPage = gotoPage;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setImage2(String image2) {
                this.image2 = image2;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setTitleColor(String titleColor) {
                this.titleColor = titleColor;
            }

            public void setTitleSmall(String titleSmall) {
                this.titleSmall = titleSmall;
            }

            public int getGoodsId() {
                return goodsId;
            }

            public GotoPageEntity getGotoPage() {
                return gotoPage;
            }

            public int getId() {
                return id;
            }

            public String getImage() {
                return image;
            }

            public String getImage2() {
                return image2;
            }

            public String getTitle() {
                return title;
            }

            public String getTitleColor() {
                return titleColor;
            }

            public String getTitleSmall() {
                return titleSmall;
            }

            public static class GotoPageEntity {
                private String gotoType;
                private boolean isGoH5;
                /**
                 * goodsId : 102310
                 */

                private ParametersEntity parameters;
                private Parameters1Entity parameters1;
                private String relatedTypeUrl;
                private String url;

                public void setGotoType(String gotoType) {
                    this.gotoType = gotoType;
                }

                public void setIsGoH5(boolean isGoH5) {
                    this.isGoH5 = isGoH5;
                }

                public void setParameters(ParametersEntity parameters) {
                    this.parameters = parameters;
                }

                public void setParameters1(Parameters1Entity parameters1) {
                    this.parameters1 = parameters1;
                }

                public void setRelatedTypeUrl(String relatedTypeUrl) {
                    this.relatedTypeUrl = relatedTypeUrl;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getGotoType() {
                    return gotoType;
                }

                public boolean isIsGoH5() {
                    return isGoH5;
                }

                public ParametersEntity getParameters() {
                    return parameters;
                }

                public Parameters1Entity getParameters1() {
                    return parameters1;
                }

                public String getRelatedTypeUrl() {
                    return relatedTypeUrl;
                }

                public String getUrl() {
                    return url;
                }

                public static class ParametersEntity {
                    private int goodsId;

                    public void setGoodsId(int goodsId) {
                        this.goodsId = goodsId;
                    }

                    public int getGoodsId() {
                        return goodsId;
                    }
                }

                public static class Parameters1Entity {
                }
            }
        }

        public static class SubFirstEntity {
            private int goodsId;
            /**
             * gotoType : gotogoodsinfo
             * isGoH5 : false
             * parameters : {"goodsId":100905}
             * parameters1 : {}
             * relatedTypeUrl :
             * url : http://mall.wv.mtime.cn/?utm_source=app_home_1#!/commerce/item/100905/
             */

            private GotoPageEntity gotoPage;
            private int id;
            private String image;
            private String image2;
            private String title;
            private String titleColor;
            private String titleSmall;

            public void setGoodsId(int goodsId) {
                this.goodsId = goodsId;
            }

            public void setGotoPage(GotoPageEntity gotoPage) {
                this.gotoPage = gotoPage;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setImage2(String image2) {
                this.image2 = image2;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setTitleColor(String titleColor) {
                this.titleColor = titleColor;
            }

            public void setTitleSmall(String titleSmall) {
                this.titleSmall = titleSmall;
            }

            public int getGoodsId() {
                return goodsId;
            }

            public GotoPageEntity getGotoPage() {
                return gotoPage;
            }

            public int getId() {
                return id;
            }

            public String getImage() {
                return image;
            }

            public String getImage2() {
                return image2;
            }

            public String getTitle() {
                return title;
            }

            public String getTitleColor() {
                return titleColor;
            }

            public String getTitleSmall() {
                return titleSmall;
            }

            public static class GotoPageEntity {
                private String gotoType;
                private boolean isGoH5;
                /**
                 * goodsId : 100905
                 */

                private ParametersEntity parameters;
                private Parameters1Entity parameters1;
                private String relatedTypeUrl;
                private String url;

                public void setGotoType(String gotoType) {
                    this.gotoType = gotoType;
                }

                public void setIsGoH5(boolean isGoH5) {
                    this.isGoH5 = isGoH5;
                }

                public void setParameters(ParametersEntity parameters) {
                    this.parameters = parameters;
                }

                public void setParameters1(Parameters1Entity parameters1) {
                    this.parameters1 = parameters1;
                }

                public void setRelatedTypeUrl(String relatedTypeUrl) {
                    this.relatedTypeUrl = relatedTypeUrl;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getGotoType() {
                    return gotoType;
                }

                public boolean isIsGoH5() {
                    return isGoH5;
                }

                public ParametersEntity getParameters() {
                    return parameters;
                }

                public Parameters1Entity getParameters1() {
                    return parameters1;
                }

                public String getRelatedTypeUrl() {
                    return relatedTypeUrl;
                }

                public String getUrl() {
                    return url;
                }

                public static class ParametersEntity {
                    private int goodsId;

                    public void setGoodsId(int goodsId) {
                        this.goodsId = goodsId;
                    }

                    public int getGoodsId() {
                        return goodsId;
                    }
                }

                public static class Parameters1Entity {
                }
            }
        }

        public static class SubFourthEntity {
            private int goodsId;
            /**
             * gotoType : gotourl
             * isGoH5 : false
             * parameters : {}
             * parameters1 : {}
             * relatedTypeUrl :
             * url : http://feature.mtime.cn/mobile/item/2015/preironman/
             */

            private GotoPageEntity gotoPage;
            private String image;
            private String image2;

            public void setGoodsId(int goodsId) {
                this.goodsId = goodsId;
            }

            public void setGotoPage(GotoPageEntity gotoPage) {
                this.gotoPage = gotoPage;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setImage2(String image2) {
                this.image2 = image2;
            }

            public int getGoodsId() {
                return goodsId;
            }

            public GotoPageEntity getGotoPage() {
                return gotoPage;
            }

            public String getImage() {
                return image;
            }

            public String getImage2() {
                return image2;
            }

            public static class GotoPageEntity {
                private String gotoType;
                private boolean isGoH5;
                private ParametersEntity parameters;
                private Parameters1Entity parameters1;
                private String relatedTypeUrl;
                private String url;

                public void setGotoType(String gotoType) {
                    this.gotoType = gotoType;
                }

                public void setIsGoH5(boolean isGoH5) {
                    this.isGoH5 = isGoH5;
                }

                public void setParameters(ParametersEntity parameters) {
                    this.parameters = parameters;
                }

                public void setParameters1(Parameters1Entity parameters1) {
                    this.parameters1 = parameters1;
                }

                public void setRelatedTypeUrl(String relatedTypeUrl) {
                    this.relatedTypeUrl = relatedTypeUrl;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getGotoType() {
                    return gotoType;
                }

                public boolean isIsGoH5() {
                    return isGoH5;
                }

                public ParametersEntity getParameters() {
                    return parameters;
                }

                public Parameters1Entity getParameters1() {
                    return parameters1;
                }

                public String getRelatedTypeUrl() {
                    return relatedTypeUrl;
                }

                public String getUrl() {
                    return url;
                }

                public static class ParametersEntity {
                }

                public static class Parameters1Entity {
                }
            }
        }

        public static class SubSecondEntity {
            private int goodsId;
            /**
             * gotoType : gotogoodsinfo
             * isGoH5 : false
             * parameters : {"goodsId":102198}
             * parameters1 : {}
             * relatedTypeUrl :
             * url : http://mall.wv.mtime.cn/?utm_source=app_home_2#!/commerce/item/102198/
             */

            private GotoPageEntity gotoPage;
            private int id;
            private String image;
            private String image2;
            private String title;
            private String titleColor;
            private String titleSmall;

            public void setGoodsId(int goodsId) {
                this.goodsId = goodsId;
            }

            public void setGotoPage(GotoPageEntity gotoPage) {
                this.gotoPage = gotoPage;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setImage2(String image2) {
                this.image2 = image2;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setTitleColor(String titleColor) {
                this.titleColor = titleColor;
            }

            public void setTitleSmall(String titleSmall) {
                this.titleSmall = titleSmall;
            }

            public int getGoodsId() {
                return goodsId;
            }

            public GotoPageEntity getGotoPage() {
                return gotoPage;
            }

            public int getId() {
                return id;
            }

            public String getImage() {
                return image;
            }

            public String getImage2() {
                return image2;
            }

            public String getTitle() {
                return title;
            }

            public String getTitleColor() {
                return titleColor;
            }

            public String getTitleSmall() {
                return titleSmall;
            }

            public static class GotoPageEntity {
                private String gotoType;
                private boolean isGoH5;
                /**
                 * goodsId : 102198
                 */

                private ParametersEntity parameters;
                private Parameters1Entity parameters1;
                private String relatedTypeUrl;
                private String url;

                public void setGotoType(String gotoType) {
                    this.gotoType = gotoType;
                }

                public void setIsGoH5(boolean isGoH5) {
                    this.isGoH5 = isGoH5;
                }

                public void setParameters(ParametersEntity parameters) {
                    this.parameters = parameters;
                }

                public void setParameters1(Parameters1Entity parameters1) {
                    this.parameters1 = parameters1;
                }

                public void setRelatedTypeUrl(String relatedTypeUrl) {
                    this.relatedTypeUrl = relatedTypeUrl;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getGotoType() {
                    return gotoType;
                }

                public boolean isIsGoH5() {
                    return isGoH5;
                }

                public ParametersEntity getParameters() {
                    return parameters;
                }

                public Parameters1Entity getParameters1() {
                    return parameters1;
                }

                public String getRelatedTypeUrl() {
                    return relatedTypeUrl;
                }

                public String getUrl() {
                    return url;
                }

                public static class ParametersEntity {
                    private int goodsId;

                    public void setGoodsId(int goodsId) {
                        this.goodsId = goodsId;
                    }

                    public int getGoodsId() {
                        return goodsId;
                    }
                }

                public static class Parameters1Entity {
                }
            }
        }
    }

    public void setAdvList(List<AdvListEntity> advList) {
        this.advList = advList;
    }

    public List<AdvListEntity> getAdvList() {
        return advList;
    }

    public static class AdvListEntity {
        /**
         * gotoType : gotourl
         * isGoH5 : false
         * parameters : {}
         * parameters1 : {}
         * relatedTypeUrl :
         * url : http://feature.mtime.cn/mobile/movie/2016/zgyh/index.html
         */

        private GotoPageEntity gotoPage;
        private String img;
        private String img2;
        private String url;

        public void setGotoPage(GotoPageEntity gotoPage) {
            this.gotoPage = gotoPage;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public void setImg2(String img2) {
            this.img2 = img2;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public GotoPageEntity getGotoPage() {
            return gotoPage;
        }

        public String getImg() {
            return img;
        }

        public String getImg2() {
            return img2;
        }

        public String getUrl() {
            return url;
        }

        public static class GotoPageEntity {
            private String gotoType;
            private boolean isGoH5;
            private ParametersEntity parameters;
            private Parameters1Entity parameters1;
            private String relatedTypeUrl;
            private String url;

            public void setGotoType(String gotoType) {
                this.gotoType = gotoType;
            }

            public void setIsGoH5(boolean isGoH5) {
                this.isGoH5 = isGoH5;
            }

            public void setParameters(ParametersEntity parameters) {
                this.parameters = parameters;
            }

            public void setParameters1(Parameters1Entity parameters1) {
                this.parameters1 = parameters1;
            }

            public void setRelatedTypeUrl(String relatedTypeUrl) {
                this.relatedTypeUrl = relatedTypeUrl;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getGotoType() {
                return gotoType;
            }

            public boolean isIsGoH5() {
                return isGoH5;
            }

            public ParametersEntity getParameters() {
                return parameters;
            }

            public Parameters1Entity getParameters1() {
                return parameters1;
            }

            public String getRelatedTypeUrl() {
                return relatedTypeUrl;
            }

            public String getUrl() {
                return url;
            }

            public static class ParametersEntity {
                private long goodsId;

                public long getGoodsId() {
                    return goodsId;
                }

                public void setGoodsId(long goodsId) {
                    this.goodsId = goodsId;
                }
            }

            public static class Parameters1Entity {
            }
        }
    }


    public static class HotMovieEntity {
        private MovieEntity movie;
        private int newsId;
        private String title;
        private String topCover;

        public void setMovie(MovieEntity movie) {
            this.movie = movie;
        }

        public void setNewsId(int newsId) {
            this.newsId = newsId;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setTopCover(String topCover) {
            this.topCover = topCover;
        }

        public MovieEntity getMovie() {
            return movie;
        }

        public int getNewsId() {
            return newsId;
        }

        public String getTitle() {
            return title;
        }

        public String getTopCover() {
            return topCover;
        }

        public static class MovieEntity {
        }
    }

    public static class HotPersonEntity {
    }

    public static class HotPointsEntity {
        private int commentCount;
        private String desc;
        private int id;
        private String img;
        private String img2;
        private String img3;
        private int publishTime;
        private String tag;
        private String title;
        private int type;

        public void setCommentCount(int commentCount) {
            this.commentCount = commentCount;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public void setImg2(String img2) {
            this.img2 = img2;
        }

        public void setImg3(String img3) {
            this.img3 = img3;
        }

        public void setPublishTime(int publishTime) {
            this.publishTime = publishTime;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getCommentCount() {
            return commentCount;
        }

        public String getDesc() {
            return desc;
        }

        public int getId() {
            return id;
        }

        public String getImg() {
            return img;
        }

        public String getImg2() {
            return img2;
        }

        public String getImg3() {
            return img3;
        }

        public int getPublishTime() {
            return publishTime;
        }

        public String getTag() {
            return tag;
        }

        public String getTitle() {
            return title;
        }

        public int getType() {
            return type;
        }
    }

    public static class TopPostersEntity {
        /**
         * gotoType : gotonews
         * isGoH5 : false
         * parameters : {"newId":1554256}
         * parameters1 : {}
         * relatedTypeUrl :
         * url : http://m.mtime.cn/#!/news/movie/1554256/
         */

        private GotoPageEntity gotoPage;
        private String img;
        private String keyColor;
        private String url;

        public void setGotoPage(GotoPageEntity gotoPage) {
            this.gotoPage = gotoPage;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public void setKeyColor(String keyColor) {
            this.keyColor = keyColor;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public GotoPageEntity getGotoPage() {
            return gotoPage;
        }

        public String getImg() {
            return img;
        }

        public String getKeyColor() {
            return keyColor;
        }

        public String getUrl() {
            return url;
        }

        public static class GotoPageEntity {
            private String gotoType;
            private boolean isGoH5;
            /**
             * newId : 1554256
             */

            private ParametersEntity parameters;
            private Parameters1Entity parameters1;
            private String relatedTypeUrl;
            private String url;

            public void setGotoType(String gotoType) {
                this.gotoType = gotoType;
            }

            public void setIsGoH5(boolean isGoH5) {
                this.isGoH5 = isGoH5;
            }

            public void setParameters(ParametersEntity parameters) {
                this.parameters = parameters;
            }

            public void setParameters1(Parameters1Entity parameters1) {
                this.parameters1 = parameters1;
            }

            public void setRelatedTypeUrl(String relatedTypeUrl) {
                this.relatedTypeUrl = relatedTypeUrl;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getGotoType() {
                return gotoType;
            }

            public boolean isIsGoH5() {
                return isGoH5;
            }

            public ParametersEntity getParameters() {
                return parameters;
            }

            public Parameters1Entity getParameters1() {
                return parameters1;
            }

            public String getRelatedTypeUrl() {
                return relatedTypeUrl;
            }

            public String getUrl() {
                return url;
            }

            public static class ParametersEntity {
                private int newId;

                public void setNewId(int newId) {
                    this.newId = newId;
                }

                public int getNewId() {
                    return newId;
                }
            }

            public static class Parameters1Entity {
            }
        }
    }
}
