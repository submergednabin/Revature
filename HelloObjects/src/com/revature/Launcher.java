package com.revature;
import com.revature.models.Buggy;
import com.revature.models.Car;


public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==============================(Using our Constructors)");
		Car myCar = new Car(4, 2); //Instantiating (creating) a Car Object
		
		System.out.println(myCar.tires );
		
		System.out.println(myCar.color);
		
		System.out.println(myCar); //this will print memory address
		
//		System.out.println(myCar.drive(50));
		
		System.out.println("My Car is " + myCar.color + " and has a mileage of " + myCar.mileage);
		
		//instantiate a car object, using the all args constructor
		
		Car youCar = new Car(4, 4, 90000,"gold");
		
		System.out.println("=============================(Using the Methods)");
		Buggy myBuggy = new Buggy();
		
		
		System.out.println(myCar.drive(200));
		System.out.println(myBuggy.drive(500));
		myBuggy.punchSomeone(); // this is a void method. It has nothing return so it will only print the string from method itself
		
		System.out.println("=============================(Casting)");
		
	}

}
