package com.dev.sk.launchpad.domain.base

interface UseCase<U, V> {
    suspend fun execute(request: U): V
}

interface SynchronousUseCase<U, V> {
    fun execute(request: U? = null): V
}