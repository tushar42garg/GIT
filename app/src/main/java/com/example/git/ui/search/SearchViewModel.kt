package com.example.git.ui.search

import com.example.git.BaseViewModel
import com.example.git.Util.NotNullMutableLiveData
import com.example.git.data.remote.API.SearchAPI
import com.example.git.data.remote.domain.Repository
import com.example.git.extension.with

/**
 * Created by Tushar Garg on 17/4/20.
 */

class SearchViewModel(private val api: SearchAPI) : BaseViewModel() {
    private var query: String = ""
        get() = if (field.isEmpty()) "nspiria" else field

    private val _refreshing: NotNullMutableLiveData<Boolean> = NotNullMutableLiveData(false)
    val refreshing: NotNullMutableLiveData<Boolean>
        get() = _refreshing

    private val _items: NotNullMutableLiveData<List<Repository>> = NotNullMutableLiveData(arrayListOf())
    val items: NotNullMutableLiveData<List<Repository>>
        get() = _items

    fun doSearch() {
        val params = mutableMapOf<String, String>().apply {
            this["q"] = query
            this["sort"] = "stars"
        }

        addToDisposable(api.search(params).with()
            .subscribe({
                _items.value = it.repositories
            }, {
                // handle errors
            }))
    }

    fun onQueryChange(query: CharSequence) {
        this.query = query.toString()
    }
}