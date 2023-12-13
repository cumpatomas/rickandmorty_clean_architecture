package com.cumpatomas.rickandmorty.di

import com.cumpatomas.rickandmorty.data.datasource.character.RemoteCharacterDataSourceInterface
import com.cumpatomas.rickandmorty.data.datasource.character.remote.RemoteCharacterDataSourceImplementation
import com.cumpatomas.rickandmorty.data.datasource.character.remote.api.RemoteCharactersApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    fun provideRemoteCharacterDataSource(api: RemoteCharactersApi):
            RemoteCharacterDataSourceInterface = RemoteCharacterDataSourceImplementation(api)
}