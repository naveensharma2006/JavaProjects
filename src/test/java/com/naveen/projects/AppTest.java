package com.naveen.projects;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.naveen.projects.dao.EmployeeDAO;
import com.naveen.projects.dao.EmployeeDAOImpl;
import com.naveen.projects.pojos.Employee;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {

		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		Employee emp1 = employeeDAO.getEmployeeDetails("Sneha");

		Employee emp = new Employee(2, 20, "Sneha", "VArthur Sneha", "F");
		assertEquals(emp, emp1);

		assertEquals(25, employeeDAO.getEmployeeID("Naveen"));
	}
}
