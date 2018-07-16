package com.briup.app01.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app01.bean.Grade;
import com.briup.app01.service.IGradeService;
import com.briup.app01.util.MsgResponse;

@RestController
@RequestMapping("/grade")
public class GradeController {
	@Autowired
	private IGradeService schoolService;

	@GetMapping("finAll")
	public MsgResponse findAll(){
		try{
			List<Grade> list=schoolService.findAll();
			return MsgResponse.success("查找成功", list);
		}
		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	@GetMapping ("findById")
	public MsgResponse findById(long id){
		try {
			Grade school=schoolService .findById(id);
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
			schoolService.deleteById(id);
				return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("insertGrade")
	public MsgResponse insert(Grade school){
		try {
			schoolService.insert(school);
			return MsgResponse.success("插入成功",school);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	@PostMapping("updateGrade")
	public MsgResponse update(Grade school){
		try {
			schoolService.update(school);
			return MsgResponse.success("更新成功",school);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
}
