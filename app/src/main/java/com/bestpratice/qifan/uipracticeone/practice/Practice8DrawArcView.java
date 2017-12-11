package com.bestpratice.qifan.uipracticeone.practice;

/**
 * Created by user on 2017/12/4.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    Paint paint = new Paint();

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(400, 50, 700, 200, -110, 100, true, paint);
        canvas.drawArc(400, 50, 700, 200, 20, 140, false, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(400, 50, 700, 200, -180, 60, false, paint);
    }
}