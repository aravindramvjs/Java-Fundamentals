import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDateLearning{

	public static void main(String[] args) {

		// Date in String format
		String dateString = "2023-05-21";
		
		//telling the compiler the format of the dateString
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		//parsing the dateString with declared format
		LocalDate parsedDate = LocalDate.parse(dateString , formatter);
		
		
		System.out.println(parsedDate);
		
		//get year from the string
		System.out.println(parsedDate.getYear());
		
		//get month from the string
		System.out.println(parsedDate.getMonth());
		
		//get date from the string
		System.out.println(parsedDate.getDayOfMonth());
		
		//get value of month from the string
		System.out.println(parsedDate.getMonthValue());
		
		//get dayofweek(mon tue wed...) from the string
		System.out.println(parsedDate.getDayOfWeek());
		
	}
}	
		