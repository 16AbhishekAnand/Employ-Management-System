package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.Employees;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private Employees employees;

    @GetMapping("/data")
    public List<Employee> getEmployees() {
        return employees.getAllEmployelist();
    }
    @PostMapping("/empDetails")
    public void addEmployee(@RequestBody Employee employee) {
        employees.addEmployee(employee);
    }
}