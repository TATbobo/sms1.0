package com.briup.app01.service;

import java.util.List;

import com.briup.app01.bean.Course;


public interface ICourseService {
	List<Course> findAll() throws Exception;
	
	Course findById(long id) throws Exception;
	
	void deleteById(long id) throws Exception;

	void insert(Course course) throws Exception;
	
	void update(Course course) throws Exception;
}
