package com.example.data.repository

import com.example.data.online_data_source.OnlineDataSource
import com.example.domain.entities.ArticleEntity
import com.example.domain.repository.ArticleRepository


class ArticleRepositoryImpl constructor(private val onlineDataSource: OnlineDataSource) : ArticleRepository {
    override suspend fun getArticles(sourceID: String): List<ArticleEntity> {
        return onlineDataSource.getArticles().toDomain()
    }
}