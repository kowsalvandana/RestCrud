package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private Integer sid;
	private String name;
	private Double fee;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer sid, String name, Double fee) {
		super();
		this.sid = sid;
		this.name = name;
		this.fee = fee;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", fee=" + fee + "]";
	}
	
	

}
