package com.example.lx.android_learn;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UserCountActivity extends AppCompatActivity {

    private Button btn_userCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_count);

        btn_userCount = (Button) this.findViewById(R.id.btn_userCount);
        btn_userCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferences = getSharedPreferences("text_2015.12.12", MODE_PRIVATE);
                int count = sharedPreferences.getInt("count", 0);
                Toast.makeText(UserCountActivity.this, count + "", Toast.LENGTH_SHORT).show();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("count", ++count);
                editor.commit();
            }
        });
    }
}
