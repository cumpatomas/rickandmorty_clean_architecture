package com.cumpatomas.rickandmorty.domain.usecases.character

import com.cumpatomas.rickandmorty.domain.model.Character
import com.cumpatomas.rickandmorty.domain.repository.CharacterRepositoryInterface
import javax.inject.Inject

class CharacterUseCaseImpl @Inject constructor(
    private val repository: CharacterRepositoryInterface
) : CharacterUseCaseInterface {
    override suspend fun getAllCharacters(): List<Character> {
        return repository.getAllCharacters()
    }
}