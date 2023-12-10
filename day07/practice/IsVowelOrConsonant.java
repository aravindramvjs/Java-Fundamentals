package day07.practice;

import java.util.*;

//Write a Java program that reads a character from the user. 
//If the character is a vowel, print "The character is a vowel." 
//If the character is a consonant, print "The character is a consonant." 
//Make sure to handle both upper and lower case letters.

import java.util.Scanner;

public class IsVowelOrConsonant { //check entered letter is vowel or consonant

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // creating scanner object
		
		System.out.print("Type a letter: "); //cmdline for entering text
		String charstr = scan.nextLine(); //can not scan only char so scanning str and converting to char
		
		charstr = charstr.toLowerCase();
		char letter = charstr.charAt(0);
		
		
		

		String vowel = "aeiou"; //vowel string
		boolean Isvowel = false; //the below for loop and if else check the letter is vowel or not and change this isvowel value
		
		for(int i = 0; i < vowel.length(); i++) {
			
			char currentvowel = vowel.charAt(i);
			
			if(currentvowel == letter) {
				Isvowel = true;
			}
			
		}
		
		if(Isvowel) {
			System.out.println(letter + " is vowel.");
		}
		else {
			System.out.println(letter + " is consonant.");
		}

	}

}
