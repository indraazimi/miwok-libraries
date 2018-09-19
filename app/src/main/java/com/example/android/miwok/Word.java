/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Miwok translation, and an image for that word.
 */
public class Word implements Parcelable {

    /** Default translation for the word */
    @SerializedName("defaultWord")
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    @SerializedName("miwokWord")
    private String mMiwokTranslation;

    /** Image name for the word */
    @SerializedName("image")
    private String mImageName;

    protected Word(Parcel in) {
        mDefaultTranslation = in.readString();
        mMiwokTranslation = in.readString();
        mImageName = in.readString();
    }

    public static final Creator<Word> CREATOR = new Creator<Word>() {
        @Override
        public Word createFromParcel(Parcel in) {
            return new Word(in);
        }

        @Override
        public Word[] newArray(int size) {
            return new Word[size];
        }
    };

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the image name of the word.
     */
    public String getImageName() {
        return mImageName;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return !TextUtils.isEmpty(mImageName);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mDefaultTranslation);
        dest.writeString(mMiwokTranslation);
        dest.writeString(mImageName);
    }
}