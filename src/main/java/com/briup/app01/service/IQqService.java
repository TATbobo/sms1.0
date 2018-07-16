package com.briup.app01.service;

import java.util.List;

import com.briup.app01.bean.Qq;


public interface IQqService {
	List<Qq> findAll() throws Exception;
	
	Qq findById(long id) throws Exception;
	
	void deleteById(long id) throws Exception;

	void insert(Qq qq) throws Exception;
	
	void update(Qq qq) throws Exception;
}
