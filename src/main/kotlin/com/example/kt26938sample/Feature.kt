package com.example.kt26938sample

import javax.persistence.*

@Embeddable
data class Feature(
    val name: String,
    @Embedded
    val description: Description
)