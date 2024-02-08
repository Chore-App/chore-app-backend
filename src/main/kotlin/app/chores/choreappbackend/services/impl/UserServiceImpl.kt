package app.chores.choreappbackend.services.impl

import app.chores.choreappbackend.repository.UserRepository
import app.chores.choreappbackend.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    // Sets up the repository which interfaces with a specific db table
    @Autowired
    private lateinit var userRepository: UserRepository

    override fun getUserCount(): Int {
        return userRepository.findAll().count()
    }

}