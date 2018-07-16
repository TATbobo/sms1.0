package com.briup.app01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app01.bean.Student;
import com.briup.app01.dao.StudentMapper;
import com.briup.app01.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService{
	@Autowired
	private StudentMapper studentMapper;
		
	@Override
	public List<Student> findAll() throws Exception {
		List<Student> list= studentMapper.findAll();
		if(list!=null){
			return list;
		}else{
			throw new Exception("数据库中没有对象");

		}
	}

	@Override
	public Student findById(long id) throws Exception {
		Student student=studentMapper.findById(id);
		if(student!=null){
			return studentMapper.findById(id);
		}else{
			throw new Exception("要查找的对象不存在");

		}
	}

	@Override
	public void deleteById(long id) throws Exception {
		Student student=studentMapper.findById(id);
		if(student!=null){
			studentMapper.deleteById(id);
		}else{
			throw new Exception("要删除的对象不存在");
		}
	}

	@Override
	public void insert(Student student) throws Exception {
		Student a=studentMapper.findById(student.getId());
		if(a==null){
			 studentMapper.insert(student);
		}else{
			throw new Exception("要插入的对象已存在");
		}
	}



	@Override
	public void update(Student student) throws Exception {
	
		studentMapper.update(student);
	}
	
}
