package com.example.questionaryartsakh.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.questionaryartsakh.databinding.FragmentPartOneBinding

class PartOneFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return FragmentPartOneBinding.inflate(inflater, container, false).apply {
            next.setOnClickListener { view?.findNavController()?.navigate(PartOneFragmentDirections.actionPartOneFragmentToPartTwoFragment()) }
        }.root
    }

}