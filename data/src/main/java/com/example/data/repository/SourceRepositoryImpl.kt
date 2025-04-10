package com.example.data.repository

import com.example.data.online_data_source.OnlineDataSource
import com.example.domain.entities.SourceEntity
import com.example.domain.repository.SourceRepository

class SourceRepositoryImpl  constructor(private  val onlineDataSource: OnlineDataSource):
    SourceRepository {
    override suspend fun getArticleSource(): List<SourceEntity> {
        val response = onlineDataSource.getArticleSource()
        return response.toDomain()
    }

}