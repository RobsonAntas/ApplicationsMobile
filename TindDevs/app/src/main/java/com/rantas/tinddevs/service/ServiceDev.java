package com.rantas.tinddevs.service;

import com.rantas.tinddevs.model.Dev;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceDev {
    @GET("photos")
    Call<List<Dev>> getAllGuitHubDevs();
}
