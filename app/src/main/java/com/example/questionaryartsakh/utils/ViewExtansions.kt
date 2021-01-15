package com.example.questionaryartsakh.utils

import android.view.View
import androidx.databinding.BindingAdapter

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.isVisible(): Boolean {
    return visibility == View.VISIBLE
}

@BindingAdapter("app:visibility")
fun visibleIf(anyView: View, show: Boolean) {
    if (show) anyView.visible() else anyView.gone()
}


