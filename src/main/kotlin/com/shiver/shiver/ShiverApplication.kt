package com.shiver.shiver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShiverApplication

fun main(args: Array<String>) {
    runApplication<ShiverApplication>(*args)
}