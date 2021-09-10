package com.revature.models;

//This is a class meant to model a car - you can think of it like a template for all car object
// It defines all the variables (fields/attributes) and methods (behaviors) I want a car object to have

public class Car {
	//Declare some car variables
	public int tires;
	public int doors;
	public int mileage;
	public String color;
	
	//Lets also give the Car class a method-------
	
	public String drive(int speed) {
		return "the speed of the car is " + speed+ " mph";
	}
	
	//Some constructors below-------------------
	
	//Remember, constructors are special methods that let us initialize an object
	//In other words, they give values to the object's variables
	
	//No-args constructor
	//If you create a Car object without argumentss, this no args constructor will be called
	
	
	public Car(){ //no parameters in the parenthesis...hence no args
		
		super(); //this isn't necessary, super() will be called implicitly (by own)
		this.tires = 4;
		this.doors = 4;
		this.mileage = 76000;
		this.color = "white";
		
	}
	
	//construtor with some arguments
	public Car(int tires, int doors) {
		super();
		this.tires = tires;
		this.doors = doors;
		this.mileage = 76000;
		this.color = "white";
	}
	
		 
	//All args constructor
	public Car(int tires, int doors, int mileage, String color) {
		//this is constructor chaining - we are going to call the some-args constructor ablove
		this(tires, doors); //this is calling the constructor directly above, instead of super()
		this.color = color;
		this.mileage = mileage;
	}
	
	
	//!! Note: These 3 constructors have same name but different parameters
	// This is called method overloading
	
	
}
