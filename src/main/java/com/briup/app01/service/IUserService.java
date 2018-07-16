package com.briup.app01.service;

import java.util.List;

import com.briup.app01.bean.User;



public interface IUserService {

	List<User> findAll() throws Exception;
	
	User findById(long id) throws Exception;
	
	void deleteById(long id) throws Exception;

	void insert(User user) throws Exception;
	
	void update(User user) throws Exception;
}
