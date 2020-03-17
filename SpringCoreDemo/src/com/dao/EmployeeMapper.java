package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.test.Employee_Jdbc;

public class EmployeeMapper implements RowMapper<Employee_Jdbc> {

	@Override
	public Employee_Jdbc mapRow(ResultSet rs, int arg1) throws SQLException {

		Employee_Jdbc e1=new Employee_Jdbc();
		e1.setEmp_no(rs.getInt("Emp_no"));
		e1.setEmp_name(rs.getString("Emp_name"));
		
		
		return e1;
	}

}
