package com.scopesingleton;

public class Car {
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		System.out.println("Setter called ");
		this.name = name;
	}
	
	public void init()
	{
		System.out.println("init method");
	}
	
	public void destroy() {
		System.out.println("destory method");
	}
}
