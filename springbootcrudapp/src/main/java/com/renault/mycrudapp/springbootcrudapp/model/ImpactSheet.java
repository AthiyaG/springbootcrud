package com.renault.mycrudapp.springbootcrudapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="impactSheet")
public class ImpactSheet implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String project;
	private String bodytype;
	private String domain;
	private Boolean impact;
	
	public int getId() {
		return this.id;
	}
	
	public String getBodytype() {
		return this.bodytype;
	}
	
	public String getProject() {
		return this.project;
	}
	
	public String getDomain() {
		return this.domain;
	}
	
	public Boolean getImpact() {
		return this.impact;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}
	
	public void setProject(String project) {
		this.project = project;
	}
	
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public void setImpact(Boolean impact) {
		this.impact = impact;
	}
	
	
}
