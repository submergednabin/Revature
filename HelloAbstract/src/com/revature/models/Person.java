package com.revature.models;

//This is an abstract class, that will also implement our Interface
public abstract class Person implements Walkable {
	
	public String name;
	public String phobia;
	
	//concrete method
	public void breathe() {
		System.out.println("hoo hah hoo hah");
	}
	
	//abstract method
	public abstract String getScared(String words);

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String phobia) {
		super();
		this.name = name;
		this.phobia = phobia;
	}
	
	
}

