package com.example.data.online_data_source

import com.example.data.api.WebServices
import com.example.data.api.core.ApiConst
import com.example.data.models.ArticleResponseModel
import com.example.data.models.SourceResponseModel
import javax.inject.Inject

class OnlineDataSourceImpl @Inject constructor(private val webServices: WebServices) : OnlineDataSource {
    override suspend fun getArticleSource(): SourceResponseModel {
        return webServices.getSource(ApiConst.apiKey)
    }

    override suspend fun getArticles(): ArticleResponseModel {
        return webServices.getArticles(ApiConst.apiKey)
    }
}