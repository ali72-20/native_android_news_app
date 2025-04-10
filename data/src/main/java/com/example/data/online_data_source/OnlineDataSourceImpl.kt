package com.example.data.online_data_source

import com.example.data.api.WebServices
import com.example.data.models.ArticleResponseModel
import com.example.data.models.SourceResponseModel

class OnlineDataSourceImpl public  constructor(webServices: WebServices): OnlineDataSource {
    override suspend fun getArticleSource() : SourceResponseModel {
        TODO("Not yet implemented")
    }

    override suspend fun getArticles(): ArticleResponseModel {
        TODO("Not yet implemented")
    }
}