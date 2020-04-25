/**
 * 
 */
package com.naveen.projects.dao;

import java.util.ArrayList;
import java.util.List;

import com.naveen.projects.pojos.Employee;

/**
 * @author naveensharma
 *
 */
public class EmployeeList {

	public static List<Employee> getEmployees() {

		List<Employee> employees = new ArrayList<Employee>();

		Employee emp = new Employee(1, 25, "Naveen", "VArthur Naveen", "M");
		employees.add(emp);
		emp = new Employee(2, 20, "Sneha", "VArthur Sneha", "F");
		employees.add(emp);
		emp = new Employee(3, 25, "Saanvi", "VArthur Saanvi", "F");
		employees.add(emp);
		return employees;

	}

}
