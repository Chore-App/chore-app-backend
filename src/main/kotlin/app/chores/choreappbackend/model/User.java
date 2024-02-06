package app.chores.choreappbackend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity declares that this represents a table
//@Table() correlates this object to a Table
//@Id specifies the Primary Key
@Entity
@Table(name = "users")
public class User {
    @Id
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private User() {
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
