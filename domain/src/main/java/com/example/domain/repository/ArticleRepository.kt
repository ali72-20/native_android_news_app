package com.example.domain.repository

import com.example.domain.entities.ArticleEntity

interface ArticleRepository {
    suspend fun getArticles(sourceID:String): List<ArticleEntity>
}