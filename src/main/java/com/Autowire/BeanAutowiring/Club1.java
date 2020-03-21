package com.Autowire.BeanAutowiring;

public class Club1 {

	int cId;
	String name;
	String owner;
	public Club1() {
		// TODO Auto-generated constructor stub
	}
	public int getcId() {
		return cId;    
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Club1(int cId, String name, String owner) {
		super();
		this.cId = cId;
		this.name = name;
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Club1 [cId=" + cId + ", name=" + name + ", owner=" + owner + "]";
	}
	
	
	
	
}
