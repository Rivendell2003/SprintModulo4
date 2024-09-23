package com.example.sprintmodulo4AboutJonny;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button contactButton = findViewById(R.id.contact_button);
        contactButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, com.example.sprintmodulo4AboutJonny.ContactActivity.class);
            startActivity(intent);
        });
    }
}
