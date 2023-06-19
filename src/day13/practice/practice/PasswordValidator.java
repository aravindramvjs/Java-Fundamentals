package day13.practice;

import java.util.Scanner;
//import java.util.regex.Pattern;

//Write a Java method to validate a password. 
//A valid password should contain at least 
//	one uppercase letter, 
//	one lowercase letter, 
//	one digit, and 
//	one special character, and 
//	it should be at least 8 characters long.

public class PasswordValidator {
	
	class validatePassword{
		
		static void validate(String password) {
			String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&*?]).{8,}$";
			
			boolean isMatch = password.matches(regex); 
			
			if(!isMatch) {
				System.out.printf("Password: %s is Not valid", password);
			}
			else {
				System.out.printf("Password: %s is Valid", password);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Password: ");
		String password = scan.nextLine();
		
		validatePassword.validate(password);
		
		scan.close();
	}

}
