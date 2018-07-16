package com.briup.app01.dao;

import java.util.List;

import com.briup.app01.bean.Answer;


public interface AnswerMapper {
	List<Answer> findAll();
	Answer findById(long id);
	void deleteById(long id);
	void insert(Answer answer);
	void update(Answer answer);
}
