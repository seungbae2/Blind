package com.example.blindapp.data.source.remote.api

import com.example.blindapp.data.model.dto.ContentDto
import com.example.blindapp.data.model.dto.ContentResponse
import com.example.blindapp.data.model.dto.ListResponse
import retrofit2.http.*

interface ContentService {

    @GET("list")
    suspend fun getList() : ListResponse

    @POST("save")
    suspend fun saveItem(@Body ContentDto: ContentDto) : ContentResponse

    @POST("update")
    suspend fun updateItem(@Body contentDto: ContentDto) : ContentResponse

    @DELETE("{id}")
    suspend fun deleteItem(@Path("id") id: Int) : ContentResponse
}