package me.rishabhkhanna.gitbookreader.view.activities;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;

import me.rishabhkhanna.gitbookreader.R;
import me.rishabhkhanna.gitbookreader.utils.BottomNavigationHelper;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    public static final String TAG = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AHBottomNavigation bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);
        BottomNavigationHelper.Companion.setupBottomNavigationView(bottomNavigation);
    }
}
