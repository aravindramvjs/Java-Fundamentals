package day13.solved;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexplayground {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		//declaring the flow of the code to continue or exit from the flow
		String exitFlow = "continue";
		
		while(!("exit").equalsIgnoreCase(exitFlow)){
			
			// geting the RegEx from the user
			System.out.print("Enter The Regex: ");
			String regex = scan.nextLine();
			Pattern pattern = Pattern.compile(regex);
			
			// geting the string to search using the RegEx
			System.out.println("Enter the words to search: ");
			String searchWords = scan.nextLine();
			
			// Match the String Entered by the user
			Matcher matcher = pattern.matcher(searchWords);
			
			boolean isFound = false;
			
			while (matcher.find()) {
				System.out.printf("I found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n",
						matcher.group(), matcher.start(), matcher.end());
				isFound = true;
			}
			
			if (!isFound) {
				System.out.format("No match found.%n");
			}
			System.out.println("Type exit to exit code or continue: ");
			exitFlow = scan.nextLine();
		}
		scan.close();
	}
}

			
		
		