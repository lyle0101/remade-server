package com.lylog.remade.presentation

import com.lylog.remade.domain.Location
import com.lylog.remade.domain.Review
import java.time.LocalDateTime

data class ReviewRequestDto(
    val contents: String,
    val location: Location,
)

data class ReviewResponseDto(
    val id: Long?,
    val contents: String,
    val location: Location,
    val createdAt: LocalDateTime,
)

fun Review.toDto() = ReviewResponseDto(
    id = id,
    contents = contents,
    location = location,
    createdAt = createdAt,
)
