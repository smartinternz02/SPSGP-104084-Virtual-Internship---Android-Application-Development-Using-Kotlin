package com.preyash.emailvalid.repository

import com.preyash.emailvalid.roomDB.GroceryDatabase
import com.preyash.emailvalid.roomDB.GroceryItems

class GroceryRepository(private val db: GroceryDatabase) {

    suspend fun insert(items: GroceryItems) = db.getGroceryDao().insert(items)
    suspend fun delete(items: GroceryItems) = db.getGroceryDao().delete(items)

    fun getAllItems() = db.getGroceryDao().getAllGroceryItems()

}