<<<<<<< HEAD
package day15.solved;

import java.util.Scanner;

public class ScannerhasNextLearning {
	
	public static void main(String[] args) {
		// Create a string with multiple words
		String sentence = "Hello world! How are you?";

		// Create a scanner to read from the string
		Scanner scanner = new Scanner(sentence);

		
		while(scanner.hasNext()) {
			System.out.println(scanner.next());
		}

		// Check if the scanner has another token to read
		// Print the result
		System.out.println(scanner.hasNext());

		// Close the scanner
		scanner.close();
	}

}
=======
package day15.solved;

import java.util.Scanner;

public class ScannerhasNextLearning {
	
	public static void main(String[] args) {
		// Create a string with multiple words
		String sentence = "Hello world! How are you?";

		// Create a scanner to read from the string
		Scanner scanner = new Scanner(sentence);

		
		while(scanner.hasNext()) {
			System.out.println(scanner.next());
		}

		// Check if the scanner has another token to read
		// Print the result
		System.out.println(scanner.hasNext());

		// Close the scanner
		scanner.close();
	}

}
>>>>>>> b0435508f578ca93c722be10c5389471c5eae0af
