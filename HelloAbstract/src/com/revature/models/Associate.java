package com.revature.models;


//The concrete Class Associate extends Person
//Think of it like a more specific implementation of more generic Person type
// The Person Abstract Class implements Walkable....so associate inherits Walkable's members as well
public class Associate extends Person {
	public String batch;
	
	@Override
	//We can access the unitofMeasurement field from all the way in the Walkable Interface
	public void move(int distance) {
		System.out.println("I walked "+  distance+ " "+ unitOfMeasurement + " today");
		
	}

	@Override
	//Overriding the abstract method in the Person Class
	public String getScared(String words) {
		//super will allow access to parent fields and methods from within the child class
		return super.name + " got scared and said " + words;
	}

	public Associate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Associate(String batch) {
		super();
		this.batch = batch;
	}

	public Associate(String name, String phobia, String batch) {
		super();
		this.name = name;
		this.phobia = phobia;
		this.batch = batch;
		// TODO Auto-generated constructor stub
	}
	
	//two constructors....................
	
}
