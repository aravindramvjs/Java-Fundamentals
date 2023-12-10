package day11.practice;

class UserAccount {

	public static void validateUsername(String username) throws IllegalArgumentException {
		
		if (username == null || username.trim().isEmpty()) {
			throw new IllegalArgumentException("Name Cannot be empty");
		}
		
		if(username.length() <= 8) {
			throw new IllegalArgumentException("Name atleast Contains 8 character");
		}
	}
	
	public static void validateAge(int age)  {
		if(age <= 1 ) {
			throw new IllegalArgumentException("Age Can not be negative or zero"); 
		}
	}
}

public class IllegalArgumentExceptionPracticeCode {

	public static void main(String[] args) {

		String username = "Aravind Ram";

		try {
			UserAccount.validateUsername(username);
			System.out.printf("Hello %s, You're Logged In\n",username);
			
			UserAccount.validateAge(0);
			System.out.println("You are eligible for our website");
		} 
		catch (IllegalArgumentException e) { 
			System.out.println("Invalid Username or age: " + e.getMessage());
		}

	}

}