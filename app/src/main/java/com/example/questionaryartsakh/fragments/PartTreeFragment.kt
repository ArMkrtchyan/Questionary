package com.example.questionaryartsakh.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.questionaryartsakh.MainActivity
import com.example.questionaryartsakh.R
import com.example.questionaryartsakh.databinding.FragmentPartOneBinding
import com.example.questionaryartsakh.databinding.FragmentPartTreeBinding

class PartTreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return FragmentPartTreeBinding.inflate(inflater,container,false).apply {
            (activity as MainActivity).setSupportActionBar(toolbar)
//         next.setOnClickListener { view>findNavController()?.navigate(PartOneFragmentDirections.) }
        }.root
    }

}