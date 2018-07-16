package com.briup.app01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app01.bean.User;
import com.briup.app01.dao.UserMapper;
import com.briup.app01.service.IUserService;


@Service
public class UserServiceimpl implements IUserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findAll() throws Exception {
	List<User> list =userMapper.findAll();
	if(list!=null){
		return list;
	}else{
		throw new Exception("数据库中查询不到任何数据");
		}
	}

	@Override
	public User findById(long id) throws Exception {
		User user =userMapper.findById(id);
		if(user!=null){
			return userMapper.findById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		User user=userMapper.findById(id);
		if(user !=null){
			userMapper.deleteById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
	}

	@Override
	public void insert(User user) throws Exception {
		User a=userMapper.findById(user.getId());
		if(a==null){
			userMapper.insert(user);
		}else{
			throw new Exception("要插入的对象已存在");
		}
		
	}

	@Override
	public void update(User user) throws Exception {
		userMapper.update(user);
		
	}

}
