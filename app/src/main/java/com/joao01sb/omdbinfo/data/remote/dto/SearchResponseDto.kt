package com.joao01sb.omdbinfo.data.remote.dto

data class SearchResponseDto(
    val Search: List<MovieSearchDto>?,
    val totalResults: String?,
    val Response: String,
    val Error: String? = null
)
