package com.example.rajnikant;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button1);
        btn.setOnClickListener(view -> {
            Intent intent =new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });


    }

}