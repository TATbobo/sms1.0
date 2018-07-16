package com.briup.app01.dao;

import java.util.List;


import com.briup.app01.bean.Questionnaire;



public interface QuestionnaireMapper {
	List<Questionnaire> findAll();
	Questionnaire findById(long id);
	void deleteById(long id);
	void insert(Questionnaire question);
	void update(Questionnaire question);
}
