package com.springjdbc.databaseSetup;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages =  {"com.springjdbc.databaseSetup"})
public class JdbcConfig {
	@Bean(name = {"ds"})
	public DataSource getDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/spring_db?useSSL=false");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");
		return driverManagerDataSource;
	}
	
	@Bean(name = {"jdbcTemplate"})
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	//If we don't want to use this extra code[inside JdbcConfig.java] we have to add 
	//@ComponentScan(basePackages =  {"com.springjdbc.databaseSetup"}) in JdbcConfig.java class
	//@Component in StudentDaoImpl.java class
	//@Autowired in JdbcTemplate property inside StudentDaoImpl.java class
//	@Bean(name = {"studentDaoImplementation"})
//	public StudentDao getStudentDao() {
//		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
//		studentDaoImpl.setJdbcTemplate(getJdbcTemplate());
//		return studentDaoImpl;
//	}
}
