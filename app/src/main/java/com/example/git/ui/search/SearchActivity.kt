package com.example.git.ui.search

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.LayoutRes
import com.example.git.R
import com.example.git.databinding.ActivityMainBinding
import com.example.git.ui.BindingActivity
import org.koin.androidx.viewmodel.ext.android.getViewModel

/**
 * Created by Tushar Garg on 17/4/20.
 */
class SearchActivity : BindingActivity<ActivityMainBinding>() {
    @LayoutRes
    override fun getLayoutResId() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.vm= getViewModel()
        binding.setLifecycleOwner(this)

    }


    }
