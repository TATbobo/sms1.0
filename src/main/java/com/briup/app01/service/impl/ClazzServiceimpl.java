package com.briup.app01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app01.bean.Clazz;
import com.briup.app01.dao.ClazzMapper;
import com.briup.app01.service.IClazzService;


@Service
public class ClazzServiceimpl implements IClazzService{
	@Autowired
	private ClazzMapper clazzMapper;
	@Override
	public List<Clazz> findAll() throws Exception {
	List<Clazz> list =clazzMapper.findAll();
	if(list!=null){
		return list;
	}else{
		throw new Exception("数据库中查询不到任何数据");
		}
	}

	@Override
	public Clazz findById(long id) throws Exception {
		Clazz answer =clazzMapper.findById(id);
		if(answer!=null){
			return clazzMapper.findById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		Clazz answer=clazzMapper.findById(id);
		if(answer !=null){
			clazzMapper.deleteById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
	}

	@Override
	public void insert(Clazz clazz) throws Exception {
		Clazz a=clazzMapper.findById(clazz.getId());
		if(a==null){
			clazzMapper.insert(clazz);
		}else{
			throw new Exception("要插入的对象已存在");
		}
		
	}

	@Override
	public void update(Clazz clazz) throws Exception {
		clazzMapper.update(clazz);
		
	}

}
