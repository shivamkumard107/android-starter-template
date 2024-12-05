package com.dev.sk.launchpad.domain.model

import androidx.annotation.Keep

@Keep
data class SampleDTO(
    val rates: Map<String, Double?>
)