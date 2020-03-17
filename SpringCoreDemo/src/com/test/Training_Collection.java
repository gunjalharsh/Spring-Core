package com.test;

import java.util.List;

public class Training_Collection {
	
	int batchno;
	String projectname;
	List<Technology_Collection>tech;
	public int getBatchno() {
		return batchno;
	}
	public void setBatchno(int batchno) {
		this.batchno = batchno;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public List<Technology_Collection> getTech() {
		return tech;
	}
	public void setTech(List<Technology_Collection> tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Training_Collection [batchno=" + batchno + ", projectname=" + projectname + ", tech=" + tech + "]";
	}
	
	public void display() {
		
		
		
		System.out.println("Batch No :"+batchno);
		System.out.println("Project Name :"+projectname);
		System.out.println("technology :"+tech);
	}

}
