package day06.practice;

import java.util.Scanner;

public class Split {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Full Name: ");
		String fullName = scan.nextLine();
		
		String[] fullNamearr = fullName.split(" ");
		
//		for(String element: fullNamearr) {
//			System.out.println("your name " + element);
//		}
		
		System.out.printf("your firstname %s ");
	}

}
