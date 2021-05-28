package com.example.view;

import android.view.Menu;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.new_yorkerdk.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//Bundmenu
    BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

    Menu menu = bottomNavigationView.getMenu();
    MenuItem menuItem = menu.getItem(0);
    menuItem.setChecked(true);

    bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {

                case R.id.page_1:
                    break;


                case R.id.page_2:
                    Intent intent1 = new Intent(MainActivity.this, ActivityOne.class);
                    startActivity(intent1);

                    break;


                case R.id.page_3:
                    Intent intent2 = new Intent(MainActivity.this, ActivityTwo.class);
                    startActivity(intent2);

                    break;
            }
            return false;
        }
        });
    }

    public void changeActivityToProductCatalog(View view) {
        setContentView(R.layout.productcatalog);
    }
}


