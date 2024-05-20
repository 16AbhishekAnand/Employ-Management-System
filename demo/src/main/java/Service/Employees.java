package Service;

import Model.Employee;
import Repositary.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Employees {
    @Autowired
    private EmployeeDao employeeDao;
    public List<Employee> getAllEmployelist() {

        return  employeeDao.getAllEmployees();
    }

}

