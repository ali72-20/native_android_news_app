package com.example.newsapp.domain.entities

data class SourceResponseEntity(
    val status: String?,
    val sources: List<SourceEntity?>? = null
)

data class SourceEntity(
    val id: String?,
    val name: String?,
    val description: String?,
    val url: String?,
    val category: String?,
    val language: String?,
    val country: String?
)
