package com.example.data.models

import com.example.domain.entities.ArticleEntity

data class ArticleResponseModel(
	val totalResults: Int? = null,
	val articles: List<ArticlesItem?>? = null,
	val status: String? = null
){
	fun toDomain():List<ArticleEntity>{
		return articles!!.map { it!!.toDomain() }
	}
}

data class ArticlesItem(
	val publishedAt: String? = null,
	val author: String? = null,
	val urlToImage: String? = null,
	val description: String? = null,
	val source: SourcesItem? = null,
	val title: String? = null,
	val url: String? = null,
	val content: String? = null
){
	fun toDomain():ArticleEntity{
		return ArticleEntity(
			publishedAt = publishedAt,
			author = author,
			urlToImage = urlToImage,
			description = description,
			source = source?.toDomain(),
			title = title,
			url = url,
			content = content,
		)
	}
}

