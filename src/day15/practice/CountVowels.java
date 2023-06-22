package day15.practice;

import java.util.Scanner;

//Write a Java program that takes a string as input and counts the number of vowels in it.

public class CountVowels {
	
	public static void main(String[] args) {
		
//		get input from the user
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String inputStr = scan.nextLine();
		
//		check each letter is vowel or not if vowel increase the count
		
		int count = 0;
		
		for(int i = 0; i < inputStr.length(); i++) {
			
			char currentLetter = inputStr.toLowerCase().charAt(i);
			
			if(currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'i' || currentLetter == 'o' || currentLetter == 'u') {
				count++;
			}
		}
		
		System.out.printf("The vowel count in %s is %d.", inputStr, count);
		
		scan.close();
		
	}

}
