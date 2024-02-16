package app.chores.choreappbackend.model

import jakarta.persistence.*

@Entity
@Table(name = "categories")
class Category {
    @Id
    val id : Int = 0

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    val user : User = User()


    val name : String = ""
}