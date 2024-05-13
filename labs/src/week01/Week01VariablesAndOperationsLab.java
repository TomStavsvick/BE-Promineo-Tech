//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int seatsRemaining = 100;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double groceryTotal = 1.25d;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'A';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = false;
		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Bob";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "1600 Pennsylvania Ave";

		// 7. Print all variables to the console
		System.out.println("Seats Remaining: " + seatsRemaining);
		System.out.println("Gorcery Cost: " + groceryTotal);
		System.out.println("Middle Initial: " + middleInitial);
		System.out.println("Is it hot outside? - " + isHotOutside);
		System.out.println("Customer's First Name: " + customerFirstName);
		System.out.println("Street Address: " + streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		seatsRemaining -= 2;
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		groceryTotal += 2.15d;

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'B';

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHotOutside = !isHotOutside;

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String customerFullName = customerFirstName + " " + middleInitial + ". Smith";

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("I'd like to introduce you to " + customerFullName + " who lives at " + streetAddress + ".");

		
	}
}
