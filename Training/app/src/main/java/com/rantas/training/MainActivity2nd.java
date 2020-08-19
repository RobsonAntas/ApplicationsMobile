package com.rantas.training;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.rantas.training.model.AboutFood;

public class MainActivity2nd extends AppCompatActivity {
    public static final String LOG2nd = MainActivity2nd.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2nd);


        Intent nIntent = getIntent();
        Log.i(LOG2nd, "second activy");
        AboutFood rAboutFood = (AboutFood) nIntent.getSerializableExtra(MyAdapter.MyViewHolder.RECEIP);
        TextView text = findViewById(R.id._2ndScrenText);
        text.setText(rAboutFood.getFood());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG2nd, "2ndActivy on Start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG2nd, "2ndActivy on Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG2nd, "2ndActivy on Stop");
    }
}