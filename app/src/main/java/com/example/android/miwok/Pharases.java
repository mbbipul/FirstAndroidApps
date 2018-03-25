package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Pharases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> pharases = new ArrayList<Word>();
        pharases.add(new Word("Father","baba"));
        pharases.add(new Word("Mother","ma"));
        pharases.add(new Word("Son","putro"));
        pharases.add(new Word("Daughter","konna"));
        pharases.add(new Word("Older Brother","dada"));
        pharases.add(new Word("Younger Brother","vai"));
        pharases.add(new Word("Older Sister","didi"));
        pharases.add(new Word("Younger Sister","bon"));
        pharases.add(new Word("Grandmother","thamma"));
        pharases.add(new Word("Grandfather","dadu"));



        WordAdapter familyAdapter = new WordAdapter(this,pharases,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(familyAdapter);
    }
}
