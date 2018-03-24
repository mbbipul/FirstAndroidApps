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
        words.add(new Word("one","ek"));
        words.add(new Word("two","dui"));
        words.add(new Word("three","tin"));
        words.add(new Word("four","car"));
        words.add(new Word("five","paach"));
        words.add(new Word("six","choy"));
        words.add(new Word("seven","sat"));
        words.add(new Word("eight","aat"));
        words.add(new Word("nine","noi"));
        words.add(new Word("ten","dosh"));



        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, android.R.layout.simple_list_item_1, words);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }

}
