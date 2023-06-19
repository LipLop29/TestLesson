package com.example.testlesson.presentation.ui.fragments.detail

import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.testlesson.R
import com.example.testlesson.databinding.FragmentDetailFilmsBinding
import com.example.testlesson.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFilmsFragment :
    BaseFragment<DetailFilmsViewModel, FragmentDetailFilmsBinding>(R.layout.fragment_detail_films) {

    override val binding by viewBinding(FragmentDetailFilmsBinding::bind)
    override val viewModel by viewModels<DetailFilmsViewModel>()
    private val args: DetailFilmsFragmentArgs by navArgs()

    override fun setupSubscribes() = with(binding){
        viewModel.fetchDetailFilms(args.id).subscribe(
            onError = {
                Toast.makeText(requireContext(), "error detail", Toast.LENGTH_SHORT).show()
            },

            onSuccess = { it ->
                it.let {
                    tvName.text = it.title
                    Glide.with(imgFilm).load(it.image)
                        .into(imgFilm)
                }
            }
        )
    }
}