package com.example.questionaryartsakh.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.questionaryartsakh.AdapterBlanks
import com.example.questionaryartsakh.Blank
import com.example.questionaryartsakh.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return FragmentHomeBinding.inflate(inflater, container, false).apply {
            add.setOnClickListener {
                view?.findNavController()
                    ?.navigate(HomeFragmentDirections.actionHomeFragmentToPartOneFragment())
            }
            blanks.adapter = AdapterBlanks {
                view?.findNavController()
                    ?.navigate(HomeFragmentDirections.actionHomeFragmentToPartOneFragment())
            }.apply {
                submitList(ArrayList<Blank>().apply {
                    add(Blank(0))
                    add(Blank(0))
                    add(Blank(0))
                    add(Blank(0))
                    add(Blank(0))
                    add(Blank(0))
                    add(Blank(0))
                    add(Blank(0))
                    add(Blank(0))
                    add(Blank(0))
                })
            }
        }.root
    }

}