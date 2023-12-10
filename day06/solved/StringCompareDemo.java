package day06.solved;

public class StringCompareDemo {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello"; // the value is same so java refer str2 to str1 therefore str2 = str1
		String str3 = new String("Hello"); // creating object of memory location rather saving in same loc uisng new String
		
//		comparing using "==" operator
		System.out.println("comparing using \"==\" operator");
		
		System.out.println(str1 == str2); 
		System.out.println(str1 == str3); // "==" operator checks the memory location is same or not
		
//		comparing using equals() method
		System.out.println("comparing using equals() method");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3)); // equals() method checks the value is same or not
		
	}
}
