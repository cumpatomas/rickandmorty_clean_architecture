package com.cumpatomas.rickandmorty.domain.repository

import com.cumpatomas.rickandmorty.domain.model.Character

interface CharacterRepositoryInterface {
    suspend fun getAllCharacters(): List<Character>

    suspend fun getCharactersByQuery(query: String): List<Character>
}