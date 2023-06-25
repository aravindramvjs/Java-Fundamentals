package day14.hots;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculateDateAndTime {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		
		boolean isValid = false;
		
		System.out.println("Please ensure to enter dates in yyyy-mm-dd HH:mm:ss foramt");
		
		while(!isValid) {
			
			try {
				
				System.out.println("Enter The First Date And Time: ");
				String startDateTime = scan.nextLine();
				LocalDateTime startParsedDateTime = LocalDateTime.parse(startDateTime, formatter);
				
				System.out.println("Enter The Second Date And Time: ");
				String endDateTime = scan.nextLine();
				LocalDateTime endParsedDateTime = LocalDateTime.parse(endDateTime, formatter);
				
				isValid = true;
				
				Duration duration = Duration.between(startParsedDateTime, endParsedDateTime);
				long days = duration.toDays();
		        long hours = duration.toHours() % 24;
		        long minutes = duration.toMinutes() % 60;
		        long seconds = duration.getSeconds() % 60;
		        
		        System.out.println("Days: " + days);
		        System.out.println("Time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
			}
			catch(Exception e){
				System.out.println("Invalid Date Format");
			}
		
		}
		
		scan.close();
	}
}
