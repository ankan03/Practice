package com.springjdbc.databaseSetup;

public interface StudentDao {

	public int insert(Student student);
	public int update(Student student);
	public int delete(int id);
}
