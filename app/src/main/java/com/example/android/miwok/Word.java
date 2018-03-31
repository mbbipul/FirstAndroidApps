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
    private int mAudioResourceId;
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,
                int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        miwokImages = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
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
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
}
