package com.cumpatomas.rickandmorty.data.datasource.character.remote.dto

import com.google.gson.annotations.SerializedName

data class CharacterResponseDto(
    @SerializedName("results")
    var charactersList: List<CharacterDto>?,
    var info: Pages
)

data class CharacterDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("species")
    val species: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("image")
    val image: String
    )

data class Pages(
    @SerializedName("pages")
    val pages: Int
)

