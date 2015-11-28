package com.example.lx.android_learn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;


public class DataIntentActivity extends Activity {

    private EditText txt_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_data);

        txt_View = (EditText) this.findViewById(R.id.txt_View);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        txt_View.setText(message);
    }

}
