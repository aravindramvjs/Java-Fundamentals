package day10.solved;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		
		try {
			
			String ageStr = "twenty";
			
			int age = Integer.parseInt(ageStr);// if I give Twenty instead of 20 it will throws an NFE exception
			
			System.out.println("Your age is  " + age);
			
		} 
		
		catch (NumberFormatException e) {
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();
			
		}
		
	}
}
