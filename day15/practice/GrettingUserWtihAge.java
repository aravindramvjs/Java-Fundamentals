package day15.practice;

//Write a Java program that prompts the user for their name and age and then prints a message saying "Hello, [name]. Next year, you'll be [age+1]".

import java.util.*;

public class GrettingUserWtihAge {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		Get user name
		System.out.print("Enter Your Name: ");
		String name = scan.nextLine();
		
//		get user age
		System.out.print("Enter Your Age: ");
		int age = scan.nextInt();
		
//		adding 1 to their age
		age += 1;
		
		System.out.printf("Hello %s, Next year you'll be %d.", name, age);
		
		scan.close();
	}
}
