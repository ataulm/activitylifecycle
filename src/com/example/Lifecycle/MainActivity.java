package com.example.Lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends LoggingActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void openAnotherActivity(View button) {
        Intent intent = new Intent(this, AnotherActivity.class);
        startActivity(intent);
    }
}
