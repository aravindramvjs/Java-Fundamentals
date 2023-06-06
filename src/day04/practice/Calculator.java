package day04.practice;

class calc{
	
	void addition(int num1, int num2) {
		System.out.print("addition: ");
		System.out.println(num1 + num2);
	}
	
	void subtract(int num1, int num2) {
		System.out.print("Subtract: ");
		System.out.println(num1 - num2);
	}
	
	void multiply(int num1, int num2) {
		System.out.print("Mulitply: ");
		System.out.println(num1 * num2);
	}
	
	void divide(int num1, int num2) {
		System.out.print("Division: ");
		System.out.println(num1 / num2);
	}
}

public class Calculator {

	public static void main(String[] args) {
		
		calc cal = new calc();
		
		cal.addition(10, 12);
		cal.subtract(20, 8);
		cal.multiply(2, 4);
		cal.divide(10, 2);

	}
 
}
