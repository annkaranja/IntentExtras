package com.example.intentextras;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class ReceiverActivity extends AppCompactibility {
    TextView tvName;
    TextView tvAge;

    @override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvName = findViewById(R.id.tvName);
        tvAge = findViewById(R.id.tvAge);

    }

}




