package com.ynov.vernet.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewQuestion;
    Button[] btnAnswer = new Button[4];
    String goodAnswer;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewQuestion = findViewById(R.id.textViewQuestion);

        // Buttons
        btnAnswer[0] = findViewById(R.id.btnAnswer_0);
        btnAnswer[1] = findViewById(R.id.btnAnswer_1);
        btnAnswer[2] = findViewById(R.id.btnAnswer_2);
        btnAnswer[3] = findViewById(R.id.btnAnswer_3);

        // Implement buttons
        for (int i = 0; i < 4; i++)
            btnAnswer[i].setOnClickListener(this);

        getCategory();
    }

    // Get category
    public String getCategory() {
        String category = getIntent().getStringExtra("category");

        switch (category) {
            // Generate question
            case "computer":
                goodAnswer = new Questions(this, this).computer();
                break;
            case "art":
                goodAnswer = new Questions(this, this).art();
                break;
        }

        return category;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAnswer_0:
                if (goodAnswer == btnAnswer[0].getText())
                    goodAnswer();
                else
                    badAnswer();
                break;

            case R.id.btnAnswer_1:
                if (goodAnswer == btnAnswer[1].getText())
                    goodAnswer();
                else
                    badAnswer();
                break;

            case R.id.btnAnswer_2:
                if (goodAnswer == btnAnswer[2].getText())
                    goodAnswer();
                else
                    badAnswer();
                break;

            case R.id.btnAnswer_3:
                if (goodAnswer == btnAnswer[3].getText())
                    goodAnswer();
                else
                    badAnswer();
                break;
        }
    }

    public void goodAnswer() {
        Snackbar.make(textViewQuestion, "Good answer !", 500)
                .show();

        // Wait 1/4 s and show next question
        new Handler().postDelayed(() -> getCategory(), 500);
    }


    public void badAnswer() {
        Snackbar.make(findViewById(R.id.btnAnswer_3), "Bad answer !", Snackbar.LENGTH_SHORT)
                .show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), CategoryActivity.class));
        finish();
    }
}