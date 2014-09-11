package com.chiemy.pagetransformerdemo;

import android.support.v4.view.ViewPager.PageTransformer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BgTranslatePageTransformer implements PageTransformer {
    
    //屏幕左边界position=0，右边界position=1
    public void transformPage(View view, float position) {
        int pageWidth = view.getWidth();

        if (position < -1) { // [-Infinity,-1)
            // 向左滑动，当前页面的前一页.
            view.setAlpha(0);
        } else if (position <= 1) { // [-1,1]
        	view.setAlpha(1);
			ImageView iv = (ImageView)view.findViewById(R.id.bg_image);
			iv.setTranslationX(-position*0.5f*pageWidth);

        } else { // (1,+Infinity]
        	//向右滑动，当前页面的后一页
            view.setAlpha(0);
        }
    }
}
