package Repositary;

import Model.Employee;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {
     ArrayList<Employee> emplist = new ArrayList<Employee>();
     {
        emplist.add(new Employee(1, "Prem", "Tiwari", "chapradreams@gmail.com","Developer"));
        emplist.add(new Employee(2,"John","Marcus","jhn12@gmail.com","Q&a"));
        emplist.add(new Employee(3,"Stephen","Rock","stphan@12icloud.com","Lead"));
    }
    public List<Employee> getAllEmployees()
    {
        return emplist;
    }

    public void addEmployee(Employee employee) {

        emplist.add(employee);
    }
}
