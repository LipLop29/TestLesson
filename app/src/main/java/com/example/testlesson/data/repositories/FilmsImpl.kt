package com.example.testlesson.data.repositories

import com.example.testlesson.data.base.BaseRepository
import com.example.testlesson.data.dtos.toDomain
import com.example.testlesson.data.remote.apiservices.FilmsApi
import com.example.testlesson.domain.models.Films
import com.example.testlesson.domain.repositories.FilmsRepository
import com.example.testlesson.utils.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FilmsImpl @Inject constructor(
    private val filmsApiService: FilmsApi
) : BaseRepository(), FilmsRepository {

    override fun fetchFilms() = doRequest {
        filmsApiService.fetchFilms().map {
            it.toDomain()
        }
    }

    override fun fetchFilmsDetail(id: String) = doRequest{
        filmsApiService.fetchDetailFilms(id).toDomain()
    }

}