package com.example.bottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    private HomeFragment homeFragment;
    private DealsFragment dealsFragment;
    private SearchFragment searchFragment;
    private WhereFragment whereFragment;
    private OthersFragment othersFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainFrame = (FrameLayout) findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView) findViewById(R.id.main_nav);

        homeFragment = new HomeFragment();
        dealsFragment = new DealsFragment();
        searchFragment = new SearchFragment();
        whereFragment = new WhereFragment();
        othersFragment = new OthersFragment();

        setFragment(homeFragment);

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.nav_home:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment(homeFragment);
                        return true;
                    case R.id.nav_deals:
                        mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(dealsFragment);
                        return true;
                    case R.id.nav_find:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                        setFragment(searchFragment);
                        return true;
                    case R.id.nav_where:
                        mMainNav.setItemBackgroundResource(R.color.colorMyYellow);
                        setFragment(whereFragment);
                        return true;
                    case R.id.nav_others:
                        mMainNav.setItemBackgroundResource(R.color.colorMyGreen);
                        setFragment(othersFragment);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }
}
