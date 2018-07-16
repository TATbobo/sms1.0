package com.briup.app01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app01.bean.Grade;
import com.briup.app01.dao.GradeMapper;
import com.briup.app01.service.IGradeService;


@Service
public class GradeServiceimpl implements IGradeService{
	@Autowired
	private GradeMapper gradeMapper;
	@Override
	public List<Grade> findAll() throws Exception {
	List<Grade> list =gradeMapper.findAll();
	if(list!=null){
		return list;
	}else{
		throw new Exception("数据库中查询不到任何数据");
		}
	}

	@Override
	public Grade findById(long id) throws Exception {
		Grade grade =gradeMapper.findById(id);
		if(grade!=null){
			return gradeMapper.findById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		Grade grade=gradeMapper.findById(id);
		if(grade !=null){
			gradeMapper.deleteById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
	}

	@Override
	public void insert(Grade grade) throws Exception {
		Grade a=gradeMapper.findById(grade.getId());
		if(a==null){
			gradeMapper.insert(grade);
		}else{
			throw new Exception("要插入的对象已存在");
		}
		
	}

	@Override
	public void update(Grade grade) throws Exception {
		gradeMapper.update(grade);
		
	}

}
