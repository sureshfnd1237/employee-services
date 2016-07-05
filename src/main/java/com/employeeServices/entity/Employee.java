package main.java.com.employeeServices.entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity
@Table(name="EMPLOYEE")

public class Employee implements Serializable {

	private static final long serialVersionUID = 5140578452814441796L;
	@Id
	@Column(name = "EMPLOYEE_ID")
	private Integer employeeId;
	@Column(name = "EMPLOYEE_NAME")
	private String employeeName;
	@Column(name = "EMPLOYEE_DOB")
	private Date employeeDob;
	@Column(name = "EMPLOYEE_DESIGNATION")
	private String employeeDesignation;

	public Employee() {
		super();
	}   
	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}   
	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}   
	public Date getEmployeeDob() {
		return this.employeeDob;
	}

	public void setEmployeeDob(Date employeeDob) {
		this.employeeDob = employeeDob;
	}   
	public String getEmployeeDesignation() {
		return this.employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
   
}
