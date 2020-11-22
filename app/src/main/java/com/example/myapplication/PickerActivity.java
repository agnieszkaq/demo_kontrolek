package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class PickerActivity extends AppCompatActivity {
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);

        timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.setIs24HourView(true);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onClick(View view) {
        Toast.makeText(getBaseContext(),
                "Time selected: " +
                        timePicker.getHour() +
                        ":" + timePicker.getMinute(),
                Toast.LENGTH_SHORT).show();
    }
}