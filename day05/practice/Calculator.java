package day05.practice;


public class Calculator {
	
	void addition(int num1, int num2) {
		System.out.println("addition: " + (num1 + num2) );
	}
	
	void subtract(int num1, int num2) {
		System.out.println("addition: " + (num1 - num2) );
	}
	
	void multiply(int num1, int num2) {
		System.out.println("addition: " + (num1 * num2) );
	}
	
	void divide(int num1, int num2) {
		System.out.println("addition: " + (num1 / num2) );
	}
	
	public static void main(String[] args) {
		
		
	Calculator calc = new Calculator();
		
		calc.addition(10, 12);
		calc.subtract(20, 8);
		calc.multiply(2, 4);
		calc.divide(10, 2);

	}
 
}
