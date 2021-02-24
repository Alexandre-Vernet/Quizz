package com.ynov.vernet.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewQuestion;
    Button[] btnAnswer = new Button[4];
    String goodAnswer;
    int score = 0;
    int countQuestion = 0;

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

        // Get category sent via menu
        getCategory();
    }

    // Get category of question
    public void getCategory() {
        String category = getIntent().getStringExtra("category");

        switch (category) {
            // Generate question
            case "computer":
                goodAnswer = new Questions(this, this).computer();
                break;
            case "art":
                goodAnswer = new Questions(this, this).art();
                break;
            case "animals":
                goodAnswer = new Questions(this, this).animals();
                break;
        }
    }

    @Override
    public void onClick(View v) {

        // Generate 10 questions
        if (this.countQuestion >= 10) {
            gameDone();
            return;
        }

        switch (v.getId()) {
            case R.id.btnAnswer_0:
                if (goodAnswer == btnAnswer[0].getText())
                    goodAnswer();
                break;

            case R.id.btnAnswer_1:
                if (goodAnswer == btnAnswer[1].getText())
                    goodAnswer();
                break;

            case R.id.btnAnswer_2:
                if (goodAnswer == btnAnswer[2].getText())
                    goodAnswer();
                break;

            case R.id.btnAnswer_3:
                if (goodAnswer == btnAnswer[3].getText())
                    goodAnswer();
                break;
        }

        // Get next question
        new Handler().postDelayed(this::getCategory, 200);
        countQuestion++;
    }

    public void goodAnswer() {
        this.score++;
    }

    public void gameDone() {

        // Around score
        if (this.score < 0)
            this.score = 0;

        // Show score
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle(R.string.done)
                .setMessage(getString(R.string.your_score_is, this.score))
                .setPositiveButton(R.string.play_again, (dialogInterface, i) -> {

                    // Reset score
                    this.score = 0;
                    this.countQuestion = 0;

                    // Play again
                    new Handler().postDelayed(this::getCategory, 200);
                })
                .setNegativeButton(R.string.exit_to_menu, (dialogInterface, i) -> {

                    // Go to main menu
                    startActivity(new Intent(getApplicationContext(), CategoryActivity.class));
                    finish();
                })
                .show();
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.setCancelable(false);
    }

    @Override
    public void onBackPressed() {
        if (this.countQuestion >= 1) {
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle(R.string.leave)
                    .setMessage(R.string.stop_current_game)
                    .setPositiveButton(R.string.yes, (dialogInterface, i) -> {
                        super.onBackPressed();
                        startActivity(new Intent(getApplicationContext(), CategoryActivity.class));
                        finish();
                    })
                    .setNegativeButton(R.string.no, null)
                    .show();
            alertDialog.setCanceledOnTouchOutside(false);
        } else {
            startActivity(new Intent(getApplicationContext(), CategoryActivity.class));
            finish();
        }
    }
}