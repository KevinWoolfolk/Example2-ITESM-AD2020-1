package com.example.example2_itesm_ad2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
public class childActivity extends AppCompatActivity {

    Button mybutton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        mybutton2 = findViewById(R.id.button2);

        mybutton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //myTextView.setText("You clicked me");

                Intent myIntent = new Intent( childActivity.this, MainActivity.class);

                startActivity(myIntent);
            }
        });

    }
}
