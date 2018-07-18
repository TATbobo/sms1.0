package com.briup.app01.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app01.VM.QuestionVM;
import com.briup.app01.bean.Question;
import com.briup.app01.service.IQuestionService;
import com.briup.app01.util.MsgResponse;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private IQuestionService questionService;

	
	@ApiOperation(value="保存问题",notes="保存问题的同时还保存选项,问题，选项，选项中的外键question_id都不需要输入")
	@PostMapping("saveQuestion")
	public MsgResponse saveQuestion(QuestionVM questionVM){
		try {
			
			questionService.saveQuestion(questionVM);
			return MsgResponse.success("保存成功", questionVM);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}

	}
	
	@GetMapping("findAll")
	public MsgResponse findAll(){
		try{
			List<Question> list=questionService.findAll();
			return MsgResponse.success("查找成功", list);
		}
		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	@GetMapping("finAllquestionVM")
	public MsgResponse findAllquestionVM(){
		try{
			List<QuestionVM> list=questionService.findAllQuestionVM();
			return MsgResponse.success("查找成功", list);
		}
		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	@GetMapping ("findByIdVM")
	public MsgResponse findByIdVM(long id){
		try {
			QuestionVM school=questionService .findByIdVM(id);
			return MsgResponse.success("查找成功",school);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}	
	@GetMapping ("findById")
	public MsgResponse findById(long id){
		try {
			Question school=questionService .findById(id);
			return MsgResponse.success("查找成功",school);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}	
	@GetMapping("deleteById")
	public MsgResponse  deleteById(long id)
	{
		try {
			questionService.deleteById(id);
				return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("insertQuestion")
	public MsgResponse insert(Question school){
		try {
			questionService.insert(school);
			return MsgResponse.success("插入成功",school);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	@PostMapping("updateQuestion")
	public MsgResponse update(Question school){
		try {
			questionService.update(school);
			return MsgResponse.success("更新成功",school);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
}
