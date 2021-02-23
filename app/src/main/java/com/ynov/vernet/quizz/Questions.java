package com.ynov.vernet.quizz;

import android.app.Activity;
import android.content.Context;
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

    public String computer() {

        String question;
        String[] answer = new String[4];

        // Generate random question
        Random random = new Random();
        int randomQuestion = random.nextInt(7 - 0) + 0;

        switch (randomQuestion) {
            case 0:
                question = "What is the name of the network of computers from which the Internet has emerged?";
                answer[0] = "Arpanet";
                answer[1] = "Internet";
                answer[2] = "MySpace";
                answer[3] = "Extranet";
                goodAnswer = "Arpanet";
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
            case 3:
                question = "Which unit is an indication for the sound quality of MP3?";
                answer[0] = "mp3";
                answer[1] = "Kp";
                answer[2] = "Pps";
                answer[3] = "Kbps";
                goodAnswer = "Kbps";
                break;
            case 4:
                question = "In computing what is Ram short for?";
                answer[0] = "Rare Access Military";
                answer[1] = "Random Access Memory";
                answer[2] = "Ram doesn't exist";
                answer[3] = "Royal Air Maroc";
                goodAnswer = "Random Access Memory";
                break;
            case 5:
                question = "In which Nintendo DS game do you have to raise a puppy as well as possible?";
                answer[0] = "Nintendogs";
                answer[1] = "Animal crossing";
                answer[2] = "Super Mario";
                answer[3] = "Little Horse";
                goodAnswer = "Nintendogs";
                break;
            case 6:
                question = "What does USB stand for in the computer world?";
                answer[0] = "Universe Setup Bios";
                answer[1] = "Universal Secret Bus";
                answer[2] = "Use Scratch Bitch";
                answer[3] = "Universal Serial Bus";
                goodAnswer = "Universal Serial Bus";
                break;
            default:
                question = "What is the country top-level domain of Belgium?";
                answer[0] = ".fr";
                answer[1] = "The .be domain";
                answer[2] = ".com";
                answer[3] = ".lo";
                goodAnswer = "The .be domain";
        }

        // Display questions
        textViewQuestion.setText(question);
        for (int i = 0; i < 4; i++)
            btnAnswer[i].setText(answer[i]);

        return goodAnswer;
    }
    public String art() {

        String question;
        String[] answer = new String[4];

        // Generate random question
        Random random = new Random();
        int randomQuestion = random.nextInt(4 - 0) + 0;

        switch (randomQuestion) {
            case 0:
                question = "What color are often the domes of churches in Russia?";
                answer[0] = "Yello colored";
                answer[1] = "Gold colored";
                answer[2] = "Blue colored";
                answer[3] = "Red colored";
                goodAnswer = "Gold colored";
                break;
            case 1:
                question = "In which Spanish city did the Joan Miro museum open in 1975?";
                answer[0] = "Barcelona";
                answer[1] = "Seville";
                answer[2] = "Madrid";
                answer[3] = "Malaga";
                goodAnswer = "Barcelona";
                break;
            case 2:
                question = "In which country was the famous painter El Greco born?";
                answer[0] = "Greece";
                answer[1] = "London";
                answer[2] = "Paris";
                answer[3] = "Russia";
                goodAnswer = "Greece";
                break;
            case 3:
                question = "In which city is the composer Frederic Chopin buried?";
                answer[0] = "Paris";
                answer[1] = "Marseille";
                answer[2] = "Bordeaux";
                answer[3] = "Clermont-Ferrand";
                goodAnswer = "Paris";
                break;
            case 4:
                question = "Who did paint the famous painting Guernica?";
                answer[0] = "Monet";
                answer[1] = "Van Gogh";
                answer[2] = "Picasso";
                answer[3] = "Manet";
                goodAnswer = "Picasso";
                break;
            case 5:
                question = "In which city did Romeo and Julia live?";
                answer[0] = "Verona";
                answer[1] = "Rome";
                answer[2] = "Paris";
                answer[3] = "London";
                goodAnswer = "Verona";
                break;
            case 6:
                question = "Which famous French engineer designed two bridges for the city of Porto?";
                answer[0] = "Nikolas Tesla";
                answer[1] = "James Watt";
                answer[2] = "Thomas Edison";
                answer[3] = "Gustave Eiffel";
                goodAnswer = "Gustave Eiffel";
                break;
            case 7:
                question = "In which English town did Adolf Hitler study art?";
                answer[0] = "Berlin";
                answer[1] = "James Watt";
                answer[2] = "Manchester";
                answer[3] = "Liverpool";
                goodAnswer = "Liverpool";
                break;
            case 8:
                question = "Who was the original author of Dracula?";
                answer[0] = "Antoine de Saint Exupery";
                answer[1] = "Bram Stoker";
                answer[2] = "Charles Beaudelaire";
                answer[3] = "Emile Zola";
                goodAnswer = "Bram Stoker";
                break;
            default:
                question = "In which city can you see Michelangelo's David?";
                answer[0] = "New-York";
                answer[1] = "Bordeaux";
                answer[2] = "Florence";
                answer[3] = "Bruxelles";
                goodAnswer = "Florence";
        }

        // Display questions
        textViewQuestion.setText(question);
        for (int i = 0; i < 4; i++)
            btnAnswer[i].setText(answer[i]);

        return goodAnswer;
    }
}