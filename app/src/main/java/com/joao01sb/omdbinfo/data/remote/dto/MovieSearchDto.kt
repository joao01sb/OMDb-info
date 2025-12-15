package com.joao01sb.omdbinfo.data.remote.dto

data class MovieSearchDto(
    val Title: String,
    val Year: String,
    val imdbID: String,
    val Type: String,
    val Poster: String
)
