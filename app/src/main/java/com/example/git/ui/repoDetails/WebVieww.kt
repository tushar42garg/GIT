package com.example.git.ui.repoDetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.git.R
import kotlinx.android.synthetic.main.activity_web_vieww.*

/**
 * Created by Tushar Garg on 18/4/20.
 */
class WebVieww : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_vieww)

        val url= intent.getStringExtra("url")
        gitProjectWebView.loadUrl(url)
    }
}
