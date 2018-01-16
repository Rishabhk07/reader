package me.rishabhkhanna.gitbookreader.view.activities;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;

import me.rishabhkhanna.gitbookreader.R;
import me.rishabhkhanna.gitbookreader.models.Author;
import me.rishabhkhanna.gitbookreader.utils.BottomNavigationHelper;
import me.rishabhkhanna.gitbookreader.view.fragments.AuthorFragment;
import me.rishabhkhanna.gitbookreader.view.fragments.ExploreFragment;
import me.rishabhkhanna.gitbookreader.view.fragments.LibraryFragment;
import me.rishabhkhanna.gitbookreader.view.fragments.TopicsFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    public static final String TAG = "";
    private ExploreFragment exploreFragment = null;
    private TopicsFragment topicsFragment = null;
    private LibraryFragment libraryFragment = null;
    private AuthorFragment authorFragment = null;
    private FrameLayout frameLayout = null;
    FragmentManager fragmentManager = null;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AHBottomNavigation bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);
        frameLayout = (FrameLayout) findViewById(R.id.targetFragment);
        BottomNavigationHelper.Companion.setupBottomNavigationView(bottomNavigation);
        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                Log.d(TAG, "onTabSelected: " + position);
                switch (position) {
                    case 0:
                        if (exploreFragment == null) {
                            exploreFragment = new ExploreFragment();
                        }
                        setFragment(exploreFragment);
                        break;
                    case 1:
                        if (topicsFragment == null) {
                            topicsFragment = new TopicsFragment();
                        }
                        setFragment(topicsFragment);
                        Log.d(TAG, "two ");
                        break;
                    case 2:
                        if (libraryFragment == null) {
                            libraryFragment = new LibraryFragment();
                        }
                        setFragment(libraryFragment);
                        Log.d(TAG, "three");
                        break;
                    case 3:
                        if (authorFragment == null) {
                            authorFragment = new AuthorFragment();
                        }
                        setFragment(authorFragment);
                        Log.d(TAG, "four");
                        break;
                }
                return true;
            }
        });
    }

    private void setFragment(Fragment fragment) {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.targetFragment, fragment).commit();
    }


}
