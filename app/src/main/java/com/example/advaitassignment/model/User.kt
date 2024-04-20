package com.example.advaitassignment.model

import androidx.room.Embedded
import com.example.advaitassignment.UserLinks
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("links")
    @Embedded
    val userLinks: UserLinks,
    val username: String
)
