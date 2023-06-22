package day14.practice;
 
import java.time.LocalDateTime;

public class CurrentDateTime {
	
	public static void main(String[] args) {
		//Write a Java program to display the current date and time using the LocalDateTime class.
		
		
		LocalDateTime timenow = LocalDateTime.now();
		System.out.println(timenow);
		
	}
}