package com.rantas.tinddevs.routerRepo;

import com.rantas.tinddevs.service.ServiceDev;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class ConfigRouter {

    private Retrofit retrofit;

    public ConfigRouter() {

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        this.retrofit = retrofit;
    }

    public ServiceDev getAllDevs(){
        return this.retrofit.create(ServiceDev.class);
    }
}
