package day11.solved;

public class NullPointerExceptionHandling {
	
	public static void main(String[] args){
	
		String str = null;
		
		try{
			System.out.println(str.indexOf("hi"));
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
			
	}
}
