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

public class Lvl4 extends AppCompatActivity {
	private int sum = 0;
	private ImageView number6Button, number5Button, number7Button,
	number9Button, backButton, checkButton;
	private TextView screenTextView;
	private Chronometer chronometer;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.lvl4);

		number6Button = findViewById(R.id.number6ButtonLvl4);
		number5Button = findViewById(R.id.number5ButtonLvl4);
		number7Button = findViewById(R.id.number7ButtonLvl4);
		number9Button = findViewById(R.id.number9ButtonLvl4);
		checkButton = findViewById(R.id.checkButtonLvl4);
		backButton = findViewById(R.id.backButtonLvl4);
		chronometer = findViewById(R.id.chronometerLvl4);
		screenTextView = findViewById(R.id.screenTextViewLvl4);

		chronometer.start();
		number6Button.setOnClickListener(v -> {
			sum += 6;
			screenTextView.setText(String.valueOf(sum));
		});
		number5Button.setOnClickListener(v -> {
			sum += 5;
			screenTextView.setText(String.valueOf(sum));
		});
		number7Button.setOnClickListener(v -> {
			sum += 7;
			screenTextView.setText(String.valueOf(sum));
		});
		number9Button.setOnClickListener(v -> {
			sum += 9;
			screenTextView.setText(String.valueOf(sum));
		});
		checkButton.setOnClickListener(v -> {
			if (sum == 22){
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
