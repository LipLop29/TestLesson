package com.example.testlesson.presentation.ui.fragments

import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.testlesson.R
import com.example.testlesson.databinding.FragmentFilmsBinding
import com.example.testlesson.presentation.base.BaseFragment
import com.example.testlesson.presentation.models.toUI
import com.example.testlesson.presentation.ui.adapter.FilmsAdapter
import com.example.testlesson.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FilmsFragment :
    BaseFragment<FilmsViewModel, FragmentFilmsBinding>(R.layout.fragment_films) {

    override val binding by viewBinding(FragmentFilmsBinding::bind)
    override val viewModel by viewModels<FilmsViewModel>()
    private var filmsAdapter = FilmsAdapter(this::onItemClick)

    override fun initialise() {
        binding.animeRecView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = filmsAdapter
        }
    }

    override fun setupSubscribes() {
        subscribeToFetchManga()
    }

    private fun subscribeToFetchManga() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.fetchFilms().collect {
                    when (it) {
                        is Resource.Error -> {
                            Toast.makeText(requireContext(), "error", Toast.LENGTH_SHORT).show()
                        }

                        is Resource.Loading -> {}
                        is Resource.Success -> {
                            filmsAdapter.submitList(it.data?.map {
                                it.toUI()
                            })
                        }
                    }
                }
            }
        }
    }

    private fun onItemClick(
        id: String
    ) {
        findNavController().navigate(
            R.id.action_filmsFragment_to_detailFilmsFragment
        )
    }
}