package day12.practice;

import java.util.Scanner;

public class StringLengthValidator {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your sentance : ");
        
        String num = sc.nextLine();
        
        sc.close();
        
        if (num.length() >= 5 && num.length() <= 15) {
        	
            System.out.println("Your sentance is have minimum 5 characters to maximum 15 characters");
            
        }
        
        else {
            System.out.println("Under the value");
        }
    }
}