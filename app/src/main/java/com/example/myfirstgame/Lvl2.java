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

public class Lvl2 extends AppCompatActivity {
    private int sum = 0;
    private ImageView number8Button, number4Button, number7Button, number3Button,
    backButton, number9Button, checkButton;
    private TextView screenTextView;
    private Chronometer chronometer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.lvl2);

        number8Button = findViewById(R.id.number8ButtonLvl2);
        number4Button = findViewById(R.id.number4ButtonLvl2);
        number7Button = findViewById(R.id.number7ButtonLvl2);
        number3Button = findViewById(R.id.number3ButtonLvl2);
        number9Button = findViewById(R.id.number9ButtonLvl2);
        checkButton = findViewById(R.id.checkButtonLvl2);
        backButton = findViewById(R.id.backButtonLvl2);
        chronometer = findViewById(R.id.chronometerLvl2);
        screenTextView = findViewById(R.id.screenTextViewLvl2);

        chronometer.start();

        number8Button.setOnClickListener(v -> {
            sum += 8;
            screenTextView.setText(String.valueOf(sum));
        });
        number4Button.setOnClickListener(v -> {
            sum += 4;
            screenTextView.setText(String.valueOf(sum));
        });
        number7Button.setOnClickListener(v -> {
            sum += 7;
            screenTextView.setText(String.valueOf(sum));
        });
        number3Button.setOnClickListener(v -> {
            sum += 3;
            screenTextView.setText(String.valueOf(sum));
        });
        number9Button.setOnClickListener(v -> {
            sum += 9;
            screenTextView.setText(String.valueOf(sum));
        });
        checkButton.setOnClickListener(v -> {
            if (sum == 33){
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
