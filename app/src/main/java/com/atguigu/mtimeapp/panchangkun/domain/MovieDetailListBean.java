package com.atguigu.mtimeapp.panchangkun.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 正在上映的电影List数据
 * Created by Administrator on 2016/4/11.
 */
public class MovieDetailListBean {

    /**
     * lid : 290
     * bImg : http://img31.mtime.cn/mg/2016/04/07/150238.33518570.jpg
     * date : 2016-04-11
     * totalComingMovie : 49
     * newActivitiesTime : 0
     * ms : [{"id":211903,"t":"伦敦陷落","tCn":"伦敦陷落","tEn":"London Has Fallen","r":6.7,
     * "rc":994,"img":"http://img31.mtime.cn/mt/2016/03/18/144725.14339749_1280X720X2.jpg",
     * "dN":"巴巴克·纳加非","aN1":"杰拉德·巴特勒","aN2":"艾伦·艾克哈特","p":["动作","犯罪","惊悚"],
     * "rd":"20160408","d":"99分钟","cC":144,"sC":3472,"rsC":0,"NearestCinemaCount":143,"Neare
     * stShowtimeCount":1604,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":true,"isTicket"
     * :true,"commonSpecial":"盛产孤胆英雄的美国","isFilter":false,"wantedCount":1695,"movieType":"
     * 动作 | 犯罪 | 惊悚","is3D":true,"isIMAX":false,"isIMAX3D":false,"isDMAX":true,"versions":[{
     * "enum":1,"version":"2D"},{"enum":2,"version":"3D"},{"enum":6,"version":"中国巨幕"}]},{"id
     * ":229813,"t":"火锅英雄","tCn":"火锅英雄","tEn":"Chongqing Hot Pot","r":6.5,"rc":3265,"img"
     * :"http://img31.mtime.cn/mt/2016/03/17/095046.92546354_1280X720X2.jpg","dN":"杨庆","aN1":"
     * 陈坤","aN2":"白百何","p":["爱情","动作","剧情","喜剧"],"rd":"20160401","d":"95分钟","cC":1
     * 43,"sC":2188,"rsC":0,"NearestCinemaCount":142,"NearestShowtimeCount":1117,"NearestDay":
     * 1460332800,"ua":0,"isNew":false,"isHot":true,"isTicket":true,"commonSpecial":"贼好看，\
     * u201c贼\u201d好看","isFilter":false,"wantedCount":2728,"movieType":"爱情 | 动作 | 剧情","
     *
     * is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"versio
     * n":"2D"}]},{"id":216573,"t":"我的特工爷爷","tCn":"我的特工爷爷","tEn":"The Bodyguard","r":
     * 5.5,"rc":1296,"img":"http://img31.mtime.cn/mt/2016/03/18/115923.98692411_1280X720X2.jpg"
     * ,"dN":"洪金宝","aN1":"洪金宝","aN2":"刘德华","p":["动作","剧情","悬疑","犯罪"],"rd":"201604
     * 01","d":"99分钟","cC":135,"sC":1308,"rsC":0,"NearestCinemaCount":132,"NearestShowtimeCoun
     * t":704,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":true,"isTicket":true,"common
     * Special":"围观群众都是天团级别的","isFilter":false,"wantedCount":2716,"movieType":"动作 | 剧
     * 情 | 悬疑","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":true,"versions":[{"enum":1,"version":"2D"},{"enum":6,"version":"中国巨幕"}]},{"id":205222,"t":"疯狂动物城","tCn":"疯狂动物城","tEn":"Zootopia","r":8.7,"rc":10875,"img":"http://img31.mtime.cn/mt/2016/01/28/092552.17985926_1280X720X2.jpg","dN":"拜恩·霍华德","aN1":"金妮弗·古德温","aN2":"杰森·贝特曼","p":["动画","冒险","喜剧"],"rd":"20160304","d":"108分钟","cC":129,"sC":1279,"rsC":0,"NearestCinemaCount":127,"NearestShowtimeCount":616,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"狐狸尼克撩得一手好妹","isFilter":false,"wantedCount":14245,"movieType":"动画 | 冒险 | 喜剧","is3D":true,"isIMAX":false,"isIMAX3D":true,"isDMAX":true,"versions":[{"enum":1,"version":"2D"},{"enum":2,"version":"3D"},{"enum":4,"version":"IMAX3D"},{"enum":6,"version":"中国巨幕"}]},{"id":203183,"t":"蝙蝠侠大战超人：正义黎明","tCn":"蝙蝠侠大战超人：正义黎明","tEn":"Batman v Superman: Dawn of Justice","r":7.4,"rc":13032,"img":"http://img31.mtime.cn/mt/2016/03/14/201837.61652663_1280X720X2.jpg","dN":"扎克·施奈德","aN1":"本·阿弗莱克","aN2":"亨利·卡维尔","p":["动作","冒险","奇幻","科幻"],"rd":"20160325","d":"151分钟","cC":126,"sC":894,"rsC":0,"NearestCinemaCount":125,"NearestShowtimeCount":446,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"外星大男孩对孤儿装备党","isFilter":false,"wantedCount":11036,"movieType":"动作 | 冒险 | 奇幻","is3D":true,"isIMAX":false,"isIMAX3D":true,"isDMAX":true,"versions":[{"enum":1,"version":"2D"},{"enum":2,"version":"3D"},{"enum":4,"version":"IMAX3D"},{"enum":6,"version":"中国巨幕"}]},{"id":225158,"t":"睡在我上铺的兄弟","tCn":"睡在我上铺的兄弟","tEn":"Who Sleeps My Bro","r":5.7,"rc":6749,"img":"http://img31.mtime.cn/mt/2016/03/17/173331.19323605_1280X720X2.jpg","dN":"张琦","aN1":"陈晓","aN2":"秦岚","p":["剧情"],"rd":"20160401","d":"93分钟","cC":99,"sC":478,"rsC":0,"NearestCinemaCount":92,"NearestShowtimeCount":247,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"宿舍的黄段子是一道风景","isFilter":false,"wantedCount":1351,"movieType":"剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":156682,"t":"荒野猎人","tCn":"荒野猎人","tEn":"The Revenant","r":8,"rc":4963,"img":"http://img31.mtime.cn/mt/2016/03/03/222241.58917235_1280X720X2.jpg","dN":"亚利桑德罗·冈萨雷斯·伊纳里图","aN1":"莱昂纳多·迪卡普里奥","aN2":"汤姆·哈迪","p":["冒险","剧情","惊悚","西部"],"rd":"20160318","d":"156分钟","cC":71,"sC":374,"rsC":0,"NearestCinemaCount":66,"NearestShowtimeCount":188,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"其实小李的大氅老值钱了","isFilter":false,"wantedCount":6720,"movieType":"冒险 | 剧情 | 惊悚","is3D":false,"isIMAX":true,"isIMAX3D":false,"isDMAX":true,"versions":[{"enum":1,"version":"2D"},{"enum":3,"version":"IMAX"},{"enum":6,"version":"中国巨幕"}]},{"id":229122,"t":"灵偶契约","tCn":"灵偶契约","tEn":"The Boy","r":6.6,"rc":255,"img":"http://img31.mtime.cn/mt/2016/03/30/111813.75613052_1280X720X2.jpg","dN":"威廉·布伦特·贝尔","aN1":"劳伦·科汉","aN2":"鲁珀特·伊文斯","p":["恐怖","惊悚"],"rd":"20160401","d":"97分钟","cC":45,"sC":148,"rsC":0,"NearestCinemaCount":43,"NearestShowtimeCount":74,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"保姆从来都不是好差事","isFilter":false,"wantedCount":472,"movieType":"恐怖 | 惊悚","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":232692,"t":"午夜寻访录","tCn":"午夜寻访录","tEn":"Midnight Record Search","r":-1,"rc":11,"img":"http://img31.mtime.cn/mt/2016/03/17/153645.50060865_1280X720X2.jpg","dN":"刘天荣","aN1":"沙溢","aN2":"胡可","p":["惊悚"],"rd":"20160408","d":"90分钟","cC":21,"sC":64,"rsC":0,"NearestCinemaCount":21,"NearestShowtimeCount":33,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"老白胡可两口子齐上阵","isFilter":false,"wantedCount":29,"movieType":"惊悚","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":229451,"t":"太空熊猫英雄归来","tCn":"太空熊猫英雄归来","tEn":"Space Panda","r":3.5,"rc":96,"img":"http://img31.mtime.cn/mt/2015/11/02/151318.16176984_1280X720X2.jpg","dN":"郑成峰","aN1":"","aN2":"","p":["动画","喜剧"],"rd":"20160402","d":"80分钟","cC":15,"sC":31,"rsC":0,"NearestCinemaCount":13,"NearestShowtimeCount":21,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"反派大联萌来袭","isFilter":false,"wantedCount":135,"movieType":"动画 | 喜剧","is3D":true,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"},{"enum":2,"version":"3D"}]},{"id":232570,"t":"隔壁惊魂","tCn":"隔壁惊魂","tEn":"Ghost Neighbor","r":5.6,"rc":8,"img":"http://img31.mtime.cn/mt/2016/03/28/151116.71732478_1280X720X2.jpg","dN":"邢博","aN1":"李左飞","aN2":"曹子辰","p":["惊悚","恐怖"],"rd":"20160408","d":"92分钟","cC":16,"sC":33,"rsC":0,"NearestCinemaCount":14,"NearestShowtimeCount":17,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"京城鬼宅又上银幕","isFilter":false,"wantedCount":24,"movieType":"惊悚 | 恐怖","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":209007,"t":"美人鱼","tCn":"美人鱼","tEn":"The Mermaid","r":7.5,"rc":15394,"img":"http://img31.mtime.cn/mt/2016/02/04/165933.21865133_1280X720X2.jpg","dN":"周星驰","aN1":"邓超","aN2":"罗志祥","p":["爱情","剧情","科幻"],"rd":"20160208","d":"93分钟","cC":7,"sC":43,"rsC":0,"NearestCinemaCount":5,"NearestShowtimeCount":14,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"一边笑喷一边泪崩","isFilter":false,"wantedCount":16805,"movieType":"爱情 | 剧情 | 科幻","is3D":true,"isIMAX":false,"isIMAX3D":false,"isDMAX":true,"versions":[{"enum":2,"version":"3D"},{"enum":6,"version":"中国巨幕"}]},{"id":230241,"t":"我的老婆是明星","tCn":"我的老婆是明星","tEn":"My Wife Is A Superstar","r":5.3,"rc":8,"img":"http://img31.mtime.cn/mt/2016/03/25/085208.48363109_1280X720X2.jpg","dN":"翁秀兰","aN1":"刘心悠","aN2":"周柏豪","p":["爱情","剧情","喜剧"],"rd":"20160408","d":"105分钟","cC":12,"sC":21,"rsC":0,"NearestCinemaCount":11,"NearestShowtimeCount":14,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":67,"movieType":"爱情 | 剧情 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":222349,"t":"不速之客","tCn":"不速之客","tEn":"The Guest","r":5.8,"rc":122,"img":"http://img31.mtime.cn/mt/2016/03/30/113537.91294974_1280X720X2.jpg","dN":"林大雄","aN1":"黎明","aN2":"韩彩英","p":["惊悚","剧情","犯罪"],"rd":"20160401","d":"94分钟","cC":10,"sC":30,"rsC":0,"NearestCinemaCount":9,"NearestShowtimeCount":14,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"看男神女神一起玩重口","isFilter":false,"wantedCount":253,"movieType":"惊悚 | 剧情 | 犯罪","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":232382,"t":"白毛女","tCn":"白毛女","tEn":"The White-haired Girl","r":6.4,"rc":40,"img":"http://img31.mtime.cn/mt/2016/03/15/170139.51895013_1280X720X2.jpg","dN":"侯克明","aN1":"雷佳","aN2":"张英席","p":["舞台艺术"],"rd":"20160325","d":"122分钟","cC":6,"sC":31,"rsC":0,"NearestCinemaCount":4,"NearestShowtimeCount":9,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"3D的飘雪感觉很真","isFilter":false,"wantedCount":74,"movieType":"舞台艺术","is3D":true,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"},{"enum":2,"version":"3D"}]},{"id":23983,"t":"缘份","tCn":"缘份","tEn":"Behind the Yellow Line","r":7,"rc":748,"img":"http://img31.mtime.cn/mt/2016/03/25/084748.64565514_1280X720X2.jpg","dN":"黄泰来","aN1":"张国荣","aN2":"张曼玉","p":["喜剧","爱情","剧情"],"rd":"20160325","d":"90分钟","cC":7,"sC":19,"rsC":0,"NearestCinemaCount":5,"NearestShowtimeCount":9,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"所谓缘分就是钱和机会","isFilter":false,"wantedCount":1328,"movieType":"喜剧 | 爱情 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":209501,"t":"摩尔庄园大电影3魔幻列车大冒险","tCn":"摩尔庄园大电影3魔幻列车大冒险","tEn":"Legend Of The Moles-The Magic Train Adventure","r":5.3,"rc":221,"img":"http://img31.mtime.cn/mt/2016/03/13/160106.35635976_1280X720X2.jpg","dN":"李婷婷","aN1":"杨鸥","aN2":"夏磊","p":["动画","家庭","剧情","冒险"],"rd":"20160402","d":"86分钟","cC":5,"sC":7,"rsC":0,"NearestCinemaCount":5,"NearestShowtimeCount":7,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"关于列车的遐想","isFilter":false,"wantedCount":426,"movieType":"动画 | 家庭 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":208254,"t":"神战：权力之眼","tCn":"神战：权力之眼","tEn":"Gods of Egypt","r":6.6,"rc":3895,"img":"http://img31.mtime.cn/mt/2016/03/04/095907.69694487_1280X720X2.jpg","dN":"亚历克斯·普罗亚斯","aN1":"尼可拉·科斯特-瓦尔道","aN2":"杰拉德·巴特勒","p":["动作","冒险","奇幻"],"rd":"20160311","d":"127分钟","cC":4,"sC":7,"rsC":0,"NearestCinemaCount":4,"NearestShowtimeCount":7,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"场景设定很洋气","isFilter":false,"wantedCount":2810,"movieType":"动作 | 冒险 | 奇幻","is3D":true,"isIMAX":false,"isIMAX3D":true,"isDMAX":true,"versions":[{"enum":2,"version":"3D"},{"enum":4,"version":"IMAX3D"},{"enum":6,"version":"中国巨幕"}]},{"id":224231,"t":"女汉子真爱公式","tCn":"女汉子真爱公式","tEn":"The Rise of A Tomboy","r":5.4,"rc":450,"img":"http://img31.mtime.cn/mt/2016/03/17/100106.41163014_1280X720X2.jpg","dN":"郭大雷","aN1":"赵丽颖","aN2":"张翰","p":["喜剧","爱情","剧情"],"rd":"20160318","d":"93分钟","cC":4,"sC":11,"rsC":0,"NearestCinemaCount":4,"NearestShowtimeCount":5,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"网络段子大杂烩","isFilter":false,"wantedCount":789,"movieType":"喜剧 | 爱情 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":232571,"t":"小角色","tCn":"小角色","tEn":"","r":-1,"rc":1,"img":"http://img31.mtime.cn/mt/571/232571/232571_1280X720X2.jpg","dN":"","aN1":"","aN2":"","p":["剧情","喜剧"],"cC":4,"sC":6,"rsC":0,"NearestCinemaCount":2,"NearestShowtimeCount":4,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":5,"movieType":"剧情 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":79451,"t":"飞鹰艾迪","tCn":"飞鹰艾迪","tEn":"Eddie the Eagle","r":7.6,"rc":495,"img":"http://img31.mtime.cn/mt/2016/02/22/155535.32315483_1280X720X2.jpg","dN":"德克斯特·弗莱彻","aN1":"塔伦·埃格顿","aN2":"休·杰克曼","p":["传记","喜剧","剧情","历史","运动"],"rd":"20160318","d":"105分钟","cC":2,"sC":5,"rsC":0,"NearestCinemaCount":2,"NearestShowtimeCount":3,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"运动和励志天生绝配","isFilter":false,"wantedCount":1036,"movieType":"传记 | 喜剧 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":101204,"t":"轩辕大帝","tCn":"轩辕大帝","tEn":"Xuan Yuan:The Great Emperor","r":5,"rc":459,"img":"http://img31.mtime.cn/mt/2016/03/24/092734.75359978_1280X720X2.jpg","dN":"李晓军","aN1":"于波","aN2":"王德顺","p":["古装","历史"],"rd":"20160401","d":"90分钟","cC":2,"sC":3,"rsC":0,"NearestCinemaCount":2,"NearestShowtimeCount":2,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"远古英雄大战来一发","isFilter":false,"wantedCount":132,"movieType":"古装 | 历史","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":205122,"t":"北京爱情故事","tCn":"北京爱情故事","tEn":"BeiJing Love Story","r":6.6,"rc":11645,"img":"http://img31.mtime.cn/mt/2014/02/11/100303.80631796_1280X720X2.jpg","dN":"陈思诚","aN1":"陈思诚","aN2":"佟丽娅","p":["爱情","剧情"],"rd":"20140213","d":"121分钟","cC":2,"sC":2,"rsC":0,"NearestCinemaCount":2,"NearestShowtimeCount":2,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","isFilter":false,"wantedCount":1254,"movieType":"爱情 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":162309,"t":"HOLD住爱","tCn":"HOLD住爱","tEn":"Holding Love","r":3,"rc":3808,"img":"http://img31.mtime.cn/mt/2012/08/08/142942.17070174_1280X720X2.jpg","dN":"张琦","aN1":"杨幂","aN2":"刘恺威","p":["爱情","悬疑","喜剧"],"rd":"20120823","cC":2,"sC":2,"rsC":0,"NearestCinemaCount":2,"NearestShowtimeCount":2,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","isFilter":false,"wantedCount":1956,"movieType":"爱情 | 悬疑 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":190450,"t":"警察故事2013","tCn":"警察故事2013","tEn":"Police Story 2013","r":6.4,"rc":10488,"img":"http://img31.mtime.cn/mt/2013/12/09/005021.64965819_1280X720X2.jpg","dN":"丁晟","aN1":"成龙","aN2":"刘烨","p":["动作","犯罪","剧情","惊悚"],"rd":"20131224","d":"108分钟","cC":2,"sC":2,"rsC":0,"NearestCinemaCount":2,"NearestShowtimeCount":2,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","isFilter":false,"wantedCount":1199,"movieType":"动作 | 犯罪 | 剧情","is3D":true,"isIMAX":false,"isIMAX3D":true,"isDMAX":true,"versions":[{"enum":2,"version":"3D"},{"enum":4,"version":"IMAX3D"},{"enum":6,"version":"中国巨幕"}]},{"id":49134,"t":"鲁迅","tCn":"鲁迅","tEn":"Lu Xun","r":7.3,"rc":45,"img":"http://img21.mtime.cn/mt/2011/09/20/100715.64111445_1280X720X2.jpg","dN":"丁荫楠","aN1":"濮存昕","aN2":"张瑜","p":["剧情","历史","传记"],"rd":"20050909","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","isFilter":false,"wantedCount":32,"movieType":"剧情 | 历史 | 传记","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":223891,"t":"美人鱼之海盗来袭","tCn":"美人鱼之海盗来袭","tEn":"The Little Mermaid: Attack of The Pirates","r":5.3,"rc":562,"img":"http://img31.mtime.cn/mt/2015/07/14/092716.76990212_1280X720X2.jpg","dN":"邱浩强","aN1":"","aN2":"","p":["动画","冒险","喜剧"],"rd":"20150731","d":"85分钟","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","isFilter":false,"wantedCount":1093,"movieType":"动画 | 冒险 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":225879,"t":"喜乐长安","tCn":"喜乐长安","tEn":"Easy Life","r":6,"rc":407,"img":"http://img31.mtime.cn/mt/2016/03/08/091322.87445880_1280X720X2.jpg","dN":"竹卿","aN1":"张天阳","aN2":"何泓姗","p":["爱情","武侠","喜剧"],"rd":"20160325","d":"95分钟","cC":1,"sC":2,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"韩少书迷们都去影院了吗","isFilter":false,"wantedCount":460,"movieType":"爱情 | 武侠 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":153131,"t":"光棍终结者","tCn":"光棍终结者","tEn":"Single Terminator","r":5.1,"rc":318,"img":"http://img21.mtime.cn/mt/2011/11/07/182843.43638572_1280X720X2.jpg","dN":"赵非","aN1":"李艾","aN2":"周韦彤","p":["爱情","喜剧"],"rd":"20111111","cC":2,"sC":2,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":56,"movieType":"爱情 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":190544,"t":"宫锁沉香","tCn":"宫锁沉香","tEn":"The Palace","r":5.3,"rc":5519,"img":"http://img31.mtime.cn/mt/2013/08/01/150814.10446785_1280X720X2.jpg","dN":"潘安子","aN1":"周冬雨","aN2":"陈晓","p":["爱情","剧情","古装"],"rd":"20130813","d":"115分钟","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","isFilter":false,"wantedCount":3112,"movieType":"爱情 | 剧情 | 古装","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":161357,"t":"黑暗中的救赎","tCn":"黑暗中的救赎","tEn":"The Brother","r":5.4,"rc":70,"img":"http://img21.mtime.cn/mt/2012/05/28/130738.21549380_1280X720X2.jpg","dN":"安战军","aN1":"果静林","aN2":"任泉","p":["剧情","犯罪"],"rd":"20120621","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","isFilter":false,"wantedCount":19,"movieType":"剧情 | 犯罪","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":177861,"t":"功夫熊猫3","tCn":"功夫熊猫3","tEn":"Kung Fu Panda 3","r":7.5,"rc":8204,"img":"http://img31.mtime.cn/mt/2016/01/09/113356.19578118_1280X720X2.jpg","dN":"吕寅荣","aN1":"黄磊","aN2":"杨幂","p":["动画","动作","冒险","喜剧","家庭"],"rd":"20160129","d":"95分钟","cC":1,"sC":2,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"看潘达君重出江湖","isFilter":false,"wantedCount":11467,"movieType":"动画 | 动作 | 冒险","is3D":true,"isIMAX":false,"isIMAX3D":true,"isDMAX":true,"versions":[{"enum":1,"version":"2D"},{"enum":2,"version":"3D"},{"enum":4,"version":"IMAX3D"},{"enum":6,"version":"中国巨幕"}]},{"id":127244,"t":"永无止境","tCn":"永无止境","tEn":"Limitless","r":7.5,"rc":7522,"img":"http://img21.mtime.cn/mt/2011/09/30/122209.60012598_1280X720X2.jpg","dN":"尼尔·博格","aN1":"布莱德利·库珀","aN2":"罗伯特·德尼罗","p":["惊悚","悬疑","科幻"],"rd":"20111013","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","isFilter":false,"wantedCount":2703,"movieType":"惊悚 | 悬疑 | 科幻","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":163126,"t":"北京遇上西雅图","tCn":"北京遇上西雅图","tEn":"Finding Mr.Right","r":7.7,"rc":17901,"img":"http://img31.mtime.cn/mt/2013/02/22/090814.53002276_1280X720X2.jpg","dN":"薛晓路","aN1":"汤唯","aN2":"吴秀波","p":["爱情","喜剧"],"rd":"20130321","d":"123分钟","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":5401,"movieType":"爱情 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":219629,"t":"陪安东尼度过漫长岁月","tCn":"陪安东尼度过漫长岁月","tEn":"A Journey, through Time, with Anthony","r":5.8,"rc":919,"img":"http://img31.mtime.cn/mt/2015/11/06/105328.59514239_1280X720X2.jpg","dN":"秦小珍","aN1":"刘畅","aN2":"白百何","p":["爱情"],"rd":"20151113","d":"120分钟","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":2956,"movieType":"爱情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":218226,"t":"分手木马计","tCn":"分手木马计","tEn":"","r":-1,"rc":9,"img":"http://img31.mtime.cn/mt/2014/11/06/110233.98337821_1280X720X2.jpg","dN":"胡艺川","aN1":"王一","aN2":"","p":["爱情","剧情"],"rd":"20141129","d":"85分钟","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","isFilter":false,"wantedCount":1,"movieType":"爱情 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":231842,"t":"恐怖将映","tCn":"恐怖将映","tEn":"Fear is coming","r":5.2,"rc":172,"img":"http://img31.mtime.cn/mt/2016/03/21/143009.45580290_1280X720X2.jpg","dN":"张洋","aN1":"谢容儿","aN2":"Mik Thongraya","p":["恐怖"],"rd":"20160325","d":"90分钟","cC":1,"sC":3,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460332800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"恐怖版《泰囧》的小感觉","isFilter":false,"wantedCount":2973,"movieType":"恐怖","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":216154,"t":"一路惊喜","tCn":"一路惊喜","tEn":"Crazy New Year's Eve","r":5.9,"rc":4308,"img":"http://img31.mtime.cn/mt/2015/01/16/091913.81971229_1280X720X2.jpg","dN":"金依萌","aN1":"郭采洁","aN2":"凤小岳","p":["爱情","家庭","喜剧"],"rd":"20150206","d":"120分钟","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460419200,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","isFilter":false,"wantedCount":1371,"movieType":"爱情 | 家庭 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":96001,"t":"狄仁杰之通天帝国","tCn":"狄仁杰之通天帝国","tEn":"Detective Dee and the Mystery of the Phantom Flame","r":7,"rc":14985,"img":"http://img21.mtime.cn/mt/2010/08/31/012713.84314315_1280X720X2.jpg","dN":"徐克","aN1":"刘德华","aN2":"李冰冰","p":["动作","历史","悬疑","古装"],"rd":"20100929","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460419200,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":5952,"movieType":"动作 | 历史 | 悬疑","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":125326,"t":"恋爱通告","tCn":"恋爱通告","tEn":"Love In Disguise","r":6.2,"rc":8366,"img":"http://img21.mtime.cn/mt/2010/07/19/110121.60184611_1280X720X2.jpg","dN":"王力宏","aN1":"王力宏","aN2":"刘亦菲","p":["爱情","喜剧"],"rd":"20100812","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460419200,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":1988,"movieType":"爱情 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":203613,"t":"战狼","tCn":"战狼","tEn":"Wolf Warriors","r":7,"rc":10268,"img":"http://img31.mtime.cn/mt/2015/02/04/092856.57377119_1280X720X2.jpg","dN":"吴京","aN1":"吴京","aN2":"余男","p":["动作","战争"],"rd":"20150402","d":"90分钟","cC":1,"sC":2,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1460505600,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":9713,"movieType":"动作 | 战争","is3D":true,"isIMAX":false,"isIMAX3D":false,"isDMAX":true,"versions":[{"enum":2,"version":"3D"},{"enum":6,"version":"中国巨幕"}]},{"id":224689,"t":"垫底辣妹","tCn":"垫底辣妹","tEn":"Flying Colors","r":7.6,"rc":534,"img":"http://img31.mtime.cn/mt/2016/03/31/001142.64728084_1280X720X2.jpg","dN":"土井裕泰","aN1":"有村架纯","aN2":"伊藤淳史","p":["剧情"],"rd":"20160414","d":"117分钟","cC":57,"sC":324,"rsC":0,"NearestCinemaCount":4,"NearestShowtimeCount":4,"NearestDay":1460505600,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":472,"movieType":"剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":219131,"t":"纽约纽约","tCn":"纽约纽约","tEn":"New York New York","r":-1,"rc":12,"img":"http://img31.mtime.cn/mt/2016/03/17/160007.97969060_1280X720X2.jpg","dN":"罗冬","aN1":"阮经天","aN2":"杜鹃","p":["爱情","剧情"],"rd":"20160415","d":"105分钟","cC":10,"sC":56,"rsC":0,"NearestCinemaCount":3,"NearestShowtimeCount":3,"NearestDay":1460592000,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":2404,"movieType":"爱情 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":207872,"t":"奇幻森林","tCn":"奇幻森林","tEn":"The Jungle Book","r":-1,"rc":112,"img":"http://img31.mtime.cn/mt/2016/03/28/170428.48853494_1280X720X2.jpg","dN":"乔恩·费儒","aN1":"尼尔·塞西","aN2":"比尔·默瑞","p":["冒险","剧情","家庭","奇幻"],"rd":"20160415","d":"105分钟","cC":77,"sC":1252,"rsC":0,"NearestCinemaCount":40,"NearestShowtimeCount":43,"NearestDay":1460592000,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":2320,"movieType":"冒险 | 剧情 | 家庭","is3D":true,"isIMAX":false,"isIMAX3D":true,"isDMAX":true,"versions":[{"enum":2,"version":"3D"},{"enum":4,"version":"IMAX3D"},{"enum":6,"version":"中国巨幕"}]},{"id":232059,"t":"猫脸老太太","tCn":"猫脸老太太","tEn":"Mother's Revenge","r":-1,"rc":17,"img":"http://img31.mtime.cn/mt/2016/04/11/093805.91113842_1280X720X2.jpg","dN":"赵小溪","aN1":"王翀","aN2":"田淼","p":["惊悚","恐怖","悬疑"],"rd":"20160415","d":"90分钟","cC":2,"sC":7,"rsC":0,"NearestCinemaCount":2,"NearestShowtimeCount":3,"NearestDay":1460678400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":1204,"movieType":"惊悚 | 恐怖 | 悬疑","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":225720,"t":"冰河追凶","tCn":"冰河追凶","tEn":"Lost In White","r":-1,"rc":88,"img":"http://img31.mtime.cn/mt/2016/03/18/091618.24526976_1280X720X2.jpg","dN":"徐伟","aN1":"梁家辉","aN2":"佟大为","p":["悬疑","动作","犯罪"],"rd":"20160415","cC":19,"sC":116,"rsC":0,"NearestCinemaCount":19,"NearestShowtimeCount":88,"NearestDay":1460678400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":302,"movieType":"悬疑 | 动作 | 犯罪","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]},{"id":209597,"t":"废柴特工","tCn":"废柴特工","tEn":"American Ultra","r":6.4,"rc":517,"img":"http://img31.mtime.cn/mt/2016/04/01/164732.59310030_1280X720X2.jpg","dN":"尼玛·诺里扎德","aN1":"杰西·艾森伯格","aN2":"克里斯汀·斯图尔特","p":["动作","喜剧"],"rd":"20160415","d":"95分钟","cC":7,"sC":64,"rsC":0,"NearestCinemaCount":7,"NearestShowtimeCount":29,"NearestDay":1460678400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":2653,"movieType":"动作 | 喜剧","is3D":true,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"},{"enum":2,"version":"3D"}]},{"id":210271,"t":"我的新野蛮女友","tCn":"我的新野蛮女友","tEn":"My New Sassy Girl","r":-1,"rc":546,"img":"http://img31.mtime.cn/mt/2016/03/16/092953.63679225_1280X720X2.jpg","dN":"赵根植","aN1":"车太贤","aN2":"宋茜","p":["爱情","喜剧"],"rd":"20160422","cC":1,"sC":7,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":7,"NearestDay":1461283200,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","isFilter":false,"wantedCount":1612,"movieType":"爱情 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":1,"version":"2D"}]}]
     * voucherMsg :
     */

