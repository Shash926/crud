package com.example.crud.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.model;

public interface repository extends JpaRepository<model, Serializable>{

}
