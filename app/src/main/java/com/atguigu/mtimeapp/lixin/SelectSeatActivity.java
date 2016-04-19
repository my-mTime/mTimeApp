package com.atguigu.mtimeapp.lixin;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Request;

/**
 * 电影院选座的页面
 */
public class SelectSeatActivity extends Activity implements View.OnTouchListener {

    private SeatTableView seatTableView;
    private SeatMo[][] seatTable;
    private LinearLayout rowView;

    private Matrix mMatrix = new Matrix();
    private float mScaleFactor = 1.0f;
    private float mFocusX = 0.f;
    private float mFocusY = 0.f;
    /**
     * 默认的宽度
     */
    private int defWidth;
    /**
     * 选择的座位
     */
    private List<SeatMo> selectedSeat;
    /**
     * 透明度
     */
    private AlphaAnimation alpha;

    private ScaleGestureDetector mScaleDetector;
    private MoveGestureDetector mMoveDetector;
    private int seatColumnCount;
    private int seatRowCount;
    private int screenWidth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_seat);
        initView();
        initData();
    }

    private void initData() {

        screenWidth = getResources().getDisplayMetrics().widthPixels;
        defWidth = getResources().getDimensionPixelSize(R.dimen.padding_30dp);

        OkHttpUtils.get().url(ContantsUtils.SELECT_SEAT).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(String response) {
                SeatBean seatBean = new Gson().fromJson(response, SeatBean.class);
                setSeatData(seatBean);
            }
        });
    }

    /**
     * 设置座位数据
     *
     * @param seatBean
     */
    private void setSeatData(SeatBean seatBean) {
        setTitleData(seatBean);

        //设置座位的数据
        setSeat(seatBean);

        if (hasSetSeatData) {
            selectedSeat = new ArrayList<>();
            //设置透明度
            alpha = new AlphaAnimation(0.3F, 0.3F);
            alpha.setDuration(0); // Make animation instant
            alpha.setFillAfter(true); // Tell it to persist after the animation ends

            //居中线的画笔
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStrokeWidth(1f);
            paint.setColor(Color.LTGRAY);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);

            seatTableView.setSeatTable(seatTable);
            seatTableView.setRowSize(seatRowCount);
            seatTableView.setColumnSize(seatColumnCount);
            seatTableView.setOnTouchListener(this);
            seatTableView.setLinePaint(paint);
            seatTableView.setDefWidth(defWidth);
        }

        onChanged();

        // Setup Gesture Detectors
        mScaleDetector = new ScaleGestureDetector(this, new ScaleListener());
        mMoveDetector = new MoveGestureDetector(this, new MoveListener());
    }

    private boolean hasSetSeatData = false;

    private boolean setSeat(SeatBean seatBean) {
        //列数
        seatColumnCount = seatBean.getSeatColumnCount();
        //行数
        seatRowCount = seatBean.getSeatRowCount();
        //设置座位的对象
        seatTable = new SeatMo[seatRowCount][seatColumnCount];
        List<SeatBean.SeatEntity> seatList = seatBean.getSeat();
        int prePos = 0;
        for (int i = 0; i < seatRowCount; i++) {
            int hasSeatcount = 0;//有座位的数据
            for (int j = 0; j < seatColumnCount; j++) {
                SeatBean.SeatEntity seatEntity = seatList.get(prePos + j);
                if (seatEntity.getId() != 0) {//此行结束则返回
                    SeatMo seat = new SeatMo();
                    seat.row = seatEntity.getY();
                    seat.column = seatEntity.getX();
                    seat.rowName = i + 1 + "";//设置行名称
                    seat.seatName = seatEntity.getName();
                    seat.status = seatEntity.isStatus() ? 1 : 0;
                    seatTable[i][j] = seat;
                } else {
                    seatTable[i][j] = null;//不画
                }
                hasSeatcount++;
            }
            prePos += hasSeatcount;
        }
        hasSetSeatData = true;
        return hasSetSeatData;
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            mScaleFactor *= detector.getScaleFactor(); // scale change since previous event
            mScaleFactor = Math.max(0.1f, Math.min(mScaleFactor, 6.0f));

            return true;
        }
    }

    private class MoveListener extends MoveGestureDetector.SimpleOnMoveGestureListener {
        @Override
        public boolean onMove(MoveGestureDetector detector) {
            PointF d = detector.getFocusDelta();
            eatClick = d.x > 1 || d.y > 1;
            mFocusX += d.x;
            mFocusY += d.y;

            return true;
        }
    }

    private void onChanged() {
        rowView.removeAllViews();
        rowView.setPadding(getResources().getDimensionPixelSize(R.dimen.padding_1dp),
                (int) (mFocusY), 0, 0);//上下移动
//        rowView.startAnimation(alpha);
        for (int i = 0; i < seatTableView.getRowSize(); i++) {
            TextView textView = new TextView(this);
            //座位有可能为空
            for (int j = 0; j < seatTableView.getColumnSize(); j++) {
                if (seatTable[i][j] != null) {
                    textView.setText(seatTable[i][j].rowName);
                    break;
                }
            }
            textView.setTextSize(14.0f * mScaleFactor);
            textView.setTextColor(Color.WHITE);
            textView.setGravity(Gravity.CENTER);
            textView.setLayoutParams(new ViewGroup.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT, (int) (defWidth * mScaleFactor)));
            textView.setPadding(getResources().getDimensionPixelSize(R.dimen.padding_5dp), 0,
                    getResources().getDimensionPixelSize(R.dimen.padding_5dp), 0);
            rowView.addView(textView);
        }
    }

    /**
     * 设置title的数据
     *
     * @param seatBean
     */
    private void setTitleData(SeatBean seatBean) {

    }

    private void initView() {
        seatTableView = (SeatTableView) findViewById(R.id.seatviewcont);
        rowView = (LinearLayout) findViewById(R.id.seatraw);
    }

    int[] oldClick = new int[2];
    int[] newClick = new int[2];
    boolean eatClick = true;//在缩放和移动的时候,不触发click事件

    private int minLeft;
    private int minTop;

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                oldClick = getClickPoint(event);
                eatClick = false;
                break;
            case MotionEvent.ACTION_POINTER_DOWN:
            case MotionEvent.ACTION_POINTER_UP:
            case MotionEvent.ACTION_CANCEL:
                eatClick = true;
                break;
            case MotionEvent.ACTION_UP:
                newClick = getClickPoint(event);
                int i = newClick[0];
                int j = newClick[1];
                if (!eatClick && i != -1 && j != -1 && i == oldClick[0] && j == oldClick[1]) {
                    if (seatTable[i][j].status == 1) {
                        seatTable[i][j].status = 2;
                        selectedSeat.add(seatTable[i][j]);
                        Toast.makeText(this, seatTable[i][j].seatName, Toast.LENGTH_SHORT).show();
                    } else {
                        seatTable[i][j].status = 1;
                        selectedSeat.remove(seatTable[i][j]);
                    }
                }
                break;
        }


        mScaleDetector.onTouchEvent(event);
        mMoveDetector.onTouchEvent(event);

        mMatrix.reset();
        mMatrix.postScale(mScaleFactor, mScaleFactor);
        //限定移动区域
        minLeft = (int) (defWidth * mScaleFactor * seatColumnCount) - screenWidth;
        mFocusX = minLeft > 0 ?
                Math.max(-minLeft, Math.min(mFocusX, defWidth * mScaleFactor))
                : Math.max(0, Math.min(mFocusX, defWidth * mScaleFactor));

        minTop = (int) (defWidth * mScaleFactor * seatRowCount) - seatTableView.getMeasuredHeight();
        mFocusY = minTop > 0 ? Math.max(-minTop, Math.min(mFocusY, 0)) : 0;

        seatTableView.mScaleFactor = mScaleFactor;
        seatTableView.mPosX = mFocusX;
        seatTableView.mPosY = mFocusY;
        seatTableView.invalidate();
        onChanged();

        return true;
    }

    int[] noSeat = {-1, -1};

    //click的坐标
    public int[] getClickPoint(MotionEvent event) {
        float currentXPosition = event.getX() - mFocusX;
        float currentYPosition = event.getY() - mFocusY;//修正坐标
        float area = seatTableView.getSeatWidth();
        for (int i = 0; i < seatTableView.getRowSize(); i++) {
            for (int j = 0; j < seatTableView.getColumnSize(); j++) {
                if ((j * area) < currentXPosition
                        && currentXPosition < j * area + area
                        && (i * area) < currentYPosition
                        && currentYPosition < i * area + area
                        && seatTable[i][j] != null
                        && seatTable[i][j].status >= 1) {//1 和 2  才能被点击

                    return new int[]{i, j};
                }
            }
        }
        return noSeat;
    }
}
