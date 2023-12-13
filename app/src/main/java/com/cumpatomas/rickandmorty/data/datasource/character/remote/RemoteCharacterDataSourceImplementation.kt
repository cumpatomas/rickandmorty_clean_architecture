package com.cumpatomas.rickandmorty.data.datasource.character.remote

import com.cumpatomas.rickandmorty.data.datasource.character.RemoteCharacterDataSourceInterface
import com.cumpatomas.rickandmorty.data.datasource.character.remote.api.RemoteCharactersApi
import com.cumpatomas.rickandmorty.data.datasource.character.remote.dto.CharacterDto
import javax.inject.Inject

class RemoteCharacterDataSourceImplementation @Inject constructor(
    private val api: RemoteCharactersApi
) : RemoteCharacterDataSourceInterface {
    override suspend fun getAllCharacters(): List<CharacterDto> {
        val response =
            api.getChars("character/")
        if (response.isSuccessful) {
            return response.body()?.charactersList ?: emptyList()
        } else {
            throw Exception("getting Characters FAILED")
        }
    }

    override suspend fun getCharactersByQuery(query: String): List<CharacterDto> {
        val response =
            api.getChars("character/?name=$query")
        if (response.isSuccessful) {
            return response.body()?.charactersList ?: emptyList()
        } else {
            throw Exception("getting Characters FAILED")
        }

    }
}