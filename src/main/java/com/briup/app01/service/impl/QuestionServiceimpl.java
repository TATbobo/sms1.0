package com.briup.app01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app01.bean.Question;
import com.briup.app01.dao.QuestionMapper;
import com.briup.app01.service.IQuestionService;


@Service
public class QuestionServiceimpl implements IQuestionService{
	@Autowired
	private QuestionMapper questionMapper;
	@Override
	public List<Question> findAll() throws Exception {
	List<Question> list =questionMapper.findAll();
	if(list!=null){
		return list;
	}else{
		throw new Exception("数据库中查询不到任何数据");
		}
	}

	@Override
	public Question findById(long id) throws Exception {
		Question question =questionMapper.findById(id);
		if(question!=null){
			return questionMapper.findById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		Question question=questionMapper.findById(id);
		if(question !=null){
			questionMapper.deleteById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
	}

	@Override
	public void insert(Question question) throws Exception {
		Question a=questionMapper.findById(question.getId());
		if(a==null){
			questionMapper.insert(question);
		}else{
			throw new Exception("要插入的对象已存在");
		}
		
	}

	@Override
	public void update(Question question) throws Exception {
		questionMapper.update(question);
		
	}

}
