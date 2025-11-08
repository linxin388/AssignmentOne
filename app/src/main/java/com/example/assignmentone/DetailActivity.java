package com.example.assignmentone;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Set up back button to close this activity and return to main
        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close current activity and return to main
            }
        });

        // Get the button ID passed from MainActivity through intent
        int buttonId = getIntent().getIntExtra("BUTTON_ID", 0);

        // Retrieve data from arrays.xml resources
        String[] titles = getResources().getStringArray(R.array.titles);
        String[] details = getResources().getStringArray(R.array.details);
        String[] images = getResources().getStringArray(R.array.images);

        // Get references to UI components
        TextView tvTitle = findViewById(R.id.tvTitle);
        TextView tvContent = findViewById(R.id.tvContent);
        ImageView ivImage = findViewById(R.id.ivImage);

        // Update UI with data corresponding to the clicked button
        tvTitle.setText(titles[buttonId]);
        tvContent.setText(details[buttonId]);

        // Set image based on the image name from arrays.xml
        String imageName = images[buttonId];
        int imageResource = getResources().getIdentifier(imageName, "drawable", getPackageName());
        ivImage.setImageResource(imageResource);
    }
}