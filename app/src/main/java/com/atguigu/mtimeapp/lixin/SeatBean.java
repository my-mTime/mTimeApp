package com.atguigu.mtimeapp.lixin;

import java.util.List;

/**
 * Created by 笨货 on 2016/4/15.
 * 电影院选座位的对象
 */
public class SeatBean {


    /**
     * isSale : true
     * isAutoSelected : true
     * supplierId : 5249
     * mtimeSellPrice : 2800
     * price : 28
     * cinemaId : 7799
     * cinemaName : 本溪环球国际影城
     * movieId : 224689
     * movieName : 垫底辣妹
     * movieLength : 117
     * hallName : 4号厅
     * versionDesc : 2D
     * language : 中文
     * salePrice : 2800
     * isCoupon : false
     * serviceFee : 300
     * salePriceList : []
     * realTime : 1460808300
     * hallSpecialDes :
     * seatColumnCount : 13
     * seatRowCount : 8
     * seat : [{"id":47332372,"x":0,"y":0,"name":"1排13座","type":0,"seatNumber":"13","status":true},{"id":47332373,"x":1,"y":0,"name":"1排12座","type":0,"seatNumber":"12","status":true},{"id":47332374,"x":2,"y":0,"name":"1排11座","type":0,"seatNumber":"11","status":true},{"id":47332375,"x":3,"y":0,"name":"1排10座","type":0,"seatNumber":"10","status":true},{"id":47332376,"x":4,"y":0,"name":"1排09座","type":0,"seatNumber":"09","status":true},{"id":47332377,"x":5,"y":0,"name":"1排08座","type":0,"seatNumber":"08","status":true},{"id":47332378,"x":6,"y":0,"name":"1排07座","type":0,"seatNumber":"07","status":true},{"id":47332379,"x":7,"y":0,"name":"1排06座","type":0,"seatNumber":"06","status":true},{"id":47332380,"x":8,"y":0,"name":"1排05座","type":0,"seatNumber":"05","status":true},{"id":47332381,"x":9,"y":0,"name":"1排04座","type":0,"seatNumber":"04","status":true},{"id":47332382,"x":10,"y":0,"name":"1排03座","type":0,"seatNumber":"03","status":true},{"id":47332383,"x":11,"y":0,"name":"1排02座","type":0,"seatNumber":"02","status":true},{"id":47332384,"x":12,"y":0,"name":"1排01座","type":0,"seatNumber":"01","status":true},{"id":0,"x":0,"y":1,"name":"","type":0,"seatNumber":"","status":false},{"id":47332386,"x":1,"y":1,"name":"2排11座","type":0,"seatNumber":"11","status":true},{"id":47332387,"x":2,"y":1,"name":"2排10座","type":0,"seatNumber":"10","status":true},{"id":47332388,"x":3,"y":1,"name":"2排09座","type":0,"seatNumber":"09","status":true},{"id":47332389,"x":4,"y":1,"name":"2排08座","type":0,"seatNumber":"08","status":true},{"id":47332390,"x":5,"y":1,"name":"2排07座","type":0,"seatNumber":"07","status":true},{"id":47332391,"x":6,"y":1,"name":"2排06座","type":0,"seatNumber":"06","status":true},{"id":47332392,"x":7,"y":1,"name":"2排05座","type":0,"seatNumber":"05","status":true},{"id":47332393,"x":8,"y":1,"name":"2排04座","type":0,"seatNumber":"04","status":true},{"id":47332394,"x":9,"y":1,"name":"2排03座","type":0,"seatNumber":"03","status":true},{"id":47332395,"x":10,"y":1,"name":"2排02座","type":0,"seatNumber":"02","status":true},{"id":47332396,"x":11,"y":1,"name":"2排01座","type":0,"seatNumber":"01","status":true},{"id":0,"x":12,"y":1,"name":"","type":0,"seatNumber":"","status":false},{"id":47332398,"x":0,"y":2,"name":"3排12座","type":0,"seatNumber":"12","status":true},{"id":47332399,"x":1,"y":2,"name":"3排11座","type":0,"seatNumber":"11","status":true},{"id":47332400,"x":2,"y":2,"name":"3排10座","type":0,"seatNumber":"10","status":true},{"id":47332401,"x":3,"y":2,"name":"3排09座","type":0,"seatNumber":"09","status":true},{"id":47332402,"x":4,"y":2,"name":"3排08座","type":0,"seatNumber":"08","status":false},{"id":47332403,"x":5,"y":2,"name":"3排07座","type":0,"seatNumber":"07","status":false},{"id":47332404,"x":6,"y":2,"name":"3排06座","type":0,"seatNumber":"06","status":false},{"id":47332405,"x":7,"y":2,"name":"3排05座","type":0,"seatNumber":"05","status":false},{"id":47332406,"x":8,"y":2,"name":"3排04座","type":0,"seatNumber":"04","status":true},{"id":47332407,"x":9,"y":2,"name":"3排03座","type":0,"seatNumber":"03","status":true},{"id":47332408,"x":10,"y":2,"name":"3排02座","type":0,"seatNumber":"02","status":true},{"id":47332409,"x":11,"y":2,"name":"3排01座","type":0,"seatNumber":"01","status":true},{"id":0,"x":12,"y":2,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":0,"y":3,"name":"","type":0,"seatNumber":"","status":false},{"id":47332412,"x":1,"y":3,"name":"4排10座","type":0,"seatNumber":"10","status":true},{"id":47332413,"x":2,"y":3,"name":"4排09座","type":0,"seatNumber":"09","status":true},{"id":47332414,"x":3,"y":3,"name":"4排08座","type":0,"seatNumber":"08","status":true},{"id":47332415,"x":4,"y":3,"name":"4排07座","type":0,"seatNumber":"07","status":false},{"id":47332416,"x":5,"y":3,"name":"4排06座","type":0,"seatNumber":"06","status":false},{"id":47332417,"x":6,"y":3,"name":"4排05座","type":0,"seatNumber":"05","status":false},{"id":47332418,"x":7,"y":3,"name":"4排04座","type":0,"seatNumber":"04","status":false},{"id":47332419,"x":8,"y":3,"name":"4排03座","type":0,"seatNumber":"03","status":true},{"id":47332420,"x":9,"y":3,"name":"4排02座","type":0,"seatNumber":"02","status":true},{"id":47332421,"x":10,"y":3,"name":"4排01座","type":0,"seatNumber":"01","status":true},{"id":0,"x":11,"y":3,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":12,"y":3,"name":"","type":0,"seatNumber":"","status":false},{"id":47332424,"x":0,"y":4,"name":"5排11座","type":0,"seatNumber":"11","status":true},{"id":47332425,"x":1,"y":4,"name":"5排10座","type":0,"seatNumber":"10","status":true},{"id":47332426,"x":2,"y":4,"name":"5排09座","type":0,"seatNumber":"09","status":true},{"id":47332427,"x":3,"y":4,"name":"5排08座","type":0,"seatNumber":"08","status":true},{"id":47332428,"x":4,"y":4,"name":"5排07座","type":0,"seatNumber":"07","status":false},{"id":47332429,"x":5,"y":4,"name":"5排06座","type":0,"seatNumber":"06","status":false},{"id":47332430,"x":6,"y":4,"name":"5排05座","type":0,"seatNumber":"05","status":false},{"id":47332431,"x":7,"y":4,"name":"5排04座","type":0,"seatNumber":"04","status":false},{"id":47332432,"x":8,"y":4,"name":"5排03座","type":0,"seatNumber":"03","status":true},{"id":47332433,"x":9,"y":4,"name":"5排02座","type":0,"seatNumber":"02","status":true},{"id":47332434,"x":10,"y":4,"name":"5排01座","type":0,"seatNumber":"01","status":true},{"id":0,"x":11,"y":4,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":12,"y":4,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":0,"y":5,"name":"","type":0,"seatNumber":"","status":false},{"id":47332438,"x":1,"y":5,"name":"6排10座","type":0,"seatNumber":"10","status":true},{"id":47332439,"x":2,"y":5,"name":"6排09座","type":0,"seatNumber":"09","status":true},{"id":47332440,"x":3,"y":5,"name":"6排08座","type":0,"seatNumber":"08","status":true},{"id":47332441,"x":4,"y":5,"name":"6排07座","type":0,"seatNumber":"07","status":true},{"id":47332442,"x":5,"y":5,"name":"6排06座","type":0,"seatNumber":"06","status":true},{"id":47332443,"x":6,"y":5,"name":"6排05座","type":0,"seatNumber":"05","status":false},{"id":47332444,"x":7,"y":5,"name":"6排04座","type":0,"seatNumber":"04","status":false},{"id":47332445,"x":8,"y":5,"name":"6排03座","type":0,"seatNumber":"03","status":true},{"id":47332446,"x":9,"y":5,"name":"6排02座","type":0,"seatNumber":"02","status":true},{"id":47332447,"x":10,"y":5,"name":"6排01座","type":0,"seatNumber":"01","status":true},{"id":0,"x":11,"y":5,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":12,"y":5,"name":"","type":0,"seatNumber":"","status":false},{"id":47332450,"x":0,"y":6,"name":"7排11座","type":0,"seatNumber":"11","status":true},{"id":47332451,"x":1,"y":6,"name":"7排10座","type":0,"seatNumber":"10","status":true},{"id":47332452,"x":2,"y":6,"name":"7排09座","type":0,"seatNumber":"09","status":true},{"id":47332453,"x":3,"y":6,"name":"7排08座","type":0,"seatNumber":"08","status":true},{"id":47332454,"x":4,"y":6,"name":"7排07座","type":0,"seatNumber":"07","status":true},{"id":47332455,"x":5,"y":6,"name":"7排06座","type":0,"seatNumber":"06","status":true},{"id":47332456,"x":6,"y":6,"name":"7排05座","type":0,"seatNumber":"05","status":true},{"id":47332457,"x":7,"y":6,"name":"7排04座","type":0,"seatNumber":"04","status":true},{"id":47332458,"x":8,"y":6,"name":"7排03座","type":0,"seatNumber":"03","status":true},{"id":47332459,"x":9,"y":6,"name":"7排02座","type":0,"seatNumber":"02","status":true},{"id":47332460,"x":10,"y":6,"name":"7排01座","type":0,"seatNumber":"01","status":true},{"id":0,"x":11,"y":6,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":12,"y":6,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":0,"y":7,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":1,"y":7,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":2,"y":7,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":3,"y":7,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":4,"y":7,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":5,"y":7,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":6,"y":7,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":7,"y":7,"name":"","type":0,"seatNumber":"","status":false},{"id":0,"x":8,"y":7,"name":"","type":0,"seatNumber":"","status":false},{"id":47332472,"x":9,"y":7,"name":"8排04座","type":0,"seatNumber":"04","status":true},{"id":47332473,"x":10,"y":7,"name":"8排03座","type":0,"seatNumber":"03","status":true},{"id":47332474,"x":11,"y":7,"name":"8排02座","type":0,"seatNumber":"02","status":true},{"id":47332475,"x":12,"y":7,"name":"8排01座","type":0,"seatNumber":"01","status":true}]
     * remainSeat : 68
     * rowNameList : [{"rowId":0,"rowName":"1"},{"rowId":1,"rowName":"2"},{"rowId":2,"rowName":"3"},{"rowId":3,"rowName":"4"},{"rowId":4,"rowName":"5"},{"rowId":5,"rowName":"6"},{"rowId":6,"rowName":"7"},{"rowId":7,"rowName":"8"}]
     * provider : [{"id":5249,"name":"本溪环球国际影城","dId":171749994}]
     * orderMsg :
     * subOrderID : 0
     * orderId : 0
     */

