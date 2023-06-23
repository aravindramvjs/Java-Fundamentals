package day14.solved;

public class StringBuilderLoopAppender{
	public static void main(String[] args){
	
	// Appending a array of Strings
		String[] strArr = { "This", "is", "a", "collection", "of", "words",
							"to", "be", "appended", "to", "form", "a", "Sentence" };
		

		System.out.println("Sentence of Normal String Append");
		String newStr = "";		
		
		for(String str : strArr){
			
			newStr += str + " ";
			
			System.out.println(newStr);
		}
		
		System.out.println(newStr.trim());
		
		
		
		StringBuilder StrBuilderStr = new StringBuilder();
		
		for(String str : strArr){
			
			StrBuilderStr.append(str).append(" ");
			
		}
		
		System.out.println("Sentence of StringBuilder");
		System.out.println(StrBuilderStr.toString().trim());
	}
}