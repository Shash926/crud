package com.example.crud.controller;

//contoller file.

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.model;
import com.example.crud.service.service;
@RequestMapping("/all")
@RestController
public class controller {
	
	@Autowired
	private service Service;
	@PostMapping("/crud")
	public ResponseEntity<String> Createmodel(@RequestBody model Model){
		String status = Service.upsert(Model);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
		
	}
	@GetMapping("crud/{cid}")
	public ResponseEntity<model> getmodel(@PathVariable Integer cid){
		model Model = Service.getById(cid);
		return new ResponseEntity<>(Model, HttpStatus.OK);
		
	}
	@GetMapping("/crud")
	public ResponseEntity<List<model>> getAllcrud(){
		List<model> allcrud = Service.getAllCourses();
		return new ResponseEntity<>(allcrud,HttpStatus.OK);
		
	}
	@PutMapping("/crud/{cid}")
	public ResponseEntity<model> updatemodel(@PathVariable Integer cid,@RequestBody model Model){
		return new ResponseEntity<model>(Service.update(cid,Model),HttpStatus.OK);
}
	//delete
	@DeleteMapping("crud/{cid}")
	public ResponseEntity<String> deletemodel(@PathVariable Integer cid){
		String status = Service.deleteById(cid);
		return new ResponseEntity<>(status, HttpStatus.OK);
		//example
	}
}
