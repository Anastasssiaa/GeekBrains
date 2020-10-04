package com.example.myapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView greeting = findViewById(R.id.greeting);
        @SuppressLint("ResourceType") String hello = getResources().getString(R.id.greeting);
        hello += "!!";
        greeting.setText(hello);
    }

}