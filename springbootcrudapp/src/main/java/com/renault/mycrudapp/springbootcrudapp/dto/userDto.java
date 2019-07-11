package com.renault.mycrudapp.springbootcrudapp.dto;

import java.util.List;

import com.renault.mycrudapp.springbootcrudapp.model.users_data;

public class userDto {

	private int id;
	private String name;
	private String subDepartment;
	private String department;
	private List<users_data> users;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return name;
	}
	public void setUsername(String username) {
		this.name = username;
	}
	public String getDepartment() {
		return department;
	}
	public void setSubDepartment(String subDepartment) {
		this.subDepartment = department;
	}
	public String getSubDepartment() {
		return subDepartment;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
/*	public List<users_data> getUsers() {
		return users_data;
	}
	public void setUsers(List<users_data> users) {
		this.users = users;
	}*/
}
