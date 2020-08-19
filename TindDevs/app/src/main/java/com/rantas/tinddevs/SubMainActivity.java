package com.rantas.tinddevs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.rantas.tinddevs.model.Dev;

public class SubMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_main);

        TextView textView = (TextView)findViewById(R.id.received);
        Intent mIntent = getIntent();
        Dev dev = (Dev) mIntent.getSerializableExtra("profile");
        textView.setText(dev.getTitle());
    }
}