package com.revature.models;

//Buggy extends Car! So what? First of all, Inheritance (An OOP Pillars)
		
//This means that the Buggy Class inherits
public class Buggy extends Car{
	
	//Buggy has all the fields of the Car class (tires, color, etc)
	//But let's declare one more variable that's unique to the buggy class
	public int punchCounter;
	
	//Lets make a method that's unique to the Buggy class
	public void punchSomeone() {
		System.out.println("PONCH");
	}
	
	//This is an example of METHOD OVERRIDING
	
	@Override
	public String drive(int speed) {
		return "You are going " + speed + " miles per hour IN YOUr BUGGY";
				
	}
	
	//lets make a no-args and all-args constructor
		
	
	//no args-constructor (generate from superclass option)
	public Buggy() {
		super();
		
	}
	
	//all args constructor (generate from fields)
	public Buggy(int punchCounter) {
		super();
		this.punchCounter = punchCounter;
	}
	

	
	
	
}
