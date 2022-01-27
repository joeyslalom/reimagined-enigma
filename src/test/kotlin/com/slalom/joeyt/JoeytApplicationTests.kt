package com.slalom.joeyt

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class JoeytApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun shouldReturn3Cars() {
		val controller = CarController()
		assertEquals(controller.cars().size, 3)
	}
}
