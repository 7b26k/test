package com.bilal.BirdApp;

public class Bird {
	private String color;
	private String name;
	
	public String getcolor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getDetails() {
		System.out.println("Bird :"+getName()+" Color :"+getcolor());
		
	}
	
	
	
	
	

}
