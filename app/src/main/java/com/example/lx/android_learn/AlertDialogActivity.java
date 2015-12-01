package com.example.lx.android_learn;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlertDialogActivity extends AppCompatActivity {

    private Button btn_simpleDialog;

    private Button progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        btn_simpleDialog = (Button) this.findViewById(R.id.btn_simpleDialog);
        btn_simpleDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                builder.setTitle("简单消息提示");
                builder.setMessage("一个简单的提示对话框");
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                builder.create().show();

            }
        });


        final ProgressDialog.Builder progressBuilder = new ProgressDialog.Builder(this);

        progressDialog = (Button) this.findViewById(R.id.btn_progressDialog);
        progressDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressBuilder.setTitle("简单消息提示");
                progressBuilder.setMessage("一个简单的提示对话框");
                progressBuilder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                progressBuilder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                progressBuilder.create().show();

            }
        });


    }
}
