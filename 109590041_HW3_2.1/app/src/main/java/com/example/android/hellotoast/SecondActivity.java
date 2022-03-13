package com.example.android.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            ".extra.REPLY";
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        mShowCount = (TextView) findViewById(R.id.show_send_count);
        mShowCount.setText(intent.getStringExtra(MainActivity.EXTRA_MESSAGE));
    }
}