package com.example.questionaryartsakh.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.example.questionaryartsakh.AdapterBlanks
import com.example.questionaryartsakh.Blank
import com.example.questionaryartsakh.database.BlankRepository
import com.example.questionaryartsakh.databinding.FragmentHomeBinding
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


class HomeFragment : Fragment() {

    @ExperimentalCoroutinesApi
    private val repository by lazy { BlankRepository() }
    private val adapter by lazy {
        AdapterBlanks(this::edit, this::send, this::delete, this::show).apply {
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
    }

    @ExperimentalCoroutinesApi
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return FragmentHomeBinding.inflate(inflater, container, false).apply {
            lifecycleScope.launch {
                repository.findAllBlanks {
                    it.collect { list ->
                        // adapter.submitList(list)
                    }
                }
            }
            add.setOnClickListener {
                view?.findNavController()?.navigate(HomeFragmentDirections.actionHomeFragmentToPartOneFragment())
            }
            blanks.adapter = adapter
        }.root
    }

    private fun edit(blank: Blank) {
        view?.findNavController()?.navigate(HomeFragmentDirections.actionHomeFragmentToPartOneFragment())
    }

    private fun send(blank: Blank) {
        Toast.makeText(requireContext(),"send",Toast.LENGTH_SHORT).show()
    }

    private fun delete(blank: Blank) {
        Toast.makeText(requireContext(),"delete",Toast.LENGTH_SHORT).show()
    }

    private fun show(blank: Blank) {
        view?.findNavController()?.navigate(HomeFragmentDirections.actionHomeFragmentToShowBlankFragment())
    }

}