    private int lid;
    private String bImg;
    private String date;
    private int totalComingMovie;
    private int newActivitiesTime;
    private String voucherMsg;
    /**
     * id : 211903
     * t : 伦敦陷落
     * tCn : 伦敦陷落
     * tEn : London Has Fallen
     * r : 6.7
     * rc : 994
     * img : http://img31.mtime.cn/mt/2016/03/18/144725.14339749_1280X720X2.jpg
     * dN : 巴巴克·纳加非
     * aN1 : 杰拉德·巴特勒
     * aN2 : 艾伦·艾克哈特
     * p : ["动作","犯罪","惊悚"]
     * rd : 20160408
     * d : 99分钟
     * cC : 144
     * sC : 3472
     * rsC : 0
     * NearestCinemaCount : 143
     * NearestShowtimeCount : 1604
     * NearestDay : 1460332800
     * ua : 0
     * isNew : false
     * isHot : true
     * isTicket : true
     * commonSpecial : 盛产孤胆英雄的美国
     * isFilter : false
     * wantedCount : 1695
     * movieType : 动作 | 犯罪 | 惊悚
     * is3D : true
     * isIMAX : false
     * isIMAX3D : false
     * isDMAX : true
     * versions : [{"enum":1,"version":"2D"},{"enum":2,"version":"3D"},{"enum":6,"version":"中国巨幕"}]
     */

