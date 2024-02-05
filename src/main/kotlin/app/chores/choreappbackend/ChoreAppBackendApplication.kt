package app.chores.choreappbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChoreAppBackendApplication

fun main(args: Array<String>) {
    runApplication<ChoreAppBackendApplication>(*args)
}