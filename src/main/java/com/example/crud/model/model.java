package com.example.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Data;
//this is model

@Entity
@Table(name = "COURSE_DTLS")
public class model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cid", length=10, nullable=false)
	private Integer cid;
	@Column(name="name", length=20, nullable=false)
	private String name;
	@Column(name="price", length=20, nullable=false)
	private Double price;
	
	public model() {}
	public model(Integer cid, String name, Double price) {
		super();
		this.cid = cid;
		this.name = name;
		this.price = price;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
