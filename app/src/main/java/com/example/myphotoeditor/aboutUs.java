package com.example.myphotoeditor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class aboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

                Element adsElement = new Element();
                View aboutPage = new AboutPage(this)
                        .isRTL(false)
                        .setDescription("This is the video downloader application which was developed by Aashnarayan Prasad Yadav. The main intention of the app is to make  easier and flexible for the user to download all the videos from the different platform. This app is more efficient and user friendly.  " +
                                "This app is the ultimate solution for downloading all the videos from platform like YouTube, Instagram & Facebook.")
                        .addItem(new Element().setTitle("Version 1.0"))
                        .addGroup("CONNECT WITH US!")
                        .setImage(R.drawable.icon)
                        .addInstagram("aash_yadav06")    //Your instagram id
                        .addGitHub("AashnarayanYadav06")
                        .addEmail("aashy925@gmail.com")
                        .addTwitter("AashYadav06")
                        .addFacebook("aash.yadav.96")
                        .addWebsite("Your website/")
                        .addYoutube("UCTEIw9jKantz2qvOIg3qE8g")   //Enter your youtube link here (replace with my channel link)
                        .addPlayStore("com.example.yourprojectname")   //Replace all this with your package name
                        .addItem(createCopyright())
                        .create();
                setContentView(aboutPage);
            }
            private Element createCopyright()
            {
                Element copyright = new Element();
                @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright 2024 by Aash Yadav ", Calendar.getInstance().get(Calendar.YEAR));
                copyright.setTitle(copyrightString);
                // copyright.setIcon(R.mipmap.ic_launcher);
                copyright.setGravity(Gravity.CENTER);
                copyright.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(aboutUs.this,copyrightString,Toast.LENGTH_SHORT).show();
                    }
                });
                return copyright;


            }
}