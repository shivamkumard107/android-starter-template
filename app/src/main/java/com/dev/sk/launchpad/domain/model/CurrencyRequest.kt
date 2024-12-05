package com.dev.sk.launchpad.domain.model

import androidx.annotation.Keep
import com.dev.sk.launchpad.domain.model.CurrencyDTO

@Keep
data class CurrencyRequest(val currencyDTO: CurrencyDTO)