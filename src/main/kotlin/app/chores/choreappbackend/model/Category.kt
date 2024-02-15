package app.chores.choreappbackend.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "categories")
class Category {
    @Id
    val id : Int = 0
}