package com.briup.app01.service;

import java.util.List;

import com.briup.app01.VM.SurveyVM;
import com.briup.app01.bean.Survey;



public interface ISurveyService {
	List<Survey> findAll() throws Exception;
	
	List<SurveyVM> findAllSurveyVM() throws Exception;
	
	SurveyVM findByIdVM(long id) throws Exception;
	
	Survey findById(long id) throws Exception;
	
	void deleteById(long id) throws Exception;

	void insert(Survey survey) throws Exception;
	
	void update(Survey survey) throws Exception;
}
