package day06.practice;

import java.util.Scanner;

//Write a Java program that takes a predefined string "John Doe", and prints the full name in uppercase.

public class Touppercase {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your First Name: ");
		String firstName = scan.nextLine();
		
		System.out.print("Enter Your Last Name: ");
		String lastName = scan.nextLine();
		
		String fullname = firstName.concat(lastName).toUpperCase();
		
		System.out.println("Hello "+ fullname + ", Welcome to Java Development");
		
		System.out.printf("Hello %s, Welcome to Java Development", fullname);

	}
}
