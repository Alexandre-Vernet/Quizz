package com.ynov.vernet.quizz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button[] btnAnswer = new Button[4];

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAnswer[0] = findViewById(R.id.btnAnswer_1);
        btnAnswer[1] = findViewById(R.id.btnAnswer_2);
        btnAnswer[2] = findViewById(R.id.btnAnswer_3);
        btnAnswer[3] = findViewById(R.id.btnAnswer_4);

        // Implement buttons
        for (int i = 0; i < 4; i++)
            btnAnswer[i].setOnClickListener(this);

        // Generate questions
        new Questions(this, this).askQuestion();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAnswer_1:
                Toast.makeText(this, "coucouuu", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnAnswer_2:
                Toast.makeText(this, "coucou 2", Toast.LENGTH_SHORT).show();

        }
    }
}