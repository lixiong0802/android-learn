package com.example.lx.android_learn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ControlImageActivity extends Activity {

    private ImageView imageView;

    private int[] images = new int[]{
            R.drawable.r1,
            R.drawable.r48,
            R.drawable.r72
    };
    int currentImg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_image);

        imageView = (ImageView) this.findViewById(R.id.imageView);
        imageView.setImageResource(images[currentImg++]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentImg == 3) {
                    currentImg = 0;
                }
                imageView.setImageResource(images[currentImg++]);
            }
        });
    }
}
