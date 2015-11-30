package com.example.lx.android_learn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    public final static String EXTRA_MESSAGE = "com.example.lx.android_learn.MESSAGE";

    //点击按钮
    private Button btn_Click;

    //跳转按钮
    private Button btn_IntentActivity;

    //跳转带数据按钮
    private EditText txt_dataIntent;
    private Button btn_DataIntentActivity;

    private Button btn_Simpel_ListView;

    private Button btn_Web_View;

    private Button btn_image;

    private Button btn_textView;

    private Button btn_textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btn_Click = (Button) this.findViewById(R.id.btn_Click);
        btn_Click.setOnClickListener(this);

        btn_IntentActivity = (Button) this.findViewById(R.id.btn_IntentActivity);
        btn_IntentActivity.setOnClickListener(this);

        btn_DataIntentActivity = (Button) this.findViewById(R.id.btn_DataIntentActivity);
        btn_DataIntentActivity.setOnClickListener(this);

        txt_dataIntent = (EditText) this.findViewById(R.id.txt_dataIntent);

        btn_Simpel_ListView = (Button) this.findViewById(R.id.btn_Simpel_ListView);
        btn_Simpel_ListView.setOnClickListener(this);

        btn_Web_View = (Button) this.findViewById(R.id.btn_Web_View);
        btn_Web_View.setOnClickListener(this);

        btn_image = (Button) this.findViewById(R.id.btn_image);
        btn_image.setOnClickListener(this);

        btn_textView = (Button) this.findViewById(R.id.btn_textView);
        btn_textView.setOnClickListener(this);

        btn_textView1 = (Button) this.findViewById(R.id.btn_textView1);
        btn_textView1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v == btn_Click) {
            Toast.makeText(this, "亲亲我，爱爱我", Toast.LENGTH_SHORT).show();
        }
        if (v == btn_IntentActivity) {
            Intent intent = new Intent(this, IntentActivity.class);
            startActivity(intent);
        }
        if (v == btn_DataIntentActivity) {
            Intent intent = new Intent(this, DataIntentActivity.class);
            intent.putExtra(EXTRA_MESSAGE, txt_dataIntent.getText().toString());
            startActivity(intent);
        }
        if (v == btn_Simpel_ListView) {
            Intent intent = new Intent(this, ControlListView.class);
            startActivity(intent);
        }

        if (v == btn_Web_View) {
            Intent intent = new Intent(this, ControlWebView.class);
            startActivity(intent);
        }

        if (v == btn_image) {
            Intent intent = new Intent(this, ControlImageActivity.class);
            startActivity(intent);
        }
        if (v == btn_textView) {
            Intent intent = new Intent(this, ControlTextViewActivity.class);
            startActivity(intent);
        }
        if (v == btn_textView1) {
            Intent intent = new Intent(this, ControlTextView1Activity.class);
            startActivity(intent);
        }
    }
}
