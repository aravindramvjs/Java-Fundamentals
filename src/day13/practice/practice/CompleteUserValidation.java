package day13.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Create a separate class UserValidator and a method UserValidator.
//validate(User user) that validate each of the attributes of the below class. 
//Please add the validation of id should be Positive, 
//name should be of minimum length 2,  
//use the Practice#4 rules for validating password, 
//use Practice#2 to validate email. Use the below User class 

class User {
	int id;
	String name;
	String password;
	String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	validate method get user crenditals and validate using another methods
	void validate(User user) throws IllegalArgumentException {
		validateId(user.getId());
		validateName(user.getName());
		validateEmail(user.getEmail());
		validatePassword(user.getPassword());
		
	}

//	Id Validator => Id must be posituve numbers
	void validateId(int id) throws IllegalArgumentException {
		if (id <= 0) {
			throw new IllegalArgumentException("ID should be positive.");
		}
	}

//   Username Validator => username length greater than 2.
	void validateName(String name) throws IllegalArgumentException {
		if (name == null || name.length() < 2) {
			throw new IllegalArgumentException("Name should have a minimum length of 2 characters.");
		}
	}

//  email validator checks for the presence of '@' and '.' 
	void validateEmail(String email) throws IllegalArgumentException {
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		boolean isMatch = email.matches(emailRegex);
		if (!isMatch) {
			throw new IllegalArgumentException("Invalid email format.");
		}
	}

//  password validator must have 8 len, one lower, one upper, one digit and one speacial char
	void validatePassword(String password) throws IllegalArgumentException {
		String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
		Pattern pattern = Pattern.compile(passwordRegex);
		Matcher matcher = pattern.matcher(password);
		if (!matcher.matches()) {
			throw new IllegalArgumentException("Invalid password format.");
		}
	}

}

public class CompleteUserValidation {

	public static void main(String[] args) {
		User user = new User();

		user.setId(1);
		user.setName("aravind");
		user.setEmail("aravind@gmail.com");
		user.setPassword("Aravind21");

		try {
			user.validate(user);
			System.out.println("User Id: " + user.getId());
			System.out.println("User Name: " + user.getName());
			System.out.println("User Email: " + user.getEmail());
			System.out.println("User Password: " + user.getPassword());
			System.out.println("User is valid.");
		} 
		
		catch (IllegalArgumentException e) {
			System.out.println("User validation failed: " + e.getMessage());
		}
	}

}
