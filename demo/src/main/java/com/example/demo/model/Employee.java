package com.example.demo.model;

import jakarta.persistence.*;

//@Entity(name = "employee")
@Entity
@Table
public class Employee {

    @Id
    @SequenceGenerator(
            name = "ems_id_sequence",
            sequenceName = "ems_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ems_id_sequence"
    )
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String title;

    public Employee() {}

    public Employee(
            Integer id,
            String firstName,
            String lastName,
            String email,
            String title
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
    }

    //@Id
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

    public String getTitle() {
        return title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
