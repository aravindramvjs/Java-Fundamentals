package day12.hots;

import java.util.*;

//Create a program in Java that validates user input for a "username". The username rules are as follows:
//    - Only contains alphanumeric characters (a-z, A-Z, 0-9)
//    - Length should be between 8 to 20 characters
//    - Must start with a letter




class nameValidator{
	
//	checking the username is alphanumeric static method using regex
	static boolean isAlphaNumeric(String s) {
	    return s != null && s.matches("^[a-zA-Z0-9]*$");
	}
	
	static void validatorUsername(String username){
		
		int validScore = 3;
		
		
		//cheking username is alphanumeric
		
		if(isAlphaNumeric(username) == false) {
			validScore -= 1;
			System.out.println("username only contains alphanumeric characters (a-z, A-Z, 0-9)\n");
		}
		
		
		//starting with letter
		
		if(Character.isAlphabetic(username.charAt(0)) == false) {
			validScore -= 1;
			System.out.printf("Username %s Must start with a letter\n", username);
		}
		
		
		//length should be 8 to 20
		
		if(username.length() < 8 || username.length() > 20) {
			validScore -= 1;
			System.out.printf("username %s should be between 8 to 20 characters\n", username);
		}
		
		//the valid score is 3 print the success message
		
		if(validScore == 3) {
			System.out.println("The username you had entered is valid and saved successfully");
		}
	}
	
}

public class UsernameValidator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Username: ");
		String username = scan.nextLine();
		
		nameValidator.validatorUsername(username);
		
		scan.close();
	}

}
