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

public class Lvl5 extends AppCompatActivity {
	private int sum = 0;
	private ImageView number4Button, number9Button, number6Button,
	backButton, checkButton;
	private TextView screenTextView;
	private Chronometer chronometer;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.lvl5);

		number4Button = findViewById(R.id.number4ButtonLvl5);
		number9Button = findViewById(R.id.number9ButtonLvl5);
		number6Button = findViewById(R.id.number2ButtonLvl5);
		checkButton = findViewById(R.id.checkButtonLvl5);
		backButton = findViewById(R.id.backButtonLvl5);
		chronometer = findViewById(R.id.chronometerLvl5);
		screenTextView = findViewById(R.id.screenTextViewLvl5);

		chronometer.start();
		number4Button.setOnClickListener(v -> {
			sum += 4;
			screenTextView.setText(String.valueOf(sum));
		});
		number9Button.setOnClickListener(v -> {
			sum += 9;
			screenTextView.setText(String.valueOf(sum));
		});
		number6Button.setOnClickListener(v -> {
			sum += 6;
			screenTextView.setText(String.valueOf(sum));
		});
		checkButton.setOnClickListener(v -> {
			if (sum == 69){
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
