package com.example.sprintmodulo4AboutJonny;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button callButton = findViewById(R.id.call_button);
        callButton.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:+56950920195")); // el numero de contacto
            startActivity(callIntent);
        });

        Button contactButton = findViewById(R.id.contact_button);
        contactButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, com.example.sprintmodulo4AboutJonny.ContactActivity.class);
            startActivity(intent);
        });
        // botón para cerrar la aplicacion
        ImageButton closeButton = findViewById(R.id.close_button);
        closeButton.setOnClickListener(v -> finishAffinity()); // cierra la app actual

    }
}

