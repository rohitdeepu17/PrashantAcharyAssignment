package com.example.advaitassignment.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.advaitassignment.data.local.dao.UnsplashImageDao
import com.example.advaitassignment.data.local.dao.UnsplashRemoteKeysDao
import com.example.advaitassignment.model.UnsplashImage
import com.example.advaitassignment.model.UnsplashRemoteKeys

@Database(entities = [UnsplashRemoteKeys::class, UnsplashImage::class], version = 1)
abstract class UnsplashDatabase: RoomDatabase() {
    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao
}