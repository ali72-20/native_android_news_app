package com.example.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class SourceEntity(
    val id: String?,
    val name: String?,
    val description: String?,
    val url: String?,
    val category: String?,
    val language: String?,
    val country: String?
):Parcelable
