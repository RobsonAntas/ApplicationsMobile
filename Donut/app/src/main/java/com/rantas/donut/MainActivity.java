package com.rantas.donut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "posting";
    public static final int REQ_CODE = 202;
    private Button _1btn;
    private ImageView  _1stImage;
    private ImageView  _2ndImage;
    private ImageView  _3thImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _1stImage = findViewById(R.id._1stImage);
        _2ndImage = findViewById(R.id._2ndImage);
        _3thImage = findViewById(R.id._3thImage);
        _1btn = findViewById(R.id._1stButton);

           _1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _1stIntent = new Intent(MainActivity.this,MainActivity2nd.class);
                _1stIntent.putExtra(EXTRA_MESSAGE,"Order");
                startActivity(_1stIntent);
            }
        });

    }

}