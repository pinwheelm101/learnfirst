package com.LearnWork1;

public class Phone {
	private String type;
	private String name;
	
//	public void Phone() {}

	
	public Phone(String type, String name) {
		
		this.type = type;
		this.name = name;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.printf("这是一款型号为%s的%s手机\n",type,name);
	}
	
}
