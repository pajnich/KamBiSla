package com.example.matic.kambisla;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class DateQuiz extends AppCompatActivity {

    private Question[] questions = new Question[]{
            new Question("Kaj te zanima (izberi vsaj eno)?", new String[]{"Potovanje", "Umetnost", "Namizne igre", "Plavanje", "Knjige", "Kino", "Koncerti", "Hrana", "Telovadba", "Pohodništvo", "Zgodovina", "Kultura", "Šport", "Pijača", "Gledališče"}),
            new Question("Kaj rad ješ?", new String[]{"Kitajska hrana", "Italijanska hrana", "Tajska hrana", "Hitra hrana", "Slovenska hrana"}),
            new Question("Koliko časa imaš?", new String[]{"1 ura", "2 uri", "3 ure", "4 ure", "5 ur"}),
            new Question("Kakšen prevoz imaš?", new String[]{"Avto", "Javni prevoz", "Kolo"}),
            new Question("Kje želiš začeti?", new String[]{""}),
            new Question("Kje želiš končati?", new String[]{""})
    };
    private int questionIndex;
    private TextView questionView;
    private AnswerGrid answerGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);
        buildGUI();
        startQuiz();
    }

    private void buildGUI() {
        LinearLayout linearLayout = findViewById(R.id.dateQuiz_interest);
        linearLayout.setGravity(Gravity.CENTER_HORIZONTAL);

        questionView = new TextView(this);
        questionView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 0, 1));
        questionView.setTextSize(24);
        questionView.setGravity(Gravity.CENTER);
        linearLayout.addView(questionView);

        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 0, 8));
        linearLayout.addView(scrollView);

        answerGrid = new AnswerGrid(this);
        answerGrid.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
        scrollView.addView(answerGrid);

        LinearLayout buttonRow = new LinearLayout(this);
        buttonRow.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1));
        buttonRow.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.addView(buttonRow);

        Button backButton = new Button(this);
        backButton.setLayoutParams(new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1));
        backButton.setText("NAZAJ");
        backButton.setVisibility(View.INVISIBLE);
        buttonRow.addView(backButton);
        Button nextButton = new Button(this);
        nextButton.setLayoutParams(new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1));
        nextButton.setText("NAPREJ");
        nextButton.setBackgroundColor(Color.parseColor("#42A5F5"));
        buttonRow.addView(nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FoodActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }

    private void startQuiz() {
        questionIndex = 0;
        showNextQuestion(questionIndex);
    }

    private void showNextQuestion(int questionIndex) {
        questionView.setText(questions[questionIndex].question);
        answerGrid.addAnswers(questions[questionIndex].answers);
    }
}
