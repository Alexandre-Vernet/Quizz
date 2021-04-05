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


    public String art() {

        String question;
        String[] answer = new String[4];

        // Generate random question
        Random random = new Random();
        int randomQuestion = random.nextInt(9);

        switch (randomQuestion) {
            case 0:
                question = "What color are often the domes of churches in Russia ?";
                answer[0] = "Yello colored";
                answer[1] = "Gold colored";
                answer[2] = "Blue colored";
                answer[3] = "Red colored";
                goodAnswer = "Gold colored";
                break;
            case 1:
                question = "In which Spanish city did the Joan Miro museum open in 1975 ?";
                answer[0] = "Barcelona";
                answer[1] = "Seville";
                answer[2] = "Madrid";
                answer[3] = "Malaga";
                goodAnswer = "Barcelona";
                break;
            case 2:
                question = "In which country was the famous painter El Greco born ?";
                answer[0] = "Greece";
                answer[1] = "London";
                answer[2] = "Paris";
                answer[3] = "Russia";
                goodAnswer = "Greece";
                break;
            case 3:
                question = "In which city is the composer Frederic Chopin buried ?";
                answer[0] = "Paris";
                answer[1] = "Marseille";
                answer[2] = "Bordeaux";
                answer[3] = "Clermont-Ferrand";
                goodAnswer = "Paris";
                break;
            case 4:
                question = "Who did paint the famous painting Guernica ?";
                answer[0] = "Monet";
                answer[1] = "Van Gogh";
                answer[2] = "Picasso";
                answer[3] = "Manet";
                goodAnswer = "Picasso";
                break;
            case 5:
                question = "In which city did Romeo and Julia live ?";
                answer[0] = "Verona";
                answer[1] = "Rome";
                answer[2] = "Paris";
                answer[3] = "London";
                goodAnswer = "Verona";
                break;
            case 6:
                question = "Which famous French engineer designed two bridges for the city of Porto ?";
                answer[0] = "Nikolas Tesla";
                answer[1] = "James Watt";
                answer[2] = "Thomas Edison";
                answer[3] = "Gustave Eiffel";
                goodAnswer = "Gustave Eiffel";
                break;
            case 7:
                question = "In which English town did Adolf Hitler study art ?";
                answer[0] = "Berlin";
                answer[1] = "James Watt";
                answer[2] = "Manchester";
                answer[3] = "Liverpool";
                goodAnswer = "Liverpool";
                break;
            case 8:
                question = "Who was the original author of Dracula ?";
                answer[0] = "Antoine de Saint Exupery";
                answer[1] = "Bram Stoker";
                answer[2] = "Charles Beaudelaire";
                answer[3] = "Emile Zola";
                goodAnswer = "Bram Stoker";
                break;
            default:
                question = "In which city can you see Michelangelo's David ?";
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

    public String animals() {

        String question;
        String[] answer = new String[4];

        // Generate random question
        Random random = new Random();
        int randomQuestion = random.nextInt(14);

        switch (randomQuestion) {
            case 0:
                question = "What is a bichon ?";
                answer[0] = "Dog";
                answer[1] = "Bird";
                answer[2] = "The little dear";
                answer[3] = "Cat";
                goodAnswer = "Dog";
                break;
            case 1:
                question = "What is a macaw ?";
                answer[0] = "Horse";
                answer[1] = "Parrot";
                answer[2] = "Chicken farmer";
                answer[3] = "Marrin mammal";
                goodAnswer = "Parrot";
                break;
            case 2:
                question = "What animal was Flipper in the TV series ?";
                answer[0] = "Dolphin";
                answer[1] = "Seal";
                answer[2] = "Walrus";
                answer[3] = "Whale";
                goodAnswer = "Dolphin";
                break;
            case 3:
                question = "What animal is the female of the wild boar ?";
                answer[0] = "Sow";
                answer[1] = "Hase";
                answer[2] = "Trout";
                answer[3] = "Laie";
                goodAnswer = "Laie";
                break;
            case 4:
                question = "How many legs do insects have ?";
                answer[0] = "2";
                answer[1] = "6";
                answer[2] = "8";
                answer[3] = "10";
                goodAnswer = "6";
                break;
            case 5:
                question = "Among these animals, which whistles ?";
                answer[0] = "Cicada";
                answer[1] = "Peacock";
                answer[2] = "Swallow";
                answer[3] = "Snake";
                goodAnswer = "Snake";
                break;
            case 6:
                question = "In which category of insect is the butterfly ?";
                answer[0] = "Hymenoptera";
                answer[1] = "Dipterers";
                answer[2] = "Isoptera";
                answer[3] = "Lepidoptera";
                goodAnswer = "Lepidoptera";
                break;
            case 7:
                question = "After the elephant, which land animal is the heaviest ?";
                answer[0] = "Hippopotamus";
                answer[1] = "Rhinoceros";
                answer[2] = "Whale";
                answer[3] = "Gorilla";
                goodAnswer = "Rhinoceros";
                break;
            case 8:
                question = "What type of animal is an ostrich ?";
                answer[0] = "Mammal";
                answer[1] = "Bird";
                answer[2] = "Fish";
                answer[3] = "Insect";
                goodAnswer = "Bird";
                break;
            case 9:
                question = "What is the other name of the cobra ?";
                answer[0] = "Viper";
                answer[1] = "Boa";
                answer[2] = "Python";
                answer[3] = "Naja";
                goodAnswer = "Bird";
                break;
            case 10:
                question = "Among these animals, which is the fastest ?";
                answer[0] = "Cheetah";
                answer[1] = "Leopard";
                answer[2] = "Panther";
                answer[3] = "Jaguar";
                goodAnswer = "Leopard";
                break;
            case 11:
                question = "What animal lives in a spawning ground ?";
                answer[0] = "Fox";
                answer[1] = "Salmon";
                answer[2] = "Koala";
                answer[3] = "Gander";
                goodAnswer = "Salmon";
                break;
            case 12:
                question = "How many branches does a starfish have ?";
                answer[0] = "4";
                answer[1] = "5";
                answer[2] = "8";
                answer[3] = "12";
                goodAnswer = "5";
                break;
            default:
                question = "Which animal is the emblem of the United States ?";
                answer[0] = "Eagle";
                answer[1] = "Snake";
                answer[2] = "Ostrich";
                answer[3] = "Tiger";
                goodAnswer = "Eagle";
        }

        // Display questions
        textViewQuestion.setText(question);
        for (int i = 0; i < 4; i++)
            btnAnswer[i].setText(answer[i]);

        return goodAnswer;
    }

    public String kitchen() {

        String question;
        String[] answer = new String[4];

        // Generate random question
        Random random = new Random();
        int randomQuestion = random.nextInt(14);

        switch (randomQuestion) {
            case 0:
                question = "What is a capon ?";
                answer[0] = "A young castrated chicken";
                answer[1] = "A chicken over 5 years old";
                answer[2] = "The little A sterile chicken";
                answer[3] = "A wild goose";
                goodAnswer = "A young castrated chicken";
                break;
            case 1:
                question = "What fish do we make accras from ?";
                answer[0] = "Wolf";
                answer[1] = "Cod";
                answer[2] = "Swordfish";
                answer[3] = "Salmon";
                goodAnswer = "Cod";
                break;
            case 2:
                question = "What cream is made from crushed almonds ?";
                answer[0] = "custard";
                answer[1] = "Frangipane cream";
                answer[2] = "Mascarpone cream";
                answer[3] = "Whipped cream";
                goodAnswer = "Frangipane cream";
                break;
            case 3:
                question = "What dessert was discovered by chance following a mistake by two sisters ?";
                answer[0] = "Apple pie";
                answer[1] = "rum baba";
                answer[2] = "Tarte tatin";
                answer[3] = "Paris Brest";
                goodAnswer = "Tarte tatin";
                break;
            case 4:
                question = "Which of these fruits does not grow in a tree ?";
                answer[0] = "Lemon";
                answer[1] = "Pear";
                answer[2] = "Guava";
                answer[3] = "Melon";
                goodAnswer = "Melon";
                break;
            case 5:
                question = "What fruit do we make in guacamole ?";
                answer[0] = "Tomato";
                answer[1] = "Papaya";
                answer[2] = "Avocado";
                answer[3] = "Strawberry";
                goodAnswer = "Avocado";
                break;
            case 6:
                question = "What is a Provence violet ?";
                answer[0] = "Artichoke";
                answer[1] = "Grass";
                answer[2] = "Olive producer";
                answer[3] = "Fruit";
                goodAnswer = "Artichoke";
                break;
            case 7:
                question = "What fruit is Gariguette a variety ?";
                answer[0] = "Cherry";
                answer[1] = "Strawberry";
                answer[2] = "Whale";
                answer[3] = "Pear";
                goodAnswer = "Strawberry";
                break;
            case 8:
                question = "What country does broccoli come from ?";
                answer[0] = "China";
                answer[1] = "Belgium";
                answer[2] = "Mexico";
                answer[3] = "Italy";
                goodAnswer = "Italy";
                break;
            case 9:
                question = "What vegetable makes lovable ?";
                answer[0] = "Beet";
                answer[1] = "Avocado";
                answer[2] = "Sucrine";
                answer[3] = "Carrot";
                goodAnswer = "Carrot";
                break;
            case 10:
                question = "What is the name of a children's menu at Quick ?";
                answer[0] = "Happy Meal";
                answer[1] = "Magic Box";
                answer[2] = "Baby Box";
                answer[3] = "Children Meal";
                goodAnswer = "Happy Meal";
                break;
            case 11:
                question = "What fast food brand has the slogan 'so good' ?";
                answer[0] = "KFC";
                answer[1] = "Burger King";
                answer[2] = "Mc Donald";
                answer[3] = "Pizza Hut";
                goodAnswer = "KFC";
                break;
            case 12:
                question = "What is the specific element of croque madame ?";
                answer[0] = "Tomato";
                answer[1] = "Carrot";
                answer[2] = "Egg";
                answer[3] = "Salmon";
                goodAnswer = "Salmon";
                break;
            default:
                question = "What does the word kebab mean ?";
                answer[0] = "Turkish";
                answer[1] = "Grill";
                answer[2] = "Sandwich";
                answer[3] = "Lamb";
                goodAnswer = "Grill";
        }

        // Display questions
        textViewQuestion.setText(question);
        for (int i = 0; i < 4; i++)
            btnAnswer[i].setText(answer[i]);

        return goodAnswer;
    }

    public String movies() {

        String question;
        String[] answer = new String[4];

        // Generate random question
        Random random = new Random();
        int randomQuestion = random.nextInt(14);

        switch (randomQuestion) {
            case 0:
                question = "What is a bichon";
                answer[0] = "Dog";
                answer[1] = "Bird";
                answer[2] = "The little dear";
                answer[3] = "Cat";
                goodAnswer = "Dog";
                break;
            case 1:
                question = "What is a macaw";
                answer[0] = "Horse";
                answer[1] = "Parrot";
                answer[2] = "Chicken farmer";
                answer[3] = "Marrin mammal";
                goodAnswer = "Parrot";
                break;
            case 2:
                question = "What animal was Flipper in the TV series";
                answer[0] = "Dolphin";
                answer[1] = "Seal";
                answer[2] = "Walrus";
                answer[3] = "Whale";
                goodAnswer = "Dolphin";
                break;
            case 3:
                question = "What animal is the female of the wild boar";
                answer[0] = "Sow";
                answer[1] = "Hase";
                answer[2] = "Trout";
                answer[3] = "Laie";
                goodAnswer = "Laie";
                break;
            case 4:
                question = "How many legs do insects have";
                answer[0] = "2";
                answer[1] = "6";
                answer[2] = "8";
                answer[3] = "10";
                goodAnswer = "6";
                break;
            case 5:
                question = "Among these animals, which whistles";
                answer[0] = "Cicada";
                answer[1] = "Peacock";
                answer[2] = "Swallow";
                answer[3] = "Snake";
                goodAnswer = "Snake";
                break;
            case 6:
                question = "In which category of insect is the butterfly";
                answer[0] = "Hymenoptera";
                answer[1] = "Dipterers";
                answer[2] = "Isoptera";
                answer[3] = "Lepidoptera";
                goodAnswer = "Lepidoptera";
                break;
            case 7:
                question = "After the elephant, which land animal is the heaviest";
                answer[0] = "Hippopotamus";
                answer[1] = "Rhinoceros";
                answer[2] = "Whale";
                answer[3] = "Gorilla";
                goodAnswer = "Rhinoceros";
                break;
            case 8:
                question = "What type of animal is an ostrich";
                answer[0] = "Mammal";
                answer[1] = "Bird";
                answer[2] = "Fish";
                answer[3] = "Insect";
                goodAnswer = "Bird";
                break;
            case 9:
                question = "What is the other name of the cobra";
                answer[0] = "Viper";
                answer[1] = "Boa";
                answer[2] = "Python";
                answer[3] = "Naja";
                goodAnswer = "Bird";
                break;
            case 10:
                question = "Among these animals, which is the fastest";
                answer[0] = "Cheetah";
                answer[1] = "Leopard";
                answer[2] = "Panther";
                answer[3] = "Jaguar";
                goodAnswer = "Leopard";
                break;
            case 11:
                question = "What animal lives in a spawning ground";
                answer[0] = "Fox";
                answer[1] = "Salmon";
                answer[2] = "Koala";
                answer[3] = "Gander";
                goodAnswer = "Salmon";
                break;
            case 12:
                question = "How many branches does a starfish have";
                answer[0] = "4";
                answer[1] = "5";
                answer[2] = "8";
                answer[3] = "12";
                goodAnswer = "5";
                break;
            default:
                question = "Which animal is the emblem of the United States";
                answer[0] = "Eagle";
                answer[1] = "Snake";
                answer[2] = "Ostrich";
                answer[3] = "Tiger";
                goodAnswer = "Eagle";
        }

        // Display questions
        textViewQuestion.setText(question);
        for (int i = 0; i < 4; i++)
            btnAnswer[i].setText(answer[i]);

        return goodAnswer;
    }

    public String geography() {

        String question;
        String[] answer = new String[4];

        // Generate random question
        Random random = new Random();
        int randomQuestion = random.nextInt(14);

        switch (randomQuestion) {
            case 0:
                question = "With which country France has no border ?";
                answer[0] = "Belgium";
                answer[1] = "Austria";
                answer[2] = "Swiss";
                answer[3] = "Spain";
                goodAnswer = "Austria";
                break;
            case 1:
                question = "What river crosses the city of Lyon ?";
                answer[0] = "Garonne";
                answer[1] = "Seine";
                answer[2] = "Rhin";
                answer[3] = "Rhone";
                goodAnswer = "Rhone";
                break;
            case 2:
                question = "What is the official language of Ireland ?";
                answer[0] = "Celtic";
                answer[1] = "German";
                answer[2] = "French";
                answer[3] = "English";
                goodAnswer = "English";
                break;
            case 3:
                question = "What is the capital of Pakistan ?";
                answer[0] = "Islamabad";
                answer[1] = "Mogadishu";
                answer[2] = "Kabul";
                answer[3] = "Karachi";
                goodAnswer = "Islamabad";
                break;
            case 4:
                question = "What color is on the German flag ?";
                answer[0] = "Black, Red, White";
                answer[1] = "Black, Red, Yellow";
                answer[2] = "Black, Red, Yellow";
                answer[3] = "Black, Orange, White";
                goodAnswer = "Black, Red, Yellow";
                break;
            case 5:
                question = "What is the capital of the Philippines ?";
                answer[0] = "Jakarta";
                answer[1] = "Wellington";
                answer[2] = "Seoul";
                answer[3] = "Manila";
                goodAnswer = "Manila";
                break;
            case 6:
                question = "On which island can we go to Mount Pelée ?";
                answer[0] = "Martinique";
                answer[1] = "Guyana";
                answer[2] = "Hawaii";
                answer[3] = "Guadeloupe";
                goodAnswer = "Martinique";
                break;
            case 7:
                question = "What is the capital of the United States of America ?";
                answer[0] = "New-York";
                answer[1] = "Miami";
                answer[2] = "Washington DC";
                answer[3] = "Detroit";
                goodAnswer = "Washington DC";
                break;
            case 8:
                question = "Which French department has why geography that the 16 ?";
                answer[0] = "Laude";
                answer[1] = "L'aveyron";
                answer[2] = "Le cantal";
                answer[3] = "La charante";
                goodAnswer = "La charante";
                break;
            case 9:
                question = "What city is nicknamed the City of Kings ?";
                answer[0] = "Petra";
                answer[1] = "Timbuktu";
                answer[2] = "Beijing";
                answer[3] = "Lima";
                goodAnswer = "Lima";
                break;
            case 10:
                question = "What city is nicknamed the city of seven hills ?";
                answer[0] = "Rome";
                answer[1] = "Paris";
                answer[2] = "Barcelona";
                answer[3] = "Lisbon";
                goodAnswer = "Rome";
                break;
            case 11:
                question = "What city is called the navel of the world ?";
                answer[0] = "Cuzco";
                answer[1] = "Rome";
                answer[2] = "Baghdad";
                answer[3] = "Beijing";
                goodAnswer = "Cuzco";
                break;
            case 12:
                question = "What country is called the flat country ?";
                answer[0] = "Netherlands";
                answer[1] = "Belgium";
                answer[2] = "Greece";
                answer[3] = "Portugal";
                goodAnswer = "Belgium";
                break;
            default:
                question = "How many French departments are there ?";
                answer[0] = "99";
                answer[1] = "101";
                answer[2] = "108";
                answer[3] = "113";
                goodAnswer = "101";
        }

        // Display questions
        textViewQuestion.setText(question);
        for (int i = 0; i < 4; i++)
            btnAnswer[i].setText(answer[i]);

        return goodAnswer;
    }

    public String computer() {

        String question;
        String[] answer = new String[4];

        // Generate random question
        Random random = new Random();
        int randomQuestion = random.nextInt(8);

        switch (randomQuestion) {
            case 0:
                question = "What is the name of the network of computers from which the Internet has emerged ?";
                answer[0] = "Arpanet";
                answer[1] = "Internet";
                answer[2] = "MySpace";
                answer[3] = "Extranet";
                goodAnswer = "Arpanet";
                break;
            case 1:
                question = "In what year was Google launched on the web ?";
                answer[0] = "2001";
                answer[1] = "1999";
                answer[2] = "1998";
                answer[3] = "L'an 1";
                goodAnswer = "1998";
                break;
            case 2:
                question = "What does \"FTP\" stand for in the computer and internet world ?";
                answer[0] = "Fa Ta Pa";
                answer[1] = "Force Tripe Prout";
                answer[2] = "File Transfer Protocol";
                answer[3] = "La réponse D";
                goodAnswer = "File Transfer Protocol";
                break;
            case 3:
                question = "Which unit is an indication for the sound quality of MP3 ?";
                answer[0] = "mp3";
                answer[1] = "Kp";
                answer[2] = "Pps";
                answer[3] = "Kbps";
                goodAnswer = "Kbps";
                break;
            case 4:
                question = "In computing what is Ram short for ?";
                answer[0] = "Rare Access Military";
                answer[1] = "Random Access Memory";
                answer[2] = "Ram doesn't exist";
                answer[3] = "Royal Air Maroc";
                goodAnswer = "Random Access Memory";
                break;
            case 5:
                question = "In which Nintendo DS game do you have to raise a puppy as well as possible ?";
                answer[0] = "Nintendogs";
                answer[1] = "Animal crossing";
                answer[2] = "Super Mario";
                answer[3] = "Little Horse";
                goodAnswer = "Nintendogs";
                break;
            case 6:
                question = "What does USB stand for in the computer world ?";
                answer[0] = "Universe Setup Bios";
                answer[1] = "Universal Secret Bus";
                answer[2] = "Use Scratch Bitch";
                answer[3] = "Universal Serial Bus";
                goodAnswer = "Universal Serial Bus";
                break;
            default:
                question = "What is the country top-level domain of Belgium ?";
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

    public String science() {

        String question;
        String[] answer = new String[4];

        // Generate random question
        Random random = new Random();
        int randomQuestion = random.nextInt(24);

        switch (randomQuestion) {
            case 0:
                question = "What is the closest planet to the Sun ?";
                answer[0] = "Mercury";
                answer[1] = "Saturn";
                answer[2] = "Jupiter";
                answer[3] = "Mars";
                goodAnswer = "Mercury";
                break;
            case 1:
                question = "What is the name of the 2nd biggest planet in our solar system ?";
                answer[0] = "Jupiter";
                answer[1] = "Titan";
                answer[2] = "Saturn";
                answer[3] = "Neptune";
                goodAnswer = "Saturn";
                break;
            case 2:
                question = "The sun is";
                answer[0] = "a star";
                answer[1] = "a comet";
                answer[2] = "a galaxy";
                answer[3] = "a planet";
                goodAnswer = "a star";
                break;
            case 3:
                question = "The chemical element uranium was named after what planet ?";
                answer[0] = "Venus";
                answer[1] = "Uranus";
                answer[2] = "Mars";
                answer[3] = "Earth";
                goodAnswer = "Uranus";
                break;
            case 4:
                question = "A change of the DNA in an organism that results in a new trait is known as a ?";
                answer[0] = "Chromosome";
                answer[1] = "Photosynthesis";
                answer[2] = "Mutation";
                answer[3] = "Antibiotics";
                goodAnswer = "Mutation";
                break;
            case 5:
                question = "The area of biology devoted to the study of fungi is known as ?";
                answer[0] = "botanical";
                answer[1] = "mutation";
                answer[2] = "mycology";
                answer[3] = "chemistry";
                goodAnswer = "mycology";
                break;
            case 6:
                question = "What is the name of the process used by plants to convert sunlight into food ?";
                answer[0] = "Photosynthesis";
                answer[1] = "Rainbow";
                answer[2] = "Black sun";
                answer[3] = "Aurora borealis";
                goodAnswer = "Photosynthesis";
                break;
            case 7:
                question = "Electric current is measured using what device ?";
                answer[0] = "Drums";
                answer[1] = "Weighing machine";
                answer[2] = "Voltmeter";
                answer[3] = "Ammeter";
                goodAnswer = "Ammeter";
                break;
            case 8:
                question = "Electric resistance is typically measured in what units ?";
                answer[0] = "Volt";
                answer[1] = "Ampere";
                answer[2] = "Ohms";
                answer[3] = "Watts";
                goodAnswer = "Ohms";
                break;
            case 9:
                question = "What is the first name of the famous scientist who gave us Newton’s three laws of motion ?";
                answer[0] = "John";
                answer[1] = "Oliver";
                answer[2] = "William";
                answer[3] = "Isaac";
                goodAnswer = "Isaac";
                break;
            case 10:
                question = "Theoretical physicist James Maxwell was born in what country ?";
                answer[0] = "Scotland";
                answer[1] = "Lithuania";
                answer[2] = "Germany";
                answer[3] = "Australia";
                goodAnswer = "Scotland";
                break;
            case 11:
                question = "What scientist is well known for his theory of relativity ?";
                answer[0] = "Thomas Edison";
                answer[1] = "Albert Einstein";
                answer[2] = "Stephen Hawking";
                answer[3] = "Nicolas Copernic";
                goodAnswer = "Albert Einstein";
                break;
            case 12:
                question = "What are the two main metals in the earth’s core ?";
                answer[0] = "Iron and nickel";
                answer[1] = "Magnesium and lithium";
                answer[2] = "Sodium and calcium";
                answer[3] = "Iron and zync";
                goodAnswer = "Iron and nickel";
                break;
            case 13:
                question = "What is the second most common gas found in the air we breathe ?";
                answer[0] = "Hydrogen";
                answer[1] = "Helium";
                answer[2] = "Argon";
                answer[3] = "Oxygen";
                goodAnswer = "Oxygen";
                break;
            case 14:
                question = "What is the name of the layer of earth’s atmosphere that absorbs the majority of the potentially damaging ultraviolet light from the sun ?";
                answer[0] = "The ozone layer";
                answer[1] = "The troposphere";
                answer[2] = "The stratosphere";
                answer[3] = "The thermosphere";
                goodAnswer = "The ozone layer";
                break;
            case 15:
                question = "What is the next prime number after 7 ?";
                answer[0] = "8";
                answer[1] = "17";
                answer[2] = "13";
                answer[3] = "11";
                goodAnswer = "11";
                break;
            case 16:
                question = "How many bones are in the human body ?";
                answer[0] = "232";
                answer[1] = "206";
                answer[2] = "183";
                answer[3] = "146";
                goodAnswer = "206";
                break;
            case 17:
                question = "What is the hardest natural substance on Earth ?";
                answer[0] = "Quartz";
                answer[1] = "Gold";
                answer[2] = "Bedrock";
                answer[3] = "Diamond";
                goodAnswer = "Diamond";
                break;
            case 18:
                question = "Roughly how long does it take for the sun’s light to reach Earth ?";
                answer[0] = "8 seconds";
                answer[1] = "8 minutes";
                answer[2] = "8 hours";
                answer[3] = "8 days";
                goodAnswer = "8 minutes";
                break;
            case 19:
                question = "Humans and chimpanzees share roughly how much DNA ?";
                answer[0] = "62%";
                answer[1] = "66%";
                answer[2] = "84%";
                answer[3] = "98%";
                goodAnswer = "98%";
                break;
            case 20:
                question = "At what temperature are Celsius and Fahrenheit equal ?";
                answer[0] = "-40";
                answer[1] = "-16";
                answer[2] = "0";
                answer[3] = "100";
                goodAnswer = "-40";
                break;
            case 21:
                question = "How many teeth does an adult human have ?";
                answer[0] = "25";
                answer[1] = "32";
                answer[2] = "35";
                answer[3] = "38";
                goodAnswer = "32";
                break;
            case 22:
                question = "Which is the main gas that makes up the Earth’s atmosphere ?";
                answer[0] = "Argon";
                answer[1] = "Carbon dioxide";
                answer[2] = "Nitrogen";
                answer[3] = "Oxygen";
                goodAnswer = "Nitrogen";
                break;
            default:
                question = "The concept of gravity was discovered by which famous physicist ?";
                answer[0] = "Hawking";
                answer[1] = "Edison";
                answer[2] = "Thomson";
                answer[3] = "Curie";
                goodAnswer = "Newton";
        }

        // Display questions
        textViewQuestion.setText(question);
        for (int i = 0; i < 4; i++)
            btnAnswer[i].setText(answer[i]);

        return goodAnswer;
    }

    public String sport() {

        String question;
        String[] answer = new String[4];

        // Generate random question
        Random random = new Random();
        int randomQuestion = random.nextInt(33);

        switch (randomQuestion) {
            case 0:
                question = "How many players make up a basketball team on the court ?";
                answer[0] = "4";
                answer[1] = "5";
                answer[2] = "6";
                answer[3] = "9";
                goodAnswer = "5";
                break;
            case 1:
                question = "How high is the volleyball net for a men's competition ?";
                answer[0] = "1m80";
                answer[1] = "2m24";
                answer[2] = "2m43";
                answer[3] = "2m78";
                goodAnswer = "2m43";
                break;
            case 2:
                question = "What sport is practiced during Roland-Garros ?";
                answer[0] = "Sailing";
                answer[1] = "Judo";
                answer[2] = "Tennis";
                answer[3] = "Swimming";
                goodAnswer = "Tennis";
                break;
            case 3:
                question = "Which country won the soccer world cup in 1998 ?";
                answer[0] = "Italy";
                answer[1] = "Brazil";
                answer[2] = "Germany";
                answer[3] = "France";
                goodAnswer = "France";
                break;
            case 4:
                question = "Who was Louison Bobet ?";
                answer[0] = "Boxer";
                answer[1] = "Tennis player";
                answer[2] = "A high jumper";
                answer[3] = "A cyclist";
                goodAnswer = "A cyclist";
                break;
            case 5:
                question = "How many times has Michael Schumacher been crowned Formula 1 world champion ?";
                answer[0] = "5";
                answer[1] = "10";
                answer[2] = "15";
                answer[3] = "7";
                goodAnswer = "7";
                break;
            case 6:
                question = "With which stroke do you start the 4 stroke ?";
                answer[0] = "Butterfly";
                answer[1] = "The back";
                answer[2] = "The breaststroke";
                answer[3] = "The crawl";
                goodAnswer = "Butterfly";
                break;
            case 7:
                question = "In what year will golf return to be an Olympic sport ?";
                answer[0] = "2016";
                answer[1] = "2020";
                answer[2] = "2024";
                answer[3] = "2028";
                goodAnswer = "2016";
                break;
            case 8:
                question = "How many years separate two editions of the football world cup ?";
                answer[0] = "1 year";
                answer[1] = "2 years";
                answer[2] = "4 years";
                answer[3] = "10 years";
                goodAnswer = "4 years";
                break;
            case 9:
                question = "Where are the 24 Hours of Le Mans run ?";
                answer[0] = "At daytona";
                answer[1] = "To imola";
                answer[2] = "In Le Mans";
                answer[3] = "To Dubai";
                goodAnswer = "In Le Mans";
                break;
            case 10:
                question = "Which country created handball ?";
                answer[0] = "England";
                answer[1] = "Germany";
                answer[2] = "United States";
                answer[3] = "France";
                goodAnswer = "Germany";
                break;
            case 11:
                question = "In rugby how many points is worth a converted try ?";
                answer[0] = "4";
                answer[1] = "7";
                answer[2] = "5";
                answer[3] = "3";
                goodAnswer = "7";
                break;
            case 12:
                question = "Holkar Trophy is associated with which sport ?";
                answer[0] = "Bridge";
                answer[1] = "Hockey";
                answer[2] = "Football";
                answer[3] = "Badminton";
                goodAnswer = "Bridge";
                break;
            case 13:
                question = "Wellington Trophy is related to which game ?";
                answer[0] = "Rowing";
                answer[1] = "Hockey";
                answer[2] = "Tennis";
                answer[3] = "Polo";
                goodAnswer = "Rowing";
                break;
            case 14:
                question = "The National Game of Japan is";
                answer[0] = "Tennis";
                answer[1] = "Karate";
                answer[2] = "Ice Hockey";
                answer[3] = "Sumo wrestling";
                goodAnswer = "Sumo wrestling";
                break;
            case 15:
                question = "The term ' Gambit ' is associated with";
                answer[0] = "Chess";
                answer[1] = "Tennis";
                answer[2] = "Basket ball";
                answer[3] = "Baseball";
                goodAnswer = "Chess";
                break;
            case 16:
                question = "Oval stadium in England is associated with";
                answer[0] = "polo";
                answer[1] = "Cricket";
                answer[2] = "Hockey";
                answer[3] = "Football";
                goodAnswer = "Cricket";
                break;
            case 17:
                question = "How long are professional Golf Tour Players allotted per shot ?";
                answer[0] = "22 seconds";
                answer[1] = "36 seconds";
                answer[2] = "41 seconds";
                answer[3] = "45 seconds";
                goodAnswer = "45 seconds";
                break;
            case 18:
                question = "Oval stadium in England is associated with";
                answer[0] = "polo";
                answer[1] = "Cricket";
                answer[2] = "Hockey";
                answer[3] = "Football";
                goodAnswer = "Cricket";
                break;
            case 19:
                question = "Which of the following International Tennis Tournaments is held on grass court ?";
                answer[0] = "US open";
                answer[1] = "French Open";
                answer[2] = "Wimbledon";
                answer[3] = "Australian Open";
                goodAnswer = "Wimbledon";
                break;
            case 20:
                question = "Derby Cup is associated with which game ?";
                answer[0] = "Hockey";
                answer[1] = "Lawn Tennis";
                answer[2] = "Horse Racing";
                answer[3] = "Football";
                goodAnswer = "Horse Racing";
                break;
            case 21:
                question = "Mithir Sen is associated with";
                answer[0] = "Hockey";
                answer[1] = "Swimming";
                answer[2] = "Volley ball";
                answer[3] = "Weighlifting";
                goodAnswer = "Swimming";
                break;
            case 22:
                question = "Badminton is national game of which country ?";
                answer[0] = "Indonesia";
                answer[1] = "Bhutan";
                answer[2] = "Argentina";
                answer[3] = "USA";
                goodAnswer = "Indonesia";
                break;
            case 23:
                question = "Which of the following is the Trophy / Cups associated with the game of Hockey ?";
                answer[0] = "Derby";
                answer[1] = "Agha Khan Cup";
                answer[2] = "Merdeka";
                answer[3] = "Vizzy Trophy";
                goodAnswer = "Agha Khan Cup";
                break;
            case 24:
                question = "Limba Ram is known for his outstanding performance in which of the following";
                answer[0] = "Boxing";
                answer[1] = "Shooting";
                answer[2] = "Swimming";
                answer[3] = "Archery";
                goodAnswer = "Archery";
                break;
            case 25:
                question = "Thomas cup is associated with which game ?";
                answer[0] = "Football";
                answer[1] = "Cricket";
                answer[2] = "Badminton";
                answer[3] = "Chess";
                goodAnswer = "Badminton";
                break;
            case 26:
                question = "Where are the 2012 Olympic Games taking place ?";
                answer[0] = "Italy";
                answer[1] = "Germany";
                answer[2] = "France";
                answer[3] = "England";
                goodAnswer = "England";
                break;
            case 27:
                question = "Who became the first woman in the world to ski to the North Pole";
                answer[0] = "Alexandra Pavid";
                answer[1] = "Meera Sahib";
                answer[2] = "M.Patanjali";
                answer[3] = "Ann Bancraft";
                goodAnswer = "Ann Bancraft";
                break;
            case 28:
                question = "Who was the first black tennis player to win a Wimbledon title";
                answer[0] = "Steffi Bucher";
                answer[1] = "Gegata Sen";
                answer[2] = "Althea Gibson";
                answer[3] = "Sucheta Kriplani";
                goodAnswer = "Sucheta Kriplani";
                break;
            case 29:
                question = "Diameter of a Ping Pong Ball ?";
                answer[0] = "37 mm";
                answer[1] = "38 mm";
                answer[2] = "40 mm";
                answer[3] = "42 mm";
                goodAnswer = "40 mm";
                break;
            case 30:
                question = "Who won the US Open 2018 ?";
                answer[0] = "Brooks Koepka";
                answer[1] = "Tommy Fleetwood";
                answer[2] = "T. Finau";
                answer[3] = "D. Johnson";
                goodAnswer = "Brooks Koepka";
                break;
            case 31:
                question = "Which of the following indicates scuba diving or snorkeling activity ?";
                answer[0] = "A red flag with a diagonal white stripe";
                answer[1] = "The blue and white alpha flag";
                answer[2] = "Both A & B";
                answer[3] = "None of the above";
                goodAnswer = "A red flag with a diagonal white stripe";
                break;
            default:
                question = "Which of the following sports is relatively safe ?";
                answer[0] = "Free diving";
                answer[1] = "Sky diving";
                answer[2] = "Cave diving";
                answer[3] = "None of the above";
                goodAnswer = "Sky diving";
        }

        // Display questions
        textViewQuestion.setText(question);
        for (int i = 0; i < 4; i++)
            btnAnswer[i].setText(answer[i]);

        return goodAnswer;
    }

}
