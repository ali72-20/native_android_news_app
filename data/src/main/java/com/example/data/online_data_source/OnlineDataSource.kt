package com.example.data.online_data_source

import com.example.data.models.ArticleResponseModel
import com.example.data.models.SourceResponseModel

interface OnlineDataSource {
    suspend fun getArticleSource() : SourceResponseModel
    suspend fun getArticles():ArticleResponseModel;
}