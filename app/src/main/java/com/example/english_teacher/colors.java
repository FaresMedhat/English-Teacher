package com.example.english_teacher;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.example.english_teacher.databinding.ActivityColorsBinding;

public class colors extends AppCompatActivity {
    MediaPlayer red;
    MediaPlayer black;
    MediaPlayer white;
    MediaPlayer blue;
    MediaPlayer green;



    private ActivityColorsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        red = MediaPlayer.create(this,R.raw.red);
        black = MediaPlayer.create(this,R.raw.black);
        white = MediaPlayer.create(this,R.raw.white);
        green = MediaPlayer.create(this,R.raw.green);
        blue = MediaPlayer.create(this,R.raw.blue);

        binding = ActivityColorsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(colors.this,MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        });


    }
    public void startRed(View view){
        ImageView father_view = (ImageView) view;
        red.start();
    }
    public void startBlue(View view){
        ImageView mother_view = (ImageView) view;
        blue.start();
    }
    public void startBlack(View view){
        ImageView grandMo_view = (ImageView) view;
        black.start();
    }
    public void startGreen(View view){
        ImageView grandFa_view = (ImageView) view;
        green.start();
    }
    public void startWhite(View view){
        ImageView grandFa_view = (ImageView) view;
        white.start();
    }

}