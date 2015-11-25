package com.example.arthur.trabr2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


/**
 * Created by Arthur on 23/11/2015.
 */
public class SplashActivity extends Activity implements Runnable {

    private static final long Tempo_limite = 2000;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Handler SplashScreen = new Handler();
        SplashScreen.postDelayed(this, Tempo_limite);
    }


    @Override
    public void run() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
