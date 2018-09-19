package com.example.android.miwok;

import android.graphics.Color;

import java.util.ArrayList;

public class Main {
    private String category;
    private String background;
    private ArrayList<Word> wordList;

    public String getCategory() {
        return category;
    }

    public int getBackground() {
        return Color.parseColor(background);
    }

    public ArrayList<Word> getWordList() {
        return wordList;
    }
}
