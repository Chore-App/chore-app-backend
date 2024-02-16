package app.chores.choreappbackend

import app.chores.choreappbackend.services.CategoryService
import app.chores.choreappbackend.services.ChoreService
import app.chores.choreappbackend.services.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * The ChoreController class is a REST controller that handles HTTP requests for the ChoreService.
 */
@RestController
class ChoreController(private val choreService: ChoreService, private val userService: UserService, private val categoryService: CategoryService) {

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

    //Sample request to fetch number of entries in the "User" table
    // TODO: Remove this endpoint when no longer needed
    @GetMapping("/usercount")
    fun users(): Int {
        return userService.getUserCount()
    }

    @GetMapping("/categories/{categoryId}")
    fun getCategoryById(@PathVariable categoryId : Int) : Int {
        try {
            categoryService.getCategoryById(categoryId)
        } catch ( e:Exception ){
            println(e.message)
        }
        return 0
    }
}
