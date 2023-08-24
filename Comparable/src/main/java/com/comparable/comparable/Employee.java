package com.comparable.comparable;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	private int empID;
	private String empName;
	private String emailId;
	private String empAddress;

	public Employee(int empID, String empName, String emailId, String empAddress) {
		this.empID = empID;
		this.empName = empName;
		this.emailId = emailId;
		this.empAddress = empAddress;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", emailId=" + emailId + ", empAddress="
				+ empAddress + "]";
	}

	// Comparable
	/*
	 * Comparing custom object with the integer only.
	 */

	@Override
	public int compareTo(Employee employee) {
		return this.empID - employee.empID;
	}

	// Comparing by name,address and email id
	public static Comparator<Employee> nameComparing = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getEmpName().compareTo(e2.getEmpName());
		}
	};

}
