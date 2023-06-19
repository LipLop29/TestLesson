package com.example.testlesson.domain.repositories

import com.example.testlesson.domain.models.Films
import com.example.testlesson.utils.Resource
import kotlinx.coroutines.flow.Flow

interface FilmsRepository {

    fun fetchFilms(): Flow<Resource<List<Films>>>

    fun fetchFilmsDetail(id: String): Flow<Resource<Films>>
}