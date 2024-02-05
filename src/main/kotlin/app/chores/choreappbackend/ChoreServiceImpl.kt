package app.chores.choreappbackend

import org.springframework.stereotype.Service

/**
 * The ChoreServiceImpl class is a service that handles business logic for the ChoreController.
 */
@Service
class ChoreServiceImpl : ChoreService {
    override fun getMimic(mimic: String): String {
        return mimic
    }
}
