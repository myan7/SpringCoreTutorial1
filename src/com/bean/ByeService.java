package com.bean;

public class ByeService {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ByeService() {
		
	}

	public ByeService(String name) {
		this.name = name;
	}
	
	public void sayBye()
	{
		System.out.println("Bye "+ name);
	}
}
