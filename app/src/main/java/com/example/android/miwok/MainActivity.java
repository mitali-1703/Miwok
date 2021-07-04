package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

// Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the family category
        TextView family = (TextView) findViewById(R.id.family);

// Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the color category
        TextView color  = (TextView) findViewById(R.id.color);

// Set a click listener on that View
        color.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the color View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorIntent);
            }
        });

        // Find the View that shows the phrase category
        TextView phrase = (TextView) findViewById(R.id.phrase);

// Set a click listener on that View
        phrase.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phraseIntent);
            }
        });
    }


}