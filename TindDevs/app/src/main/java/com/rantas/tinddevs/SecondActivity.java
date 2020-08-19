package com.rantas.tinddevs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.rantas.tinddevs.model.Dev;
import com.rantas.tinddevs.model.Messenger;
import com.rantas.tinddevs.routerRepo.DevRepo;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private NewAdapter adapter;
    private DevRepo.RequestResult requestResult;
    private DevRepo devRepo;
    private Messenger messenger;
    private List<Dev> devList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        devRepo = new DevRepo(this);
        recyclerView = findViewById(R.id.myrecycler);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        devList = new ArrayList<>();
        adapter = new NewAdapter(this, devList);
        recyclerView.setAdapter(adapter);

        getResponseDown();


    }

    private void getResponseDown(){
        devRepo.getDevRepo(new DevRepo.RequestResult() {
            @Override
            public <T> void successful(T request) {
                devList = (List<Dev>) request;
                adapter.setDevList(devList);
                adapter.notifyDataSetChanged();
            }


            @Override
            public void message(Messenger messenger) {

            }
        });
    }
}