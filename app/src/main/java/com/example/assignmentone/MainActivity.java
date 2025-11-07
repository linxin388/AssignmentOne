package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * MainActivity - Main screen with four feature buttons
 * Handles navigation to DetailActivity based on button clicks
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButtonClickListeners();
    }

    /**
     * Set up click listeners for all four image buttons
     * Each button starts DetailActivity with unique ID
     */
    private void setupButtonClickListeners() {
        // Facilities button - ID 0
        ImageButton btnFacilities = findViewById(R.id.btnFacilities);
        btnFacilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity(0); // 0 represents Facilities
            }
        });

        // Events button - ID 1
        ImageButton btnEvents = findViewById(R.id.btnEvents);
        btnEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity(1); // 1 represents Events
            }
        });

        // Clubs button - ID 2
        ImageButton btnClubs = findViewById(R.id.btnClubs);
        btnClubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity(2); // 2 represents Clubs
            }
        });

        // Support button - ID 3
        ImageButton btnSupport = findViewById(R.id.btnSupport);
        btnSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity(3); // 3 represents Support
            }
        });
    }

    /**
     * Start DetailActivity with specific button ID
     * @param buttonId Unique identifier for each feature (0-3)
     */
    private void startDetailActivity(int buttonId) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("BUTTON_ID", buttonId);
        startActivity(intent);
    }
}