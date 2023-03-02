package com.example.horizontalscrollapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.*;
import android.view.View;
import android.widget.Button;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "this button works!!", Toast.LENGTH_SHORT).show();
                String tag,msg;
                Log.d(tag= "om", msg= "this is working properly");
                Log.e(tag= "General", msg= "this is not working properly");
            }
        });
    }
}