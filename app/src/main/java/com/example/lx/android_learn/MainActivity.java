package com.example.lx.android_learn;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lx.android_learn.model.User;


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

    private Button btn_login;

    private Button btn_control;

    private Button btn_tabhost;

    private Button btn_dialog;

    private Button btn_menu;

    private Button btn_goIntent;

    private Button btn_simpleUserCount;

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

        btn_login = (Button) this.findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);

        btn_control = (Button) this.findViewById(R.id.btn_control);
        btn_control.setOnClickListener(this);

        btn_tabhost = (Button) this.findViewById(R.id.btn_tabhost);
        btn_tabhost.setOnClickListener(this);

        btn_dialog = (Button) this.findViewById(R.id.btn_dialog);
        btn_dialog.setOnClickListener(this);

        btn_menu = (Button) this.findViewById(R.id.btn_menu);
        btn_menu.setOnClickListener(this);

        btn_goIntent = (Button) this.findViewById(R.id.btn_goIntent);
        btn_goIntent.setOnClickListener(this);

        btn_simpleUserCount = (Button) this.findViewById(R.id.btn_simpleUserCount);
        btn_simpleUserCount.setOnClickListener(this);
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
        if (v == btn_login) {
            Intent intent = new Intent(this, LoginUIActivity.class);
            startActivity(intent);
        }
        if (v == btn_control) {
            Intent intent = new Intent(this, ControlExampleActivity.class);
            startActivity(intent);
        }
        if (v == btn_tabhost) {
            Intent intent = new Intent(this, ControlTabhostActivity.class);
            startActivity(intent);
        }
        if (v == btn_dialog) {
            Intent intent = new Intent(this, AlertDialogActivity.class);
            startActivity(intent);
        }
        if (v == btn_menu) {
            Intent intent = new Intent(this, OptionsMenuActivity.class);
            startActivity(intent);
        }
        if (v == btn_simpleUserCount) {
            Intent intent = new Intent(this, UserCountActivity.class);
            startActivity(intent);
        }

        if (v == btn_goIntent) {
            Intent intent = new Intent(this, IntentResultActivity.class);
            User u = new User();
            u.setName("lixiong");
            u.setPwd("123456");
            intent.putExtra("user", u);
            intent.putExtra("text", "text");
            startActivityForResult(intent, 11);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        Toast.makeText(this, "requestCode:" + requestCode + ",resultCode:" + resultCode + "result:" + intent.getStringExtra("result"), Toast.LENGTH_LONG).show();
        super.onActivityResult(requestCode, resultCode, intent);
    }

}
