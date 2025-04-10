package com.example.domain.use_cases

import androidx.lifecycle.ViewModel
import com.example.domain.repository.ArticleRepository
import com.example.domain.repository.SourceRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object DI {

    @Provides
    fun provideGetArticleSourceUseCase(sourceRepository: SourceRepository) : GetArticlesSourceUseCase {
        return GetArticlesSourceUseCase(sourceRepository)
    }


    @Provides
    fun provideGetArticlesUseCase(articleRepository: ArticleRepository) : GetArticlesUseCase {
        return GetArticlesUseCase(articleRepository)
    }
}