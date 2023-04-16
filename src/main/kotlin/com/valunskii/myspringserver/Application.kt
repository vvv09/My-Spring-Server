package com.valunskii.myspringserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MySpringServerApplication

fun main(args: Array<String>) {
	runApplication<MySpringServerApplication>(*args)
}
