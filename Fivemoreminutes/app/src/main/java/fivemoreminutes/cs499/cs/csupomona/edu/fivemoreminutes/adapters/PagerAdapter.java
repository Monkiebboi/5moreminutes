package fivemoreminutes.cs499.cs.csupomona.edu.fivemoreminutes.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import fivemoreminutes.cs499.cs.csupomona.edu.fivemoreminutes.fragments.Alarm;
import fivemoreminutes.cs499.cs.csupomona.edu.fivemoreminutes.fragments.Group;

/**
 * Created by Calvin on 4/11/2015.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 1;
    private String tabTitles[] = new String[] { "Groups", "Quick Alarms"};

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new Group();
//            case 1:
//                return new Alarm();
// When adding QuickAlarms back remember to change the page count to 2.
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
