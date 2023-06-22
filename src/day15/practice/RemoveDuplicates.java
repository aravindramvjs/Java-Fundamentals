package day15.practice;

import java.util.Scanner;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
//		Get input from the user 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String inputStr = scan.nextLine();
		
//		check the duplicates using two for loop


		
		StringBuilder originalStr =  new StringBuilder();
		
//		first for loop is used to iterate each element 
		for(int i = 0; i < inputStr.length(); i++) {
			
			char currentLetter = inputStr.toLowerCase().charAt(i);
			
			boolean isDuplicate = false; //using second for loop if there is duplicates make it true
			
//			second for loop is used to iterate as far as first loop moves
			for(int j = 0; j < i; j++) {
				
				if(currentLetter == inputStr.charAt(j)) {
					isDuplicate = true;
				}
			}
			
			if(!isDuplicate) {
				originalStr.append(currentLetter);
			}
		}
		
		System.out.println("The word without any duplicates is "+ originalStr);
		
		scan.close();
		
	}

}
