package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("SpringAnnotationNew")
public class Spring_Anno_Component {

	@Value("SpringFramework")
	String training;
	@Value("Chennai")
	String loc;
	public String getTraining() {
		return training;
	}
	public void setTraining(String training) {
		this.training = training;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}	
	
	
	
}
