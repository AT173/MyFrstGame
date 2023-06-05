package com.example.myfirstgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.icon_menu);
        try {
            Intent i = new Intent(MainActivity.this, MainMenu.class);
            new Handler().postDelayed(() -> {
                startActivity(i);
            }, 2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}