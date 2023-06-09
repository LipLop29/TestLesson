package com.example.testlesson.presentation.ui.fragments

import com.example.testlesson.domain.usecase.FilmsUseCase
import com.example.testlesson.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FilmsViewModel @Inject constructor(
    private val fetchFilmsUseCase: FilmsUseCase

) : BaseViewModel() {

    fun fetchFilms() = fetchFilmsUseCase.invoke()

}