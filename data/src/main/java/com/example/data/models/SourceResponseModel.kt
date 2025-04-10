package com.example.data.models

import com.example.domain.entities.SourceEntity

data class SourceResponseModel(
    val sources: List<SourcesItem?>? = null,
    val status: String? = null
) {
    fun toDomain(): List<SourceEntity> {
        return sources!!.map { it!!.toDomain() }
    }
}

data class SourcesItem(
    val country: String? = null,
    val name: String? = null,
    val description: String? = null,
    val language: String? = null,
    val id: String? = null,
    val category: String? = null,
    val url: String? = null
) {
    fun toDomain(): SourceEntity {
        return SourceEntity(
            id = id,
            name = name,
            description = description,
            url = url,
            category = category,
            language = language,
            country = country
        )
    }
}

