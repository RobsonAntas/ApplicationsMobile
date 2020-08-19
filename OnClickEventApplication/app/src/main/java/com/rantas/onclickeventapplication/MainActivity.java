package com.rantas.onclickeventapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button _1stBtn;
    private Button _2ndBtn;
    private Button _3ndBtn;
    private TextView message;
    private TextView number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _1stBtn = findViewById(R.id._1stButtom);
        _2ndBtn = findViewById(R.id._2ndButtom);
        _3ndBtn = findViewById(R.id._3thButton);
        message = findViewById(R.id._1stTextView);
        number = findViewById(R.id._2ndTextView);

        _1stBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message.setVisibility(view.VISIBLE);
            }
        });

        _2ndBtn.setOnClickListener(new View.OnClickListener() {
            int count=0;
            @Override
            public void onClick(View view) {
                count+=1;
                number.setText(String.valueOf(count));
            }
        });
        _3ndBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String zero ="0";
                number.setText(zero);
                message.setVisibility(view.INVISIBLE);
            }
        });
    }

}