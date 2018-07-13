 package com.briup.app01.dao;

import java.util.List;

import com.briup.app01.bean.Student;

public interface StudentMapper {
	List<Student> findAll();
	Student findById(long id);
	void deleteById(long id);
	void insert(Student studnet);
	void update(Student studnet);
}
