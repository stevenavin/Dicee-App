package com.example.diceeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link the views in the layout XML file to the Java code
        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice = (ImageView) findViewById(R.id.imageViewLeftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.imageViewRightDice);

        //Store the  Dice images in and Array
        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        // Tell the button to listen for clicks
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Ze Button has been Pressed");
                //this code is executed when the button is clicked

                // Create a random number generator
                Random randomNumberGenerator = new Random();
                // Make the random number generator spit out a new random number
                int number = randomNumberGenerator.nextInt(6);

                // Print this number to the logcat to see it in the Android Monitor
                Log.d("Dicee","The Random Number is: " + number);

                // grab a random dice image from the diceArray. Then tell the ImageView to display his image
                leftDice.setImageResource(diceArray[number]);

                // create a new random number
                number = randomNumberGenerator.nextInt(6);
                // set the right dice image using an image from the diceArray.
                rightDice.setImageResource(diceArray[number]);
            }
        });

    }
}