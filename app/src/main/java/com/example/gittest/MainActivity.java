package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        String time = String.valueOf(calendar.getTime());
        Toast.makeText(MainActivity.this,time,Toast.LENGTH_LONG).show();


        Toast.makeText(MainActivity.this,"24",Toast.LENGTH_LONG).show();
        //adding a succhessuflu

    }
}