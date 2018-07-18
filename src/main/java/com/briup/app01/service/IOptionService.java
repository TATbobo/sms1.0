package com.briup.app01.service;

import java.util.List;

import com.briup.app01.VM.OptionVM;
import com.briup.app01.bean.Option;


public interface IOptionService {
	List<Option> findAll() throws Exception;
	
	List<OptionVM> findAllOptionVM() throws Exception;
	
	Option findByIdVM(long id) throws Exception;
	
	Option findById(long id) throws Exception;
	
	void deleteById(long id) throws Exception;
	
	void insert(Option option) throws Exception;
	
	void update(Option option) throws Exception;
}
