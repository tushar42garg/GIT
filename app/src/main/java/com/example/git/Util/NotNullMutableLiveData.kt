package com.example.git.Util

import androidx.lifecycle.MutableLiveData

/**
 * Created by Tushar Garg on 17/4/20.
 */

class NotNullMutableLiveData<T : Any>(defaultValue: T) : MutableLiveData<T>() {

    init {
        value = defaultValue
    }

    override fun getValue()  = super.getValue()!!
}