package com.slalom.joeyt

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class Car(val model: String, val make: String)

@RestController
class CarController {

    @GetMapping("/cars")
    fun cars(): List<Car> {
        return listOf(
            Car("nissan", "leaf"),
            Car("mazda", "cs5"),
            Car("honda", "accord")
        )
    }
}