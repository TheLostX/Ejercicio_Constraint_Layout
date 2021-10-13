package com.lost.ejerciciologin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView ivAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        cargarConGlide();
        //cargarConPicasso();
    }

    private void initWidgets(){

        ivAvatar = findViewById(R.id.img_avatar);

    }

    private void cargarConPicasso(){
        Picasso.get().load("https://i.blogs.es/451111/isaac/original.jpg").into(ivAvatar);
    }

    private void cargarConGlide(){
        Glide.with(this).load("https://i.blogs.es/451111/isaac/original.jpg").into(ivAvatar);
    }
}