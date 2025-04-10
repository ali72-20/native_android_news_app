package com.example.domain.use_cases

import com.example.domain.entities.SourceEntity
import com.example.domain.repository.SourceRepository

class GetArticlesSourceUseCase constructor(private val sourceRepository: SourceRepository){
    suspend fun getArticlesSource():List<SourceEntity>{
        return sourceRepository.getArticleSource()
    }
}
