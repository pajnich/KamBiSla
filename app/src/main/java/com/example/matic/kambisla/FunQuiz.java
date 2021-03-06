package com.example.matic.kambisla;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FunQuiz extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_quiz);
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        LinearLayout funList = findViewById(R.id.funList);
        for (int i = 0; i < funList.getChildCount(); i++) {
            CardView cardView = (CardView) funList.getChildAt(i);
            LinearLayout funItem = (LinearLayout) cardView.getChildAt(0);
            funItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LinearLayout description = (LinearLayout) ((LinearLayout) v).getChildAt(0);
                    TextView eventName = (TextView) description.getChildAt(0);
                    Intent intent = new Intent(v.getContext(), MapActivity.class);
                    intent.putExtra("eventName", eventName.getText().toString());
                    startActivity(intent);
                }
            });
        }
    }

}
