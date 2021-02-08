package com.example.questionaryartsakh.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.example.questionaryartsakh.BlankApp
import com.example.questionaryartsakh.MainActivity
import com.example.questionaryartsakh.database.BlankRepository
import com.example.questionaryartsakh.database.entity.BlankEntity
import com.example.questionaryartsakh.databinding.FragmentPartSixBinding
import com.example.questionaryartsakh.viewmodels.PartSixViewModel
import com.google.gson.Gson
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class PartSixFragment : Fragment() {

    @ExperimentalCoroutinesApi
    private val repository by lazy { BlankRepository() }
    @ExperimentalCoroutinesApi
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return FragmentPartSixBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            vModel = ViewModelProvider(this@PartSixFragment)[PartSixViewModel::class.java]
            (activity as MainActivity).setSupportActionBar(toolbar)
            next.setOnClickListener {
                lifecycleScope.launch {
                    val json = BlankApp.getInstance().getBlank().toJson()
                    Log.i("data", json)
                    repository.insertBlank(BlankEntity(blankJson = json)){
                        it.collect {
                            view?.findNavController()?.navigate(PartSixFragmentDirections.actionPartSixFragmentToHomeFragment())
                        }
                    }
                }
            }
        }.root
    }
}