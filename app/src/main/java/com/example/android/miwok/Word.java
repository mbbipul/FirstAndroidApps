package com.example.android.miwok;

/**
 * Created by bb on 3/21/2018.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

     public String getDefaultTranslation() {
         return mDefaultTranslation;
     }
     public String getMiwokTranslation() {
          return mMiwokTranslation;
     }

}