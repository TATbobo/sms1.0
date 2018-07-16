package com.briup.app01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app01.bean.School;
import com.briup.app01.dao.SchoolMapper;
import com.briup.app01.service.ISchoolService;

@Service
public class SchoolServiceimpl implements ISchoolService{
	@Autowired
	private SchoolMapper schoolMapper;
	@Override
	public List<School> findAll() throws Exception {
	List<School> list =schoolMapper.findAll();
	if(list!=null){
		return list;
	}else{
		throw new Exception("数据库中查询不到任何数据");
		}
	}

	@Override
	public School findById(long id) throws Exception {
		School school =schoolMapper.findById(id);
		if(school!=null){
			return schoolMapper.findById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		School school=schoolMapper.findById(id);
		if(school !=null){
			schoolMapper.deleteById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
	}

	@Override
	public void insert(School school) throws Exception {
		School a=schoolMapper.findById(school.getId());
		if(a==null){
			schoolMapper.insert(school);
		}else{
			throw new Exception("要插入的对象已存在");
		}
		
	}

	@Override
	public void update(School school) throws Exception {
		schoolMapper.update(school);
		
	}

}
