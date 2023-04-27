package com.example.chapte_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView itemTv=findViewById(R.id.itemLv);

        String names []= {"Dhiraj","Diksha","Milan","Sanjeev","Karan","Rohan","Sugam","Nayan"};
        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(this,R.layout.list_view_item,R.id.namesTv,names);

        itemTv.setAdapter(adapter);
    }
}