package com.example.android.sunshine;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

// Do step 2 in SettingsActivity
// COMPLETED (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar
public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        // Do step 2 in SettingsActivity
        // COMPLETED (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        int id = item.getItemId();
        if (id ==android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
