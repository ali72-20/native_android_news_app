package com.example.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ArticleEntity(
    val publishedAt: String? = null,
    val author: String? = null,
    val urlToImage: String? = null,
    val description: String? = null,
    val source: SourceEntity? = null,
    val title: String? = null,
    val url: String? = null,
    val content: String? = null
) : Parcelable
