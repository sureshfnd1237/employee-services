package main.java.com.employeeServices.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import main.java.com.employeeServices.entity.Employee;
import main.java.com.employeeServices.services.EmployeeService;

@Component
@Path("/employees")
public class EmployeeServicesController {

//	@Autowired
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	
	@Path("/getEmployee/{id}")
	@GET
	@Produces("application/json")
	public Response getEmployee(@PathParam("id") int id, @QueryParam("name") String name) {
		System.out.println("Hi");
		String response = "Hello " + name + ".Your Id is " + id;

		return Response.status(200).entity(response).build();
	}

	@Path("/saveEmployee")
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response saveEmployee(EmployeeModel employeeModel) {

		Employee Employee = employeeService.save(employeeModel);
		return Response.status(201).entity(Employee).build();

	}

	@Path("/updateEmployee")
	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateEmployee(EmployeeModel employeeModel) {

		// String response = "Employee Id: "+employeeModel.getEmployeeId()+"
		// Employee Name: "+employeeModel.getEmployeeName()+" Employee
		// Designation:"+employeeModel.getEmployeeDesignation();

		// String response = data;
		return Response.status(200).entity(employeeModel).build();

	}

	@Path("/deleteEmployee/{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteEmployee(@PathParam("id") int id) {

		// String response = "Employee Id: "+employeeModel.getEmployeeId()+"
		// Employee Name: "+employeeModel.getEmployeeName()+" Employee
		// Designation:"+employeeModel.getEmployeeDesignation();
		System.out.println(id);
		// String response = data;
		return Response.noContent().build();

	}

}