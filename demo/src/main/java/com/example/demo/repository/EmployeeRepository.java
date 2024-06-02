package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

// Spring Data JPA automatically generates the implementation of the DAO interface based on conventions and provides a
// wide range of database operations out of the box, reducing the need for boilerplate code
