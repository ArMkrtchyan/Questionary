package com.example.questionaryartsakh.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.questionaryartsakh.MainActivity
import com.example.questionaryartsakh.R
import com.example.questionaryartsakh.databinding.FragmentPartFiveBinding
import com.example.questionaryartsakh.databinding.FragmentPartFourBinding

class PartFiveFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return FragmentPartFiveBinding.inflate(inflater, container, false).apply {
            (activity as MainActivity).setSupportActionBar(toolbar)
            next.setOnClickListener { view?.findNavController()?.navigate(PartFiveFragmentDirections.actionPartFiveFragmentToPartSixFragment()) }
        }.root
    }
}