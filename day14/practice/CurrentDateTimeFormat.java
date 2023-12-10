package day14.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeFormat {
	
	public static void main(String[] args) {
	
				LocalDate today = LocalDate.now();
				
				// today's time
				LocalDateTime now = LocalDateTime.now();
				// Expected format
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
				
				DateTimeFormatter format = DateTimeFormatter.ofPattern("HH/MM/SS");
				// Converting date to the format
				String formattedDate = today.format(formatter);
				System.out.println("Today date "+formattedDate);
				// Converting time to the format
				String formattedTime = now.format(format);
				System.out.println("Current time "+formattedTime);
				
				
	}
	
}