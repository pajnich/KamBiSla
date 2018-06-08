package com.example.matic.kambisla;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DateQuiz extends AppCompatActivity {

    private Question[] questions = new Question[]{
            new Question("Kaj vaju zanima?", new String[]{"Potovanje", "Umetnost", "Namizne igre", "Vodni športi", "Knjige", "Kino", "Koncerti", "Hrana", "Telovadba", "Pohodništvo", "Zgodovina", "Kultura", "Športi z žogo", "Tenis", "Gledališče"}),
            new Question("Kaj rada jesta?", new String[]{"Kitajska hrana", "Italijanska hrana", "Tajska hrana", "Hitra hrana", "Slovenska hrana"}),
            new Question("Koliko časa imata?", new String[]{"1 ura", "2 uri", "3 ure", "4 ure", "5 ur"}),
            new Question("Kakšen prevoz imata?", new String[]{"Avto", "Javni prevoz", "Kolo"}),
            new Question("Kje želita začeti?", new String[]{""}),
            new Question("Kje želita končati?", new String[]{""})
    };
    private int questionIndex;
    private TextView questionView;
    private AnswerGrid answerGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_quiz);
        buildGUI();
        startQuiz();
    }

    private void buildGUI() {
        LinearLayout linearLayout = findViewById(R.id.dateQuiz);

        questionView = new TextView(this);
        questionView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1));
        linearLayout.addView(questionView);

        answerGrid = new AnswerGrid(this);
        answerGrid.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 8));
        linearLayout.addView(answerGrid);

        LinearLayout buttonRow = new LinearLayout(this);
        buttonRow.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1));
        buttonRow.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.addView(buttonRow);

        Button nextButton = new Button(this);
        nextButton.setLayoutParams(new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1));
        buttonRow.addView(nextButton);
        Button backButton = new Button(this);
        backButton.setLayoutParams(new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1));
        buttonRow.addView(backButton);
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
