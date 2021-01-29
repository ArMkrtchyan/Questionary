package com.example.questionaryartsakh.utils

import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import com.example.questionaryartsakh.R

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

@BindingAdapter("app:status")
fun setStatus(anyView: TextView, id: Int) {
    when (id) {
        1 -> {
            anyView.text = "Թերի լրացված"
            anyView.setTextColor(ContextCompat.getColor(anyView.context, R.color.not_fill))
        }
        2 -> {
            anyView.text = "Լրացված"
            anyView.setTextColor(ContextCompat.getColor(anyView.context, R.color.fill))
        }
        3 -> {
            anyView.text = "Ուղարկված"
            anyView.setTextColor(ContextCompat.getColor(anyView.context, R.color.sent))
        }
    }
}

@BindingAdapter("android:text")
fun EditText.bindAnyToString(value: Any?) {
    value?.let {
        setText(value.toString())
    }
}

@InverseBindingAdapter(attribute = "android:text")
fun EditText.getFloatFromBinding(): String {
    return text.toString()
}

