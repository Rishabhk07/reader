package me.rishabhkhanna.gitbookreader.view.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import me.rishabhkhanna.gitbookreader.R;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    public static final String TAG = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.menu_explore:
                        Log.d(TAG, "onNavigationItemSelected: Explore selected");
                        break;
                    case R.id.menu_topics:
                        Log.d(TAG, "onNavigationItemSelected: topics selected");
                        break;
                    case R.id.menu_library:
                        Log.d(TAG, "onNavigationItemSelected: library selected");
                        break;
                    case R.id.menu_author:
                        Log.d(TAG, "onNavigationItemSelected: author selected");
                        break;
                }
                return true;
            }
        });
    }
}
