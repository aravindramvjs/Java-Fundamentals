package day15.practice;

import java.util.Scanner;

//Write a Java program that reads a sentence from the user and then rearranges the words in reverse order

public class ReverseString {
	
	public static void main(String[] args) {
		
//		Get input from the user 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String inputStr = scan.nextLine();
		
//		using for loop starting from inputStr to 0 would make the string reverse and savind it in new str
		
		StringBuilder revesedStr = new StringBuilder();
		
		for(int i = inputStr.length() - 1; i >= 0; i--) {
			revesedStr.append(inputStr.charAt(i));
		}
		
		System.out.println("The Revesed Word is " + revesedStr);
		
		scan.close();
	}

}
