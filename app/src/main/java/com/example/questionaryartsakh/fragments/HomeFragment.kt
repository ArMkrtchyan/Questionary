package com.example.questionaryartsakh.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.example.questionaryartsakh.AdapterBlanks
import com.example.questionaryartsakh.Blank
import com.example.questionaryartsakh.BlankApp
import com.example.questionaryartsakh.database.BlankRepository
import com.example.questionaryartsakh.databinding.FragmentHomeBinding
import com.example.questionaryartsakh.utils.DialogUtil
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class HomeFragment : Fragment() {

    private lateinit var mBinding: FragmentHomeBinding

    @ExperimentalCoroutinesApi
    private val repository by lazy { BlankRepository() }
    private val blanks = ArrayList<Blank>().apply {
        add(Blank(0, 1))
        add(Blank(1, 2))
        add(Blank(2, 3))
    }
    private val adapter by lazy {
        AdapterBlanks(this::edit, this::send, this::delete, this::show).apply {
            submitList(ArrayList<Blank>().apply {
                addAll(blanks)
            })
        }
    }

    @ExperimentalCoroutinesApi
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        if (!::mBinding.isInitialized) mBinding = FragmentHomeBinding.inflate(inflater, container, false).apply {
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
        }
        return mBinding.root
    }

    override fun onResume() {
        super.onResume()
        BlankApp.getInstance().releaseBlank()
    }

    private fun edit(blank: Blank) {
        view?.findNavController()?.navigate(HomeFragmentDirections.actionHomeFragmentToPartOneFragment())
    }

    private fun send(blank: Blank) {
        lifecycleScope.launch {
            val mutableLiveData = MutableLiveData(1)
            DialogUtil.sendDialog(requireActivity(), mutableLiveData) {
                lifecycleScope.launch {
                    mutableLiveData.value = 1;delay(2000);mutableLiveData.value = 2
                }
            }
            delay(2000); mutableLiveData.value = 3
        }
    }

    private fun delete(blank: Blank) {
        val description =
            if (blank.status != 3) "Դուք դեռ չեք ուղարկել հարցաթերթիկը։ Համողվա՞ծ եք, որ ցանկանում եք հեռացնել հարցաթերթիկը:" else "Համողվա՞ծ եք, որ ցանկանում եք հեռացնել հարցաթերթիկը"
        DialogUtil.deleteDialog(requireActivity(), description) {
            adapter.submitList(ArrayList<Blank>().apply { addAll(blanks.apply { remove(blank) }) })
        }
    }

    private fun show(blank: Blank) {
        view?.findNavController()?.navigate(HomeFragmentDirections.actionHomeFragmentToShowBlankFragment())
    }

}