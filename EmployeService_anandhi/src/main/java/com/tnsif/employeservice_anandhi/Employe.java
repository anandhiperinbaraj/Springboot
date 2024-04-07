package com.tnsif.employeservice_anandhi;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employe
{
	@Id
	@Column(name="eid")
	private int eid;
	@Column(name="name")
	private String name;
	@Column(name="department")
	private String department;
	@Column(name="designation")
	private String designation;
	@Column(name="mailid")
	private String mailid;
	@Column(name="address")
	private String address;
	@Column(name="salary")
	private double salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(int eid, String name, String department, String designation, String mailid, String address,
			double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.mailid = mailid;
		this.address = address;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", name=" + name + ", department=" + department + ", designation=" + designation
				+ ", mailid=" + mailid + ", address=" + address + ", salary=" + salary + "]";
	}
}
