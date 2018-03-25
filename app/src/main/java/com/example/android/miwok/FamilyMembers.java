package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("Father","baba", R.drawable.family_grandfather));
        family.add(new Word("Mother","ma", R.drawable.family_mother));
        family.add(new Word("Son","putro", R.drawable.family_son));
        family.add(new Word("Daughter","konna", R.drawable.family_daughter));
        family.add(new Word("Older Brother","dada", R.drawable.family_older_brother));
        family.add(new Word("Younger Brother","vai", R.drawable.family_younger_brother));
        family.add(new Word("Older Sister","didi", R.drawable.family_older_sister));
        family.add(new Word("Younger Sister","bon", R.drawable.family_younger_sister));
        family.add(new Word("Grandmother","thamma", R.drawable.family_grandmother));
        family.add(new Word("Grandfather","dadu", R.drawable.family_grandfather));



        WordAdapter familyAdapter = new WordAdapter(this,family,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(familyAdapter);
    }
}
