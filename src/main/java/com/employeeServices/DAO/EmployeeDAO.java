package main.java.com.employeeServices.DAO;

import main.java.com.employeeServices.controller.EmployeeModel;
import main.java.com.employeeServices.entity.Employee;

public interface EmployeeDAO {

	Employee save(EmployeeModel employeeModel);
}
