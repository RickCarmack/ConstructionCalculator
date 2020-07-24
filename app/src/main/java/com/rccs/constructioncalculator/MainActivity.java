package com.rccs.constructioncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.calc_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                TextView lin_feet = findViewById(R.id.linear_feet);
                TextView sq_feet = findViewById(R.id.square_feet);
                TextView totPrice = findViewById(R.id.totalPrice);

                EditText length = findViewById(R.id.length_input);
                int l = Integer.parseInt(length.getText().toString());
                EditText width = findViewById(R.id.width_input);
                int w = Integer.parseInt(width.getText().toString());
                EditText pieces = findViewById(R.id.pieces_input);
                int piece = Integer.parseInt(pieces.getText().toString());
                EditText price = findViewById(R.id.price_input);
                double p = Double.parseDouble(price.getText().toString());

                // linear feet
                int lf = l * piece;
                lin_feet.setText(String.valueOf(lf));
                // square feet
                double sf = l * w / 12 * piece;
                sq_feet.setText(String.valueOf(sf));
                // price
                double tp = l * piece * p;
                totPrice.setText("$" + String.valueOf(tp));

                // calculate linear_feet = length_input * pieces_input
                // calculate square_feet = length_input * ( width_input / 12 ) * pieces input
                // set linear_feet and square_feet to locations on screen
            }
        });
    }
}