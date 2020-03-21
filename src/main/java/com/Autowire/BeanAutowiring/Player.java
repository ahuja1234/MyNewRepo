package com.Autowire.BeanAutowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Player {
	
	
	@Autowired
	Club1 clu;
	
	int pId;
	String name;
	float pay;
	
	
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Club1 getClu() {
		return clu;
	}
	public void setClu(Club1 club) {    
		this.clu = club;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPay() {
		return pay;
	}
	public void setPay(float pay) {
		this.pay = pay;
	}
	
	public void printInfo() {
		System.out.println("Player [pId=" + pId + ", name=" + name + ", pay=" + pay + "Club1= "+ clu +"]");
	}
	public Player(int pId, String name, float pay ,Club1 club1) {
		super();
		this.pId = pId;
		this.name = name;
		this.pay = pay;
		this.clu= club1; 
	}
	
	
	
	
}
