package com.example.text_button;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.versionpractice.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views by ID
        EditText editTextName = findViewById(R.id.editTextName);
        Button buttonShowName = findViewById(R.id.buttonShowName);
        TextView textViewDisplayName = findViewById(R.id.textViewDisplayName);

        // Set an OnClickListener for the button
        buttonShowName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the name from the EditText
                String name = editTextName.getText().toString().trim();

                // Display the name in the TextView
                if (!name.isEmpty()) {
                    textViewDisplayName.setText("Hello, " + name + "!");
                } else {
                    textViewDisplayName.setText("Please enter a name.");
                }
            }
        });
    }
}
