package com.example.matic.kambisla;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;

class FunCardView extends CardView {

    TextView name;
    TextView location;
    TextView operatingHours;
    ImageView image;

    public FunCardView(@NonNull Context context) {
        super(context);
        addView(createTextView(context));
    }

    private TextView createTextView(Context context) {
        TextView textView = new TextView(context);
        textView.setWidth(100);
        textView.setHeight(100);
        textView.setBackgroundColor(Color.BLUE);
        return textView;
    }
}