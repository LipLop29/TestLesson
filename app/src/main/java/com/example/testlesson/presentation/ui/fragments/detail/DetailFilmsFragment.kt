package com.example.testlesson.presentation.ui.fragments.detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.testlesson.R
import com.example.testlesson.databinding.FragmentDetailFilmsBinding
import com.example.testlesson.presentation.base.BaseFragment

//class DetailFilmsFragment :
//    BaseFragment<DetailFilmsViewModel, FragmentDetailFilmsBinding>(R.layout.fragment_detail_films) {
//
//    override val binding by viewBinding(FragmentDetailFilmsBinding::bind)
//    override val viewModel by viewModels<DetailFilmsViewModel>()
//    private val args: MangaDetailFragmentArgs by navArgs()
//
//    override fun setupSubscribes() = with(binding){
//        viewModel.fetchDetailAnime(args.id).subscribe(
//            onError = {
//            },
//            onSuccess = { it ->
//                it.data.let {
//                    itemDetailImg.setImage(it.attributesDto.posterImageDto.original)
//                    itemBigImg.setImage(it.attributesDto.posterImageDto.original)
//                    detailNameAnime.text = it.attributesDto.titlesDto.enJp
//                    tvAnimeEpisodes.text = it.attributesDto.episodeCount.toString()
//                    tvAnimeStatus.text = it.attributesDto.status
//                    tvAnimePremiered.text = it.attributesDto.startDate
//                    tvAnimeAgeRating.text = it.attributesDto.ageRatingGuide
//                    detailDescription.text = it.attributesDto.description
//                }
//            }
//        )
//    }
//}