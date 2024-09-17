package com.lylog.remade.presentation

import com.lylog.remade.application.ReviewService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController
class ReviewController(
    private val reviewService: ReviewService,
) {

    @PostMapping("/reviews")
    fun createReview(@RequestBody request: ReviewRequestDto): ReviewResponseDto {
        val (contents, location) = request
        val savedReview = reviewService.createReview(contents, location)
        return savedReview.toDto()
    }
}
