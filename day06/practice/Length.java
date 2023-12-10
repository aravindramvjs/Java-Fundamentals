package day06.practice;

import java.util.Scanner;

class Findlength{
	
	public static int lengthof(String str) {
		
		return str.length();
		
	}
}

public class Length {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Password: ");
		String password = scan.nextLine();
		
		System.out.printf("You're password contains %d characters", Findlength.lengthof(password));
	}
}
