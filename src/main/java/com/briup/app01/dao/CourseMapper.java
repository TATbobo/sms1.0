package com.briup.app01.dao;

import java.util.List;

import com.briup.app01.bean.Course;


public interface CourseMapper {

	List<Course> findAll();
	Course findById(long id);
	void deleteById(long id);
	void insert(Course coures);
	void update(Course course);
}
