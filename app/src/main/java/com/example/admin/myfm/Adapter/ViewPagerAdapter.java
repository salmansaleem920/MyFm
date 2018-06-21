package com.example.admin.myfm.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.admin.myfm.Activity.MainActivity;
import com.example.admin.myfm.Fragment.FacebookFragment;
import com.example.admin.myfm.Fragment.MyFmFragment;
import com.example.admin.myfm.Fragment.TwitterFragment;

/**
 * Created by viaviweb-2 on 22-Apr-17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    int mNumOfTabs;

    public ViewPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                MyFmFragment tab1 = new MyFmFragment();
                MainActivity.onBackPress = true;
                return tab1;
            case 1:
                FacebookFragment tab2 = new FacebookFragment();
                return tab2;
            case 2:
                TwitterFragment tab3 = new TwitterFragment();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}