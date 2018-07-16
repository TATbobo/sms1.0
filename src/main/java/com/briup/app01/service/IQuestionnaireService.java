package com.briup.app01.service;

import java.util.List;

import com.briup.app01.bean.Questionnaire;


public interface IQuestionnaireService {

	List<Questionnaire> findAll() throws Exception;
	
	Questionnaire findById(long id) throws Exception;
	
	void deleteById(long id) throws Exception;

	void insert(Questionnaire questionnaire) throws Exception;
	
	void update(Questionnaire questionnaire) throws Exception;
}
