package com.renault.mycrudapp.springbootcrudapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_data")
public class users_data implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String department;
	private String subDepartment;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSubDepartment(String subDepartment) {
		this.subDepartment = subDepartment;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getDepartment() {
		return department;
	}
	
	public String getSubDepartment() {
		return subDepartment;
	}
	public String getName() {
		return name;
	}
}
