package app.chores.choreappbackend

import org.springframework.stereotype.Service

@Service
class ChoreServiceImpl : ChoreService {
    override fun getMimic(mimic: String): String {
        return mimic
    }
}
