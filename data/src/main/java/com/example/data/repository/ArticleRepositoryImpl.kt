package com.example.data.repository

import com.example.domain.entities.ArticleEntity
import com.example.domain.repository.ArticleRepository


class ArticleRepositoryImpl constructor() : ArticleRepository {
    override suspend fun getArticles(sourceID: String): List<ArticleEntity> {
        TODO("Not yet implemented")
    }

}