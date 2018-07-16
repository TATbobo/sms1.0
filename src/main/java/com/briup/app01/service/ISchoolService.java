package com.briup.app01.service;

import java.util.List;

import com.briup.app01.bean.School;

public interface ISchoolService {
	List<School> findAll() throws Exception;
	
	School findById(long id) throws Exception;
	
	void deleteById(long id) throws Exception;

	void insert(School shcool) throws Exception;
	
	void update(School shcool) throws Exception;
}
