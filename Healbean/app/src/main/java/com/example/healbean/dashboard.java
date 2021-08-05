package com.example.healbean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import com.google.android.material.bottomnavigation.BottomNavigationView;


public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

                BottomNavigationView bottomNav = findViewById(R.id.bottomNav);
                bottomNav.setOnNavigationItemSelectedListener(navListener);

                //set Home Fragment as Default Startup Screen
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new HomeFragment()).commit();
            }

    final private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){


                        case R.id.action_home:
                            selectedFragment = new HomeFragment();
                            break;

                        case R.id.action_contact:
                            startActivity(new Intent(getApplicationContext(),ContactFragment.class));
                            finish();
                            break;

                        case R.id.logout:
                            startActivity(new Intent(getApplicationContext(),logout.class));
                            finish();
                            break;


                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, selectedFragment).commit();

                    return true;
                }
            };
}
