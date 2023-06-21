package day14.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class CalcNoOfDays {
	public static void main(String[] args) {
		
		LocalDate lastDate=LocalDate.of(2023, 06, 10);
		
		LocalDate nextDate=LocalDate.of(2023, 06, 20);
		
		long NumberBetween=ChronoUnit.DAYS.between(lastDate, nextDate);
		System.out.println("The number of days between is "+NumberBetween);
	}
}