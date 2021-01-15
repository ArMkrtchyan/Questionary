package com.example.questionaryartsakh.utils

import android.app.Activity
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.lifecycle.LiveData
import com.example.questionaryartsakh.R
import com.example.questionaryartsakh.databinding.DialogDeleteBinding
import com.example.questionaryartsakh.databinding.DialogSendBinding

object DialogUtil {
    fun deleteDialog(context: Activity, description: String, confirm: () -> Unit) {
        val dialogBuilder = AlertDialog.Builder(context)
        val dialogBinding = DialogDeleteBinding.inflate(LayoutInflater.from(context), null, false).apply {
            this.description.text = description
        }
        dialogBuilder.setView(dialogBinding.root)
        dialogBuilder.setCancelable(true)
        val alertDialog = dialogBuilder.create()
        dialogBinding.delete.setOnClickListener {
            confirm.invoke()
            alertDialog.dismiss()
        }
        dialogBinding.cancel.setOnClickListener {
            alertDialog.dismiss()
        }
        alertDialog.window?.setBackgroundDrawable(ContextCompat.getDrawable(context, R.color.transparent))
        alertDialog.window?.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        alertDialog.show()
    }

    fun sendDialog(context: Activity, state: LiveData<Int>, confirm: () -> Unit) {
        val dialogBuilder = AlertDialog.Builder(context)
        val dialogBinding = DialogSendBinding.inflate(LayoutInflater.from(context), null, false).apply {
            state.observeForever {
                this.state = it
            }
        }
        dialogBuilder.setView(dialogBinding.root)
        dialogBuilder.setCancelable(true)
        val alertDialog = dialogBuilder.create()
        dialogBinding.delete.setOnClickListener {
            confirm.invoke()
        }
        dialogBinding.ok.setOnClickListener {
            alertDialog.dismiss()
        }
        dialogBinding.cancel.setOnClickListener {
            alertDialog.dismiss()
        }
        alertDialog.window?.setBackgroundDrawable(ContextCompat.getDrawable(context, R.color.transparent))
        alertDialog.window?.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        alertDialog.show()
    }

    //    fun editChatDialog(chat: Chat, context: Activity, edit: (ChatEntity) -> Unit) {
    //        val dialogBuilder = AlertDialog.Builder(context)
    //        val dialogBinding = DialogAddChatBinding.inflate(LayoutInflater.from(context), null, false)
    //        dialogBuilder.setView(dialogBinding.root)
    //        dialogBuilder.setCancelable(true)
    //        dialogBinding.inputField.requestFocus()
    //        dialogBinding.inputField.setText(chat.userName)
    //        dialogBinding.inputField.setSelection(chat.userName.length)
    //        Utils.showKeyboard(context, dialogBinding.inputField)
    //        dialogBinding.title.text = "Edit chat name"
    //        val alertDialog = dialogBuilder.create()
    //        dialogBinding.confirm.setOnClickListener {
    //            if (dialogBinding.inputField.text.toString().isEmpty()) {
    //                Toast.makeText(context, "Please enter chat name.", Toast.LENGTH_SHORT).show()
    //                return@setOnClickListener
    //            }
    //            alertDialog.dismiss()
    //            edit(ChatEntity(chat.id, dialogBinding.inputField.text.toString(), chat.userPhoto, chat.isNewMessageContain,
    //                Utils.dateToStringWithTimeZone(Date()) ?: ""))
    //        }
    //        dialogBinding.cancel.setOnClickListener {
    //            alertDialog.dismiss()
    //        }
    //        alertDialog.window?.setBackgroundDrawable(ContextCompat.getDrawable(context, R.color.transparent))
    //        alertDialog.window?.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
    //        alertDialog.show()
    //    }

}