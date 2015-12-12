package com.example.lx.android_learn;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lx.android_learn.service.BindSerivce;

public class ServiceDemoActivity extends AppCompatActivity {

    Button bind, unbind, serviceStatus;

    //保存所启动的Service的IBinder对象
    BindSerivce.MyBinder binder;

    //定义一个ServiceConnection对象
    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            System.out.println("---------ServiceConnected---------");

            //获取service的onbind方法返回的myBinder对象
            binder = (BindSerivce.MyBinder) service;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            System.out.println("---------ServiceDisconnected---------");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_demo);

        bind = (Button) this.findViewById(R.id.btn_bind);
        unbind = (Button) this.findViewById(R.id.btn_unbind);
        serviceStatus = (Button) this.findViewById(R.id.btn_serviceStatus);

        final Intent intent = new Intent();
        intent.setAction("com.example.lx.android_learn.service.BindSerivce");

        bind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindService(intent, conn, Service.BIND_AUTO_CREATE);
            }
        });

        unbind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unbindService(conn);
            }
        });

        serviceStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ServiceDemoActivity.this, "service的count值为：" + binder.getCount(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
