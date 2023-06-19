package com.example.testlesson.presentation.ui.fragments.detail

import androidx.lifecycle.ViewModel
import com.example.testlesson.domain.usecase.FilmsDetailUseCase
import com.example.testlesson.domain.usecase.FilmsUseCase
import com.example.testlesson.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailFilmsViewModel @Inject constructor(
    private val filmsUseCase: FilmsDetailUseCase

) : BaseViewModel() {
    fun fetchDetailFilms(id: String) = filmsUseCase(id)

}