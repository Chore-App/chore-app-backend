package app.chores.choreappbackend

/**
 * The ChoreService interface is a service that handles business logic for the ChoreController.
 */
interface ChoreService {
    /**
     * This method returns the string that was passed in.
     * @param mimic The string to be returned.
     * @return The string that was passed in.
     */
    fun getMimic(mimic: String): String
}
