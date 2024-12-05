package com.dev.sk.launchpad.domain.remote

import com.dev.sk.launchpad.domain.local.CurrencyDataSource
import com.dev.sk.launchpad.domain.model.CurrencyDTO
import com.dev.sk.launchpad.domain.model.ExchangeRateDTO

class RemoteDataSource: CurrencyDataSource {
    override suspend fun getCurrencies(): Result<List<CurrencyDTO>> {
        TODO("Not yet implemented")
    }

    override suspend fun getExchangeRates(): Result<ExchangeRateDTO> {
        TODO("Not yet implemented")
    }
}