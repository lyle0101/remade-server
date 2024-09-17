package com.lylog.remade.domain

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "reviews")
class Review(
    val contents: String,
    val location: Location,
) : BaseEntity() {

    companion object {
        fun of(contents: String, location: Location): Review {
            return Review(contents, location)
        }
    }
}
