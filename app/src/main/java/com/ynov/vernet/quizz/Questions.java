package com.ynov.vernet.quizz;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Questions {
    Context context;
    Activity activity;

    TextView textViewQuestion;
    Button[] btnAnswer = new Button[4];
    String goodAnswer;

    // Debug
    private static final String TAG = "Questions";

    Questions(Context context, Activity activity) {
        this.context = context;
        this.activity = activity;

        textViewQuestion = activity.findViewById(R.id.textViewQuestion);
        btnAnswer[0] = activity.findViewById(R.id.btnAnswer_0);
        btnAnswer[1] = activity.findViewById(R.id.btnAnswer_1);
        btnAnswer[2] = activity.findViewById(R.id.btnAnswer_2);
        btnAnswer[3] = activity.findViewById(R.id.btnAnswer_3);
    }

    public String askQuestion() {

        String question;
        String[] answer = new String[4];

        // Generate random question
        Random random = new Random();
        int randomQuestion = random.nextInt(4 - 0) + 0;

        switch (randomQuestion) {
            case 0:
                question = "Question";
                answer[0] = "answer0";
                answer[1] = "answer1";
                answer[2] = "answer2";
                answer[3] = "answer3";
                break;
            case 1:
                question = "In what year was Google launched on the web?";
                answer[0] = "2001";
                answer[1] = "1999";
                answer[2] = "1998";
                answer[3] = "L'an 1";
                goodAnswer = "1998";
                break;
            case 2:
                question = "What does \"FTP\" stand for in the computer and internet world?";
                answer[0] = "Fa Ta Pa";
                answer[1] = "Force Tripe Prout";
                answer[2] = "File Transfer Protocol";
                answer[3] = "La réponse D";
                goodAnswer = "File Transfer Protocol";
                break;
            default:
                question = "What is the country top-level domain of Belgium?";
                answer[0] = ".fr";
                answer[1] = "The .be domain";
                answer[2] = ".com";
                answer[3] = ".lo";
                goodAnswer = "The .be domain";
                break;
        }

        // Display questions
        textViewQuestion.setText(question);
        for (int i = 0; i < 4; i++)
            btnAnswer[i].setText(answer[i]);

        return goodAnswer;
    }
}
