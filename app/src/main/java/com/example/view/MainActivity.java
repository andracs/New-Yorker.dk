package com.example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.new_yorkerdk.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeActivityToProductCatalog(View view) {
        setContentView(R.layout.productcatalog);
    }

    BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.page_1:
                break;
                    // do something here
                    return true;

                case R.id.page_2:
                    // do something here
                    break;
                    return true;

                case R.id.page_3:
                    // do something here
                    break;
                    return true;
                default: return true;
            }
        }
    });
    

}
