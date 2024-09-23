package com.example.sprintmodulo4AboutJonny;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button callButton = findViewById(R.id.call_button);
        callButton.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:123456789")); // Cambia el número por el que desees
            startActivity(callIntent);
        });
        Button contactButton = findViewById(R.id.contact_button);
        contactButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, com.example.sprintmodulo4AboutJonny.ContactActivity.class);
            startActivity(intent);
        });
    }
}
