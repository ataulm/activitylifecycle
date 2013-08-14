package com.example.Lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnotherActivity extends LoggingActivity {
    private static final String TAG = AnotherActivity.class.getSimpleName();
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_activity);
    }
}
