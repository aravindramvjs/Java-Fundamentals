package day13.hots;

import java.util.Scanner;

//Create a Java program to check the strength of a password. The program should classify the password as 'Weak', 'Medium' or 'Strong'. The rules are as follows:
//		- Weak: The password is less than 8 characters long.
//		- Medium: The password is 8 characters or longer and contains either at least one digit or at least one special character (non-alphanumeric).
//		- Strong: The password is 8 characters or longer, contains at least one digit, contains at least one lowercase letter, contains at least one uppercase letter, and contains at least one special character.

public class PasswordStrengthChecker {

//	regex to check the password rules
    static boolean PASSWORD_REGEX(String s) {
    	return s.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()-+]).{8,}$");
    }

    public static String checkPasswordStrength(String password) {
    	
//    	Weak: The password is less than 8 characters long.
        if (password.length() < 8) {
            return "Weak";
        } 
        
//      Medium: The password is 8 characters or longer and contains either at least one digit or at least one special character (non-alphanumeric).
        else if (!(PASSWORD_REGEX(password))) {
            return "Medium";
        } 
        
        
//      Strong: The password is 8 characters or longer, contains at least one digit, contains at least one lowercase letter, contains at least one uppercase letter, and contains at least one special character.
        else {
            return "Strong";
        }
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Password: ");
		String password = scan.nextLine();
		
		System.out.println("The password strength is: " + checkPasswordStrength(password));
		
		scan.close();
    }
}
