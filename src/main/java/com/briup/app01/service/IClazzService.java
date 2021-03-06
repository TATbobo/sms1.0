package com.briup.app01.service;

import java.util.List;

import com.briup.app01.VM.ClazzVM;
import com.briup.app01.bean.Clazz;



public interface IClazzService {
	List<Clazz> findAll() throws Exception;
	
	List<ClazzVM> findAllClazzVM() throws Exception;
	
	ClazzVM findByIdVM(long id) throws Exception;
	
	Clazz findById(long id) throws Exception;
	
	void deleteById(long id) throws Exception;

	void insert(Clazz clazz) throws Exception;
	
	void update(Clazz clazz) throws Exception;
	
	
}
