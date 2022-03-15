package com.example.projecteseasonshighblassillimanmuskettbuhanti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button RunTestButton = findViewById(R.id.RunTestButton);
        ClickListener boopHearer = new ClickListener();
        RunTestButton.setOnClickListener(boopHearer);
    }

    public static void main(String args[]) {

    }
    
    public class ClickListener implements View.OnClickListener {


    @Override
    public void onClick(View view) {

    }
}
}