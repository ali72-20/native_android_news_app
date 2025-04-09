package com.example.newsapp.data.api

import com.example.newsapp.data.api.core.ApiEndPoints
import com.example.newsapp.data.api.core.ApiQueryKeys
import com.example.newsapp.data.models.SourceResponseModel
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call
interface WebServices {
    @GET(ApiEndPoints.sourceEndPoint)
    fun getSource(@Query(ApiQueryKeys.apiKey) apiKey:String):Call<SourceResponseModel>

    @GET(ApiEndPoints.everyThingEndPoint)
    fun getArticles(@Query(ApiQueryKeys.apiKey) apiKey:String)
}