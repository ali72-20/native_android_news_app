package com.example.domain.repository

import com.example.domain.entities.SourceEntity



interface SourceRepository {
    suspend fun getArticleSource(): List<SourceEntity>
}