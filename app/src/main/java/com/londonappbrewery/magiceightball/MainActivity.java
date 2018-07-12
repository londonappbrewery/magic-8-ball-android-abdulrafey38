package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView balldisplay = (ImageView) findViewById(R.id.image_eightball);
        Button ask = (Button) findViewById(R.id.askbutton);

        final int ballaray [] = {R.drawable.ball11,R.drawable.ball22,R.drawable.ball33,R.drawable.ball44,R.drawable.ball55};


        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomnumbergenerator = new Random();

                int number = randomnumbergenerator.nextInt(4);

                balldisplay.setImageResource(ballaray[number]);
            }
        });

    }
}
