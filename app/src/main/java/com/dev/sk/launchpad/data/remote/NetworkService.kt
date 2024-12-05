package com.dev.sk.launchpad.data.remote

import com.dev.sk.launchpad.data.model.SampleResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {

    @GET("api/latest.json")
    fun getCurrenciesExchangeRate(@Query("base") base: String): SampleResponse
}