package com.example.naman.nutritionchoice.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.naman.nutritionchoice.R;

public class IntroActivity extends AppCompatActivity {

    private static int SPLASH_TIME=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: introduction page max 2 screens

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(IntroActivity.this,Main2Activity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME);

    }

    public void tabb(View view)
    {
        startActivity(new Intent(this,Main2Activity.class));
    }
}
