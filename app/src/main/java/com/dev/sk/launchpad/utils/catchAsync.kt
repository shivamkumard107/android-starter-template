package com.dev.sk.launchpad.utils

suspend fun <T> catchAsync(apiCall: suspend () -> T): Result<T> {
    try {
        return Result.success(apiCall())
    } catch (e: Exception) {
        e.printStackTrace()
        return Result.failure(e)
    }
}