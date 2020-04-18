package com.example.git.ui.search

import android.content.Context
import android.content.Intent
import android.view.View
import com.example.git.BaseViewModel
import com.example.git.Util.NotNullMutableLiveData
import com.example.git.data.remote.API.SearchAPI
import com.example.git.data.remote.domain.Repository
import com.example.git.extension.with
import com.example.git.ui.repoDetails.RepoActivity

/**
 * Created by Tushar Garg on 17/4/20.
 */

class SearchViewModel(private val api: SearchAPI) : BaseViewModel() {
    private var query: String = ""
        get() = if (field.isEmpty()) "nsp" else field

    private val _refreshing: NotNullMutableLiveData<Boolean> = NotNullMutableLiveData(false)
    val refreshing: NotNullMutableLiveData<Boolean>
        get() = _refreshing

    private val _items: NotNullMutableLiveData<List<Repository>> =
        NotNullMutableLiveData(arrayListOf())
    val items: NotNullMutableLiveData<List<Repository>>
        get() = _items

    fun doSearch() {
        val params = mutableMapOf<String, String>().apply {
            this["q"] = query
            this["sort"] = "stars"
        }

        addToDisposable(api.search(params).with()
            .doOnSubscribe { _refreshing.value = true }
            .doOnSuccess { _refreshing.value = false }
            .doOnError { _refreshing.value = false }
            .subscribe({
                _items.value = it.repositories
            }, {
                // handle errors
            })
        )
    }

    fun onQueryChange(query: CharSequence) {
        this.query = query.toString()
    }

    fun showDetails(item: Repository, view: View) {

        val context: Context = view.context
        val intent = Intent(context, RepoActivity::class.java)
        intent.putExtra("name", item.fullName)
        intent.putExtra("link", item.gitURL)
        intent.putExtra("description", item.description)
        intent.putExtra("image_url", item.owner.avatarUrl)
        context.startActivity(intent)

    }
}