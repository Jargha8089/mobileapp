package com.example.mobileapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class DashboardActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private int[] iconList = {R.drawable.ic_home, R.drawable.ic_category, R.drawable.ic_profile, R.drawable.ic_settings};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        findViews();
    }
    private void findViews(){
        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);
        setViewPager();
    }

    private void setViewPager(){
        adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(),"Home");
        adapter.addFragment(new CategoryFragment(),"Category");
        adapter.addFragment(new ProfileFragment(),"Profile");
        adapter.addFragment(new SettingFragment(),"Setting");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        setIcon();
    }

    private void  setIcon(){
        tabLayout.getTabAt(0).setIcon(iconList[0]);
        tabLayout.getTabAt(1).setIcon(iconList[1]);
        tabLayout.getTabAt(2).setIcon(iconList[2]);
        tabLayout.getTabAt(3).setIcon(iconList[3]);
    }
}