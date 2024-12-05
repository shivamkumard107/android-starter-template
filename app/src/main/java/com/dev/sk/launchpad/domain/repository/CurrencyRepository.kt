package com.dev.sk.launchpad.domain.repository

import com.dev.sk.launchpad.utils.catchAsync


interface CurrencyRepository {
    suspend fun getCurrencies()
    suspend fun getCurrencyExchangeRates()
}

class DefaultCurrencyRepository: CurrencyRepository {
    override suspend fun getCurrencies() {
        // make network call
        // make db call
    }

    override suspend fun getCurrencyExchangeRates() {
        val response = catchAsync {  }
    }

}