package com.example.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.new_yorkerdk.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        //BottomNavigationMenu start
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.page_1:
                        Intent intent0 = new Intent(Contact.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.page_2:
                        Intent intent1 = new Intent(Contact.this, ProductCatalog.class);
                        startActivity(intent1);
                        break;


                    case R.id.page_3:
                        break;
                }
                return false;
            }
        });
        //BottomNavigationMenu end
    }
}