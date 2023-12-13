package com.cumpatomas.rickandmorty.di

import com.cumpatomas.rickandmorty.domain.repository.CharacterRepositoryInterface
import com.cumpatomas.rickandmorty.domain.usecases.character.CharacterUseCaseImpl
import com.cumpatomas.rickandmorty.domain.usecases.character.CharacterUseCaseInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun providesCharacterUseCase(repository: CharacterRepositoryInterface) : CharacterUseCaseInterface
    = CharacterUseCaseImpl(repository)
}