package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String tag = "spr";
    private Button progressBarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(tag, "create");
        progressBarBtn = findViewById(R.id.progressBarBtn);
        progressBarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProgressBarActivity();
            }
        });

    }
    public void openProgressBarActivity() {
        Intent intent = new Intent(this, ProgressBarActivity.class);
        startActivity(intent);
    }

    public void onStart() {
        super.onStart();
        Log.i(tag, "onStart");
    }

    public void onRestart() {
        super.onRestart();
        Log.i(tag, "onRestart");
    }

    public void onResume() {
        super.onResume();
        Log.i(tag, "onResume");
    }

    public void onPause() {
        super.onPause();
        Log.i(tag, "onPause");
    }

    public void onStop() {
        super.onStop();
        Log.i(tag, "onStop");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(tag, "onDestroy");
    }
}