package com.example.git.data.remote.domain

import com.google.gson.annotations.SerializedName

/**
 * Created by Tushar Garg on 17/4/20.
 */
data class Owner(
    @SerializedName("id") val id: Int,
    @SerializedName("avatar_url") val avatarUrl: String,
    @SerializedName("url") val url: String,
    @SerializedName("type") val type: String
)