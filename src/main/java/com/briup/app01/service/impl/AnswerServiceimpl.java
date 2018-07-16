package com.briup.app01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app01.bean.Answer;
import com.briup.app01.dao.AnswerMapper;
import com.briup.app01.service.IAnswerService;


@Service
public class AnswerServiceimpl implements IAnswerService{
	@Autowired
	private AnswerMapper answerMapper;
	@Override
	public List<Answer> findAll() throws Exception {
	List<Answer> list =answerMapper.findAll();
	if(list!=null){
		return list;
	}else{
		throw new Exception("数据库中查询不到任何数据");
		}
	}

	@Override
	public Answer findById(long id) throws Exception {
		Answer answer =answerMapper.findById(id);
		if(answer!=null){
			return answerMapper.findById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		Answer answer=answerMapper.findById(id);
		if(answer !=null){
			answerMapper.deleteById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
	}

	@Override
	public void insert(Answer answer) throws Exception {
		Answer a=answerMapper.findById(answer.getId());
		if(a==null){
			answerMapper.insert(answer);
		}else{
			throw new Exception("要插入的对象已存在");
		}
		
	}

	@Override
	public void update(Answer answer) throws Exception {
		answerMapper.update(answer);
		
	}

}
