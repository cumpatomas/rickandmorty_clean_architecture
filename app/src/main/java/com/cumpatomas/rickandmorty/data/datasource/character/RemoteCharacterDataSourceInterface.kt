package com.cumpatomas.rickandmorty.data.datasource.character

import com.cumpatomas.rickandmorty.data.datasource.character.remote.dto.CharacterDto

interface RemoteCharacterDataSourceInterface {
    suspend fun getAllCharacters(): List<CharacterDto>

    suspend fun getCharactersByQuery(query: String): List<CharacterDto>
}