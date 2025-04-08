package com.example.newsapp.data.api

import com.example.newsapp.data.api.core.ApiConst
import com.example.newsapp.data.api.core.ApiEndPoints
import retrofit2.http.GET

interface WebServices {
    @GET("${ApiConst.baseUrl}${ApiEndPoints.sourceEndPoint}")
    fun getSource(apiKey:String,){

    }
}