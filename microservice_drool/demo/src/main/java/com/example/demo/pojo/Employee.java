package com.example.demo.pojo;

public class Employee {

	private int empId;
	private String name;
	private String Location;
	private int priority;
	private String deparment;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", Location=" + Location + ", priority=" + priority
				+ ", deparment=" + deparment + "]";
	}
	
	
}
