package com.atguigu.mtimeapp.domain;

import java.util.List;

/**
 * Created by 笨货 on 2016/4/11.
 * 商场的数据
 */
public class StoreBean {

    private AdvHeadImgEntity advHeadImg;
    /**
     * goodsId : 100905
     * img : http://img31.mtime.cn/mg/2016/04/10/115531.12166896.jpg
     * longTime : 1460433600
     * startTime : 1460253600
     * subTitle :
     * title :
     * titleColor :
     * url : http://mall.wv.mtime.cn/#!/commerce/item/100905/
     * warmup : 1
     */

    private CellAEntity cellA;
    /**
     * goodsId : 0
     * img : http://img31.mtime.cn/mg/2016/03/18/110520.87708263.jpg
     * longTime : 0
     * startTime : 0
     * subTitle :
     * title :
     * titleColor :
     * url : http://feature.mtime.cn/mobile/item/2015/preironman/
     * warmup : 0
     */

    private CellBEntity cellB;
    private CellCEntity cellC;
    /**
     * isNewAdd : false
     * msg :
     */

    private GoodsCouponEntity goodsCoupon;
    /**
     * iconTitle1 : 家居
     * iconTitle2 :
     * img1 : http://img31.mtime.cn/mg/2016/03/29/181648.75801373.jpg
     * img2 :
     * url : #!/commerce/list/?c1=43
     */

    private NavigatorFirthIconEntity navigatorFirthIcon;
    /**
     * colorValue : #FFB90F
     * goodsId : 0
     * image : http://img31.mtime.cn/mg/2016/04/08/202915.67616666.jpg
     * imageUrl : http://mall.wv.mtime.cn/#!/commerce/list/?q=FUNKO
     * moreUrl : http://mall.wv.mtime.cn/#!/commerce/list/?c1=25
     * name : 玩具模型
     * subList : [{"goodsId":102486,"image":"http://img31.mtime.cn/mg/2016/04/08/202936.71962757.jpg","title":"蝙超3件装","url":""},{"goodsId":100939,"image":"http://img31.mtime.cn/mg/2016/04/08/203007.52716356.jpg","title":"复联2摇头公仔","url":""},{"goodsId":102395,"image":"http://img31.mtime.cn/mg/2016/04/08/203106.46000558.jpg","title":"COSBABY死侍","url":""}]
     */

    private List<CategoryEntity> category;
    /**
     * iconTitle : 玩具
     * image : http://img31.mtime.cn/mg/2016/03/29/180821.36534746.jpg
     * url : #!/commerce/list/?c1=25
     */

    private List<NavigatorIconEntity> navigatorIcon;
    /**
     * image : http://img31.mtime.cn/mg/2016/04/08/200604.75326312.jpg
     * url : http://feature.mtime.com/mobile/item/2016/0408_mtime/
     */

    private List<ScrollImgEntity> scrollImg;
    /**
     * backgroupImage : http://img31.mtime.cn/mg/2016/01/29/163552.48354218.jpg
     * checkedImage : http://img31.mtime.cn/mg/2016/01/29/163425.87972160.jpg
     * goodsId : 0
     * subList : [{"goodsId":101778,"image":"http://img31.mtime.cn/goods/2015/12/09/153047.41310181_600X600X1.jpg","title":"功夫熊猫Q萌充电宝","url":""},{"goodsId":101779,"image":"http://img31.mtime.cn/goods/2015/12/09/162449.41318990_600X600X1.jpg","title":"功夫熊猫双宝环保袋","url":""},{"goodsId":101848,"image":"http://img31.mtime.cn/goods/2016/01/29/145133.60874505_600X600X1.jpg","title":"双宝练功i6手机壳","url":""},{"goodsId":101835,"image":"http://img31.mtime.cn/goods/2015/12/24/105839.33267889_600X600X1.jpg","title":"翻滚阿宝陶瓷杯","url":""},{"goodsId":102378,"image":"http://img31.mtime.cn/goods/2016/01/29/140959.35743350_600X600X1.jpg","title":"功夫熊猫POP公仔","url":""},{"goodsId":101838,"image":"http://img31.mtime.cn/goods/2016/01/07/181644.21735698_600X600X1.jpg","title":"阿宝练功多功能雕像","url":""}]
     * titleCn : 功夫熊猫
     * titleEn : Kung Fu Panda
     * uncheckImage : http://img31.mtime.cn/mg/2016/01/29/163427.96666490.jpg
     * url : http://mall.wv.mtime.cn/#!/commerce/list/?q=功夫熊猫
     */

