package com.dev.sk.launchpad.data.local.db

import android.content.Context
import androidx.room.Room

object DatabaseBuilder {
    @Volatile
    private var INSTANCE: ExchangeDatabase? = null

    fun getInstance(context: Context): ExchangeDatabase {
        return INSTANCE ?: synchronized(this) {
            if (INSTANCE == null) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ExchangeDatabase::class.java,
                    "exchange_db"
                ).build()
                INSTANCE = instance
                instance
            } else {
                return INSTANCE!!
            }
        }
    }
}