package com.example.victoriawest.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

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
        factTextView = (TextView) findViewById(R.id.fact_textview);
        showFactButton = (Button) findViewById(R.id.show_fact_button);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);


        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String fact = factBook.getFact();

                factTextView.setText(fact);

                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);

    }

}
