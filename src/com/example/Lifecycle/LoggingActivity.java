package com.example.Lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public abstract class LoggingActivity extends Activity {
    private final String TAG = getClass().getSimpleName();

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            Log.d(TAG, "wat onCreate(Bundle)");
        } else {
            Log.d(TAG, "wat onCreate()");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "wat onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "wat onRestart()");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG, "wat onConfigurationChanged(Configuration)");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "wat onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "wat onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "wat onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "wat onDestroy()");
    }
}
