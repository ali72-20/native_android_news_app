package com.example.newsapp.data.api

import com.example.newsapp.data.api.core.ApiEndPoints
import com.example.newsapp.data.api.core.ApiQueryKeys
import com.example.newsapp.data.models.SourceResponseModel
import retrofit2.http.GET
import retrofit2.http.Query
interface WebServices {
    @GET(ApiEndPoints.sourceEndPoint)
    suspend fun getSource(@Query(ApiQueryKeys.apiKey) apiKey:String): SourceResponseModel

    @GET(ApiEndPoints.everyThingEndPoint)
    suspend fun getArticles(@Query(ApiQueryKeys.apiKey) apiKey:String)
}