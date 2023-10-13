package com.example.navigationpanelbottom;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigationToHome(View view) {
        ImageView im = findViewById(R.id.user);
        HomeFragment uf = new HomeFragment();
        uf.setIm(im);
        uf.onViewCreated(view, null);
    }

    public void navigationToLibrary(View view) {
    }

    public void navigationToUser(View view) {
    }


}