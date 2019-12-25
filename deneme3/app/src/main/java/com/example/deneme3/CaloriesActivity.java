package com.example.deneme3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CaloriesActivity  extends AppCompatActivity {
    private Button cal,nut,gi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cal = findViewById(R.id.calories);
        nut = findViewById(R.id.nutriens);
        gi = findViewById(R.id.glycemixindex);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CaloriesActivity.class);
                startActivity(intent);
            }
        });

        nut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NutrientActivity.class);
                startActivity(intent);
            }
        });

        gi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GlicemikActivity.class);
                startActivity(intent);

            }
        });


    }
}