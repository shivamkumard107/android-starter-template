package com.dev.sk.launchpad.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dev.sk.launchpad.data.local.dao.CurrencyExchangeDao
import com.dev.sk.launchpad.data.local.db.entity.ExchangeRate

@Database(entities = [ExchangeRate::class], version = 1, exportSchema = false)
abstract class ExchangeDatabase: RoomDatabase() {
    abstract fun getCurrencyExchangeDao(): CurrencyExchangeDao
}