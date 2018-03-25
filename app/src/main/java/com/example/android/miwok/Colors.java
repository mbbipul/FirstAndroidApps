package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("Red","Lal", R.drawable.color_red));
        colors.add(new Word("Green","Sobuj", R.drawable.color_green));
        colors.add(new Word("Brown","Badami", R.drawable.color_brown));
        colors.add(new Word("Gray","Dhusor", R.drawable.color_gray));
        colors.add(new Word("Black","Kalo", R.drawable.color_black));
        colors.add(new Word("White","Sada", R.drawable.color_white));
        colors.add(new Word("Yellow","Komla", R.drawable.color_mustard_yellow));


        WordAdapter colorsAdapter = new WordAdapter(this,colors,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(colorsAdapter);
    }
}
