package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.model;
import com.example.crud.repo.repository;

@Service
public class ServiceImpl implements service{
	
	@Autowired
	private repository Repository;
	@Override
	public String upsert(model Model) {
		Repository.save(Model);
		return "success";
	}
	@Override
	public model getById(Integer cid) {
		Optional<model> findById = Repository.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}
	
	@Override
	public List<model> getAllCourses(){
		return Repository.findAll();
		
	}
	@Override
	public String deleteById(Integer cid) {
		if(Repository.existsById(cid)) {
			Repository.deleteById(cid);
			return "Delete Success";
		}
		return "No record Found";
	}
	@Override
	public model update(Integer cid,model Model) {
		model m1=this.getById(cid);
		m1.setName(Model.getName());
		m1.setPrice(Model.getPrice());
		Repository.save(m1);
		return m1;
	}

}

