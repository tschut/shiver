package com.shiver.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = [
    "com.shiver.rest"
])
class ShiverApplication

fun main(args: Array<String>) {
    runApplication<ShiverApplication>(*args)
}
