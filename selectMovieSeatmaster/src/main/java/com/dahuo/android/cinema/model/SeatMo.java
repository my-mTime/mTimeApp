package com.dahuo.android.cinema.model;

/**
 * @author captain_miao
 */
public class SeatMo extends BaseMo {

    /**
     * 座位名称：几排几座
     */
    public String seatName;
    /**
     * 行名称：A排
     */
	public String rowName;
    /**
     * 行坐标
     */
	public int row;
    /**
     * 列坐标
     */
	public int column;

    /**
     * 座位状态:1：可售，0：已售，-1：删除(非法)
     */
	public int status;


}
