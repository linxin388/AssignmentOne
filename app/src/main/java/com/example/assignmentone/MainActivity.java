package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Facilities button click
        ImageButton btnFacilities = findViewById(R.id.btnFacilities);
        btnFacilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("BUTTON_ID", 0); // 0 for Facilities
                startActivity(intent);
            }
        });

        // Events button click
        ImageButton btnEvents = findViewById(R.id.btnEvents);
        btnEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("BUTTON_ID", 1); // 1 for Events
                startActivity(intent);
            }
        });

        // Clubs button click
        ImageButton btnClubs = findViewById(R.id.btnClubs);
        btnClubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("BUTTON_ID", 2); // 2 for Clubs
                startActivity(intent);
            }
        });

        // Support button click
        ImageButton btnSupport = findViewById(R.id.btnSupport);
        btnSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("BUTTON_ID", 3); // 3 for Support
                startActivity(intent);
            }
        });
    }
}