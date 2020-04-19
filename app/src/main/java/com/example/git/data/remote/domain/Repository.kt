package com.example.git.data.remote.domain

import com.google.gson.annotations.SerializedName

/**
 * Created by Tushar Garg on 17/4/20.
 */
data class Repository(
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String,

    @SerializedName("full_name") val fullName: String,
    @SerializedName("owner") val owner: Owner,
    @SerializedName("description") val description: String?,
    @SerializedName("url") val url: String,
    @SerializedName("html_url") val gitURL: String,
    @SerializedName("watchers_count") val watchersCount: Int,

    @SerializedName("score") val score: Double
)