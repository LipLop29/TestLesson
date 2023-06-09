package com.example.testlesson.presentation.ui.fragments.detail

import androidx.lifecycle.ViewModel
import com.example.testlesson.domain.usecase.FilmsUseCase
import com.example.testlesson.presentation.base.BaseViewModel
import javax.inject.Inject

class DetailFilmsViewModel @Inject constructor(
    private val filmsUseCase: FilmsUseCase

) : BaseViewModel() {
    // TODO: Implement the ViewModel
//    fun fetchDetailFilms(id: String) = filmsUseCase().fe(id)

}