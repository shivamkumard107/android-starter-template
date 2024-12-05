package com.dev.sk.launchpad.data.remote

import com.dev.sk.launchpad.data.model.ExchangeRateResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {

    @GET("api/currencies.json")
    fun getCurrencies(): Map<String, String>

    @GET("api/latest.json")
    fun getCurrenciesExchangeRate(@Query("base") base: String): ExchangeRateResponse
}