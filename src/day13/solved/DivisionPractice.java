package day13.solved;

public class DivisionPractice{

class Division{
	static void divideit(int a, int b){
		if(b <= 0){
		     System.out.println("Invalid Input: Denominator can not be zero are lesser than zero");
		}
		else{	
		   int result = a/b;
		   System.out.printf("%d divided by %d is %s",a,b,result);
		}
	}
}

	public static void main(String[] args){
		Division.divideit(10,1);
	}
}