package Controlller;

import Model.Employee;
import Repositary.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Service.Employees;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private Employees employees;
    private  EmployeeDao employeeDao;

    @GetMapping
    public List<Employee> getEmployees() {
        return employees.getAllEmployelist();
    }
    @PostMapping
    public void addEmployee(@RequestBody Employee employee) {
        employeeDao.addEmployee(employee);
    }
}