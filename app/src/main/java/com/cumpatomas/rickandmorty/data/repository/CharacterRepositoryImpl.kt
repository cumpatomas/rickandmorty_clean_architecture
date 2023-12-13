package com.cumpatomas.rickandmorty.data.repository

import com.cumpatomas.rickandmorty.data.datasource.character.RemoteCharacterDataSourceInterface
import com.cumpatomas.rickandmorty.data.datasource.character.remote.dto.CharacterDto
import com.cumpatomas.rickandmorty.domain.model.Character
import com.cumpatomas.rickandmorty.domain.repository.CharacterRepositoryInterface

class CharacterRepositoryImpl(
    private val remoteDataSource: RemoteCharacterDataSourceInterface
) : CharacterRepositoryInterface {
    override suspend fun getAllCharacters(): List<Character> {
        return remoteDataSource.getAllCharacters().map { it.toDomain() }
    }

    override suspend fun getCharactersByQuery(query: String): List<Character> {
         return remoteDataSource.getCharactersByQuery(query).map { it.toDomain() }
    }

    private fun CharacterDto.toDomain(): Character {
        return Character(
            id = id,
            name = name,
            species = species,
            gender = gender,
            url = url,
            image = image,
            )
    }
}