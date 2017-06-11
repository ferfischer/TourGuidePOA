package com.fernandofischer.tourguidepoa;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by fernandofischer on 11/06/17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SeeFragment();
        } else if (position == 1) {
            return new DoFragment();
        } else if (position == 2) {
            return new EatFragment();
        } else {
            return new SleepFragment();
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_see);
        } else if (position == 1){
            return mContext.getString(R.string.category_do);
        } else if (position == 2) {
            return mContext.getString(R.string.category_eat);
        } else {
            return mContext.getString(R.string.category_sleep);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

}