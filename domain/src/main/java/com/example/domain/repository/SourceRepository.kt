package com.example.domain.repository

import com.example.domain.entities.SourceResponseEntity

interface SourceRepository {
    suspend fun getArticleSource(): SourceResponseEntity;
}