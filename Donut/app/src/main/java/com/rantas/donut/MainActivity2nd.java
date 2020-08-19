package com.rantas.donut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2nd extends AppCompatActivity {
    private static final String lOG_TAG = MainActivity2nd.class.getSimpleName();
    private TextView contentMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2nd);
        contentMessage = findViewById(R.id._1stTextView2nd);
        Intent _1stIntent2nd = getIntent();
        String message = _1stIntent2nd.getStringExtra(MainActivity.EXTRA_MESSAGE);
        contentMessage.setText(message);
    }



}