package com.example.rajnikant;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private Spinner sourceSpinner;
    private Spinner destinationSpinner;
    private String[] indianStates = {
            "Andaman and Nicobar Islands","Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar",
            "Chandigarh","Chhattisgarh", "Delhi","Dadra and Nagar Haveli","Daman and Diu", "Goa",
            "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka",
            "Kerala", "Ladakh","Lakshadweep", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya",
            "Mizoram", "Nagaland", "Odisha", "Punjab","Puducherry", "Rajasthan", "Sikkim", "Tamil Nadu",
            "Telangana","Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sourceSpinner = findViewById(R.id.source_spinner);
        destinationSpinner = findViewById(R.id.destination_spinner);

        // Create an ArrayAdapter for the Indian state list
        ArrayAdapter<String> indianStateAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, indianStates);

        // Set the ArrayAdapter for the source and destination spinners
        sourceSpinner.setAdapter(indianStateAdapter);
        destinationSpinner.setAdapter(indianStateAdapter);

        // Set a click listener for the Go button
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the selected states from the spinners
                String sourceState = sourceSpinner.getSelectedItem().toString();
                String destinationState = destinationSpinner.getSelectedItem().toString();

                // Save selected states in SharedPreferences
                SharedPreferences sharedPref = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("source", sourceState);
                editor.putString("destination", destinationState);
                editor.apply();

                // Create an intent to start the next activity
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}
