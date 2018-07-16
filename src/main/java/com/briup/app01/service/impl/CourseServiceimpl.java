package com.briup.app01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app01.bean.Course;
import com.briup.app01.dao.CourseMapper;
import com.briup.app01.service.ICourseService;



@Service
public class CourseServiceimpl implements ICourseService{
	@Autowired
	private CourseMapper courseMapper;
	@Override
	public List<Course> findAll() throws Exception {
	List<Course> list =courseMapper.findAll();
	if(list!=null){
		return list;
	}else{
		throw new Exception("数据库中查询不到任何数据");
		}
	}

	@Override
	public Course findById(long id) throws Exception {
		Course course =courseMapper.findById(id);
		if(course!=null){
			return courseMapper.findById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		Course course=courseMapper.findById(id);
		if(course !=null){
			courseMapper.deleteById(id);
		}else{
			throw new Exception("要查找的对象不存在");
		}
	}

	@Override
	public void insert(Course course) throws Exception {
		Course a=courseMapper.findById(course.getId());
		if(a==null){
			courseMapper.insert(course);
		}else{
			throw new Exception("要插入的对象已存在");
		}
		
	}

	@Override
	public void update(Course course) throws Exception {
	courseMapper.update(course);
		
	}

}
