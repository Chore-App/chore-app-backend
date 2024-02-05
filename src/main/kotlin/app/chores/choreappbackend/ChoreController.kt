package app.chores.choreappbackend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ChoreController(private val choreService: ChoreService) {

    @GetMapping("/mimic")
    fun index(@RequestParam("mimic") mimic: String): String {
        return choreService.getMimic(mimic)
    }
}