    private List<TopicEntity> topic;

    @Override
    public String toString() {
        return "StoreBean{" +
                "advHeadImg=" + advHeadImg +
                ", cellA=" + cellA +
                ", cellB=" + cellB +
                ", cellC=" + cellC +
                ", goodsCoupon=" + goodsCoupon +
                ", navigatorFirthIcon=" + navigatorFirthIcon +
                ", category=" + category +
                ", navigatorIcon=" + navigatorIcon +
                ", scrollImg=" + scrollImg +
                ", topic=" + topic +
                '}';
    }

    public void setAdvHeadImg(AdvHeadImgEntity advHeadImg) {
        this.advHeadImg = advHeadImg;
    }

    public void setCellA(CellAEntity cellA) {
        this.cellA = cellA;
    }

    public void setCellB(CellBEntity cellB) {
        this.cellB = cellB;
    }

    public void setCellC(CellCEntity cellC) {
        this.cellC = cellC;
    }

    public void setGoodsCoupon(GoodsCouponEntity goodsCoupon) {
        this.goodsCoupon = goodsCoupon;
    }

    public void setNavigatorFirthIcon(NavigatorFirthIconEntity navigatorFirthIcon) {
        this.navigatorFirthIcon = navigatorFirthIcon;
    }

    public void setCategory(List<CategoryEntity> category) {
        this.category = category;
    }

    public void setNavigatorIcon(List<NavigatorIconEntity> navigatorIcon) {
        this.navigatorIcon = navigatorIcon;
    }

    public void setScrollImg(List<ScrollImgEntity> scrollImg) {
        this.scrollImg = scrollImg;
    }

    public void setTopic(List<TopicEntity> topic) {
        this.topic = topic;
    }

    public AdvHeadImgEntity getAdvHeadImg() {
        return advHeadImg;
    }

    public CellAEntity getCellA() {
        return cellA;
    }

    public CellBEntity getCellB() {
        return cellB;
    }

    public CellCEntity getCellC() {
        return cellC;
    }

    public GoodsCouponEntity getGoodsCoupon() {
        return goodsCoupon;
    }

    public NavigatorFirthIconEntity getNavigatorFirthIcon() {
        return navigatorFirthIcon;
    }

    public List<CategoryEntity> getCategory() {
        return category;
    }

    public List<NavigatorIconEntity> getNavigatorIcon() {
        return navigatorIcon;
    }

    public List<ScrollImgEntity> getScrollImg() {
        return scrollImg;
    }

    public List<TopicEntity> getTopic() {
        return topic;
    }

    public static class AdvHeadImgEntity {
    }

    public static class CellAEntity {
        private int goodsId;
        private String img;
        private int longTime;
        private int startTime;
        private String subTitle;
        private String title;
        private String titleColor;
        private String url;
        private int warmup;

