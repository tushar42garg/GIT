package com.example.git.di

import com.example.git.data.remote.API.SearchAPI
import org.koin.dsl.module.module
import retrofit2.Retrofit

/**
 * Created by Tushar Garg on 17/4/20.
 */val apiModule = module {
    single(createOnStart = false) { get<Retrofit>().create(SearchAPI::class.java) }
}