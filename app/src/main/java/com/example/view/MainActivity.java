package com.example.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

import com.example.new_yorkerdk.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void changeActivityToProductCatalog(View view) {
        setContentView(R.layout.product_catalog);
    }

    public void changeActivityToQuotationRequest(View view) {
        setContentView(R.layout.quotation_request);
    }
}