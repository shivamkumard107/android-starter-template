package com.dev.sk.launchpad.domain.remote

import com.dev.sk.launchpad.domain.local.CurrencyDataSource
import com.dev.sk.launchpad.domain.model.CurrencyDTO
import com.dev.sk.launchpad.domain.model.SampleDTO

class RemoteDataSource: CurrencyDataSource {
    override suspend fun getCurrencies(): Result<List<CurrencyDTO>> {
        TODO("Not yet implemented")
    }

    override suspend fun getExchangeRates(): Result<SampleDTO> {
        TODO("Not yet implemented")
    }
}