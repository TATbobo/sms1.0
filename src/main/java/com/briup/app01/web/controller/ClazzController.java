package com.briup.app01.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app01.VM.ClazzVM;
import com.briup.app01.bean.Clazz;

import com.briup.app01.service.IClazzService;
import com.briup.app01.util.MsgResponse;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/clazz")
public class ClazzController {
	@Autowired
	private IClazzService clazzService;
	
	@ApiOperation(value="查询所有班级",notes="能查询出班级信息，并且级联查询到年级和班主任") 
	@GetMapping("findAllClazzVM")
	public MsgResponse findAllClazzVM(){
		try {
			List<ClazzVM> list=clazzService.findAllClazzVM();
			return MsgResponse.success("查找成功", list);
		
			
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		
	}}
	
	
	
	
	@GetMapping("findAll")
	public MsgResponse findAll(){
		try{
			List<Clazz> list=clazzService.findAll();
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
			ClazzVM school=clazzService.findByIdVM(id);
			return MsgResponse.success("查找成功",school);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}	
	@GetMapping ("findById")
	public MsgResponse findById(long id){
		try {
			Clazz school=clazzService .findById(id);
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
			clazzService.deleteById(id);
				return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("insertClazz")
	public MsgResponse insert(Clazz clazz){
		try {
			clazzService.insert(clazz);
			return MsgResponse.success("插入成功",clazz);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	@PostMapping("updateClazz")
	public MsgResponse update(Clazz clazz){
		try {
			clazzService.update(clazz);
			return MsgResponse.success("更新成功",clazz);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
}
