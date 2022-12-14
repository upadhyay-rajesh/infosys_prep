package com.example.demo.entity;

import java.io.Serializable;

//import javax.persistence.Entity;
//import javax.persistence.Id;


static
final
abstract
synchronized
transient
volatile
native
strictfp


//@Entity
public class Employee implements Serializable{
	//@Id
	private String empId;
	private transient String empName;
	private String empPassword;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	
	
}
