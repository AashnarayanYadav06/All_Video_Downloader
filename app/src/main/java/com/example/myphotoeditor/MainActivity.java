package com.example.myphotoeditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myphotoeditor.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.instaLinear.setOnClickListener(this);
        binding.fbLinear.setOnClickListener(this);
        binding.ytLinear.setOnClickListener(this);
        binding.reelsLinear.setOnClickListener(this);



        binding.linearabt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent=new Intent(getApplicationContext(), aboutUs.class);
                 startActivity(intent);
            }
        });
        
        binding.settingLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Setting is Coming Soon", Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public void onClick(View v) {

        int itemId = v.getId();

        if (itemId == R.id.instaLinear) {
            intentStart("https://instavideosave.net/");
        } else if (itemId == R.id.fbLinear) {
            intentStart("https://fdown.net/");
        } else if (itemId == R.id.ytLinear) {
            intentStart("https://x2mate.com/en89");
        } else if (itemId == R.id.reelsLinear) {
            intentStart("https://fdownloader.net/en/facebook-reels-downloader");
        }
    }

    public void intentStart(String url) {
        Intent intent = new Intent(getApplicationContext(), Second_Activity.class);
        intent.putExtra("url", url);
        startActivity(intent);


    }
}