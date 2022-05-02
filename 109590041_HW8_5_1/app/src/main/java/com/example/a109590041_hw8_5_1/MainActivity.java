package com.example.a109590041_hw8_5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int level = 0;
    ImageView battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        battery = findViewById(R.id.imageView);
    }

    public void add(View view)
    {
        if(level < 7)
        {
            level++;
        }
        battery.setImageLevel(level);
    }

    public void sub(View view)
    {
        if(level > 0)
        {
            level--;
        }
        battery.setImageLevel(level);
    }
}