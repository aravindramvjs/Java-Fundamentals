package day14.practice;

public class ReversesStringBuilder {
	
	public static void main(String[] args) {
	
		
		
		String strArr = "Hello, how are you?" ;
	
				StringBuilder strBuilderFromSent = new StringBuilder();
		String[] splitArr=strArr.split(" ");
				
				for(int i=splitArr.length-1;i>=0;i--) {
					strBuilderFromSent.append(splitArr[i]);
					strBuilderFromSent.append(" ");
					
				}
				System.out.println(strBuilderFromSent.toString().trim());
	}
	
}