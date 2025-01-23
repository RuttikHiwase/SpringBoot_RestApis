package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.springrest.entities.Course;

public class CourseServiceImpl implements CourseService{
	
	List<Course> list;

	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"Java Core Course","This is core java course "));
		list.add(new Course(146,"Springboot Course","Creating rest API in  this course "));
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

}
