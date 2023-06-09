package com.example.testlesson.domain.usecase

import com.example.testlesson.domain.repositories.FilmsRepository
import javax.inject.Inject

class FilmsUseCase @Inject constructor(
    private val repository : FilmsRepository
){

    operator fun invoke() = repository.fetchFilms()
}