package com.revature;

public class Launcher {

	public static void main(String[] args) {
		
		System.out.println("===================================(If/else if/else)");
		
		double randomNum = Math.random();
		//Math is a Class in the Java package
		
		System.out.println("Today's random number is: " + randomNum);
		
		if( randomNum > 0.75) {
			
			System.out.println("random number is greater than 0.75");
			
		} else if(randomNum > 0.50) {
		
			System.out.println("The number generated is less than .75 and greateer than .50");
		} else {
			
			System.out.println("random number is really small");
		}
		
		System.out.println("==============================================(while/do-while loop)");
		
		short smallNum = 2;
		
		while(smallNum < 500) {
			smallNum += 20;
			System.out.println("Small Number is: " + smallNum);
		}
		
		System.out.println("While loop has completed");
		
		//now we'll use a do-while loop, which runs a block of code BEFORE checking the boolean
		do {
			smallNum -= 100;
			System.out.println("smaallNum has decreased to" + smallNum);
		} while(smallNum !=2 && smallNum > 10); 
		System.out.println("Do While Loop has completed");
		//after the while expression fails, the code within the "do" never runs again
		//so smallNum stays at 2 and doesn't decrement after the while expressions evaluates to false
		
		System.out.println("=============================================(For Loops)");
		
		int loopVictim = 0;
		
		for(int i = 0; i < 10; i++) {
			loopVictim += 5;
			
			System.out.println("Our loop victim is now: " + loopVictim);
			System.out.println("Our loop variable/iterator is now: " + i);
		}
		
		
		char[] myName = {'N', ' ', 'A', 'B', 'I', 'N','S','S'};
		
		for(int i = 0; i<myName.length; i++) {
			if(myName[i] == ' ') {
				continue;
			}
			if(myName[i] == 'S') {
				break;
			}
			System.out.println(myName[i]);
			
		}
		
		
	}


}
