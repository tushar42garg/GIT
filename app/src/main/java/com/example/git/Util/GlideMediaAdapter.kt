package com.example.git.Util

import android.graphics.Color
import android.widget.ImageView
import androidx.annotation.Nullable
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions
import com.example.git.R
import kotlin.math.roundToInt

/**
 * Created by Tushar Garg on 18/4/20.
 */

class GlideBindingAdapter {

    companion object {

        @JvmStatic
        @BindingAdapter("roundMediaUrl")
        fun setRoundMediaResource(view: ImageView, mediaUrl: String) {
            val density = view.context.resources.displayMetrics.density
            Glide.with(view.context)
                .load(mediaUrl)
                .apply(RequestOptions()
                    .placeholder(R.mipmap.ic_launcher)
                    .fitCenter()
                    .circleCrop()
                    .priority(Priority.HIGH))
                .format(DecodeFormat.PREFER_ARGB_8888)
                .override((420 * density).roundToInt(), (420 * density).roundToInt())
                .into(view)
        }
    }
}