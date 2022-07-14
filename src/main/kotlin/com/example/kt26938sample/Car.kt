package com.example.kt26938sample

import javax.persistence.ElementCollection
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinTable

@Entity
class Car(
    val brand: String,

    @ElementCollection
    @JoinTable(name = "feature")
    val features: List<Feature>
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}