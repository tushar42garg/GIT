package com.example.git.ui.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.git.R
import com.example.git.data.remote.domain.Repository
import com.example.git.databinding.RepoSearchItemBinding
import com.example.git.ui.BindingViewHolder

/**
 * Created by Tushar Garg on 17/4/20.
 */
class RepositoryAdapter(var items: List<Repository> = arrayListOf(), val vm: SearchViewModel) :
    RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder {
        return RepositoryViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.repo_search_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RepositoryViewHolder, position: Int) {
        holder.binding.item = items[position]
        holder.binding.vm = vm
    }

    override fun getItemCount() = items.size
    class RepositoryViewHolder(view: View) : BindingViewHolder<RepoSearchItemBinding>(view)
}