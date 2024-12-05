package com.dev.sk.launchpad.domain.model

import androidx.annotation.Keep

@Keep
data class ExchangeRateDTO(
    val rates: Map<String, Double?>
)