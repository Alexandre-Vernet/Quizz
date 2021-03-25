package com.ynov.vernet.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class AnswerActivity extends AppCompatActivity {

    private static final String TAG = "AnswerActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        // Get question's id
        int[] id = getIntent().getIntArrayExtra("id");
        getIntent().getArray
        Log.d(TAG, "onCreate: " + id);

    }
}