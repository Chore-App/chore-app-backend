package app.chores.choreappbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class ChoreAppBackendApplication

fun main(args: Array<String>) {
    runApplication<ChoreAppBackendApplication>(*args)
}

@RestController
class MimicController {
    @GetMapping("/mimic")
    fun index(@RequestParam("mimic") mimic: String) = mimic
}
