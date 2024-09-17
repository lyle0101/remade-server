package com.lylog.remade.application

import com.lylog.remade.domain.Location
import com.lylog.remade.domain.Review
import com.lylog.remade.domain.ReviewRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ReviewService(
    private val reviewRepository: ReviewRepository,
) {

    @Transactional
    fun createReview(contents: String, location: Location): Review {
        val newReview = Review.of(contents, location)
        return reviewRepository.save(newReview)
    }
}
