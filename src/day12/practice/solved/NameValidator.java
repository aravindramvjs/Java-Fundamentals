package day12.solved;

public class NameValidator {
	
	public static void main(String[] args){
		
		String name = "Aravind";
		
		if("".equals(name)){
			System.out.println("The name feild can not be null or empty");
		}
		else{
			System.out.printf("Hello, %s", name);
		}
	}

}
