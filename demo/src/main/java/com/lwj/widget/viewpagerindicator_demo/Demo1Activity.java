package com.lwj.widget.viewpagerindicator_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.lwj.widget.viewpagerindicator.ViewPagerIndicator;
import com.lwj.widget.viewpagerindicator_demo.adapter.MyViewpagerAdapter;
import com.lwj.widget.viewpagerindicator_demo.transformer.MyGallyPageTransformer;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试的相关的 activity
 * @author Administrator
 * @Title ${name}
 * @ProjectName ViewPagerIndicator
 * @Description: TODO
 * @date 2019/2/1613:08
 */
public class Demo1Activity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<Integer> list=new ArrayList<Integer>();
    private ViewPagerIndicator  mViewPagerIndicator;
    static  final int allNum=10000;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);

        viewPager =  (ViewPager) findViewById(R.id.vp);
        viewPager.setOffscreenPageLimit(3);

        //向集合中 加入 mipmap对象
        list.add(R.mipmap.iv_lunbo1);
        list.add(R.mipmap.iv_lunbo2);
        list.add(R.mipmap.iv_lunbo3);

        int num = list.size();  // 100/7=14..2    7*7=49  20/7=2..6   7   30/7=4..2    14   40/7=5..5   14
        int firstIndex = 0;
        if (num > 0) {
            firstIndex = allNum / num / 2 * num;
        }

        mViewPagerIndicator = (ViewPagerIndicator)findViewById(R.id.indicator_line);

        viewPager.setPageMargin(getResources().getDimensionPixelSize(R.dimen.viewpager_margin));
        viewPager.setPageTransformer(true, new MyGallyPageTransformer());
        viewPager.setAdapter(new MyViewpagerAdapter(list, this));
        mViewPagerIndicator.setViewPager(viewPager,list.size());

        /**
         *  设置Pager转换器
         */
        viewPager.setCurrentItem(firstIndex);
    }
}
