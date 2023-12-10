package day15.hots;

import java.util.Scanner;

public class ScannerCustomDelimitter {
	
	public static void main(String[] args) {
		

		// Create a new Scanner instance to read user input from the console
		
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a list of items separated by commas: ");
        String input = scan.nextLine();
        
        scan.close();
        
//        creating another scanner and passing the input to this scanner
        
        Scanner scanner = new Scanner(input);
        
        // Set the delimiter to a comma
        scanner.useDelimiter(",");
        
        // Read and print each token
        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println(token);
        }
               
        scanner.close();
	}

}
