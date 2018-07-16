package com.briup.app01.dao;

import java.util.List;

import com.briup.app01.bean.User;



public interface UserMapper {

	List<User> findAll();
	User findById(long id);
	void deleteById(long id);
	void insert(User user);
	void update(User user);
}
