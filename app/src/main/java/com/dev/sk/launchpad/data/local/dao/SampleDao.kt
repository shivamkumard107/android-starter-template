package com.dev.sk.launchpad.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.dev.sk.launchpad.data.local.db.entity.SampleEntity

@Dao
interface SampleDao {
    // @Insert
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: SampleEntity): Long

    // @Update

    // @Transaction

    // @Query
}