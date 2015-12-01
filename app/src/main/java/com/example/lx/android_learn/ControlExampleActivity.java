package com.example.lx.android_learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.ToggleButton;

public class ControlExampleActivity extends AppCompatActivity {

    private ToggleButton btn_toggleButton;

    private RadioGroup root;

    private AutoCompleteTextView autoCompleteTextView;

    private TimePicker timePicker;


    private String[] books = new String[]{
            "疯狂Java讲义", "疯狂Ajax讲义", "疯狂XML讲义", "疯狂Workflow讲义"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_example);


        root = (RadioGroup) this.findViewById(R.id.root);
        btn_toggleButton = (ToggleButton) this.findViewById(R.id.btn_toggleButton);
        btn_toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    root.setOrientation(RadioGroup.HORIZONTAL);
                } else {
                    root.setOrientation(RadioGroup.VERTICAL);
                }
            }
        });

        autoCompleteTextView = (AutoCompleteTextView) this.findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, books);
        autoCompleteTextView.setAdapter(adapter);

        timePicker = (TimePicker) this.findViewById(R.id.time);
        timePicker.setIs24HourView(true);
    }
}
