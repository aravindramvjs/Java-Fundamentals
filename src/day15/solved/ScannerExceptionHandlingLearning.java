package day15.solved;

import java.util.*;

public class ScannerExceptionHandlingLearning {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a your age: ");
		
		try {

			int name = scanner.nextInt();
			System.out.println("Your age is: " + name);			
	
		} catch( InputMismatchException e) {

			System.out.println("Invalid age input");
			e.printStackTrace();

		}

		scanner.close();

	}

}
