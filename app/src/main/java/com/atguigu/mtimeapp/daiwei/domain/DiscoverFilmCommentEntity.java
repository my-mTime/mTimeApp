package com.atguigu.mtimeapp.daiwei.domain;

/**
 * Created by daiwei on 2016/4/20.
 *
 * 发现 -- 影评实体类
 */
public class DiscoverFilmCommentEntity {

    /**
     * id : 7949853
     * nickname : 杀手里昂Leon
     * userImage : http://img22.mtime.cn/up/2012/05/25/105354.10919174_128X128.jpg
     * rating : 8.0
     * title : 徐氏武侠观的忠实体现
     * summary : 文/杀手里昂
     从拍摄时间上来说，《箭士柳白猿》应该是徐皓峰的第二部作品，在《倭寇的踪迹》之后，《师父》之前。之所以把时间捋清，是为了更好的说明导演在不同阶段呈现出的创作风格走向。

     在《倭寇的踪迹》中，徐皓峰凭借其独有的动作风格及画面感给观众带来了前所未有的武侠体验，开启了徐氏新派武侠风格。而在去年大放异彩的电影《师父》中，徐皓峰又用一种更接近于商业的方式刷新了国人的武侠文化视野。而作为中间的《...
     * relatedObj : {"type":1,"id":158687,"title":"箭士柳白猿","rating":"7.3","image":"http://img31.mtime.cn/mt/2016/03/07/144414.19679515_1280X720X2.jpg"}
     */

    private int id;
    private String nickname;
    private String userImage;
    private String rating;
    private String title;
    private String summary;
    /**
     * type : 1
     * id : 158687
     * title : 箭士柳白猿
     * rating : 7.3
     * image : http://img31.mtime.cn/mt/2016/03/07/144414.19679515_1280X720X2.jpg
     */

    private RelatedObjEntity relatedObj;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public RelatedObjEntity getRelatedObj() {
        return relatedObj;
    }

    public void setRelatedObj(RelatedObjEntity relatedObj) {
        this.relatedObj = relatedObj;
    }

    public static class RelatedObjEntity {
        private int type;
        private int id;
        private String title;
        private String rating;
        private String image;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

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

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}
