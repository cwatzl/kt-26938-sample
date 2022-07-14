package com.example.kt26938sample

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager

@DataJpaTest
class CarPersistenceTests {
    @Autowired
    private lateinit var testEm: TestEntityManager

    @Test
    fun canSaveCar() {
        val car = Car(
            brand = "Mazda",
            features = listOf(
                Feature(
                    name = "ESP",
                    description = Description(en = "For your safety", de = "Für Ihre Sicherheit")
                )
            )
        )

        testEm.persist(car)
        testEm.flush()
    }
}
