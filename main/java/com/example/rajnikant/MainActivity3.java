package com.example.rajnikant;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Initialize TextViews
        TextView sourceTextView = findViewById(R.id.source_state_text_view);
        TextView destinationTextView = findViewById(R.id.destination_state_text_view);

        // Retrieve values from SharedPreferences
        SharedPreferences sharedPref = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String sourceState = sharedPref.getString("source", "");
        String destinationState = sharedPref.getString("destination", "");

        // Set the retrieved values in the TextViews
        sourceTextView.setText("Source State: " + sourceState);
        destinationTextView.setText("Destination State: " + destinationState);
    }
}
