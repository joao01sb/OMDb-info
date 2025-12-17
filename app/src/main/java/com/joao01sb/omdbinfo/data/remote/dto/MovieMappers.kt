package com.joao01sb.omdbinfo.data.remote.dto

import com.joao01sb.omdbinfo.domain.model.Movie
import com.joao01sb.omdbinfo.domain.model.MovieDetails

fun MovieSearchDto.toDomain(): Movie {
    return Movie(
        id = imdbID,
        title = Title,
        year = Year,
        type = Type,
        posterUrl = Poster
    )
}

fun MovieDetailsDto.toDomain(): MovieDetails {
    return MovieDetails(
        title = Title,
        year = Year,
        plot = Plot,
        rating = imdbRating,
        poster = Poster,
        actors = Actors
    )
}