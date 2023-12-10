package day10.practice;

import java.util.Scanner;

//Write a code to read a String using the below lines
//and loop it until the user enters valid integer. 
//Please use try and catch clause and catch **NumberFormatException** thrown by *Integer.parseInt* method

public class EnterValidInput {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter the Integer: ");
		String intStr = s.nextLine();
		
		boolean isValid = false;

		while(isValid != true) {
			
			try {
				
				int result = Integer.parseInt(intStr);
				isValid = true;
				System.out.println("The number you had entered is " + result);
				break;
			}
			catch(NumberFormatException e){
				
				System.out.println("Invalid Input");
				System.out.println("Please Enter Valid Integer: ");
				intStr = s.nextLine();
			}
			
		}
	
	}
		
		

}
