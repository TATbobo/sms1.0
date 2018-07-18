package com.briup.app01.service;

import java.util.List;

import com.briup.app01.VM.QuestionVM;
import com.briup.app01.bean.Question;


public interface IQuestionService {

	List<Question> findAll() throws Exception;
	
	List<QuestionVM> findAllQuestionVM() throws Exception;
	
	QuestionVM findByIdVM(long id) throws Exception;
	
	Question findById(long id) throws Exception;
	
	void deleteById(long id) throws Exception;

	void insert(Question question) throws Exception;
	
	void update(Question question) throws Exception;
	
	void saveQuestion(QuestionVM questionVM) throws Exception;
}
