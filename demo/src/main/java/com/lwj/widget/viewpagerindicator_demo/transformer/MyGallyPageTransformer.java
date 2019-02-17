package com.lwj.widget.viewpagerindicator_demo.transformer;

import android.support.v4.view.ViewPager.PageTransformer;
import android.view.View;

/**
 *  动画 转换器
 */
public final class MyGallyPageTransformer implements PageTransformer {
    private final float MAX_SCALE = 1.2F;
    private final float MIN_SCALE = 1.0F;

    public void transformPage( View page, float position) {
        System.out.println("MyGallyPageTransformer transformPage position:" + position);
        float scaleFactor = Math.max(this.MIN_SCALE, (float)1 - Math.abs(position));
        if (position < (float)-1) {
            page.setScaleX(scaleFactor);
            page.setScaleY(scaleFactor);
        } else if (position < (float)0) {
            page.setScaleX(scaleFactor);
            page.setScaleY(scaleFactor);
        } else if (position >= (float)0 && position < (float)1) {
            page.setScaleX(scaleFactor);
            page.setScaleY(scaleFactor);
        } else if (position >= (float)1) {
            page.setScaleX(scaleFactor);
            page.setScaleY(scaleFactor);
        }

    }
}

