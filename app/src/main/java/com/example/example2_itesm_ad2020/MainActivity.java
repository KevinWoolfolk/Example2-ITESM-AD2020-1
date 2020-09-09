package com.example.example2_itesm_ad2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button mybutton;
    TextView myTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mybutton = findViewById(R.id.button);
        myTextView = findViewById(R.id.textView);
        myTextView.setText("Hola");

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //myTextView.setText("You clicked me");

                Intent myIntent = new Intent( MainActivity.this, childActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
