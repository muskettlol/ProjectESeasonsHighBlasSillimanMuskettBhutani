package com.example.projecteseasonshighblassillimanmuskettbuhanti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Establishing run test button
        Button RunTestButton = findViewById(R.id.RunTestButton);
        TextView multiLineTV = findViewById(R.id.multiLineTV);
        ClickListener clickListener = new ClickListener(multiLineTV);
        RunTestButton.setOnClickListener(clickListener);
    }




}