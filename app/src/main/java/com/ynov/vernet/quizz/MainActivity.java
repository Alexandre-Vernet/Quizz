package com.ynov.vernet.quizz;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textViewQuestion;
    Button[] btnAnswer = new Button[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewQuestion = findViewById(R.id.textViewQuestion);
        btnAnswer[0] = findViewById(R.id.btnAnswer_1);
        btnAnswer[1] = findViewById(R.id.btnAnswer_2);
        btnAnswer[2] = findViewById(R.id.btnAnswer_3);
        btnAnswer[3] = findViewById(R.id.btnAnswer_4);

        textViewQuestion.setText(new Questions().askQuestion());
    }
}