package com.dev.sk.launchpad.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.dev.sk.launchpad.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainFragment : Fragment() {

    private val viewModel: MainFragmentViewModel by viewModels()
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        setupUI()
        setupListeners()
        collectFlows()
        return binding.root
    }

    private fun collectFlows() {}

    private fun setupListeners() {}

    private fun setupUI() {}

    companion object {
        fun instance() = MainFragment()
        const val TAG = "MainFragment"
    }


}