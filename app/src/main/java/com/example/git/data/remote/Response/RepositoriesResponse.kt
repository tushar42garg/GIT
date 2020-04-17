package com.example.git.data.remote.Response

import com.example.git.data.remote.domain.Repository
import com.google.gson.annotations.SerializedName

/**
 * Created by Tushar Garg on 17/4/20.
 */
data class RepositoriesResponse(
    @SerializedName("total_count") val totalCount: Int,
    @SerializedName("incomplete_results") val incompleteResults: Boolean,
    @SerializedName("items") val repositories: ArrayList<Repository>
)