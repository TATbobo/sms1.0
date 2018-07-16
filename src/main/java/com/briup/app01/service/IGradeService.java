package com.briup.app01.service;

import java.util.List;

import com.briup.app01.bean.Grade;

public interface IGradeService {
	List<Grade> findAll() throws Exception;
	
	Grade findById(long id) throws Exception;
	
	void deleteById(long id) throws Exception;

	void insert(Grade grade) throws Exception;
	
	void update(Grade grade) throws Exception;
}
