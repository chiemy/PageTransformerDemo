package com.chiemy.pagetransformerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager.PageTransformer;

public class Translate2Activity extends BaseActivity {
	/**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 5;
	@Override
	protected PageTransformer getTranslatePageTransformer() {
		return new BgTranslatePageTransformer();
	}

	@Override
	protected FragmentStatePagerAdapter getFragmentPagerAdapter() {
		return new ScreenSlidePagerAdapter(getSupportFragmentManager());
	}
	
	/**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
        	Fragment frag =  new ScreenSlideBgPageFragment();
        	Bundle bundle = new Bundle();
        	bundle.putInt("position", position);
        	frag.setArguments(bundle);
            return frag;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
