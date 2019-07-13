package com.example.phaseonechallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonAbout;
    private Button buttonProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbout = findViewById(R.id.btn_about_alc);
        buttonProfile = findViewById(R.id.btn_my_profile);
        final Intent intentAbout = new Intent(MainActivity.this, AboutAlc.class);
        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentAbout);
            }
        });

        final Intent intentProfile = new Intent(MainActivity.this, ProfileActivity.class);
        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentProfile);
            }
        });
    }
}
