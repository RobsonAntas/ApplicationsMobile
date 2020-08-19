package com.rantas.tinddevs.routerRepo;

import android.content.Context;

import com.rantas.tinddevs.model.Dev;
import com.rantas.tinddevs.model.Messenger;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DevRepo {
    private Context context;
    public DevRepo(Context context) {
        this.context = context;
    }

    public interface RequestResult{
        <T> void successful(T request);
        void message(Messenger messenger);
    }



    public void getDevRepo(final RequestResult requestResult){
        Call<List<Dev>> call = new ConfigRouter().getAllDevs().getAllGuitHubDevs();

        call.enqueue(new Callback<List<Dev>>() {
            @Override
            public void onResponse(Call<List<Dev>> call, Response<List<Dev>> response) {
                List<Dev> devList = response.body();
                requestResult.successful(devList);
            }

            @Override
            public void onFailure(Call<List<Dev>> call, Throwable t) {
                requestResult.message(new Messenger(t.getMessage(), 500));
            }
        });

    }
}

