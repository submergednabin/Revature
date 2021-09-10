package com.revature;

import com.revature.models.Associate;
import com.revature.models.Person;

public class Launcher {

	public static void main(String[] args) {
		
//		keyboard shortcut for imports: ctrl+shift+o
		Person daniel = new Associate("Daniel", "Clowns", "Java GCP");
		daniel.breathe();
		System.out.println(daniel.getScared("not the clowns, please" ));
		

	}

}
