package com.briup.app01.service;

import java.util.List;

import com.briup.app01.bean.Student;

public interface IStudentService {
	List<Student> findAll() throws Exception;
	
	Student findById(long id) throws Exception;
	
	void deleteById(long id) throws Exception;

	void insert(Student studnet) throws Exception;
	
	void update(Student studnet) throws Exception;
}
