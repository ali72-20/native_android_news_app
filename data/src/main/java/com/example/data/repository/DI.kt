package com.example.data.repository

import com.example.data.online_data_source.OnlineDataSource
import com.example.data.online_data_source.OnlineDataSourceImpl
import com.example.domain.repository.ArticleRepository
import com.example.domain.repository.SourceRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DI {

    @Binds
    abstract fun provideSourceRepository(
        sourceRepositoryImpl: SourceRepositoryImpl
    ): SourceRepository

    @Binds
    abstract fun provideArticleRepository(
        articleRepositoryImpl: ArticleRepositoryImpl
    ):ArticleRepository
}