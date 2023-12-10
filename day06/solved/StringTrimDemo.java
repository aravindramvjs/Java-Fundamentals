package day06.solved;

public class StringTrimDemo {
	
	public static void main(String[] args) {
		

		String firstName = "    Aravind     ";
		
		System.out.println("Without Trim method: " + firstName);	  //Without Trim method
		System.out.println("With Trim method: " + firstName.trim()); //With Trim method

		System.out.println("length Without Trim method: " + firstName.length());		//length Without Trim method
		System.out.println("Length With Trim method: " + firstName.trim().length());	//length With Trim method
	}

}
