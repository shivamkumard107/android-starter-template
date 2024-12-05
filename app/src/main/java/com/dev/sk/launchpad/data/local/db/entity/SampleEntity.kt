package com.dev.sk.launchpad.data.local.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sampleTable")
data class SampleEntity(
    @PrimaryKey val code: String,
    @ColumnInfo(name = "name") val name: String,
)