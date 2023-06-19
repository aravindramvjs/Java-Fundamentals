package day13.solved;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidateRegex{
	public static void main(String[] args){
		
	String email = "aravindR@gmail.com";
	
	String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		//Pattern pattern = Pattern.compile(regex);
		//Matcher matcher = pattern.matcher(email);
		//Boolean isMatch = matcher.matches();
		boolean isMatch = Pattern.matches(regex, email);
	
		if(!isMatch){
			System.out.printf("Invalid Email: %s", email);
		}
		else{
			System.out.printf("Valid Email: %s", email);
		}

	}
}
		