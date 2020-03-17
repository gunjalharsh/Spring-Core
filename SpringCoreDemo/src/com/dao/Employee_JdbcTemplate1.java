package com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.test.Employee_Jdbc;

//ADD MYSQL JAR FILE

public class Employee_JdbcTemplate1 {
	DataSource datasource;
	JdbcTemplate jdbctemplate;
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		jdbctemplate=new JdbcTemplate(datasource);
	}
	public List<Employee_Jdbc>listemp()
	{
		
		String SQL="select * from emp1;";
		List<Employee_Jdbc> emps=jdbctemplate.query(SQL,new EmployeeMapper());
		
		return emps;
		
		
	}
	

}
