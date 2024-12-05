package com.dev.sk.launchpad.domain.model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
data class CurrencyDTO(
    val currencyCode: String,
    val currencyName: String
) : Parcelable