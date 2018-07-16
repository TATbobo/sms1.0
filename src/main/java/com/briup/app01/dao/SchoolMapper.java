package com.briup.app01.dao;

import java.util.List;

import com.briup.app01.bean.School;


public interface SchoolMapper {
	List<School> findAll();
	School findById(long id);
	void deleteById(long id);
	void insert(School school);
	void update(School school);
}
