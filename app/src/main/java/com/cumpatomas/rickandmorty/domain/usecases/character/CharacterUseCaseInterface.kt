package com.cumpatomas.rickandmorty.domain.usecases.character

import com.cumpatomas.rickandmorty.domain.model.Character

interface CharacterUseCaseInterface {

    suspend fun getAllCharacters() : List<Character>
}