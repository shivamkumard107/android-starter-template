package com.dev.sk.launchpad.ui

sealed class UiStatus {
    data object Loading : UiStatus()
    data object Success : UiStatus()
    data class Error(val message: String?) : UiStatus()
    data object Syncing : UiStatus()
}