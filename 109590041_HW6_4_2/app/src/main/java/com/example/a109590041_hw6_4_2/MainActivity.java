package com.example.a109590041_hw6_4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public CheckBox[] CheckBoxArray = new CheckBox[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBoxArray[0] = findViewById(R.id.checkBox1);
        CheckBoxArray[1] = findViewById(R.id.checkBox2);
        CheckBoxArray[2] = findViewById(R.id.checkBox3);
        CheckBoxArray[3] = findViewById(R.id.checkBox4);
        CheckBoxArray[4] = findViewById(R.id.checkBox5);
    }

    String CheckBoxText(CheckBox view, String message)
    {
        if((view).isChecked())
        {
            message += (String)(view).getText()  + " ";
        }
        return message;
    }

    public void ShowToast(View view)
    {
        String message = "";
        message = CheckBoxText(CheckBoxArray[0], message);
        message = CheckBoxText(CheckBoxArray[1], message);
        message = CheckBoxText(CheckBoxArray[2], message);
        message = CheckBoxText(CheckBoxArray[3], message);
        message = CheckBoxText(CheckBoxArray[4], message);
        Toast.makeText(this, message,
            Toast.LENGTH_SHORT).show();
    }

}

