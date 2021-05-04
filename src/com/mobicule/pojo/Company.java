package com.mobicule.pojo;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	private int cId;
	private String cName;
	private String cAddress;
	private String cEmail;
	private Date cDate;
	private Set<Department> departments;
	
	public Company() {
		
	}
	
	public Company(int cId, String cName, String cAddress, String cEmail, Date cDate, Set<Department> departments) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cAddress = cAddress;
		this.cEmail = cEmail;
		this.cDate = cDate;
		this.departments = departments;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public Date getcDate() {
		return cDate;
	}
	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
	public Set<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}