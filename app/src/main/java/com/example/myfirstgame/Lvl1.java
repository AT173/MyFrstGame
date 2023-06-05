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

public class Lvl1 extends AppCompatActivity {
    private int sum = 0;
    private TextView screenTextView;
    private ImageView number2Button, number8Button, number3Button, number4Button, number6Button,
            backButton, checkButton;
    private Chronometer chronometer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.lvl1);

        number2Button = findViewById(R.id.number2ButtonLvl1);
        number8Button = findViewById(R.id.number8ButtonLvl1);
        number3Button = findViewById(R.id.number3ButtonLvl1);
        number4Button = findViewById(R.id.number4ButtonLvl1);
        number6Button = findViewById(R.id.number6ButtonLvl1);
        checkButton = findViewById(R.id.checkButtonLvl1);
        backButton = findViewById(R.id.backButtonLvl1);
        chronometer = findViewById(R.id.chronometerLvl1);
        screenTextView = findViewById(R.id.screenTextViewLvl1);

        chronometer.start();

        number2Button.setOnClickListener(v -> {
            sum += 2;
            screenTextView.setText(String.valueOf(sum));
        });
        number8Button.setOnClickListener(v -> {
            sum += 8;
            screenTextView.setText(String.valueOf(sum));
        });
        number3Button.setOnClickListener(v -> {
            sum += 3;
            screenTextView.setText(String.valueOf(sum));
        });
        number4Button.setOnClickListener(v -> {
            sum += 4;
            screenTextView.setText(String.valueOf(sum));
        });
        number6Button.setOnClickListener(v -> {
            sum += 6;
            screenTextView.setText(String.valueOf(sum));
        });

        checkButton.setOnClickListener(v -> {
            if (sum == 45){
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
