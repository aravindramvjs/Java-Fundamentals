import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDateLearning{
	public static void main(String[] args){
		
		//get local date or general date
		LocalDate date = LocalDate.now();
		
		//using formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
		
		//combing date and formatter to get resultDate = 20-06-23
		String resultDate = date.format(formatter);
		System.out.println(resultDate);
	}
}
		