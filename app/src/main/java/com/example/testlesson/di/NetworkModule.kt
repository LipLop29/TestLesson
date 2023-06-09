package com.example.testlesson.di

import com.example.testlesson.data.remote.RetrofitClient
import com.example.testlesson.data.remote.apiservices.FilmsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    val retrofitClient = RetrofitClient()

    @Singleton
    @Provides
    fun provideSearchApiServices(): FilmsApi {
        return retrofitClient.provideFilmsApiServices()
    }
}