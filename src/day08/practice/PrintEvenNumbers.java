package day08.practice;

//Write a Java program that prints the first 10 even numbers using a do-while loop.

public class PrintEvenNumbers {

	public static void main(String[] args) {
		
		int i = 1;
		do {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			
			i++;
		}
		while(i <= 10);

	}

}
