package com.ucucite.blockonemobdev;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

public class MyPagerAdapter extends FragmentStateAdapter {

    public MyPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Return the fragment based on the position
        if (position == 0) {
            return new FirstFragment(); // obs_one
        } else if (position == 1) {
            return new SecondFragment(); // obs_two
        } else {
            return new ThirdFragment(); // obs_three
        }
    }

    @Override
    public int getItemCount() {
        return 3; // Number of fragments (obs_one + obs_two)
    }
}