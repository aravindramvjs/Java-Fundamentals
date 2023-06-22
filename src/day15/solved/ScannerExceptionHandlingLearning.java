<<<<<<< HEAD
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
=======
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
>>>>>>> b0435508f578ca93c722be10c5389471c5eae0af
