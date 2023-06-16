package day12.solved;

class Dividercls{
	
	public static void divider(int a, int b) throws IllegalArgumentException{
		
		if(b<=0){
			throw new IllegalArgumentException("Invalid Input");
		}
		else{
			int result = a/b;
			System.out.println(result);
		}
	}
}

public class DivisionValidator {
	
	public static void main(String[] args){

		try {
			Dividercls.divider(20,0);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}		

}