package day07.HOTS;

import java.util.Scanner;

//HOTS#1 : 
//Write a Java program to simulate a ticket booking system for a movie theater. 
//The program should ask the user for the number of tickets and the age of each ticket holder. 
//Based on the age, determine the ticket price using the following rules:
//
//- Children (age <= 12): $7 per ticket
//- Adults (age > 12 and age <= 60): $12 per ticket
//- Seniors (age > 60): $9 per ticket
//Display the total ticket price to the user.

public class TicketPriceGenerator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // creating scanner object
		
		System.out.print("Enter how many tickets you want: ");
		
		int tickets = scan.nextInt();
		int ageArr[] = new int[tickets+1];  
		
		System.out.println("We are availing some consession for certain age ranges. So kindly enter the respective ages");
		
		 for(int i = 1; i <= tickets; i++) {
			 System.out.printf("The age person %d: ", i);
			 ageArr[i] = scan.nextInt();
		 }
		 
		
		int TotolTicketPrice = 0;
		
		for(int age: ageArr) {
			if(age <= 12) {
				TotolTicketPrice += (age * 7);
			}
			else if(age > 12 && age <= 60 ) {
				 TotolTicketPrice += (age * 12);
			 }
			else if(age > 60) {
				TotolTicketPrice += (age * 9);
			}
		 }
		
		System.out.printf("The Total Ticket Price is $%d", TotolTicketPrice);
		
		

	}

}
