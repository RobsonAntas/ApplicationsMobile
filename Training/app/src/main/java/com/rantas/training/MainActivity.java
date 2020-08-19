package com.rantas.training;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.rantas.training.model.AboutFood;
import com.rantas.training.repository.TextTraining;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    public static final String LOG = MainActivity.class.getSimpleName();

    private LinkedList<AboutFood> list;
    private RecyclerView mrecyclerView;
    private RecyclerView.LayoutManager mlayoutManager;
    private RecyclerView.Adapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(LOG,"on Create");
        this.list = new TextTraining().getWriting();

        mrecyclerView = findViewById(R.id.recyclerTraining);
        mlayoutManager = new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(mlayoutManager);

        madapter =new MyAdapter(this,this.list);
        mrecyclerView.setAdapter(madapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w(LOG,"on Start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(LOG,"on Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(LOG,"on Stop");
    }
}