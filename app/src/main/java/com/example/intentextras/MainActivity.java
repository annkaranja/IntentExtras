package com.example.intentextras;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etAge;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName = findViewById(R.id.etName);
                etAge = findViewById(R.id.etAge);
                Intent myIntent = new Intent(getBaseContext(), ReceiverActivity1.class);
                String name = etName.getText().toString();
                String age = etAge.getText().toString();
                myIntent.putExtra("etName", name);
                myIntent.putExtra("etAge", age);
                startActivity(myIntent);


                btnSend.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), RecieverActivity1.class);
                        intent.putExtra("Ann Karanja", 16);
                        startActivity(intent);
                    }
                });

            }

        });
    }
}