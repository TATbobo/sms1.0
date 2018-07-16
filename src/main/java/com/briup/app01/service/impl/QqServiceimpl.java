package com.briup.app01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app01.bean.Qq;
import com.briup.app01.dao.QqMapper;
import com.briup.app01.service.IQqService;



@Service
public class QqServiceimpl implements IQqService{
	@Autowired
	private QqMapper qqMapper;
	@Override
	public List<Qq> findAll() throws Exception {
	List<Qq> list =qqMapper.findAll();
	if(list!=null){
		return list;
	}else{
		throw new Exception("数据库中查询不到任何数据");
		}
	}

	@Override
	public Qq findById(long id) throws Exception {
		Qq qq =qqMapper.findById(id);
		if(qq!=null){
			return qqMapper.findById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		Qq qq=qqMapper.findById(id);
		if(qq !=null){
			qqMapper.deleteById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
	}

	@Override
	public void insert(Qq qq) throws Exception {
		Qq a=qqMapper.findById(qq.getId());
		if(a==null){
			qqMapper.insert(qq);
		}else{
			throw new Exception("要插入的对象已存在");
		}
		
	}

	@Override
	public void update(Qq qq) throws Exception {
		qqMapper.update(qq);
		
	}

}