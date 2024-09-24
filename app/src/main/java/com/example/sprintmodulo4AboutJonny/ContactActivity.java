package com.example.sprintmodulo4AboutJonny;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ImageButton whatsappButton = findViewById(R.id.whatsapp_button);
        whatsappButton.setOnClickListener(v -> {
            Toast.makeText(this, "Abriendo WhatsApp...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/56950920195"));
            startActivity(intent);
        });

        ImageButton linkedinButton = findViewById(R.id.linkedin_button);
        linkedinButton.setOnClickListener(v -> {
            Toast.makeText(this, "Abriendo LinkedIn...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/rivendell2003"));
            startActivity(intent);
        });

        ImageButton githubButton = findViewById(R.id.github_button);
        githubButton.setOnClickListener(v -> {
            Toast.makeText(this, "Abriendo GitHub...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Rivendell2003"));
            startActivity(intent);
        });

        ImageButton emailButton = findViewById(R.id.email_button);
        emailButton.setOnClickListener(v -> {
            Toast.makeText(this, "Enviando correo...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:rivendell2003@outlook.com"));
            startActivity(intent);
        });

        // boton para volver al MainActivity
        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(ContactActivity.this, MainActivity.class);
            startActivity(intent);
            finish();  // finaliza la actividad actual
        });

        // botón para cerrar la aplicacion
        ImageButton closeButton = findViewById(R.id.close_button);
        closeButton.setOnClickListener(v -> finishAffinity()); // cierra la app actual
    }
}
