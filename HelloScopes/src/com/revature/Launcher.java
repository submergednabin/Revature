package com.revature;

public class Launcher {
	
	static int i =  5;
	
	static int i2;
	
	// This is a class scoped reference variable
	//(called a reference variable because it REFERS to an object)
	//For uninitialized reference variables, the default value is 'null'
	static Launcher launcher;
	//	static char c;
	
	double dub = 5.7;
	public static void main(String[] args) {
		System.out.println(i); //this will print 5
		
		System.out.println(i2); //this will print 0 ? 0 for an uninitialized static int = 0;
		
		//		System.out.println(c);
		
		//		System.out.println(dub); // a static method can not see an instance scoped variable
		//      Remember, static indicates that something belongs to the class
		//		Thus, instance variable, which belong to INSTANCEsS of the class aren't visible within statics
		
		i2 = -98;
		// initializing the previously uninitialized reference variable
		launcher = new Launcher();
		
		System.out.println(i); //this primitive variable hasn't been changed
		System.out.println(i2); //this primitive variable has been changed
		System.out.println(launcher); //reference variables store the location of an object in memory (memory address)
		
		// The launcher variable is an object of the Launcher Class
		// So it can access the instance scoped variable dub!!
		System.out.println(launcher.dub);
		//Calling static objects with non-static variables is a way to access non-static variable in static methods
		
		System.out.println("==============================(Messing with a new Launcher object)");
		//initialize a new Launcher object
		Launcher launcher2 = new Launcher();
		//launcher and launcher2 are the same data type (Launcher) but they are two different obejcts
		
		launcher2.dub = 1234; //give launcher2 a new value for the dub variable
		//dub is instance scoped, we can change the value of dub in launcher2, without changing it in launcher
		
		System.out.println(launcher.dub);
		System.out.println(launcher2.dub);
		
		i2= 234324; //changing the value of the class scoped variable i2
		
		//because i2 is a class scoped variable, each object has the same value for it
		System.out.println(launcher.i2);
		System.out.println(launcher2.i2);
		//you'll get warnings here - "should be access in a static way" aka without calling it from the object
		//that's because they're static variables. It's redundant to call them from an object,
		//since it'll always be the same value
		
		System.out.println("===============================(Method/Block Scopes)");
		//call the example method below
		//the main method runs automatically when you run your applications
		//but any other method must be explicitly called in order to execute
		example(true);
		// if the example method was non static, still we could call it with launcher.example or launcher2.example;
	}
	
	//Remember, a method defines some behavior of a class
	public static void example(boolean b) {
		float f = 25.0f;//example of a method scope variable
		
		System.out.println("method scoped variable" + f);
		
		if(b) {
			char c = 'c'; //example of a block scoped variables
			System.out.println("block scoped variable: " + c);
			System.out.println("method scoped variable again: " + f);
		}
	}

}
