package com.example.a109590041_hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mCount = 0;
    TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        if(savedInstanceState != null)
        {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if(isVisible)
            {
                mCount = savedInstanceState.getInt("mCount");
                if(mShowCount != null)
                    mShowCount.setText(Integer.toString(mCount));
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putBoolean("reply_visible", true);
        outState.putInt("mCount", mCount);
    }

    public void countUP(View view){
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}