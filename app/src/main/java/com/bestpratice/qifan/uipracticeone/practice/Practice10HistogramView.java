package com.bestpratice.qifan.uipracticeone.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by user on 2017/12/4.
 */

public class Practice10HistogramView extends View {
    private final int PADDING = 30;//间隔
    private final int WIDTH_ITEM = 120;//宽度
    private final int startXOffset = 10;
    private final int startYOffset = 100;
    private final int height = 400;
    int[] heights = {5, 30, 25, 150, 200, 250, 125};
    String[] lables = {"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};
    private Paint mCoordinatePaint;
    private Paint mRectPaint;
    private Paint mTextPaint;
    private int width;


    public Practice10HistogramView(Context context) {
        super(context);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mCoordinatePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mCoordinatePaint.setColor(Color.WHITE);
        mCoordinatePaint.setStrokeWidth(5);
        mRectPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mRectPaint.setColor(0xff72B916);
        mRectPaint.setStyle(Paint.Style.FILL);
        mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mTextPaint.setColor(Color.WHITE);
        mTextPaint.setTextSize(30);
        int size = lables.length;
        width = size * WIDTH_ITEM + (size + 1) * PADDING;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        canvas.drawLine(startXOffset, startYOffset, startXOffset, startYOffset + height, mCoordinatePaint);
        canvas.drawLine(startXOffset, startYOffset + height, startXOffset + width, startYOffset + height, mCoordinatePaint);
        int lastPosition = startXOffset - WIDTH_ITEM;
        for (int i = 0; i < lables.length; i++) {
            canvas.drawRect(lastPosition + WIDTH_ITEM + PADDING, startYOffset + height - heights[i], lastPosition + WIDTH_ITEM * 2 + PADDING, startYOffset + height, mRectPaint);
            canvas.drawText(lables[i], lastPosition + WIDTH_ITEM + PADDING + (WIDTH_ITEM - mTextPaint.measureText(lables[i])) / 2, startYOffset + height + 60, mTextPaint);
            lastPosition = lastPosition + WIDTH_ITEM + PADDING;
        }
    }
}
