package day11.solved;

public class DividesZero {
	
	public static void main(String[] args){
	
		int a = 20;
		int b = 0;
		
		try{
			int result = a/b;
			System.out.printf("%d divided by %d is %d" , a, b, result);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
	}
}
