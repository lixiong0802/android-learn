package com.example.lx.android_learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServicestartActivity extends AppCompatActivity {

    private Button btn_start;
    private Button btn_stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicestart);

        final Intent intent = new Intent();
        intent.setAction("com.example.lx.android_learn.service.FirstService");

        btn_start = (Button) this.findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startService(intent);
            }
        });
        btn_stop = (Button) this.findViewById(R.id.btn_stop);
        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stopService(intent);
            }
        });
    }
}
