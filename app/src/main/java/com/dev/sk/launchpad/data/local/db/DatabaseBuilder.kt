package com.dev.sk.launchpad.data.local.db

import android.content.Context
import androidx.room.Room

object DatabaseBuilder {
    @Volatile
    private var INSTANCE: SampleDatabase? = null

    fun getInstance(context: Context): SampleDatabase {
        return INSTANCE ?: synchronized(this) {
            if (INSTANCE == null) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SampleDatabase::class.java,
                    "sample_db"
                ).build()
                INSTANCE = instance
                instance
            } else {
                return INSTANCE!!
            }
        }
    }
}