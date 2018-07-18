package com.briup.app01.dao;

import java.util.List;

import com.briup.app01.bean.Question;


public interface QuestionMapper {

	List<Question> findAll();
	Question findById(long id);
	void deleteById(long id);
	void insert(Question question);
	void update(Question question);
	void save(Question question);
}
