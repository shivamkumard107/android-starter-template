package com.dev.sk.launchpad.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dev.sk.launchpad.data.local.dao.SampleDao
import com.dev.sk.launchpad.data.local.db.entity.SampleEntity

@Database(entities = [SampleEntity::class], version = 1, exportSchema = false)
abstract class SampleDatabase: RoomDatabase() {
    abstract fun getCurrencyExchangeDao(): SampleDao
}