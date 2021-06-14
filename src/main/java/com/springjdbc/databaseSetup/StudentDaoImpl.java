package com.springjdbc.databaseSetup;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		String sqlQuery = "INSERT INTO student_table (student_id, student_name, student_city) VALUES (?,?,?)";
		int result = jdbcTemplate.update(sqlQuery,student.getStudentId(),student.getStudentName(),student.getStudentCity());
		return result;
	}

	public int update(Student student) {
		String sqlQuery = "UPDATE student_table SET student_name=? , student_city=? WHERE student_id=?";
		int result = jdbcTemplate.update(sqlQuery,student.getStudentName(),student.getStudentCity(),student.getStudentId());
		return result;
	}

	public int delete(int id) {
		String sqlQuery = "DELETE FROM student_table WHERE student_id=?";
		int result = jdbcTemplate.update(sqlQuery,id);
		return result;
	}

	//Get Single student Record
	public Student getStudent(int id) {
		String sqlQuery = "SELECT * FROM student_table WHERE student_id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = jdbcTemplate.queryForObject(sqlQuery, rowMapper, id);
		return student;
	}

	//Get List of student records(We can also pass parameter in this method from the 3rd parameter)
	public List<Student> getAllStudent() {
		String sqlQuery = "SELECT * FROM student_table";
		List<Student> studentList = jdbcTemplate.query(sqlQuery, new RowMapperImpl());
		return studentList;
	}

	
}
