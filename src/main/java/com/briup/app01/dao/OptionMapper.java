package com.briup.app01.dao;

import java.util.List;

import com.briup.app01.bean.Option;



public interface OptionMapper {
	List<Option> findAll();
	Option findById(long id);
	void deleteById(long id);
	void insert(Option option);
	void update(Option option);
}
