package app.chores.choreappbackend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * The ChoreController class is a REST controller that handles HTTP requests for the ChoreService.
 */
@RestController
class ChoreController(private val choreService: ChoreService) {


    /**
     * This method handles GET requests for the /mimic endpoint.
     * This is a example endpoint. This will be deleted later.
     * @param mimic The string to be returned.
     * @return The string that was passed in.
     */
    // TODO: Remove this endpoint.
    @GetMapping("/mimic")
    fun index(@RequestParam("mimic") mimic: String): String {
        return choreService.getMimic(mimic)
    }
}
