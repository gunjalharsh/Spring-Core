package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Employee_JdbcTemplate1;

public class SpringMainDemo2 {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		BeanDemo myBean=(BeanDemo) ac.getBean("Bean1");
		myBean.display();
		
		
		AbstractApplicationContext ac1=new AnnotationConfigApplicationContext(AnnoBean1.class);
		AnnoBean myBean1=(AnnoBean) ac1.getBean("SpringAnnoBean");
		myBean1.disp("Harshal");
		
		
		
		EmployeeBean myBean2=(EmployeeBean) ac.getBean("myemployee1");
		myBean2.show();
		
		System.out.println("\n");
		System.out.println("Using Autowire");
		EmployeeBean myBean3=(EmployeeBean) ac.getBean("myemployee23");
		myBean3.show();
		
		
		
		System.out.println("\n");
		System.out.println("By using REF");
		Bank my4=(Bank) ac.getBean("bank");
		System.out.println(my4.getBankname());
		System.out.println(my4.getMgrname());
		System.out.println(my4.getB1().getCity());
		System.out.println(my4.getB1().getState());
		
		System.out.println("\n");
		System.out.println("By  using Autowire");
		Bank my5=(Bank) ac.getBean("bank1");
		System.out.println(my4.getBankname());
		System.out.println(my4.getMgrname());
		System.out.println(my4.getB1().getCity());
		System.out.println(my4.getB1().getState());
		
		
		System.out.println("\n");
		System.out.println("By  using Autowire Annotations");
		Bank_AutoWire my6=(Bank_AutoWire) ac.getBean("anno1");
		System.out.println("Bank Name :"+ my6.getBankname());
		System.out.println("Manager Name :"+ my6.getMgrname());
		
		System.out.println("City :"+ my6.getB20().getCity());
		System.out.println("State : "+ my6.getB20().getState());
		
		System.out.println("\n");
		System.out.println("By  using Collection Setter Injection");
		Vendor_Collection my7=(Vendor_Collection)ac.getBean("vencus");
		my7.display();
		
		
		System.out.println("\n");
		System.out.println("By  using Collection Setter Injection and List");
		Training_Collection my8=(Training_Collection)ac.getBean("train");
		my8.display();
		
		System.out.println("\n");
		System.out.println("By  using Collection Setter Injection and Map");
		MapCollection my9=(MapCollection)ac.getBean("AsMap");
		my9.display();
		
		System.out.println("\n");
		System.out.println("By  using Collection Constructor Injection and Set");
		VendorConstructor my10=(VendorConstructor)ac.getBean("const1");
		my10.display();
		
		System.out.println("\n");
		System.out.println("By  using Spring and Jdbc Connection ");
		
		Employee_JdbcTemplate1 my11=(Employee_JdbcTemplate1) ac.getBean("mydatabase");
		System.out.println("Spring+JDBC:::");
		List<Employee_Jdbc> e1=my11.listemp();
		System.out.println("ENO  NAME ");
		
		for(Employee_Jdbc rec:e1) {
			
			System.out.println(rec.getEmp_no()+" "+rec.getEmp_name());
			
		}
		System.out.println("\n");
		System.out.println("Using @value annotations");
		Spring_Anno_Component my12=(Spring_Anno_Component) ac.getBean("SpringAnnotationNew");
		
		System.out.println(my12.getTraining()+" "+ my12.getLoc());
		
		
	}

	

}
