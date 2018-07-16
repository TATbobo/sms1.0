package com.briup.app01.dao;

import java.util.List;

import com.briup.app01.bean.Grade;



public interface GradeMapper {

	List<Grade> findAll();
	Grade findById(long id);
	void deleteById(long id);
	void insert(Grade grade);
	void update(Grade grade);
}
