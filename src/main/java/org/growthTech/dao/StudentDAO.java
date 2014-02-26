package org.growthTech.dao;

import java.util.List;

import org.growthTech.entity.Student;

public interface StudentDAO {
	public void insert(Student student);
	
	public List<Student> findAllStudents();
}
