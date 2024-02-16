package app.chores.choreappbackend.services

import app.chores.choreappbackend.model.Category

interface CategoryService {
    fun getCategoryById(id : Int) : Category
}