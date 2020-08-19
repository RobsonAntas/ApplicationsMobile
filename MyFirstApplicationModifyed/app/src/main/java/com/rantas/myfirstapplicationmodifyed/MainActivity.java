package com.rantas.myfirstapplicationmodifyed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickOn_1btn(View view){
    TextView message = findViewById(R.id._1message);
    message.setVisibility(view.VISIBLE);
    }

    public void clickOn_2btn(View view){
        counter+=1;
        TextView number = findViewById(R.id.tv_total);
        number.setText(String.valueOf(counter));
    }
    public void clickOn_3btn(View view){
        this.counter=0;
        TextView reset = findViewById(R.id.tv_total);
        reset.setText(String.valueOf(this.counter));
        TextView _2reset = findViewById(R.id._1message);
        _2reset.setVisibility(view.INVISIBLE);

    }


   }