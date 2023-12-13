package com.cumpatomas.rickandmorty.di

import com.cumpatomas.rickandmorty.data.datasource.character.RemoteCharacterDataSourceInterface
import com.cumpatomas.rickandmorty.data.repository.CharacterRepositoryImpl
import com.cumpatomas.rickandmorty.domain.repository.CharacterRepositoryInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun providesCharacterRepository(datasource: RemoteCharacterDataSourceInterface): CharacterRepositoryInterface
    = CharacterRepositoryImpl(datasource)
}