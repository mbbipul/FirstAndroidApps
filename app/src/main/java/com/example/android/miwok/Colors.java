package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("Red","Lal",R.mipmap.ic_launcher));
        colors.add(new Word("Green","Sobuj",R.mipmap.ic_launcher));
        colors.add(new Word("Brown","Badami",R.mipmap.ic_launcher));
        colors.add(new Word("Gray","Dhusor",R.mipmap.ic_launcher));
        colors.add(new Word("Black","Kalo",R.mipmap.ic_launcher));
        colors.add(new Word("White","Sada",R.mipmap.ic_launcher));
        colors.add(new Word("Orange","Komla",R.mipmap.ic_launcher));


        WordAdapter colorsAdapter = new WordAdapter(this,colors);
        ListView listView = (ListView) findViewById(R.id.list_colors);

        listView.setAdapter(colorsAdapter);
    }
}
