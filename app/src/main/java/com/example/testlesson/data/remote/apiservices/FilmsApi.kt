package com.example.testlesson.data.remote.apiservices

import com.example.testlesson.data.dtos.FilmsDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface FilmsApi {

    @GET("films")
    suspend fun fetchFilms(
        @Query("fields") fields: String = "",
        @Query("limit") limit: Int = 50
    ): List<FilmsDto>

    @GET("films/{id}")
    suspend fun fetchDetailFilms(
        @Path("id") id: String
    ): FilmsDto
}