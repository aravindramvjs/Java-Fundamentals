import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateLearning{
	public static void main(String[] args){
	
		//get today's date
		//LocalDate before var is used to denote the obj
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//get today's date and current time
		//return 2023-06-20T10:07:54.539974600 last 539974600 is microseconds
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//get date like this Tue Jun 20 10:10:16 IST 2023
		Date generalDate = new Date();
		System.out.println(generalDate);
	}
}
		
		