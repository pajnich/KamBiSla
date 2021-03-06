package com.example.matic.kambisla;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

class AnswerCard extends CardView {
    private boolean selected;

    public AnswerCard(Context context) {
        super(context);
        selected = false;
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!selected) {
                    setBackgroundColor(Color.parseColor("#42A5F5"));
                    selected = true;
                } else {
                    setBackgroundColor(Color.WHITE);
                    selected = false;
                }
            }
        });
        setCardElevation(2);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(200, 200);
        params.setMargins(2, 2, 2, 2);
        setLayoutParams(params);
    }
}
