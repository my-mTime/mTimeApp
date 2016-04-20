package com.atguigu.mtimeapp.daiwei.domain;

import java.util.List;

/**
 * Created by daiwei on 2016/4/20.
 *
 * 发现 -- 排行榜实体类
 */
public class DiscoverLeaderboardEntity {

    /**
     * topLists : [{"id":1342,"topListNameCn":"2015年日本《电影旬报》海外十佳影片","topListNameEn":"","type":0,"summary":"2015日本旬报海外佳片榜：《疯狂的麦克斯4》夺魁，《刺客聂隐娘》位列第五。"},{"id":1340,"topListNameCn":"2015年日本《电影旬报》年度十佳影片","topListNameEn":"","type":0,"summary":"2015日本旬报大奖揭晓：《恋人们》夺魁，《海街日记》位列第四。"},{"id":1337,"topListNameCn":"2015独立电影北美票房榜Top20","topListNameEn":"","type":0,"summary":"国外著名电影媒体indieWIRE网站29日评选出2015年北美票房最高的20部独立电影，票房统计截止至2015年12月29日。海伦·米伦主演的《金衣女人》以3000多万美元票房成为吸金之王。《机械姬》和《聚焦》分别位列二三位。"},{"id":1334,"topListNameCn":"《综艺》2015年度十佳电影","topListNameEn":"","type":0,"summary":"《刺客聂隐娘》入围美国Variety网站的年度十佳电影。"},{"id":1333,"topListNameCn":"《卫报》2015年电影50佳","topListNameEn":"","type":0,"summary":"奥斯卡外语片大热门《索尔之子》名列榜首。"},{"id":1332,"topListNameCn":"美国电影学会（AFI）2015年度电影十佳","topListNameEn":"","type":0,"summary":"《大空头》、《间谍之桥》、《卡萝尔》位列前三位。"},{"id":1331,"topListNameCn":"美国电影学会（AFI）2015年度美剧十佳","topListNameEn":"","type":0,"summary":"《美国谍梦》获第一"},{"id":1330,"topListNameCn":"《电影评论》2015年电影20佳","topListNameEn":"","type":0,"summary":"《卡萝尔》位列榜首，侯孝贤《刺客聂隐娘》居次席。"},{"id":1324,"topListNameCn":"《电影手册》2015年度十佳电影名单","topListNameEn":"","type":0,"summary":"《疯狂的麦克斯4》意外上榜"},{"id":1322,"topListNameCn":"《人物》2015全球十大性感男星","topListNameEn":"","type":2,"summary":"大卫·贝克汉姆登顶，也是该评选30周年的胜者。"},{"id":1321,"topListNameCn":"影史最有趣的101部剧本出炉","topListNameEn":"","type":0,"summary":"伍迪·艾伦以7部作品入选美国编剧家协会今天票选出影史最有趣的101部电影剧本。"},{"id":1314,"topListNameCn":"《福布斯》电视男演员收入排行榜","topListNameEn":"","type":2,"summary":"谢耳朵吉姆·帕森斯成功登顶，昔日搭档约翰尼·盖尔克奇位居第二。"},{"id":1311,"topListNameCn":"《福布斯》2015全球最高薪女星排行榜","topListNameEn":"","type":2,"summary":"劳伦斯登顶，范冰冰第四，也是唯一进榜的亚洲女星。"},{"id":1308,"topListNameCn":"TimeOut评选最佳动作电影TOP100","topListNameEn":"","type":0,"summary":"《虎胆龙威》夺得最佳动作电影第一名"},{"id":1307,"topListNameCn":"《福布斯》2015全球收入最高演员排行榜","topListNameEn":"","type":2,"summary":"小罗伯特·唐尼8000万美金位居榜首。"},{"id":1306,"topListNameCn":"TimeOut评选100部最佳动画电影","topListNameEn":"","type":0,"summary":"《木偶奇遇记》获百部经典之首"},{"id":1302,"topListNameCn":"BBC评选100部最伟大的美国电影","topListNameEn":"","type":0,"summary":"《公民凯恩》力压《教父》夺冠。"},{"id":1295,"topListNameCn":"美媒评2014/2015年度最佳25部剧集","topListNameEn":"","type":1,"summary":"美国网站indiewire评选出年度最佳25部电视剧作品，为9月将举行的艾美奖预热。"},{"id":1293,"topListNameCn":"2015上半年北美评分最高院线片","topListNameEn":"","type":0,"summary":"依据metacritic(收录《综艺》、《好莱坞报道者》、《村之声》、《洛杉矶时报》等美国权威报章和网站的影评人电影打分)得分排名。"},{"id":1294,"topListNameCn":"韩国人心目中的50大韩国美男演员","topListNameEn":"","type":2,"summary":"《演艺家中介》是韩国最长寿的周播娱综合乐播报栏目，近日栏目组对韩国全年龄段男女老少1000人样本进行调查(调查时间2015年4月30日到5月1日)，评选出了韩国人心目中的国际影坛和韩国影坛50大美男美女演员榜单。"}]
     * totalCount : 146
     * pageCount : 8
     */

    private int totalCount;
    private int pageCount;
    /**
     * id : 1342
     * topListNameCn : 2015年日本《电影旬报》海外十佳影片
     * topListNameEn :
     * type : 0
     * summary : 2015日本旬报海外佳片榜：《疯狂的麦克斯4》夺魁，《刺客聂隐娘》位列第五。
     */

    private List<TopListsEntity> topLists;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<TopListsEntity> getTopLists() {
        return topLists;
    }

    public void setTopLists(List<TopListsEntity> topLists) {
        this.topLists = topLists;
    }

    public static class TopListsEntity {
        private int id;
        private String topListNameCn;
        private String topListNameEn;
        private int type;
        private String summary;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTopListNameCn() {
            return topListNameCn;
        }

        public void setTopListNameCn(String topListNameCn) {
            this.topListNameCn = topListNameCn;
        }

        public String getTopListNameEn() {
            return topListNameEn;
        }

        public void setTopListNameEn(String topListNameEn) {
            this.topListNameEn = topListNameEn;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }
    }
}
