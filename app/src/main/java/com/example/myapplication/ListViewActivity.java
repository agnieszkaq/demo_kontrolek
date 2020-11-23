package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends ListActivity {
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
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, shortNames));
    }

    public void onLIstItemClick(
            ListView parent, View v, int position, long id){
        Toast.makeText(this, "You have selected" + shortNames[position], Toast.LENGTH_SHORT).show();
    }
}