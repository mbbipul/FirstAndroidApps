package com.example.android.miwok;

import android.media.Image;

/**
 * Created by bb on 3/21/2018.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private static final int NO_IMAGE = -1;
    private int miwokImages = NO_IMAGE;
    public Word(String defaultTranslation, String miwokTranslation,int miwokImage ) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        miwokImages = miwokImage;
    }
    public  Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
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

    public boolean hasImage(){
        return  miwokImages != NO_IMAGE ;
    }
}
