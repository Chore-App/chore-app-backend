package app.chores.choreappbackend.repository;

import app.chores.choreappbackend.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int>{}
