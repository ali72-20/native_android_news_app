package com.example.domain.use_cases

import com.example.domain.entities.SourceEntity
import com.example.domain.repository.SourceRepository
import javax.inject.Inject

class GetArticlesSourceUseCase @Inject constructor(private val sourceRepository: SourceRepository){
    suspend fun getArticlesSource():List<SourceEntity>{
        return sourceRepository.getArticleSource()
    }
}
