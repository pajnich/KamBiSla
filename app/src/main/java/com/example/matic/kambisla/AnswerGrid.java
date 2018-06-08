package com.example.matic.kambisla;

import android.content.Context;
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
            TextView answerView = new TextView(context);
            answerView.setLayoutParams(new LinearLayout.LayoutParams(200, 100));
            answerView.setText(answer);
            addView(answerView);
        }
    }
}
