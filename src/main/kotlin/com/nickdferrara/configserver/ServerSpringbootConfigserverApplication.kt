package com.nickdferrara.configserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServerSpringbootConfigserverApplication

fun main(args: Array<String>) {
    runApplication<ServerSpringbootConfigserverApplication>(*args)
}
