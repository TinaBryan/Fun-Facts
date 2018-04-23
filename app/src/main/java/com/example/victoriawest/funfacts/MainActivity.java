package com.example.victoriawest.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        factTextView = findViewById(R.id.fact_textview);
        showFactButton = findViewById(R.id.show_fact_button);
        relativeLayout = findViewById(R.id.relativeLayout);


        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String fact = factBook.getFact();

                factTextView.setText(fact);
                String color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(Color) ;
            }
        };
        showFactButton.setOnClickListener(listener);

    }
}
