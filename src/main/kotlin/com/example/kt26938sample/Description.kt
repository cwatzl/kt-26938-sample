package com.example.kt26938sample

import javax.persistence.*

@Embeddable
data class Description(
    @Column(name = "description_en")
    // @Access(AccessType.FIELD) // enable to make it work
    val en: String,

    @Column(name = "description_de")
    // @Access(AccessType.FIELD) // enable to make it work
    val de: String
)