package com.briup.app01.dao;

import java.util.List;

import com.briup.app01.bean.Survey;



public interface SurveyMapper {

	List<Survey> findAll();
	Survey findById(long id);
	void deleteById(long id);
	void insert(Survey survey);
	void update(Survey survey);
}
