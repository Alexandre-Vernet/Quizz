package com.ynov.vernet.quizz;

import android.util.Log;

import java.util.concurrent.ThreadLocalRandom;

public class Questions {
    private static final String TAG = "Questions";

    public String askQuestion() {
        int randomQuestion = ThreadLocalRandom.current().nextInt(0, 10);

        String question = "Quelle est ma date de naissance ?";
        String answer1 = "1998";
        String answer2 = "1999";
        String answer3 = "2000";
        String answer4 = "2001";

        return question;
    }
}
