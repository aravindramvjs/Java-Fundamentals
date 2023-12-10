package day07.practice;

import java.util.*;

//Write a Java program that reads an integer from the user. 
//If the number is positive, print "The number is positive." 
//If the number is negative, print "The number is negative." 
//If the number is zero, print "The number is zero."

public class Ispositive {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("The Number Is Positive.");
		}
		else if(num < 0) {
			System.out.println("The Number Is Negative.");
		}
		else{
			System.out.println("The Number Is Zero.");
		}
		
		scan.close();
		

	}

}
