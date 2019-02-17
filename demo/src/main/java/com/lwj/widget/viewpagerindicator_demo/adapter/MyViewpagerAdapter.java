package com.lwj.widget.viewpagerindicator_demo.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.lwj.widget.viewpagerindicator_demo.R;

import java.util.List;

public final class MyViewpagerAdapter extends PagerAdapter {
    private List list;
    private Context context;
    private int xinWidth;
    private int xinHeight;

    public boolean isViewFromObject( View view,  Object object) {
        return view == object;
    }

    public int getCount() {
        return 10000;
    }

    public Object instantiateItem( ViewGroup container, int position) {
        ImageView vp_iv = new ImageView(this.context);
        Context var10004 = this.context;
        LayoutParams var10001 = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,(int)var10004.getResources().getDimension(R.dimen.viewpager_height));

        vp_iv.setLayoutParams(var10001);
        vp_iv.setScaleType(ScaleType.FIT_XY);
        List var4 = this.list;
        List var10003 = this.list;
        vp_iv.setImageResource(((Number)var4.get(position % var10003.size())).intValue());
        container.addView((View)vp_iv);
        return vp_iv;
    }

    public void destroyItem( ViewGroup container, int position,  Object object) {
        container.removeView((View)object);
    }

    public MyViewpagerAdapter( List list,  Context context) {
        super();
        this.context = context;
        this.list = list;
    }
}
