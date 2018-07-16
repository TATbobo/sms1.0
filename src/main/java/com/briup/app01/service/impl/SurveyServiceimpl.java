package com.briup.app01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app01.bean.Survey;
import com.briup.app01.service.ISurveyService;


@Service
public class SurveyServiceimpl implements ISurveyService{
	@Autowired
	private SurveyServiceimpl surveyServiceimpl;
	@Override
	public List<Survey> findAll() throws Exception {
	List<Survey> list =surveyServiceimpl.findAll();
	if(list!=null){
		return list;
	}else{
		throw new Exception("数据库中查询不到任何数据");
		}
	}

	@Override
	public Survey findById(long id) throws Exception {
		Survey survey =surveyServiceimpl.findById(id);
		if(survey!=null){
			return surveyServiceimpl.findById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		Survey survey=surveyServiceimpl.findById(id);
		if(survey !=null){
			surveyServiceimpl.deleteById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
	}

	@Override
	public void insert(Survey survey) throws Exception {
		Survey a=surveyServiceimpl.findById(survey.getId());
		if(a==null){
			surveyServiceimpl.insert(survey);
		}else{
			throw new Exception("要插入的对象已存在");
		}
		
	}

	@Override
	public void update(Survey survey) throws Exception {
			surveyServiceimpl.update(survey);
	}

}
