package com.ynov.vernet.quizz;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {

    GridLayout gridLayout;
    CardView[] cardViews = new CardView[8];
    String[] categories = {"art", "kitchen", "animals", "movies", "geography", "computer", "science", "sport"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        gridLayout = findViewById(R.id.gridLayout);

        // Cards
        cardViews[0] = findViewById(R.id.art);
        cardViews[1] = findViewById(R.id.kitchen);
        cardViews[2] = findViewById(R.id.animals);
        cardViews[3] = findViewById(R.id.movies);
        cardViews[4] = findViewById(R.id.geography);
        cardViews[5] = findViewById(R.id.computer);
        cardViews[6] = findViewById(R.id.science);
        cardViews[7] = findViewById(R.id.sport);

        // Implement cards
        for (int i = 0; i < 7; i++)
            cardViews[i].setOnClickListener(this);

        // Adjust Grid Layout with screen size
        int screenSize = getScreenSize();

        if (screenSize > 1100)
            gridLayout.setColumnCount(3);

        if (screenSize > 2100)
            gridLayout.setColumnCount(4);

        if (screenSize > 3100)
            gridLayout.setColumnCount(5);
    }

    public int getScreenSize() {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        return size.x;
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        for (int i = 0; i < cardViews.length; i++) {
            if (v.getId() == cardViews[i].getId()) {
                intent.putExtra("category", categories[i]);
                startActivity(intent);
                finish();
                break;
            }
        }    }
}
