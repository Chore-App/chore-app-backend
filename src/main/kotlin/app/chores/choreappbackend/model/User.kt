package app.chores.choreappbackend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity declares that this represents a table
//@Table() correlates this object to a Table
//@Id specifies the Primary Key
@Entity
@Table(name = "users")
class User (
    @Id
    val id : Int,

    val firstName : String,

    val lastName : String,

    val email : String,
)
