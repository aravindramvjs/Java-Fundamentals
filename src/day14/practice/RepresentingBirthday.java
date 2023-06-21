package day14.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RepresentingBirthday {
	
	public static void main(String[] args) {
		//Write a Java program to create a LocalDate object representing your birthday.
		
		// Date in String format
		String dateString = "2003-09-19";
		// Format the DateString is In.
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		// Converting dateString to LocalDate
		LocalDate parsedDate = LocalDate.parse(dateString, formatter);
		System.out.println(parsedDate);
			
				
	
				
	}
	
}