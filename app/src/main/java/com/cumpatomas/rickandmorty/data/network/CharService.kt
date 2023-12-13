package com.cumpatomas.rickandmorty.data.network

import com.cumpatomas.rickandmorty.domain.model.JsonModel
import javax.inject.Inject

class CharService@Inject constructor(private val retrofit: CharactersApi) {

    suspend fun getAllChars(
        query: String,
        page: String = ""
    ): ResponseEvent<JsonModel> {
        return try {
            val url = when {
                query.isEmpty() -> "character/?page=$page"
                else -> "character/?name=$query&page=$page"
            }
            val response = retrofit.getChars(url)
            if (response.isSuccessful) {
                response.body()?.let { jsonData ->
                    ResponseEvent.Success(jsonData)
                } ?: run {
                    ResponseEvent.Error(Exception("Response body is null."))
                }
            } else {
                ResponseEvent.Error(Exception("Chars data retrieve failed."))
            }
        } catch (e: Exception) {
            ResponseEvent.Error(e)
        }
    }
}
