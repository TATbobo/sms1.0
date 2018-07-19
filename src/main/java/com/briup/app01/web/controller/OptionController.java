package com.briup.app01.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app01.VM.OptionVM;
import com.briup.app01.bean.Option;
import com.briup.app01.service.IOptionService;
import com.briup.app01.util.MsgResponse;

import io.swagger.annotations.Api;
@Api(description="问题选项相关接口")
@RestController
@RequestMapping("/option")
public class OptionController {
	@Autowired
	private IOptionService optionService;
	@Autowired
	private IOptionService optionVMService;

	@GetMapping("findAll")
	public MsgResponse findAll(){
		try{
			List<Option> list=optionService.findAll();
			return MsgResponse.success("查找成功", list);
		}
		catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	@GetMapping("findAllOptionVM")
	public MsgResponse findAllOptionVM(){
		try{
			List<OptionVM> list=optionVMService.findAllOptionVM();
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
			Option school=optionService .findById(id);
			return MsgResponse.success("查找成功",school);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping ("findById")
	public MsgResponse findById(long id){
		try {
			Option school=optionService .findById(id);
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
			optionService.deleteById(id);
				return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("insertOption")
	public MsgResponse insert(Option school){
		try {
			optionService.insert(school);
			return MsgResponse.success("插入成功",school);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	@PostMapping("updateOption")
	public MsgResponse update(Option school){
		try {
			optionService.update(school);
			return MsgResponse.success("更新成功",school);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
}
