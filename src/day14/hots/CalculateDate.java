package day14.hots;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//Read two dates as inputs from the user in console in the yyyyMMdd format 
//and find the difference between the 2 dates in days. 
//Ensure to keep asking the user if the date is NOT in yyyyMMdd format

public class CalculateDate {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		
		boolean isValid = false;
		
		System.out.println("Please ensure to enter dates in yyyy-mm-dd foramt");
		
		while(!isValid) {
			
			try {
				
				System.out.println("Enter The First Date: ");
				String firstDate = scan.nextLine();
				LocalDate firstparsedDate = LocalDate.parse(firstDate, formatter);
				
				System.out.println("Enter The Second Date: ");
				String secondDate = scan.nextLine();
				LocalDate secondparsedDate = LocalDate.parse(secondDate, formatter);
				
				isValid = true;
				
				long NumberBetween = ChronoUnit.DAYS.between(firstparsedDate, secondparsedDate);
				
				System.out.println("The number of days between is "+ Math.abs(NumberBetween));
			}
			catch(DateTimeParseException e){
				System.out.println("Invalid Date Format");
			}
		
		}
		
		scan.close();
	}

}
