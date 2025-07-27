package com.example.english_teacher;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.example.english_teacher.databinding.ActivityFamilyBinding;

public class family extends AppCompatActivity {
    MediaPlayer father;
    MediaPlayer mother;
    MediaPlayer grandFather;
    MediaPlayer grandMother;


    private ActivityFamilyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         father = MediaPlayer.create(this,R.raw.father);
         mother = MediaPlayer.create(this,R.raw.mother);
         grandFather = MediaPlayer.create(this,R.raw.grand_father);
         grandMother = MediaPlayer.create(this,R.raw.grand_mother);

        binding = ActivityFamilyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(family.this,MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        });


    }
    public void startFather(View view){
        ImageView father_view = (ImageView) view;
        father.start();
    }
    public void startMother(View view){
        ImageView mother_view = (ImageView) view;
        mother.start();
    }
    public void startGrandMother(View view){
        ImageView grandMo_view = (ImageView) view;
        grandMother.start();
    }
    public void startGrandFather(View view){
        ImageView grandFa_view = (ImageView) view;
        grandFather.start();
    }


}