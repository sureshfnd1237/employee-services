package main.java.com.employeeServices.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import main.java.com.employeeServices.DAO.EmployeeDAO;
import main.java.com.employeeServices.controller.EmployeeModel;
import main.java.com.employeeServices.entity.Employee;
import main.java.com.employeeServices.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDao;


	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}


	@Override
	public Employee save(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		Employee employee = employeeDao.save(employeeModel);
		return employee;
	}

}
