package com.example.myfirstgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Levels extends AppCompatActivity {
    private ImageView level1Button, level2Button,
            level3Button, level4Button, level5Button, backButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.levels);

        level1Button = findViewById(R.id.level1Button);
        level2Button = findViewById(R.id.level2Button);
        level3Button = findViewById(R.id.level3Button);
        level4Button = findViewById(R.id.level4Button);
        level5Button = findViewById(R.id.level5Button);
        backButton = findViewById(R.id.backButton);

        level1Button.setOnClickListener(v -> {
            Intent i = new Intent(this, Lvl1.class);
            startActivity(i);
        });
        level2Button.setOnClickListener(v -> {
            Intent i = new Intent(this, Lvl2.class);
            startActivity(i);
        });
        level3Button.setOnClickListener(v -> {
            Intent i = new Intent(this, Lvl3.class);
            startActivity(i);
        });
        level4Button.setOnClickListener(v -> {
            Intent i = new Intent(this, Lvl4.class);
            startActivity(i);
        });
        level5Button.setOnClickListener(v -> {
            Intent i = new Intent(this, Lvl5.class);
            startActivity(i);
        });

        backButton.setOnClickListener(v -> {
            Intent i = new Intent(this, MainMenu.class);
            startActivity(i);
        });
    }
}
