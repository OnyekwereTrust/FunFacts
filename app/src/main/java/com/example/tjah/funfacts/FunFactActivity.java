package com.example.tjah.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactActivity extends AppCompatActivity {
//declare our new variables
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private RelativeLayout relativeLayout;
    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning the views from the layout file to the corresponding variable

        factTextView = (TextView) findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.showFactbutton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);


        //button action
        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              String fact = factBook.getfact();
                int color  = colorWheel.getColor();
              relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

                factTextView.setText(fact);
            }
        });

    }
}
