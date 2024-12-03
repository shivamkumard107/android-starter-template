package com.dev.sk.launchpad.utils

interface Mapper<U, V> {
    fun mapTo(dataModel: U): V
}