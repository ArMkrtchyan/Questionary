package com.example.questionaryartsakh.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.questionaryartsakh.MainActivity
import com.example.questionaryartsakh.databinding.FragmentShowBlankBinding

class ShowBlankFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return FragmentShowBlankBinding.inflate(inflater, container, false).apply {
            (activity as MainActivity).setSupportActionBar(toolbar)
            next.setOnClickListener { view?.findNavController()?.navigate(ShowBlankFragmentDirections.actionShowBlankFragmentToPartOneFragment()) }
        }.root
    }
}