    private List<MsEntity> ms;

    public void setLid(int lid) {
        this.lid = lid;
    }

    public void setBImg(String bImg) {
        this.bImg = bImg;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTotalComingMovie(int totalComingMovie) {
        this.totalComingMovie = totalComingMovie;
    }

    public void setNewActivitiesTime(int newActivitiesTime) {
        this.newActivitiesTime = newActivitiesTime;
    }

    public void setVoucherMsg(String voucherMsg) {
        this.voucherMsg = voucherMsg;
    }

    public void setMs(List<MsEntity> ms) {
        this.ms = ms;
    }

    public int getLid() {
        return lid;
    }

    public String getBImg() {
        return bImg;
    }

    public String getDate() {
        return date;
    }

    public int getTotalComingMovie() {
        return totalComingMovie;
    }

    public int getNewActivitiesTime() {
        return newActivitiesTime;
    }

    public String getVoucherMsg() {
        return voucherMsg;
    }

    public List<MsEntity> getMs() {
        return ms;
    }

    public static class MsEntity {
        private int id;
        private String t;
        private String tCn;
        private String tEn;
        private double r;
        private int rc;
        private String img;
        private String dN;
        private String aN1;
        private String aN2;
        private String rd;
        private String d;
        private int cC;
        private int sC;
        private int rsC;
        private int NearestCinemaCount;
        private int NearestShowtimeCount;
        private int NearestDay;
        private int ua;
        private boolean isNew;
        private boolean isHot;
        private boolean isTicket;
        private String commonSpecial;
        private boolean isFilter;
        private int wantedCount;
        private String movieType;
        private boolean is3D;
        private boolean isIMAX;
        private boolean isIMAX3D;
        private boolean isDMAX;
        private List<String> p;
        /**
         * enum : 1
         * version : 2D
         */

        private List<VersionsEntity> versions;

        public void setId(int id) {
            this.id = id;
        }

        public void setT(String t) {
            this.t = t;
        }

        public void setTCn(String tCn) {
            this.tCn = tCn;
        }

        public void setTEn(String tEn) {
            this.tEn = tEn;
        }

        public void setR(double r) {
            this.r = r;
        }

        public void setRc(int rc) {
            this.rc = rc;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public void setDN(String dN) {
            this.dN = dN;
        }

        public void setAN1(String aN1) {
            this.aN1 = aN1;
        }

        public void setAN2(String aN2) {
            this.aN2 = aN2;
        }

        public void setRd(String rd) {
            this.rd = rd;
        }

        public void setD(String d) {
            this.d = d;
        }

        public void setCC(int cC) {
            this.cC = cC;
        }

        public void setSC(int sC) {
            this.sC = sC;
        }

        public void setRsC(int rsC) {
            this.rsC = rsC;
        }

        public void setNearestCinemaCount(int NearestCinemaCount) {
            this.NearestCinemaCount = NearestCinemaCount;
        }

        public void setNearestShowtimeCount(int NearestShowtimeCount) {
            this.NearestShowtimeCount = NearestShowtimeCount;
        }

        public void setNearestDay(int NearestDay) {
            this.NearestDay = NearestDay;
        }

        public void setUa(int ua) {
            this.ua = ua;
        }

        public void setIsNew(boolean isNew) {
            this.isNew = isNew;
        }

        public void setIsHot(boolean isHot) {
            this.isHot = isHot;
        }

        public void setIsTicket(boolean isTicket) {
            this.isTicket = isTicket;
        }

        public void setCommonSpecial(String commonSpecial) {
            this.commonSpecial = commonSpecial;
        }

        public void setIsFilter(boolean isFilter) {
            this.isFilter = isFilter;
        }

        public void setWantedCount(int wantedCount) {
            this.wantedCount = wantedCount;
        }

        public void setMovieType(String movieType) {
            this.movieType = movieType;
        }

        public void setIs3D(boolean is3D) {
            this.is3D = is3D;
        }

        public void setIsIMAX(boolean isIMAX) {
            this.isIMAX = isIMAX;
        }

        public void setIsIMAX3D(boolean isIMAX3D) {
            this.isIMAX3D = isIMAX3D;
        }

        public void setIsDMAX(boolean isDMAX) {
            this.isDMAX = isDMAX;
        }

        public void setP(List<String> p) {
            this.p = p;
        }

        public void setVersions(List<VersionsEntity> versions) {
            this.versions = versions;
        }

        public int getId() {
            return id;
        }

        public String getT() {
            return t;
        }

        public String getTCn() {
            return tCn;
        }

        public String getTEn() {
            return tEn;
        }

        public double getR() {
            return r;
        }

        public int getRc() {
            return rc;
        }

        public String getImg() {
            return img;
        }

        public String getDN() {
            return dN;
        }

        public String getAN1() {
            return aN1;
        }

        public String getAN2() {
            return aN2;
        }

        public String getRd() {
            return rd;
        }

        public String getD() {
            return d;
        }

        public int getCC() {
            return cC;
        }

        public int getSC() {
            return sC;
        }

        public int getRsC() {
            return rsC;
        }

        public int getNearestCinemaCount() {
            return NearestCinemaCount;
        }

        public int getNearestShowtimeCount() {
            return NearestShowtimeCount;
        }

        public int getNearestDay() {
            return NearestDay;
        }

        public int getUa() {
            return ua;
        }

        public boolean isIsNew() {
            return isNew;
        }

        public boolean isIsHot() {
            return isHot;
        }

        public boolean isIsTicket() {
            return isTicket;
        }

        public String getCommonSpecial() {
            return commonSpecial;
        }

        public boolean isIsFilter() {
            return isFilter;
        }

        public int getWantedCount() {
            return wantedCount;
        }

        public String getMovieType() {
            return movieType;
        }

        public boolean isIs3D() {
            return is3D;
        }

        public boolean isIsIMAX() {
            return isIMAX;
        }

        public boolean isIsIMAX3D() {
            return isIMAX3D;
        }

        public boolean isIsDMAX() {
            return isDMAX;
        }

        public List<String> getP() {
            return p;
        }

        public List<VersionsEntity> getVersions() {
            return versions;
        }

        public static class VersionsEntity {
            @SerializedName("enum")
            private int enumX;
            private String version;

            public void setEnumX(int enumX) {
                this.enumX = enumX;
            }

            public void setVersion(String version) {
                this.version = version;
            }

            public int getEnumX() {
                return enumX;
            }

            public String getVersion() {
                return version;
            }
        }
    }
}