    private boolean isSale;
    private boolean isAutoSelected;
    private int supplierId;
    private int mtimeSellPrice;
    private String price;
    private int cinemaId;
    private String cinemaName;
    private int movieId;
    private String movieName;
    private int movieLength;
    private String hallName;
    private String versionDesc;
    private String language;
    private int salePrice;
    private boolean isCoupon;
    private int serviceFee;
    private int realTime;
    private String hallSpecialDes;
    private int seatColumnCount;
    private int seatRowCount;
    private int remainSeat;
    private String orderMsg;
    private int subOrderID;
    private int orderId;
    private List<?> salePriceList;
    /**
     * id : 47332372
     * x : 0
     * y : 0
     * name : 1排13座
     * type : 0
     * seatNumber : 13
     * status : true
     */

    private List<SeatEntity> seat;
    /**
     * rowId : 0
     * rowName : 1
     */

    private List<RowNameListEntity> rowNameList;
    /**
     * id : 5249
     * name : 本溪环球国际影城
     * dId : 171749994
     */

    private List<ProviderEntity> provider;

    @Override
    public String toString() {
        return "SeatBean{" +
                "isSale=" + isSale +
                ", isAutoSelected=" + isAutoSelected +
                ", supplierId=" + supplierId +
                ", mtimeSellPrice=" + mtimeSellPrice +
                ", price='" + price + '\'' +
                ", cinemaId=" + cinemaId +
                ", cinemaName='" + cinemaName + '\'' +
                ", movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieLength=" + movieLength +
                ", hallName='" + hallName + '\'' +
                ", versionDesc='" + versionDesc + '\'' +
                ", language='" + language + '\'' +
                ", salePrice=" + salePrice +
                ", isCoupon=" + isCoupon +
                ", serviceFee=" + serviceFee +
                ", realTime=" + realTime +
                ", hallSpecialDes='" + hallSpecialDes + '\'' +
                ", seatColumnCount=" + seatColumnCount +
                ", seatRowCount=" + seatRowCount +
                ", remainSeat=" + remainSeat +
                ", orderMsg='" + orderMsg + '\'' +
                ", subOrderID=" + subOrderID +
                ", orderId=" + orderId +
                ", salePriceList=" + salePriceList +
                ", seat=" + seat +
                ", rowNameList=" + rowNameList +
                ", provider=" + provider +
                '}';
    }

