package com.example.lx.android_learn;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lx.android_learn.model.User;

import java.util.zip.InflaterInputStream;

public class IntentResultActivity extends AppCompatActivity {

    private Button btn_back;
    private TextView txt_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_result);

        txt_result = (TextView) this.findViewById(R.id.txt_result);
        Intent intent = getIntent();
        txt_result.setText(intent.getStringExtra("text"));

        User user = intent.getParcelableExtra("user");
        Toast.makeText(this, user.toString(), Toast.LENGTH_LONG).show();

        btn_back = (Button) this.findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent re = new Intent(IntentResultActivity.this, MainActivity.class);

                re.putExtra("result", "result");
                IntentResultActivity.this.setResult(22, re);
                IntentResultActivity.this.finish();
            }
        });
    }
}
