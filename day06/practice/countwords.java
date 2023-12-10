package day06.practice;

public class countwords {

	public static void main(String[] args) {
		
		String input = "I love Java, but Java is challenging!";
		input = input.replace(",", "");
		input = input.replace("!", "");
		String[] inputarr = input.split(" ");
		
		

		for(String element: inputarr) {
			
			int count = 0;
			
			for(int i = 0; i < inputarr.length; i++) {
			
				if(element.equals(inputarr[i])) {
					count++;
				}
			}
			
			
			if(count >= 2 ) {
				
			}
			System.out.println(element + "-" + count);
			
		}
		
	}

}
