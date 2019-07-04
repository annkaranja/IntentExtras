package com.example.intentextras;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ReceiverActivity1 extends AppCompatActivity {
    TextView tvName;
    TextView tvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvName = findViewById(R.id.tvName);
        tvAge = findViewById(R.id.tvAge);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("etName");
            String age = extras.getString("etAge");
            tvName.setText(name);
            tvAge.setText(age);
        }
    }
}
