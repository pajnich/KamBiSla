package com.example.matic.kambisla;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView coolThingsClose = findViewById(R.id.CoolThingsClose);
        CardView planDate = findViewById(R.id.PlanDate);

        coolThingsClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), FunQuiz.class);
                startActivity(intent);
            }
        });
        planDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DateQuiz.class);
                startActivity(intent);
            }
        });
    }
}
