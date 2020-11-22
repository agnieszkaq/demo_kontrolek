package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextActivity extends AppCompatActivity {

    String[] shortNames = {
            "Aga",
            "Agu",
            "Agula",
            "Agusia",
            "Aguśka",
            "Agniesia",
            "Agniecha",
            "Agnieszka"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,shortNames);
        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.AutoCompleteViewTxt);
        textView.setThreshold(3);
        textView.setAdapter(adapter);

    }
}