package app.chores.choreappbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChoreAppBackendApplication

/**
 * Entry point for the Spring Boot application.
 */
fun main(args: Array<String>) {
    runApplication<ChoreAppBackendApplication>(*args)
}
