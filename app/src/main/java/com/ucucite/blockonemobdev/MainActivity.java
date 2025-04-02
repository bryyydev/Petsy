package com.ucucite.blockonemobdev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Set up ViewPager2
            ViewPager2 viewPager2 = findViewById(R.id.viewPager2);
            MyPagerAdapter adapter = new MyPagerAdapter(MainActivity.this);
            viewPager2.setAdapter(adapter);
        }
    }