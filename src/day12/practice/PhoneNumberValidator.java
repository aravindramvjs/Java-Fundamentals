package day12.practice;

//Write a Java method to validate a phone number. A valid phone number consists of 10 digits.

import java.util.*;

public class PhoneNumberValidator {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Phone Number: ");
		long phonenum=0l;
		
		
		try{
			phonenum =scan.nextLong();
			System.out.printf("The Phone Number %d is saved successfully", phonenum);
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input");
		}
		
		String strphonenum =Long.toString(phonenum);

		
		if(strphonenum.length() != 10) System.out.println("Phone Number contains 10 numbers");
	
		if("".equals(strphonenum)) System.out.println("Phone Number contains 10 numbers");
		
		if(strphonenum.charAt(0) == 0) System.out.println("Phone Number doesn't start at 0");

		scan.close();
	}

}