    public void setIsSale(boolean isSale) {
        this.isSale = isSale;
    }

    public void setIsAutoSelected(boolean isAutoSelected) {
        this.isAutoSelected = isAutoSelected;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setMtimeSellPrice(int mtimeSellPrice) {
        this.mtimeSellPrice = mtimeSellPrice;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public void setVersionDesc(String versionDesc) {
        this.versionDesc = versionDesc;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public void setIsCoupon(boolean isCoupon) {
        this.isCoupon = isCoupon;
    }

    public void setServiceFee(int serviceFee) {
        this.serviceFee = serviceFee;
    }

    public void setRealTime(int realTime) {
        this.realTime = realTime;
    }

    public void setHallSpecialDes(String hallSpecialDes) {
        this.hallSpecialDes = hallSpecialDes;
    }

    public void setSeatColumnCount(int seatColumnCount) {
        this.seatColumnCount = seatColumnCount;
    }

    public void setSeatRowCount(int seatRowCount) {
        this.seatRowCount = seatRowCount;
    }

    public void setRemainSeat(int remainSeat) {
        this.remainSeat = remainSeat;
    }

    public void setOrderMsg(String orderMsg) {
        this.orderMsg = orderMsg;
    }

    public void setSubOrderID(int subOrderID) {
        this.subOrderID = subOrderID;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setSalePriceList(List<?> salePriceList) {
        this.salePriceList = salePriceList;
    }

    public void setSeat(List<SeatEntity> seat) {
        this.seat = seat;
    }

    public void setRowNameList(List<RowNameListEntity> rowNameList) {
        this.rowNameList = rowNameList;
    }

    public void setProvider(List<ProviderEntity> provider) {
        this.provider = provider;
    }

    public boolean isIsSale() {
        return isSale;
    }

    public boolean isIsAutoSelected() {
        return isAutoSelected;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public int getMtimeSellPrice() {
        return mtimeSellPrice;
    }

    public String getPrice() {
        return price;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMovieLength() {
        return movieLength;
    }

    public String getHallName() {
        return hallName;
    }

    public String getVersionDesc() {
        return versionDesc;
    }

    public String getLanguage() {
        return language;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public boolean isIsCoupon() {
        return isCoupon;
    }

    public int getServiceFee() {
        return serviceFee;
    }

    public int getRealTime() {
        return realTime;
    }

    public String getHallSpecialDes() {
        return hallSpecialDes;
    }

    public int getSeatColumnCount() {
        return seatColumnCount;
    }

    public int getSeatRowCount() {
        return seatRowCount;
    }

    public int getRemainSeat() {
        return remainSeat;
    }

    public String getOrderMsg() {
        return orderMsg;
    }

    public int getSubOrderID() {
        return subOrderID;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<?> getSalePriceList() {
        return salePriceList;
    }

    public List<SeatEntity> getSeat() {
        return seat;
    }

    public List<RowNameListEntity> getRowNameList() {
        return rowNameList;
    }

    public List<ProviderEntity> getProvider() {
        return provider;
    }

    public static class SeatEntity {
        private int id;
        private int x;
        private int y;
        private String name;
        private int type;
        private String seatNumber;
        private boolean status;

        @Override
        public String toString() {
            return "SeatEntity{" +
                    "id=" + id +
                    ", x=" + x +
                    ", y=" + y +
                    ", name='" + name + '\'' +
                    ", type=" + type +
                    ", seatNumber='" + seatNumber + '\'' +
                    ", status=" + status +
                    '}';
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public int getId() {
            return id;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public String getName() {
            return name;
        }

        public int getType() {
            return type;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean isStatus() {
            return status;
        }
    }

    public static class RowNameListEntity {
        private int rowId;
        private String rowName;

        public void setRowId(int rowId) {
            this.rowId = rowId;
        }

        public void setRowName(String rowName) {
            this.rowName = rowName;
        }

        public int getRowId() {
            return rowId;
        }

        public String getRowName() {
            return rowName;
        }
    }

    public static class ProviderEntity {
        private int id;
        private String name;
        private int dId;

        @Override
        public String toString() {
            return "ProviderEntity{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", dId=" + dId +
                    '}';
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDId(int dId) {
            this.dId = dId;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getDId() {
            return dId;
        }
    }
}
