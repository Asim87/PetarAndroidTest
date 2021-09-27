package com.example.petarandroidtest.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "employes"
)
data class Employee(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val name: String,
    val age: String,
    val department: String,
    val assignment: String,
    val salary: String,
    val urlToImage: String
)