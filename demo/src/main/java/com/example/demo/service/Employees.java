package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Employees {
    //@Autowired
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployelist() {
        return  employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        //System.out.println("Added Sucessfully!");
        return employeeRepository.save(employee);
    }
}

