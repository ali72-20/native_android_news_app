package com.example.data.api

import com.example.data.api.core.ApiEndPoints
import com.example.data.api.core.ApiQueryKeys
import com.example.data.models.ArticleResponseModel
import com.example.data.models.SourceResponseModel
import retrofit2.http.GET
import retrofit2.http.Query

interface WebServices {
    @GET(ApiEndPoints.sourceEndPoint)
    suspend fun getSource(@Query(ApiQueryKeys.apiKey) apiKey:String): SourceResponseModel

    @GET(ApiEndPoints.everyThingEndPoint)
    suspend fun getArticles(@Query(ApiQueryKeys.apiKey) apiKey:String):ArticleResponseModel
}