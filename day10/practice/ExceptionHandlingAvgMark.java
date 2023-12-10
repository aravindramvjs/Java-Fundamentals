package day10.practice;

import java.util.Scanner;

//Read two integers totalMarks and noOfSubjects. Find the overall average (totalMarks/noOfSubjects) . 
//How will you handle the case when noOfSubjects is 0

public class ExceptionHandlingAvgMark {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		
		System.out.print("Enter your Mark: ");
		int mark = s.nextInt();
		
		System.out.print("Enter the no of subject: ");
		int sub = s.nextInt();
		
		try {
			
			int average = mark/sub;
			System.out.printf("The Average is %d", average);
			
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
	}

}
