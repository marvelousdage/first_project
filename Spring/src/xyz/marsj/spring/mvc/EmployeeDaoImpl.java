package xyz.marsj.spring.mvc;

import java.util.HashMap;

public class EmployeeDaoImpl implements IEmployeeDao{

	private JdbcUtil jdbcUtil;
	
	public void setJdbcUtil(JdbcUtil jdbcUtil) {
		this.jdbcUtil = jdbcUtil;
	}

	@Override
	public void save(Employee e) {
		jdbcUtil.getConnection();	
		System.out.println("INSERT INTO EMPLOYEE VALUES()");
	}

}
