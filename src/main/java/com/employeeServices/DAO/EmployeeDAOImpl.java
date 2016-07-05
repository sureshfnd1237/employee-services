package main.java.com.employeeServices.DAO;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import main.java.com.employeeServices.controller.EmployeeModel;
import main.java.com.employeeServices.entity.Employee;
@Component
public class EmployeeDAOImpl implements EmployeeDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	public Employee save(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmployeeName(employeeModel.getEmployeeName());
		employee.setEmployeeDob(new Date());
		employee.setEmployeeDesignation(employeeModel.getEmployeeDesignation());

		entityManager.persist(employee);
		
		return employee;
	}

}
