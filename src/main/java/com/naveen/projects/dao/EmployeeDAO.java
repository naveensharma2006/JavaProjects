package com.naveen.projects.dao;



import com.naveen.projects.pojos.Employee;

/**
 * @author naveensharma
 *
 */
public interface EmployeeDAO {
	
	public int getEmployeeID(String name);
	
	public Employee getEmployeeDetails(String name);
	
	

}
