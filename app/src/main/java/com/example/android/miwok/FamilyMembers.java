package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
        ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("Father","baba",R.mipmap.ic_launcher));
        family.add(new Word("Mother","ma",R.mipmap.ic_launcher));
        family.add(new Word("Son","putro",R.mipmap.ic_launcher));
        family.add(new Word("Daughter","konna",R.mipmap.ic_launcher));
        family.add(new Word("Older Brother","dada",R.mipmap.ic_launcher));
        family.add(new Word("Younger Brother","vai",R.mipmap.ic_launcher));
        family.add(new Word("Older Sister","didi",R.mipmap.ic_launcher));
        family.add(new Word("Younger Sister","bon",R.mipmap.ic_launcher));
        family.add(new Word("Grandmother","thamma",R.mipmap.ic_launcher));
        family.add(new Word("Grandfather","dadu",R.mipmap.ic_launcher));



        WordAdapter familyAdapter = new WordAdapter(this,family);
        ListView listView = (ListView) findViewById(R.id.list_family_member);

        listView.setAdapter(familyAdapter);
    }
}
