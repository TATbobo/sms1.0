package com.briup.app01.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app01.bean.Student;
import com.briup.app01.service.IStudentService;
import com.briup.app01.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description="班级相关接口")
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private IStudentService studentService;
	
	/**
	 * 保存学生信息
	 * 
	 */
	@PostMapping("insertStudent")
	public MsgResponse insert(Student student){
		try {
			studentService.insert(student);
			return MsgResponse.success("插入成功",student);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	@PostMapping("updateStudent")
	public MsgResponse update(Student student){
		try {
			studentService.update(student);
			return MsgResponse.success("更新成功",student);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	
	@ApiOperation(value="查询所有班级",notes="只能查询出班级的基本信息，无法级联查询到班主任和年级")
	//http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllstudent")
	public  MsgResponse findAllStudent(){
		try {
			List<Student> list=studentService.findAll();
			return MsgResponse.success("查找成功",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping ("findStudentById")
	public MsgResponse findStudentById(long id){
		try {
			Student student=studentService.findById(id);
			return MsgResponse.success("查找成功",student);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}	
	
	@GetMapping("deleteById")
	public MsgResponse  deleteById(long id)
	{
		try {
			studentService.deleteById(id);
				return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	
	
	
	
}
