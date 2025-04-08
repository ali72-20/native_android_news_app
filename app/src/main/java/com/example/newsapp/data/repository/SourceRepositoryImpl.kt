package com.example.newsapp.data.repository

import com.example.newsapp.data.data_source.online_data_source.OnlineDataSource
import com.example.newsapp.domain.repository.SourceRepository

class SourceRepositoryImpl public constructor(onlineDataSource: OnlineDataSource): SourceRepository {
    override fun getArticleSource() {
        TODO("Not yet implemented")
    }
}