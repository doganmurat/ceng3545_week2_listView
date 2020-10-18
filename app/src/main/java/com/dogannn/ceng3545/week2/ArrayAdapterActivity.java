package com.dogannn.ceng3545.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class ArrayAdapterActivity extends ListActivity {

    static final String[] ANIMALS = new String[] {"Ant","Cat","Dog","Monkey"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_array_adapter,ANIMALS));

        getListView().setTextFilterEnabled(true);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ArrayAdapterActivity.this,"a", Toast.LENGTH_LONG).show();
            }
        });

    }
}