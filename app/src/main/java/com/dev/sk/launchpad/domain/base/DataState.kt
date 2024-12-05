package com.dev.sk.launchpad.domain.base


sealed class DataState<T> {
    class Success<T>(response: T) : DataState<T>()
    class Error<T>(data: T?, throwable: Throwable?) : DataState<T>()
    data object Loading : DataState<Nothing>()
}