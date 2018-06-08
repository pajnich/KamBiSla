package com.example.matic.kambisla;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

class AnswerGrid extends GridLayout{
    Context context;

    public AnswerGrid(Context context) {
        super(context);
        this.context = context;
        setColumnCount(3);
    }


    public void addAnswers(String[] answers) {
        setRowCount(answers.length / 3 + 1);
        for (String answer :
                answers) {
            AnswerCard answerCard = new AnswerCard(context);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(300, 300);
            params.setMargins(2,2,2,2);
            answerCard.setLayoutParams(params);

            TextView answerView = new TextView(context);
            answerView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            answerView.setText(answer);
            answerView.setGravity(Gravity.CENTER);
            answerCard.addView(answerView);

            addView(answerCard);
        }
    }
}
