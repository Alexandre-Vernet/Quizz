package com.ynov.vernet.quizz;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {

    GridLayout gridLayout;
    CardView[] cardViews = new CardView[7];

    private static final String TAG = "CategoryActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        gridLayout = findViewById(R.id.gridLayout);

        // Cards
        cardViews[0] = findViewById(R.id.art);
        cardViews[1] = findViewById(R.id.biology);
        cardViews[2] = findViewById(R.id.animals);
        cardViews[3] = findViewById(R.id.movies);
        cardViews[4] = findViewById(R.id.geography);
        cardViews[5] = findViewById(R.id.computer);
        cardViews[6] = findViewById(R.id.science);

        // Implement cards
        for (int i = 0; i < 7; i++)
            cardViews[i].setOnClickListener(this);

        // Adjust Grid Layout with screen size
        int screenSize = getScreenSize();

        if (screenSize > 1100)
            gridLayout.setColumnCount(3);

        if (screenSize > 2100)
            gridLayout.setColumnCount(4);

        if (screenSize > 2400)
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

        switch (v.getId()) {
            case R.id.art:
                intent.putExtra("category", "art");
                startActivity(intent);
                finish();
                break;
            case R.id.biology:
                intent.putExtra("category", "biology");
                startActivity(intent);
                finish();
                break;
            case R.id.animals:
                intent.putExtra("category", "animals");
                startActivity(intent);
                finish();
                break;
            case R.id.movies:
                intent.putExtra("category", "movies");
                startActivity(intent);
                finish();
                break;
            case R.id.geography:
                intent.putExtra("category", "geography");
                startActivity(intent);
                finish();
                break;
            case R.id.computer:
                intent.putExtra("category", "computer");
                startActivity(intent);
                finish();
                break;
            case R.id.science:
                intent.putExtra("category", "science");
                startActivity(intent);
                finish();
                break;
        }
    }
}