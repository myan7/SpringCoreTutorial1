package com.bean;

public class UserService {
	///* Section 1
	private String name;

	
	public UserService() {
		
	}
	
	public UserService(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello()
	{
		System.out.println("Hello "+name);
	}
	
	//Section1 ends*/
	
	/*
	 * the following sections
	
	private String name;
	private ByeService bye;
	
	public UserService() {
		
	}
	
	public UserService(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public ByeService getBye() {
		return bye;
	}

	public void setBye(ByeService byeService) {
		this.bye = byeService;
	}

	public void sayHello()
	{
		System.out.println("Hello "+name);
		bye.sayBye();  // if you want to call this function you need to inject it first.
	}
	
	public void init()
	{
		System.out.println("Bean get initialized.");
	}
	public void destroy()
	{
		System.out.println("Bean will be destroyed.");
	}
	 */
	
}
