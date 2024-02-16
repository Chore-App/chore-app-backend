package app.chores.choreappbackend.services.impl

import app.chores.choreappbackend.model.Category
import app.chores.choreappbackend.repository.CategoryRepository
import app.chores.choreappbackend.services.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryServiceImpl : CategoryService {

    @Autowired
    private lateinit var categoryRepository: CategoryRepository

    override fun getCategoryById(id: Int) : Category {
        return categoryRepository.getReferenceById(id)
    }

}