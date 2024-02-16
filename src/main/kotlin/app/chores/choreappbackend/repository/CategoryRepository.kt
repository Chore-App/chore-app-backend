package app.chores.choreappbackend.repository

import app.chores.choreappbackend.model.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Int> {}