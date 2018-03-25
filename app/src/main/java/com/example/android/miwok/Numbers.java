package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //String[] words = new String[10];
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","ek",R.drawable.number_one));
        words.add(new Word("two","dui",R.drawable.number_two));
        words.add(new Word("three","tin",R.drawable.number_three));
        words.add(new Word("four","car",R.drawable.number_four));
        words.add(new Word("five","paach",R.drawable.number_five));
        words.add(new Word("six","choy",R.drawable.number_six));
        words.add(new Word("seven","sat",R.drawable.number_seven));
        words.add(new Word("eight","aat",R.drawable.number_eight));
        words.add(new Word("nine","noi",R.drawable.number_nine));
        words.add(new Word("ten","dosh",R.drawable.number_ten));



        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }

}
