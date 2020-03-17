package com.test;

public class Technology_Collection {
	
	String techname;
	String assessment;
	public String getTechname() {
		return techname;
	}
	public void setTechname(String techname) {
		this.techname = techname;
	}
	public String getAssessment() {
		return assessment;
	}
	public void setAssessment(String assessment) {
		this.assessment = assessment;
	}
	@Override
	public String toString() {
		return "Technology_Collection [techname=" + techname + ", assessment=" + assessment + "]";
	}
	

}
