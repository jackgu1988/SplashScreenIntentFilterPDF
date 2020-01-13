package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        final Uri uri = intent.getData();

        final Intent intentForActivity = new Intent(this, MainActivity.class);
        if (uri != null) {
            intentForActivity.putExtra("URI", uri.toString());
        }

        startActivity(intentForActivity);

        this.finish();
    }
}
