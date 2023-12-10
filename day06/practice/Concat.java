package day06.practice;

import java.util.Scanner;

//Write a Java program that takes your firstname and lastname and concatenates them into your fullname.

class StringConcat {
	
	static String Concatinate(String str1, String str2) {
		return str1 + str2;
	}
	
}

public class Concat {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your First Name: ");
		String firstName = scan.nextLine();
		
		System.out.print("Enter Your Last Name: ");
		String lastName = scan.nextLine();
		
		String fullname = StringConcat.Concatinate(firstName , lastName);
		
		System.out.println("Hello "+ fullname + ", Welcome to Java Development");
		
		
	}

}
