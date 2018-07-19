package com.briup.app01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app01.VM.QuestionVM;
import com.briup.app01.bean.Option;
import com.briup.app01.bean.Question;
import com.briup.app01.dao.OptionMapper;
import com.briup.app01.dao.QuestionMapper;
import com.briup.app01.dao.extend.QuestionVMMapper;
import com.briup.app01.service.IQuestionService;



@Service
public class QuestionServiceimpl implements IQuestionService{
	@Autowired
	private QuestionMapper questionMapper;
	@Autowired
	private QuestionVMMapper questionVMMapper;
	@Autowired 
	private OptionMapper optionMapper;
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

	@Override
	public List<QuestionVM> findAllQuestionVM() throws Exception {
		List<QuestionVM> list=questionVMMapper.findAllQuestionVM();
		if(list!=null){
			return list;
		}else{
			throw new Exception("数据库中查询不到任何数据");
			}
		}

	@Override
	public QuestionVM findByIdVM(long id) throws Exception {
		QuestionVM questionVM =questionVMMapper.findByIdVM(id);
		if(questionVM!=null){
			return questionVM;
		}else{
			throw new Exception("要查找的对象不存在");
		}
	}

	@Override
	public void saveQuestion(QuestionVM questionVM) throws Exception {
		Long questionId=questionVM.getId();
		String questionName=questionVM.getName();
		String questionType=questionVM .getQuestiontype();
		Question question =new Question(questionId,questionName,questionType);
		List<Option> options=questionVM.getOptions();
		questionMapper.save(question);
		Long question_id=question.getId();
		for(Option option :options){
			option.setQuestion_id(question_id);
			optionMapper.save(option);
			
		}
		
	}

	}




