package com.atguigu.mtimeapp.lixin;

import java.util.List;

/**
 * Created by 笨货 on 2016/4/13.
 * 全球票房榜的Tag
 */
public class GlobalTopTagBean {

    /**
     * title : 时光Top100
     * titleSmall : Mtime Top 100
     * pageSubAreaId : 2065
     */

    private List<TopListEntity> topList;

    public void setTopList(List<TopListEntity> topList) {
        this.topList = topList;
    }

    public List<TopListEntity> getTopList() {
        return topList;
    }

    public static class TopListEntity {
        private String title;
        private String titleSmall;
        private String pageSubAreaId;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setTitleSmall(String titleSmall) {
            this.titleSmall = titleSmall;
        }

        public void setPageSubAreaId(String pageSubAreaId) {
            this.pageSubAreaId = pageSubAreaId;
        }

        public String getTitle() {
            return title;
        }

        public String getTitleSmall() {
            return titleSmall;
        }

        public String getPageSubAreaId() {
            return pageSubAreaId;
        }
    }
}
