package com.example.demo.pojo;

import java.util.List;

public class TicketPojo {

	private int ticketid;
	private String Location;
	private int priority;
	private String department;
	private String assigned;
	private List<Employee> empList;
	
	
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public String getAssigned() {
		return assigned;
	}
	public void setAssigned(String assigned) {
		this.assigned = assigned;
	}
	@Override
	public String toString() {
		return "TicketPojo [ticketid=" + ticketid + ", Location=" + Location + ", priority=" + priority
				+ ", department=" + department + ", assigned=" + assigned + ", empList=" + empList + "]";
	}
	
	
}
