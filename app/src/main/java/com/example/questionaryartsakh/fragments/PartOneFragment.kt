package com.example.questionaryartsakh.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.questionaryartsakh.BlankApp
import com.example.questionaryartsakh.MainActivity
import com.example.questionaryartsakh.databinding.FragmentPartOneBinding

class PartOneFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return FragmentPartOneBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            blank = BlankApp.getInstance().getBlank()
            (activity as MainActivity).setSupportActionBar(toolbar)
            next.setOnClickListener {
                BlankApp.getInstance().getBlank().also {
                    it.telephone = telephone.text.toString()
                }
                view?.findNavController()?.navigate(PartOneFragmentDirections.actionPartOneFragmentToPartTwoFragment())
            }
        }.root
    }

}