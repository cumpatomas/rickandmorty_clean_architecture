package com.cumpatomas.rickandmorty.data.datasource.character.remote.api

import com.cumpatomas.rickandmorty.data.datasource.character.remote.dto.CharacterResponseDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface RemoteCharactersApi {
    @GET
    suspend fun getChars(
        @Url url: String
    ): Response<CharacterResponseDto>
}
