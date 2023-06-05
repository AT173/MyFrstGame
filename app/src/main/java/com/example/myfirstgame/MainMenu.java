package com.example.myfirstgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {
    private ImageView startButton, quitButton, rulesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main_menu);

        startButton = findViewById(R.id.startButton);
        quitButton = findViewById(R.id.quitButton);
        rulesButton = findViewById(R.id.rulesMNButton);

        startButton.setOnClickListener(v -> {
            Intent i = new Intent(this, Levels.class);
            startActivity(i);
        });
        quitButton.setOnClickListener(v -> {
            this.finishAffinity();
        });
        rulesButton.setOnClickListener(v -> {
            Intent i = new Intent(this, Rules.class);
            startActivity(i);
        });
    }
}
