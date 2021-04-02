package com.ynov.vernet.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView textViewSolutionQuestion, textViewSolutionAnswer, textViewSolutionGoodAnswer;
    private static final String TAG = "AnswerActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        textViewSolutionQuestion = findViewById(R.id.textViewSolutionQuestion);
        textViewSolutionAnswer = findViewById(R.id.textViewSolutionAnswer);
        textViewSolutionGoodAnswer = findViewById(R.id.textViewSolutionGoodAnswer);

        // Read
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String question = prefs.getString("question", null);
        String goodAnswer = prefs.getString("goodAnswer", null);

        textViewSolutionQuestion.setText(question);
        textViewSolutionGoodAnswer.setText(goodAnswer);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(getApplicationContext(), CategoryActivity.class));
        finish();
    }
}