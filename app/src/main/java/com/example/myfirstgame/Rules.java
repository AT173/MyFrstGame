package com.example.myfirstgame;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Rules extends AppCompatActivity {
    private ImageView understandButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);

        understandButton = findViewById(R.id.understandButton);
        understandButton.setOnClickListener(v -> {
            Intent i = new Intent(Rules.this, Levels.class);
            startActivity(i);
            finish();
        });
    }
}
