package com.cksolutions.appintents;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class GenderActivity extends AppCompatActivity {

    private LinearLayout llayout;
    private ImageView ivImagen;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        llayout = findViewById(R.id.llayout);
        ivImagen = findViewById(R.id.ivImagen);

        Intent intent = getIntent();
        boolean isMen = intent.getBooleanExtra("men",false);

        if (isMen){
            llayout.setBackgroundColor(Color.BLUE);
            ivImagen.setImageResource(R.mipmap.ic_launcher_round);
        }else {
            llayout.setBackgroundColor(Color.RED);
            ivImagen.setImageResource(R.mipmap.ic_launcher);
        }


    }



}
