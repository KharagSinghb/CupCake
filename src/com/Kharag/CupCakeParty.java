package com.Kharag;

import java.util.Scanner;

public class CupCakeParty {
	/**
	 * Main method
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		//The cup cake party program divides the number of cup cakes between a group of 28 students.
		//We return the number of remaining cup cakes when each student can get only one.
	
		// first we need to get the users input
		Scanner scanner = new Scanner(System.in);

		int numStudents = 28;
		
		// Ask user for number of regular boxes
		System.out.println("input the number of regular boxes :");
		int bigbox = scanner.nextInt();
		// Ask for number of small boxes
		System.out.println("input the number of smaller boxes :");
		int smallbox = scanner.nextInt();
		// Calculate number of students left after wach gets 1 cupcake
		// Print that out
		int numofbigboxcupcakes = bigbox * 8;
		int numofsmallboxcupcakes = smallbox * 3;
		
		int totalcupcakes = numofbigboxcupcakes + numofsmallboxcupcakes;
		int remainingcupcakes = totalcupcakes % numStudents;
		
		System.out.println(remainingcupcakes);
		
		
		
		


	}
}
