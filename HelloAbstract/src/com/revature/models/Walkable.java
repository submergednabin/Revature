package com.revature.models;

//This is an Interface, which contains abstract fields and abstract functionality (methods)
//It's common practice to give Interface a Verb like name that describes what they do
public interface Walkable {
	
	//Interface fields are public, static, final by default
	String unitOfMeasurement = "miles";
	
	//abstract method- no method body! AKA No implementation....public abstract by default
	void move(int distance); //note the semicolon, not curly braces..abstract!
	
	//default concrete method ...which we usuall won't use in an Interface
	default void trip() {
		System.out.println("Oh no, you fell! :()");
	}
}
