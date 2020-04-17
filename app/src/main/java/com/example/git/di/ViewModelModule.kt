package com.example.git.di

import com.example.git.ui.search.SearchViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module


/**
 * Created by Tushar Garg on 17/4/20.
 */
val viewModelModule = module {
    viewModel { SearchViewModel(get()) }
}