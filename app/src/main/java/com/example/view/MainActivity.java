package com.example.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.new_yorkerdk.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //BottomNavigationMenu start
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
                        Intent intent1 = new Intent(MainActivity.this, ProductCatalog.class);
                        startActivity(intent1);
                        break;

                    case R.id.page_3:
                        Intent intent2 = new Intent(MainActivity.this, Contact.class);
                        startActivity(intent2);
                        break;
                }
                return false;
            }
        });
    }
    //BottomNavigationMenu end

    public void changeActivityToProductCatalog(View view) {
        setContentView(R.layout.product_catalog);
    }

    public void changeActivityToQuotationRequest(View view) {
        setContentView(R.layout.quotation_request);
    }
}