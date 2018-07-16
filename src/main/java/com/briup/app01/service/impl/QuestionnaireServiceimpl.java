package com.briup.app01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app01.bean.Questionnaire;
import com.briup.app01.dao.QuestionnaireMapper;
import com.briup.app01.service.IQuestionnaireService;


@Service
public class QuestionnaireServiceimpl implements IQuestionnaireService{
	@Autowired
	private QuestionnaireMapper questionnaireMapper;
	@Override
	public List<Questionnaire> findAll() throws Exception {
	List<Questionnaire> list =questionnaireMapper.findAll();
	if(list!=null){
		return list;
	}else{
		throw new Exception("数据库中查询不到任何数据");
		}
	}

	@Override
	public Questionnaire findById(long id) throws Exception {
		Questionnaire questionnaire =questionnaireMapper.findById(id);
		if(questionnaire!=null){
			return questionnaireMapper.findById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		Questionnaire questionnaire=questionnaireMapper.findById(id);
		if(questionnaire !=null){
			questionnaireMapper.deleteById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
	}

	@Override
	public void insert(Questionnaire questionnaire) throws Exception {
		Questionnaire a=questionnaireMapper.findById(questionnaire.getId());
		if(a==null){
			questionnaireMapper.insert(questionnaire);
		}else{
			throw new Exception("要插入的对象已存在");
		}
		
	}

	@Override
	public void update(Questionnaire questionnaire) throws Exception {
		questionnaireMapper.update(questionnaire);
		
	}

}
