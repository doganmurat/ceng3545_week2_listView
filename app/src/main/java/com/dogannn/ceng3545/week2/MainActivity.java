package com.dogannn.ceng3545.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnArrayAdapter;
    Button btnCustomAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArrayAdapter = findViewById(R.id.btnArrayAdapter);
        btnCustomAdapter = findViewById(R.id.btnCustomAdapter);

        btnArrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, ArrayAdapterActivity.class);
                startActivity(a);

            }
        });
        btnCustomAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, CustomAdapterActivity.class);
                startActivity(a);

            }
        });
    }
}