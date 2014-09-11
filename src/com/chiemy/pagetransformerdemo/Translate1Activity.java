package com.chiemy.pagetransformerdemo;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager.PageTransformer;

public class Translate1Activity extends BaseActivity {
	/**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 5;


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
            return new ScreenSlidePageFragment();
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }

	@Override
	protected PageTransformer getTranslatePageTransformer() {
		return new TranslatePageTransformer();
	}

	@Override
	protected FragmentStatePagerAdapter getFragmentPagerAdapter() {
		return new ScreenSlidePagerAdapter(getSupportFragmentManager());
	}
}
