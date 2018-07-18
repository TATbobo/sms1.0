package com.briup.app01.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.briup.app01.VM.OptionVM;
import com.briup.app01.bean.Option;
import com.briup.app01.dao.OptionMapper;
import com.briup.app01.dao.extend.OptionVMMapper;
import com.briup.app01.service.IOptionService;



@Service
public class OptionServiceimpl implements IOptionService{
	@Autowired
	private OptionMapper  optionMapper;
	@Autowired
	private OptionVMMapper optionVMMapper;
	@Override
	public List<OptionVM> findAllOptionVM() throws Exception {
		List<OptionVM> list=optionVMMapper.findAllOptionVM();
		if(list!=null){
			return list;
		}else{
			throw new Exception("数据库中查询不到任何数据");
			}
	
	}
	@Override
	public Option findByIdVM(long id) throws Exception {
		OptionVM optionVM =optionVMMapper.findByIdVM(id);
		if(optionVM!=null){
			return optionMapper.findById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
		
	}


	@Override
	public Option findById(long id) throws Exception {
		Option option =optionMapper.findById(id);
		if(option!=null){
			return optionMapper.findById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		Option option=optionMapper.findById(id);
		if(option !=null){
			optionMapper.deleteById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
	}

	@Override
	public void insert(Option option) throws Exception {
		Option a=optionMapper.findById(option.getId());
		if(a==null){
			optionMapper.insert(option);
		}else{
			throw new Exception("要插入的对象已存在");
		}
		
	}

	@Override
	public void update(Option option) throws Exception {
		optionMapper.update(option);
		
	}

	@Override
	public List<Option> findAll() throws Exception {
		List<Option> list=optionMapper.findAll();
		if(list!=null){
			return list;
		}else{
			throw new Exception("数据库中查询不到任何数据");
			}
	}




}
