package com.dev.sk.launchpad.domain.local

import com.dev.sk.launchpad.data.model.ExchangeRateResponse
import com.dev.sk.launchpad.domain.model.CurrencyDTO
import com.dev.sk.launchpad.domain.model.ExchangeRateDTO

interface CurrencyDataSource {
    suspend fun getCurrencies(): Result<List<CurrencyDTO>>
    suspend fun getExchangeRates(): Result<ExchangeRateDTO>
}

interface LocalDataSource : CurrencyDataSource {
    suspend fun insertExchangeRate(currencyWithExchangeRate: Map<CurrencyDTO, Double?>)
    suspend fun getCurrencyExchangeRates(): Result<Map<CurrencyDTO, Double?>>
}

class DefaultLocalDataSource : LocalDataSource {
    override suspend fun insertExchangeRate(currencyWithExchangeRate: Map<CurrencyDTO, Double?>) {
        TODO("Not yet implemented")
    }

    override suspend fun getCurrencyExchangeRates(): Result<Map<CurrencyDTO, Double?>> {
        TODO("Not yet implemented")
    }

    override suspend fun getCurrencies(): Result<List<CurrencyDTO>> {
        TODO("Not yet implemented")
    }

    override suspend fun getExchangeRates(): Result<ExchangeRateDTO> {
        TODO("Not yet implemented")
    }

}
