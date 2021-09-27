package com.example.petarandroidtest.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.petarandroidtest.models.Employee

@Dao
interface EmployeeDao {

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun upsert(employee: Employee): Long

        @Query("SELECT * FROM employes")
        fun getAllArticles(): LiveData<List<Employee>>

        @Delete
        suspend fun deleteArticle(employee: Employee )

}