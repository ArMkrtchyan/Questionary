package com.example.questionaryartsakh.utils

import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import com.example.questionaryartsakh.Blank
import com.example.questionaryartsakh.R
import com.google.gson.Gson
import java.text.SimpleDateFormat
import java.util.*

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

object ViewExtansions {

    @BindingAdapter("app:visibility")
    @JvmStatic
    fun visibleIf(anyView: View, show: Boolean) {
        if (show) anyView.visible() else anyView.gone()
    }

    @BindingAdapter("app:status")
    @JvmStatic
    fun setStatus(anyView: TextView, id: Int) {
        when (id) {
            1 -> {
                anyView.text = "Չուղարկված"
                anyView.setTextColor(ContextCompat.getColor(anyView.context, R.color.not_fill))
            }
            2 -> {
                anyView.text = "Ուղարկված"
                anyView.setTextColor(ContextCompat.getColor(anyView.context, R.color.sent))
            }
        }
    }

    @BindingAdapter("app:liveText")
    @JvmStatic
    fun bindAnyToString(editText: AppCompatEditText, value: MutableLiveData<String>) {
        editText.setText(value.value.toString())
        editText.addTextChangedListener {
            value.value = it.toString()
        }
    }

    @BindingAdapter("app:date")
    @JvmStatic
    fun bindDateToString(anyView: TextView, value: Long?) {
        value?.let {
            val format = SimpleDateFormat("dd MMM yyyy, HH:mm", Locale("hy", "AM")).apply {
                timeZone = TimeZone.getTimeZone("GMT+04:00")
            }
            anyView.text = format.format(Date(value))
        }
    }

}

fun Blank.Languages.toJson(): String {
    return Gson().toJson(this)
}

fun Blank.Owner.toJson(): String {
    return Gson().toJson(this)
}

fun Blank.SubFieldsMultiple.toJson(): String {
    return Gson().toJson(this)
}

fun Blank.SubFields.toJson(): String {
    return Gson().toJson(this)
}

