package com.example.git.ui.repoDetails

import android.os.Bundle
import com.example.git.R
import com.example.git.Util.GlideBindingAdapter
import com.example.git.databinding.ActivityRepoDetailsBinding
import com.example.git.ui.BindingActivity
import kotlinx.android.synthetic.main.activity_repo_details.*

/**
 * Created by Tushar Garg on 18/4/20.
 */
class RepoActivity : BindingActivity<ActivityRepoDetailsBinding>(){
    override fun getLayoutResId(): Int = R.layout.activity_repo_details

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        repoName.text = intent.getStringExtra("name")
        repoLink.text = intent.getStringExtra("link")
        repoDescription.text= intent.getStringExtra("description")
        GlideBindingAdapter.setRoundMediaResource(repoImage, intent.getStringExtra("image_url"))
    }

}