package com.naveen.projects.dao;

import java.util.List;

import com.naveen.projects.pojos.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public int getEmployeeID(String name) {

		int age = 0;

		List<Employee> employees = EmployeeList.getEmployees();

		for (Employee emp : employees) {

			if (name.equalsIgnoreCase(emp.getName())) {
				age = emp.getAge();

			}
		}

		return age;
	}

	@Override
	public Employee getEmployeeDetails(String name) {

		Employee empFound;

		empFound = null;
		List<Employee> employees = EmployeeList.getEmployees();

		for (Employee emp : employees) {

			if (name.equalsIgnoreCase(emp.getName())) {
				empFound = emp;

			}
		}
		return empFound;
	}

}
