package com.naveen.projects;

import com.naveen.projects.dao.EmployeeDAO;
import com.naveen.projects.dao.EmployeeDAOImpl;
import com.naveen.projects.pojos.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		Employee emp1 = employeeDAO.getEmployeeDetails("Sneha");
		System.out.println("Employee Details " + emp1);

		System.out.println("Employee Age " + employeeDAO.getEmployeeID("Naveen"));

	}
}
