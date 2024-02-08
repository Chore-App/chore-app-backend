package app.chores.choreappbackend.repository;

import app.chores.choreappbackend.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int>{}
