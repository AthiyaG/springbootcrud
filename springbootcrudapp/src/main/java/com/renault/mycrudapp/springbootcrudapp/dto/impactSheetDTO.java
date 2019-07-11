package com.renault.mycrudapp.springbootcrudapp.dto;

public class impactSheetDTO {

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
	
	public void setBodytype(String bodytype ) {
		this.bodytype = bodytype;
	}
	
	public void setProject(String project) {
		this.domain = project;
	}
	
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public void setImpact( Boolean impact) {
		this.impact = impact;
	}
	
}
