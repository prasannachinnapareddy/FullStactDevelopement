package com.cts.activity.main;
import java.util.List;

import com.cts.activity.bean.Employee;
import com.cts.activity.dao.EmployeeDAO;
import com.cts.activity.daoimpl.EmployeeDAOimpl;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeDAO employeeDAO = new EmployeeDAOimpl();
		Employee emp = employeeDAO.getEmployeeById(1);
	    System.out.println(emp);
		Employee employee = new Employee(103, "Akhil", "Pune", 22, 567576576L, 456456.00);
		boolean status = employeeDAO.addEmployee(employee);		
		if(status)
		{
		System.out.println("Employee Added Successfully");
		}else
		{
		System.out.println("Try Again");
		}
		Employee delemp=employeeDAO.getEmployeeById(101);
		boolean result=employeeDAO.deleteEmployee(delemp);
		if(status)
		{
		System.out.println("Employee deleted Successfully");
		}else
		{
		System.out.println("Try Again");
		}
		Employee upemp=employeeDAO.getEmployeeById(102);
		upemp.setName("cap");
		boolean output=employeeDAO.updateEmployee(upemp);
		if(output)
		{
			System.out.println("updated successfully");
		}
		else
		System.out.println("try again");
		List<Employee> list1 = employeeDAO.getAllEmployees();
		for(Employee employee2 : list1)
		{
			System.out.println(employee2);
		}
	}
}