/**
 * 
 */
package com.naveen.projects.pojos;

/**
 * @author naveensharma
 *
 */
public class Employee {

	@Override
	public boolean equals(Object obj) {

		boolean isEqual = false;
		Employee emp = (Employee) obj;

		if (this.age == emp.getAge()) {
			isEqual = true;

		}
		return isEqual;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", age=" + age + ", name=" + name + ", address=" + address + ", gender="
				+ gender + "]";
	}

	/**
	 * @param empId
	 * @param age
	 * @param name
	 * @param address
	 * @param gender
	 */
	public Employee(int empId, int age, String name, String address, String gender) {
		super();
		this.empId = empId;
		this.age = age;
		this.name = name;
		this.address = address;
		this.gender = gender;
	}

	private int empId;

	private int age;

	private String name;

	private String address;

	private String gender;

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

}
