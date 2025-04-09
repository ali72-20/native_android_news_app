package com.example.newsapp.data.models

data class SourceResponseModel(
	val sources: List<SourcesItem?>? = null,
	val status: String? = null
)

data class SourcesItem(
	val country: String? = null,
	val name: String? = null,
	val description: String? = null,
	val language: String? = null,
	val id: String? = null,
	val category: String? = null,
	val url: String? = null
)

