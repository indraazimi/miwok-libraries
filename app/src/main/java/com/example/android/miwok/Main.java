package com.example.android.miwok;

import android.graphics.Color;

public class Main {
    private String category;
    private String background;

    public String getCategory() {
        return category;
    }

    public int getBackground() {
        return Color.parseColor(background);
    }
}
