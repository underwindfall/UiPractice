package com.qifan.uipractice3.practice;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;

/**
 * Created by Qifan on 2018/8/24.
 */
class PaintCodeShadow {
    int color;
    float dx, dy;
    private float radius;
    private BlurMaskFilter blurMaskFilter;

    PaintCodeShadow() {

    }

    PaintCodeShadow(int color, float dx, float dy, float radius) {
        this.get(color, dx, dy, radius);
    }

    PaintCodeShadow get(int color, float dx, float dy, float radius) {
        this.color = color;
        this.dx = dx;
        this.dy = dy;

        if (this.radius != radius) {
            this.blurMaskFilter = null;
            this.radius = radius;
        }

        return this;
    }

    void setBlurOfPaint(Paint paint) {
        if (this.radius <= 0)
            return;

        if (this.blurMaskFilter == null)
            this.blurMaskFilter = new BlurMaskFilter(this.radius, BlurMaskFilter.Blur.NORMAL);

        paint.setMaskFilter(this.blurMaskFilter);
    }
}
