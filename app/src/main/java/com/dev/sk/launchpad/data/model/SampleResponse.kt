package com.dev.sk.launchpad.data.model

import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class SampleResponse(
    @SerialName("disclaimer")
    val disclaimer: String? = null,
    @SerialName("license")
    val license: String? = null,
    @SerialName("timestamp")
    val timestamp: Long? = null,
    @SerialName("base")
    val base: String? = null,
    @SerialName("rates")
    val rates: Map<String, Double>? = null
)
