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
    CardView[] cardViews = new CardView[7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        gridLayout = findViewById(R.id.gridLayout);
        cardViews[0] = findViewById(R.id.art);
        cardViews[1] = findViewById(R.id.biology);
        cardViews[2] = findViewById(R.id.animals);
        cardViews[3] = findViewById(R.id.movies);
        cardViews[4] = findViewById(R.id.geography);
        cardViews[5] = findViewById(R.id.computer);
        cardViews[6] = findViewById(R.id.science);

        for (int i = 0; i < 7; i++)
            cardViews[i].setOnClickListener(this);

        int screenSize = getScreenSize();

        switch (screenSize) {
            case 1100:
                gridLayout.setColumnCount(3);
                break;
            case 2100:
                gridLayout.setColumnCount(4);
                break;
            case 2400:
                gridLayout.setColumnCount(5);
                break;

        }
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
            case R.id.computer:
                intent.putExtra("category", "computer");
                startActivity(intent);
                finish();
                break;
            case R.id.art:
                intent.putExtra("category", "art");
                startActivity(intent);
                finish();
                break;
            case R.id.animals:
                intent.putExtra("category", "animals");
                startActivity(intent);
                finish();
                break;
        }
    }
}