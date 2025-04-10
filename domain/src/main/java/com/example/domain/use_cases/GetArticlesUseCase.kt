package com.example.domain.use_cases

import com.example.domain.entities.ArticleEntity
import com.example.domain.repository.ArticleRepository

class GetArticlesUseCase constructor(private val articleRepository: ArticleRepository) {
    suspend fun getArticles(sourceID:String):List<ArticleEntity>{
        return articleRepository.getArticles(sourceID)
    }
}