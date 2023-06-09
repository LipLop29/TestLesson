package com.example.testlesson.di

import com.example.testlesson.data.repositories.FilmsImpl
import com.example.testlesson.domain.repositories.FilmsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun provideFilmsRepository(repositoryImpl: FilmsImpl): FilmsRepository
}