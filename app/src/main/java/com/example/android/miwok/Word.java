package com.example.android.miwok;

import android.media.Image;

/**
 * Created by bb on 3/21/2018.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;
    private int miwokImages;
    public Word(String defaultTranslation, String miwokTranslation,int miwokImage ) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        miwokImages = miwokImage;
    }

     public String getDefaultTranslation() {
         return mDefaultTranslation;
     }
     public String getMiwokTranslation() {
          return mMiwokTranslation;
     }

    public int getMiwokImage() {
        return miwokImages;
    }
}
