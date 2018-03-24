package com.bluehomestudio.luckywheel;

import android.graphics.Bitmap;

/**
 * Created by mohamed on 22/04/17.
 */

public class WheelItem {


    private int color;
    private int textColor;
    private Bitmap bitmap;
    private String text;

    public WheelItem(int color) {
        this.color = color;
    }

    public WheelItem withText(String text, int textColor) {
        this.text = text;
        this.textColor = textColor;
        return this;
    }

    public WheelItem withBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
        return this;
    }

    protected int getColor() {
        return color;
    }

    protected Bitmap getBitmap() {
        return bitmap;
    }

    protected String getText() {
        return text;
    }

    protected int getTextColor() {
        return textColor;
    }
}
