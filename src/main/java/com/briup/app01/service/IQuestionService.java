package com.briup.app01.service;

import java.util.List;

import com.briup.app01.bean.Question;


public interface IQuestionService {

	List<Question> findAll() throws Exception;
	
	Question findById(long id) throws Exception;
	
	void deleteById(long id) throws Exception;

	void insert(Question question) throws Exception;
	
	void update(Question question) throws Exception;
}
