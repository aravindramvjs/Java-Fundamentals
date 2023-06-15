package day10.solved;

public class ExceptionHandlingDivision {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

//		what if 0 gets divided by a
//		int result = a/b;
//		System.out.printf("The division of %d and %d is %d", a, b, result);

//		catching the exception
		try {
			System.out.println("Trying Division:");
			int result = a / b;
			System.out.println("The division of " + a + " and " + b + " is " + result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
