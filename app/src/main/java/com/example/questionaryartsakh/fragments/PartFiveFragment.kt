package com.example.questionaryartsakh.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.questionaryartsakh.MainActivity
import com.example.questionaryartsakh.databinding.FragmentPartFiveBinding
import com.example.questionaryartsakh.viewmodels.PartFiveViewModel

class PartFiveFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return FragmentPartFiveBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            vModel = ViewModelProvider(this@PartFiveFragment)[PartFiveViewModel::class.java]
            (activity as MainActivity).setSupportActionBar(toolbar)
            next.setOnClickListener { view?.findNavController()?.navigate(PartFiveFragmentDirections.actionPartFiveFragmentToPartSixFragment()) }
        }.root
    }
}