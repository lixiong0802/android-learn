package com.example.lx.android_learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ControlListView extends AppCompatActivity {

    private ListView list_View;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_listview);

        list_View = (ListView) this.findViewById(R.id.list_View);


        list_View.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getData()));
    }


    public List<String> getData() {

        List<String> data = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            data.add("测试数据" + i + 1);
        }

        return data;
    }
}
