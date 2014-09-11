package com.chiemy.pagetransformerdemo;

import android.support.v4.view.ViewPager.PageTransformer;
import android.view.View;
import android.view.ViewGroup;

public class TranslatePageTransformer implements PageTransformer {
    
    //屏幕左边界position=0，右边界position=1
    public void transformPage(View view, float position) {
        int pageWidth = view.getWidth();
        int pageHeight = view.getHeight();

        if (position < -1) { // [-Infinity,-1)
            // 向左滑动，当前页面的前一页.
            view.setAlpha(0);
        } else if (position <= 1) { // [-1,1]
        	view.setAlpha(1);
        	View contentView = view.findViewById(R.id.content);
        	if(contentView instanceof ViewGroup){
        		ViewGroup vg = (ViewGroup) contentView;
        		for(int i = 0 ; i < vg.getChildCount() ; i++){
        			View child = vg.getChildAt(i);
        			float factor = (float) (Math.random() * 2);
        			if(child.getTag() != null){
        				factor = (float) child.getTag();
        			}else{
        				child.setTag(factor);
        			}
        			child.setTranslationX(position * factor * pageWidth);
        		}
        	}

        } else { // (1,+Infinity]
        	//向右滑动，当前页面的后一页
            view.setAlpha(0);
        }
    }
}
