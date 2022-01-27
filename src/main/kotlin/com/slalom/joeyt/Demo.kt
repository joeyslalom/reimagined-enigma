package com.slalom.joeyt

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