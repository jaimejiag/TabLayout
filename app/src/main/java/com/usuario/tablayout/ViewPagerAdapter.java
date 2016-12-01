package com.usuario.tablayout;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by usuario on 30/11/16.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private int tabCount;
    private Context context;

    public ViewPagerAdapter(FragmentManager fm, int tabCount, Context context) {
        super(fm);
        this.tabCount = tabCount;
        this.context = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        super.getPageTitle(position);
        return context.getResources().getStringArray(R.array.tabs)[position];
    }

    @Override
    public Fragment getItem(int position) {
        CustomFragment fragment = null;
        Bundle arguments = new Bundle();

        switch (position) {
            case 0:
                arguments.putString(CustomFragment.KEY_REG_TEXT, "Tab 1");
                fragment = CustomFragment.newInstance(arguments);
                break;

            case 1:
                arguments.putString(CustomFragment.KEY_REG_TEXT, "Tab 2");
                fragment = CustomFragment.newInstance(arguments);
                break;

            case 2:
                arguments.putString(CustomFragment.KEY_REG_TEXT, "Tab 3");
                fragment = CustomFragment.newInstance(arguments);
                break;

            case 3:
                arguments.putString(CustomFragment.KEY_REG_TEXT, "Tab 4");
                fragment = CustomFragment.newInstance(arguments);
                break;

            case 4:
                arguments.putString(CustomFragment.KEY_REG_TEXT, "Tab 5");
                fragment = CustomFragment.newInstance(arguments);
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
