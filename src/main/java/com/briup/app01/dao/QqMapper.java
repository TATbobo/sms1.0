package com.briup.app01.dao;

import java.util.List;

import com.briup.app01.bean.Qq;



public interface QqMapper {

	List<Qq> findAll();
	Qq findById(long id);
	void deleteById(long id);
	void insert(Qq qq);
	void update(Qq qq);
}
