package com.briup.app01.service;

import java.util.List;

import com.briup.app01.bean.Answer;


public interface IAnswerService {
	List<Answer> findAll() throws Exception;
	
	Answer findById(long id) throws Exception;
	
	void deleteById(long id) throws Exception;

	void insert(Answer answer) throws Exception;
	
	void update(Answer answer) throws Exception;
}