        @Override
        public String toString() {
            return "CellAEntity{" +
                    "goodsId=" + goodsId +
                    ", img='" + img + '\'' +
                    ", longTime=" + longTime +
                    ", startTime=" + startTime +
                    ", subTitle='" + subTitle + '\'' +
                    ", title='" + title + '\'' +
                    ", titleColor='" + titleColor + '\'' +
                    ", url='" + url + '\'' +
                    ", warmup=" + warmup +
                    '}';
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public void setLongTime(int longTime) {
            this.longTime = longTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setTitleColor(String titleColor) {
            this.titleColor = titleColor;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setWarmup(int warmup) {
            this.warmup = warmup;
        }

        public int getGoodsId() {
            return goodsId;
        }

        public String getImg() {
            return img;
        }

        public int getLongTime() {
            return longTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public String getSubTitle() {
            return subTitle;
        }

        public String getTitle() {
            return title;
        }

        public String getTitleColor() {
            return titleColor;
        }

        public String getUrl() {
            return url;
        }

        public int getWarmup() {
            return warmup;
        }
    }

    public static class CellBEntity {
        private int goodsId;
        private String img;
        private int longTime;
        private int startTime;
        private String subTitle;
        private String title;
        private String titleColor;
        private String url;
        private int warmup;

        @Override
        public String toString() {
            return "CellBEntity{" +
                    "goodsId=" + goodsId +
                    ", img='" + img + '\'' +
                    ", longTime=" + longTime +
                    ", startTime=" + startTime +
                    ", subTitle='" + subTitle + '\'' +
                    ", title='" + title + '\'' +
                    ", titleColor='" + titleColor + '\'' +
                    ", url='" + url + '\'' +
                    ", warmup=" + warmup +
                    '}';
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public void setLongTime(int longTime) {
            this.longTime = longTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setTitleColor(String titleColor) {
            this.titleColor = titleColor;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setWarmup(int warmup) {
            this.warmup = warmup;
        }

        public int getGoodsId() {
            return goodsId;
        }

        public String getImg() {
            return img;
        }

        public int getLongTime() {
            return longTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public String getSubTitle() {
            return subTitle;
        }

        public String getTitle() {
            return title;
        }

        public String getTitleColor() {
            return titleColor;
        }

        public String getUrl() {
            return url;
        }

        public int getWarmup() {
            return warmup;
        }
    }

    public static class CellCEntity {
        /**
         * image : http://img31.mtime.cn/mg/2016/04/08/104937.27610780.jpg
         * subTitle :
         * title :
         * titleColor :
         * url : http://mall.wv.mtime.cn/#!/commerce/item/102314/
         */

        private List<ListEntity> list;

        @Override
        public String toString() {
            return "CellCEntity{" +
                    "list=" + list +
                    '}';
        }

        public void setList(List<ListEntity> list) {
            this.list = list;
        }

        public List<ListEntity> getList() {
            return list;
        }

        public static class ListEntity {
            private String image;
            private String subTitle;
            private String title;
            private String titleColor;
            private String url;

            public void setImage(String image) {
                this.image = image;
            }

            public void setSubTitle(String subTitle) {
                this.subTitle = subTitle;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setTitleColor(String titleColor) {
                this.titleColor = titleColor;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getImage() {
                return image;
            }

            public String getSubTitle() {
                return subTitle;
            }

            public String getTitle() {
                return title;
            }

            public String getTitleColor() {
                return titleColor;
            }

            public String getUrl() {
                return url;
            }
        }
    }

    public static class GoodsCouponEntity {
        private boolean isNewAdd;
        private String msg;

        @Override
        public String toString() {
            return "GoodsCouponEntity{" +
                    "isNewAdd=" + isNewAdd +
                    ", msg='" + msg + '\'' +
                    '}';
        }

        public void setIsNewAdd(boolean isNewAdd) {
            this.isNewAdd = isNewAdd;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public boolean isIsNewAdd() {
            return isNewAdd;
        }

        public String getMsg() {
            return msg;
        }
    }

    public static class NavigatorFirthIconEntity {
        private String iconTitle1;
        private String iconTitle2;
        private String img1;
        private String img2;
        private String url;

        @Override
        public String toString() {
            return "NavigatorFirthIconEntity{" +
                    "iconTitle1='" + iconTitle1 + '\'' +
                    ", iconTitle2='" + iconTitle2 + '\'' +
                    ", img1='" + img1 + '\'' +
                    ", img2='" + img2 + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }

        public void setIconTitle1(String iconTitle1) {
            this.iconTitle1 = iconTitle1;
        }

        public void setIconTitle2(String iconTitle2) {
            this.iconTitle2 = iconTitle2;
        }

        public void setImg1(String img1) {
            this.img1 = img1;
        }

        public void setImg2(String img2) {
            this.img2 = img2;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getIconTitle1() {
            return iconTitle1;
        }

        public String getIconTitle2() {
            return iconTitle2;
        }

        public String getImg1() {
            return img1;
        }

        public String getImg2() {
            return img2;
        }

        public String getUrl() {
            return url;
        }
    }

    public static class CategoryEntity {
        private String colorValue;
        private int goodsId;
        private String image;
        private String imageUrl;
        private String moreUrl;
        private String name;
        /**
         * goodsId : 102486
         * image : http://img31.mtime.cn/mg/2016/04/08/202936.71962757.jpg
         * title : 蝙超3件装
         * url :
         */

        private List<SubListEntity> subList;

        @Override
        public String toString() {
            return "CategoryEntity{" +
                    "colorValue='" + colorValue + '\'' +
                    ", goodsId=" + goodsId +
                    ", image='" + image + '\'' +
                    ", imageUrl='" + imageUrl + '\'' +
                    ", moreUrl='" + moreUrl + '\'' +
                    ", name='" + name + '\'' +
                    ", subList=" + subList +
                    '}';
        }

        public void setColorValue(String colorValue) {
            this.colorValue = colorValue;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public void setMoreUrl(String moreUrl) {
            this.moreUrl = moreUrl;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSubList(List<SubListEntity> subList) {
            this.subList = subList;
        }

        public String getColorValue() {
            return colorValue;
        }

        public int getGoodsId() {
            return goodsId;
        }

        public String getImage() {
            return image;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public String getMoreUrl() {
            return moreUrl;
        }

        public String getName() {
            return name;
        }

        public List<SubListEntity> getSubList() {
            return subList;
        }

        public static class SubListEntity {
            private int goodsId;
            private String image;
            private String title;
            private String url;

            @Override
            public String toString() {
                return "SubListEntity{" +
                        "goodsId=" + goodsId +
                        ", image='" + image + '\'' +
                        ", title='" + title + '\'' +
                        ", url='" + url + '\'' +
                        '}';
            }

            public void setGoodsId(int goodsId) {
                this.goodsId = goodsId;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getGoodsId() {
                return goodsId;
            }

            public String getImage() {
                return image;
            }

            public String getTitle() {
                return title;
            }

            public String getUrl() {
                return url;
            }
        }
    }

    public static class NavigatorIconEntity {
        private String iconTitle;
        private String image;
        private String url;

        @Override
        public String toString() {
            return "NavigatorIconEntity{" +
                    "iconTitle='" + iconTitle + '\'' +
                    ", image='" + image + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }

        public void setIconTitle(String iconTitle) {
            this.iconTitle = iconTitle;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getIconTitle() {
            return iconTitle;
        }

        public String getImage() {
            return image;
        }

        public String getUrl() {
            return url;
        }
    }

    public static class ScrollImgEntity {
        private String image;
        private String url;

        @Override
        public String toString() {
            return "ScrollImgEntity{" +
                    "image='" + image + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getImage() {
            return image;
        }

        public String getUrl() {
            return url;
        }
    }

    public static class TopicEntity {
        private String backgroupImage;
        private String checkedImage;
        private int goodsId;
        private String titleCn;
        private String titleEn;
        private String uncheckImage;
        private String url;
        /**
         * goodsId : 101778
         * image : http://img31.mtime.cn/goods/2015/12/09/153047.41310181_600X600X1.jpg
         * title : 功夫熊猫Q萌充电宝
         * url :
         */

        private List<SubListEntity> subList;

        @Override
        public String toString() {
            return "TopicEntity{" +
                    "backgroupImage='" + backgroupImage + '\'' +
                    ", checkedImage='" + checkedImage + '\'' +
                    ", goodsId=" + goodsId +
                    ", titleCn='" + titleCn + '\'' +
                    ", titleEn='" + titleEn + '\'' +
                    ", uncheckImage='" + uncheckImage + '\'' +
                    ", url='" + url + '\'' +
                    ", subList=" + subList +
                    '}';
        }

        public void setBackgroupImage(String backgroupImage) {
            this.backgroupImage = backgroupImage;
        }

        public void setCheckedImage(String checkedImage) {
            this.checkedImage = checkedImage;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public void setTitleCn(String titleCn) {
            this.titleCn = titleCn;
        }

        public void setTitleEn(String titleEn) {
            this.titleEn = titleEn;
        }

        public void setUncheckImage(String uncheckImage) {
            this.uncheckImage = uncheckImage;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setSubList(List<SubListEntity> subList) {
            this.subList = subList;
        }

        public String getBackgroupImage() {
            return backgroupImage;
        }

        public String getCheckedImage() {
            return checkedImage;
        }

        public int getGoodsId() {
            return goodsId;
        }

        public String getTitleCn() {
            return titleCn;
        }

        public String getTitleEn() {
            return titleEn;
        }

        public String getUncheckImage() {
            return uncheckImage;
        }

        public String getUrl() {
            return url;
        }

        public List<SubListEntity> getSubList() {
            return subList;
        }

        public static class SubListEntity {
            private int goodsId;
            private String image;
            private String title;
            private String url;

            @Override
            public String toString() {
                return "SubListEntity{" +
                        "goodsId=" + goodsId +
                        ", image='" + image + '\'' +
                        ", title='" + title + '\'' +
                        ", url='" + url + '\'' +
                        '}';
            }

            public void setGoodsId(int goodsId) {
                this.goodsId = goodsId;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getGoodsId() {
                return goodsId;
            }

            public String getImage() {
                return image;
            }

            public String getTitle() {
                return title;
            }

            public String getUrl() {
                return url;
            }
        }
    }
}
