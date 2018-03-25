package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        //String[] words = new String[10];
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","ek",R.mipmap.ic_launcher));
        words.add(new Word("two","dui",R.mipmap.ic_launcher));
        words.add(new Word("three","tin",R.mipmap.ic_launcher));
        words.add(new Word("four","car",R.mipmap.ic_launcher));
        words.add(new Word("five","paach",R.mipmap.ic_launcher));
        words.add(new Word("six","choy",R.mipmap.ic_launcher));
        words.add(new Word("seven","sat",R.mipmap.ic_launcher));
        words.add(new Word("eight","aat",R.mipmap.ic_launcher));
        words.add(new Word("nine","noi",R.mipmap.ic_launcher));
        words.add(new Word("ten","dosh",R.mipmap.ic_launcher));



        WordAdapter itemsAdapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }

}
