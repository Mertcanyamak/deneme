package com.example.deneme3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class LeftBarActivity extends ThreadActivity {

    public Bundle veriCek;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leftbar);

        veriCek = getIntent().getExtras();

    }
}
    