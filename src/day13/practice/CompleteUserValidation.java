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
	
	
	static void validate(User user) {

	    String passwordRegx = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&*?]).{8,}$";

        Pattern patternPassword = Pattern.compile(passwordRegx);
        Matcher matcherPassword = patternPassword.matcher(user.password);

        if (!matcherPassword.matches()) {
            System.out.println("Password is not valid.");
            System.out.println("The following conditions are not met:");

            if (!matcherPassword.find(0)) {
                System.out.println("* Password must contain at least one uppercase letter.");
            }

            if (!matcherPassword.find(1)) {
                System.out.println("* Password must contain at least one lowercase letter.");
            }

            if (!matcherPassword.find(2)) {
                System.out.println("* Password must contain at least one digit.");
            }

            if (!matcherPassword.find(3)) {
                System.out.println("* Password must contain at least one special character.");
            }
        } 
        else {
            System.out.println("Password is valid.");
        }
        
        
        String emailRegex = "^([a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,6})$";


        Pattern patternEmail = Pattern.compile(emailRegex);
        Matcher matcherEmail = patternEmail.matcher(user.email);

        if (!matcherEmail.matches()) {
            System.out.println("Email is not valid.");
            System.out.println("The following conditions are not met:");

            if (!matcherEmail.find(0)) {
                System.out.println("* Email must contain a valid username.");
            }

            if (!matcherEmail.find(1)) {
                System.out.println("* Email must contain google or yahoo etc...");
            }

            if (!matcherEmail.find(2)) {
                System.out.println("* Email must contain a .com or .in etc...");
            }
        } 
        else {
            System.out.println("Email is valid.");
        }
  
        if(user.id <= 0) System.out.println("Id must be positive number");
	
}

public class CompleteUserValidation {

}
