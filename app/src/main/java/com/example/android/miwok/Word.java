package com.example.android.miwok;

/**
 * Created by Λάμπης on 17/3/2018.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word (String defaultTranslation,String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }
    public Word (String defaultTranslation,String miwokTranslation,int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }

        public String getmDefaultTranslation (){
            return mDefaultTranslation;
        }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId(){return mImageResourceId;}

    public boolean hasImage(){

        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
