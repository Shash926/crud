package com.example.crud.service;

import java.util.List;

import com.example.crud.model.model;

public interface service {
	
	public String upsert(model Model);
	
	public model getById(Integer cid);
	
	public List<model> getAllCourses();
	
	public String deleteById(Integer cid);
	
	public model update(Integer cid, model Model);

}
