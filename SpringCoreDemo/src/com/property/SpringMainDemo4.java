package com.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainDemo4 {

	public static void main(String[] args) {

		

		
		ApplicationContext ac4=new ClassPathXmlApplicationContext("SpringConfig2.xml");
		
		User_Property my3=(User_Property)ac4.getBean("prop1");
		System.out.println(my3.getUser()+ " "+my3.getRole()+" "+my3.getEmail());
		
		
		
		
		
		
	}

}
