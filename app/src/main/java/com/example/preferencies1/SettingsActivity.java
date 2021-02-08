package com.example.preferencies1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //TODO: Inflar SettingsFragment

        SettingsFragment fragment = new SettingsFragment();


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contenidor_settings, fragment)
                .commit();
    }
}