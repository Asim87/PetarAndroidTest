package com.example.petarandroidtest.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.petarandroidtest.models.Employee

@Database(
    entities = [Employee::class],
    version = 1
)
abstract class EmployeeDb : RoomDatabase() {

    companion object {
        @Volatile
        private var instance: EmployeeDb? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also { instance = it }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                EmployeeDb::class.java,
                "petar_app.db"
            ).build()
    }
}