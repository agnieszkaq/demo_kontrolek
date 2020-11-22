package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class ProgressBarActivity extends AppCompatActivity {

    private ProgressBar pg;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        progress();
    }

    public void progress() {
        pg = (ProgressBar) findViewById(R.id.progressBar);

        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                counter++;
                pg.setProgress(counter);

                if (counter == 100)
                    t.cancel();
            }
        };
        t.schedule(tt,  0, 100);
    }
}