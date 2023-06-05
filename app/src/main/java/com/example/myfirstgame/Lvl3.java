package com.example.myfirstgame;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Lvl3 extends AppCompatActivity {
    private int sum = 0;
    private ImageView number5Button, number8Button, number9Button, number4Button,
    backButton, checkButton;
    private TextView screenTextView;
    private Chronometer chronometer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.lvl3);

        number5Button = findViewById(R.id.number5ButtonLvl3);
        number8Button = findViewById(R.id.number8ButtonLvl3);
        number9Button = findViewById(R.id.number9ButtonLvl3);
        number4Button = findViewById(R.id.number4ButtonLvl3);
        checkButton = findViewById(R.id.checkButtonLvl3);
        backButton = findViewById(R.id.backButtonLvl3);
        chronometer = findViewById(R.id.chronometerLvl3);
        screenTextView = findViewById(R.id.screenTextViewLvl3);

        chronometer.start();
        number5Button.setOnClickListener(v -> {
            sum += 5;
            screenTextView.setText(String.valueOf(sum));
        });
        number8Button.setOnClickListener(v -> {
            sum += 8;
            screenTextView.setText(String.valueOf(sum));
        });
        number9Button.setOnClickListener(v -> {
            sum += 9;
            screenTextView.setText(String.valueOf(sum));
        });
        number4Button.setOnClickListener(v -> {
            sum += 4;
            screenTextView.setText(String.valueOf(sum));
        });
        checkButton.setOnClickListener(v -> {
            if (sum == 52){
                chronometer.stop();
                chronometer.setTextAppearance(R.style.greenText);
                checkButton.setImageResource(R.drawable.green_button);
                screenTextView.setTextColor(Color.GREEN);
                Toast.makeText(this, "Уровень пройден!", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(this::finish, 2000);
            } else {
                sum = 0;
                screenTextView.setText(String.valueOf(sum));
                Toast.makeText(this, "Попробуйте еще раз", Toast.LENGTH_SHORT).show();
            }
        });
        backButton.setOnClickListener(v -> {
            finish();
        });
    }
}
