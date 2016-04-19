package com.atguigu.mtimeapp.lixin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.atguigu.mtimeapp.R;

/**
 * @author captain_miao
 */
public class SeatTableView extends View {
    Bitmap seat_sale, seat_sold, seat_selected;
    Bitmap SeatSale, SeatSold, SeatSelected;

    private int seatWidth;//座位图的宽,长宽相同
    private int defWidth;//初始值

    //放大率和移动位置
    public float mScaleFactor = 1.f;
    public float mPosX = .0f;
    public float mPosY = .0f;


    private SeatMo[][] seatTable;
    private int rowSize;
    private int columnSize;

    private Paint linePaint;//中央线的绘制

    int width;
    int height;

    public SeatTableView(Context context) {
        super(context, null);

    }

    public SeatTableView(Context context, AttributeSet attr) {
        super(context, attr);

        SeatSale = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.pic_seat_blue);
        SeatSold = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.pic_seat_gray);
        SeatSelected = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.pic_seat_orange);


        setVerticalScrollBarEnabled(true);
        setHorizontalScrollBarEnabled(true);

    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //只绘制可见的座位图
        if (defWidth < 10) {
            throw new IllegalArgumentException("the width must > 10, the value is " + defWidth);
        }
        seatWidth = (int) (defWidth * mScaleFactor);
        width = getMeasuredWidth();
        height = getMeasuredHeight();


        // 可购买座位
        seat_sale = Bitmap.createScaledBitmap(SeatSale, seatWidth-5, seatWidth-5, true);
        // 红色 已售座位
        seat_sold = Bitmap.createScaledBitmap(SeatSold, seatWidth-5, seatWidth-5, true);
        // 绿色 我的选择
        seat_selected = Bitmap.createScaledBitmap(SeatSelected, seatWidth-5, seatWidth-5, true);

        // 画座位
        int m = (int) (mPosY + seatWidth);
        m = m >= 0 ? 0 : -m / seatWidth;
        int n = Math.min(rowSize - 1, m + (height / seatWidth) + 2);//两边多显示1列,避免临界的突然消失的现象
        for (int i = m; i <= n; i++) {
            //绘制中线,座位间隔由图片来做,简化处理
            if (linePaint != null) {
                int vLine_X = columnSize % 2 == 0 ? columnSize / 2 * seatWidth : (columnSize / 2 + 1) * seatWidth + 1;
                canvas.drawLine(vLine_X + mPosX+2, i * (seatWidth) + mPosY,
                        vLine_X + mPosX+2, i * (seatWidth) + seatWidth + mPosY, linePaint);
                int hLine_Y = (rowSize * seatWidth / 2) % 2 == 0 ? rowSize * seatWidth / 2 : rowSize * seatWidth / 2 + 1;
                canvas.drawLine(0, hLine_Y+2, seatWidth * columnSize + mPosX, hLine_Y+2, linePaint);
            }
            int k = (int) (mPosX + seatWidth + 0.5f);
            k = k > 0 ? 0 : -k / seatWidth;//移动距离不可能出现移到-rowSize
            int l = Math.min(columnSize - 1, k + (width / seatWidth) + 2);//两边多显示1列,避免临界的突然消失的现象
            for (int j = k; j <= l; j++) {

                if (seatTable[i][j] != null) {
                    switch (seatTable[i][j].status) {
                        case -1:
                        case 0: {
//                            canvas.drawBitmap(bitmap,left,top,paint);
                            canvas.drawBitmap(seat_sold, j * (seatWidth) + mPosX+5, i * (seatWidth) + mPosY+5, null);
                            break;
                        }
                        case 1: {
                            canvas.drawBitmap(seat_sale, j * (seatWidth) + mPosX+5, i * (seatWidth) + mPosY+5, null);
                            break;
                        }
                        case 2: {
                            canvas.drawBitmap(seat_selected, j * (seatWidth) + mPosX+5, i * (seatWidth) + mPosY+5, null);
                            break;
                        }
                        default: {
                            break;
                        }

                    }

                }
            }
        }

    }


    /**
     * 设置座位表
     *
     * @param seatTable
     */
    public void setSeatTable(SeatMo[][] seatTable) {
        this.seatTable = seatTable;
    }

    public int getRowSize() {
        return rowSize;
    }

    /**
     * 设置行
     *
     * @param rowSize
     */
    public void setRowSize(int rowSize) {
        this.rowSize = rowSize;
    }

    public int getColumnSize() {
        return columnSize;
    }

    /**
     * 设置列
     *
     * @param columnSize
     */
    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }


    /**
     * 设置画笔颜色
     *
     * @param linePaint
     */
    public void setLinePaint(Paint linePaint) {
        this.linePaint = linePaint;
    }

    /**
     * 设置默认的座位数
     *
     * @param defWidth
     */
    public void setDefWidth(int defWidth) {
        this.defWidth = defWidth;
    }

    public int getSeatWidth() {
        return seatWidth;
    }

}
